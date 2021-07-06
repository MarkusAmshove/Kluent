package org.amshove.kluent

import org.junit.ComparisonFailure
import java.lang.reflect.InvocationTargetException
import java.util.*
import kotlin.reflect.KProperty1
import kotlin.reflect.KVisibility
import kotlin.reflect.full.declaredMemberProperties

@ExperimentalStdlibApi
fun <T : Any> T.shouldBeEquivalentTo(expected: T, config: ((EquivalencyAssertionOptions) -> EquivalencyAssertionOptions)? = null): T = this.apply { assertEquivalency(false, expected, this, config) }

@ExperimentalStdlibApi
fun <T : Any> T.shouldNotBeEquivalentTo(expected: T, config: ((EquivalencyAssertionOptions) -> EquivalencyAssertionOptions)? = null) = this.apply { assertEquivalency(true, expected, this, config) }

@ExperimentalStdlibApi
fun <T : Any, I : Iterable<T>> I.shouldBeEquivalentTo(expected: Iterable<T>, config: ((EquivalencyAssertionOptions) -> EquivalencyAssertionOptions)? = null): I = assertBothIterablesBeEquivalent(expected.toList(), this.toList(), config)

@ExperimentalStdlibApi
fun <T : Any, I : Iterable<T>> I.shouldNotBeEquivalentTo(expected: Iterable<T>, config: ((EquivalencyAssertionOptions) -> EquivalencyAssertionOptions)? = null): I = assertBothIterablesBeNotEquivalent(expected.toList(), this.toList(), config)

@ExperimentalStdlibApi
@Throws(NoSuchMethodException::class, InvocationTargetException::class, IllegalAccessException::class)
@Suppress("UNCHECKED_CAST")
internal fun <T : Any> areEquivalent(recursionLevel: Int, actual: T, expected: T, equivalencyAssertionOptions: EquivalencyAssertionOptions): Boolean {
    val currentLevelOfRecursion = recursionLevel + 1

    if (actual is Boolean || actual is Byte || actual is Short || actual is Int || actual is Long || actual is Float || actual is Double || actual is Char)
    {
        return actual == expected
    }
    if (actual is CharSequence || actual is String)
    {
        return (actual as String).equals(expected as String, true)
    }

    val actualKClass = actual::class
    val expectedKClass = expected::class

    // make the list of properties to compare
    val propertiesToCompare = actualKClass.declaredMemberProperties.filter { it.visibility != KVisibility.PRIVATE }.toMutableList()
    equivalencyAssertionOptions.excludedProperties.forEach { excludedProperty -> propertiesToCompare.removeIf { it.name.equals(excludedProperty.name, true) } }
    equivalencyAssertionOptions.includedProperties.forEach { includedProperty -> propertiesToCompare.removeAll { !it.name.equals(includedProperty.name, true) } }

    for (mA in propertiesToCompare) {
        val mB = expectedKClass.declaredMemberProperties.single { it.name == mA.name } as KProperty1<Any, *>
        val subA = (mA as KProperty1<Any, *>).invoke(actual)
        val subB = mB.invoke(expected)
        when (subA) {
            is Number, is Date, is Boolean, is Enum<*> -> if (subA != subB) {
                return false
            }
            is String -> if (!subA.equals(subB as String?, true)) {
                return false
            }
            else -> if (subA != null && subB == null
                    || subA == null && subB != null) {
                return false
            } else if (subA != null && subB != null) {
                if (subA is Iterable<*>) {
                    if ((currentLevelOfRecursion == equivalencyAssertionOptions.maxLevelOfRecursion && !equivalencyAssertionOptions.allowingInfiniteRecursion)
                            || equivalencyAssertionOptions.excludingNestedObjects) {
                        return true
                    }
                    val actualList = subA.toList()
                    val expectedList = (subB as Iterable<*>).toMutableList()
                    if (actualList.size != expectedList.size) {
                        return false
                    }
                    for (i in actualList.indices) {
                        for (j in expectedList.indices) {
                            if (expectedList.size > j) {
                                equivalencyAssertionOptions.includedProperties.clear()
                                equivalencyAssertionOptions.excludedProperties.clear()
                                val deepEquals = areEquivalent(currentLevelOfRecursion, actualList[i]!!, expectedList[j]!!, equivalencyAssertionOptions)
                                if (deepEquals) {
                                    expectedList.removeAt(j)
                                }
                            }
                        }
                    }
                    for (i in expectedList.indices) {
                        equivalencyAssertionOptions.includedProperties.clear()
                        equivalencyAssertionOptions.excludedProperties.clear()
                        val deepEquals = areEquivalent(currentLevelOfRecursion, actualList[i]!!, expectedList[i]!!, equivalencyAssertionOptions)
                        if (!deepEquals) {
                            return false
                        }
                    }
                } else {
                    if ((currentLevelOfRecursion == equivalencyAssertionOptions.maxLevelOfRecursion && !equivalencyAssertionOptions.allowingInfiniteRecursion)
                            || equivalencyAssertionOptions.excludingNestedObjects) {
                        return true
                    }
                    equivalencyAssertionOptions.includedProperties.clear()
                    equivalencyAssertionOptions.excludedProperties.clear()
                    if (!areEquivalent(currentLevelOfRecursion, subA, subB, equivalencyAssertionOptions)) {
                        return false
                    }
                }
            }
        }
    }
    return true
}

@Suppress("UNCHECKED_CAST")
private fun <T : Any> T.toStructuredString(recursionLevel: Int, structuredStringBuilder: StringBuilder, writeClassName: Boolean = true) {
    val objClass = this::class
    var className = "${objClass.simpleName}"
    className = className.padStart(className.length + recursionLevel, '-')

    if (writeClassName) {
        structuredStringBuilder.append(className)
    }

    var primitiveTypesAdded = false
    // enumerate through primitive types
    for (property in objClass.declaredMemberProperties.filter { it.visibility != KVisibility.PRIVATE }
            .map { it to (it as KProperty1<Any, *>).invoke(this) }
            .filter {
                it.second is Number || it.second is Date || it.second is Boolean || it.second is String || it.second is Enum<*>
            }
    ) {
        if (!primitiveTypesAdded) {
            structuredStringBuilder.append(" (")
            primitiveTypesAdded = true
        }
        try {
            structuredStringBuilder.append("${property.first.name} = ${property.second}, ")
        } catch (e: NoSuchMethodException) {
            structuredStringBuilder.append("${property.first.name} = ")
        } catch (e: InvocationTargetException) {
            structuredStringBuilder.append("${property.first.name} = ")
        } catch (e: IllegalAccessException) {
            structuredStringBuilder.append("${property.first.name} = ")
        }
    }
    if (primitiveTypesAdded) {
        structuredStringBuilder.delete(structuredStringBuilder.length - 2, structuredStringBuilder.length)
        structuredStringBuilder.append(')')
    }
    structuredStringBuilder.append(System.lineSeparator())

    // enumerate through complex types
    for (property in objClass.declaredMemberProperties.filter { it.visibility != KVisibility.PRIVATE }
            .map { it to (it as KProperty1<Any, *>).invoke(this) }
            .filter {
                !(it.second is Number || it.second is Date || it.second is Boolean || it.second is String || it.second is Enum<*>) && it.second != null
            }
    )
    try {
        structuredStringBuilder.append('˪')

        if (property.second!!::class.declaredMemberProperties.all { it.visibility == KVisibility.PRIVATE }) {
            structuredStringBuilder.append("${property.first.name} = ${property.second!!}")
        } else {
            if (property.second is Iterable<*>) {
                var propertyName = property.first.name
                propertyName = propertyName.padStart(propertyName.length + recursionLevel + 1, '-')
                structuredStringBuilder.append("${propertyName}${System.lineSeparator()}")
                (property.second!! as Iterable<*>).iterableToStructuredString(recursionLevel + 1, structuredStringBuilder)
            } else {
                property.second!!.toStructuredString(recursionLevel + 1, structuredStringBuilder)
            }
        }
    } catch (e: NoSuchMethodException) {
        structuredStringBuilder.append("${property.first.name} = ")
    } catch (e: InvocationTargetException) {
        structuredStringBuilder.append("${property.first.name} = ")
    } catch (e: IllegalAccessException) {
        structuredStringBuilder.append("${property.first.name} = ")
    }
}

private fun <T : Iterable<*>> T.iterableToStructuredString(recursionLevel: Int, structuredStringBuilder: StringBuilder) {
    val list = this.toList()

    for (i in list.indices) {
        val objClass = list[i]!!::class
        var className = "${objClass.simpleName}"
        className = className.padStart(className.length + recursionLevel + 1, '-')
        structuredStringBuilder.append("˪$className[$i]")
        list[i]!!.toStructuredString(recursionLevel + 1, structuredStringBuilder, false)
    }
}

@ExperimentalStdlibApi
private fun <T : Any> assertEquivalency(not: Boolean = false, expected: T, actual: T, equivalencyAssertionOptions: ((EquivalencyAssertionOptions) -> EquivalencyAssertionOptions)? = null) {
    val actualStructure: StringBuilder = StringBuilder()
    val expectedStructure: StringBuilder = StringBuilder()

    val options = equivalencyAssertionOptions?.invoke(EquivalencyAssertionOptions())
            ?: EquivalencyAssertionOptions()
    if (options.compareByProperties) {
        if (!not.xor(areEquivalent(0, actual, expected, options))) {
            actual.toStructuredString(0, actualStructure)
            expected.toStructuredString(0, expectedStructure)
            if (errorCollector.getCollectionMode() == ErrorCollectionMode.Soft) {
                try {
                    fail(EquivalencyExceptionMessage.exceptionMessage(not), expectedStructure.toString().plus(System.lineSeparator()), actualStructure.toString().plus(System.lineSeparator()))
                } catch (ex: ComparisonFailure) {
                    errorCollector.pushError(ex)
                }
            } else {
                fail(EquivalencyExceptionMessage.exceptionMessage(not), expectedStructure.toString().plus(System.lineSeparator()), actualStructure.toString().plus(System.lineSeparator()))
            }
        }
    } else {
        if (not) {
            actual.shouldNotBeEqualTo(expected)
        } else {
            actual.shouldBeEqualTo(expected)
        }
    }
}

@ExperimentalStdlibApi
private fun <T : Any, C : Any> C.assertBothIterablesBeEquivalent(expected: Iterable<T>, actual: Iterable<T>, equivalencyAssertionOptions: ((EquivalencyAssertionOptions) -> EquivalencyAssertionOptions)? = null): C {
    assertBothCollectionsEquivalency(false, expected.toList(), actual.toList(), equivalencyAssertionOptions)
    return this
}

@ExperimentalStdlibApi
private fun <T : Any, C : Any> C.assertBothIterablesBeNotEquivalent(expected: Iterable<T>, actual: Iterable<T>, equivalencyAssertionOptions: ((EquivalencyAssertionOptions) -> EquivalencyAssertionOptions)? = null): C {
    assertBothCollectionsEquivalency(true, expected.toList(), actual.toList(), equivalencyAssertionOptions)
    return this
}

@ExperimentalStdlibApi
private fun <T : Any> assertBothCollectionsEquivalency(not: Boolean = false, expectedList: List<T>, actualList: List<T>, equivalencyAssertionOptions: ((EquivalencyAssertionOptions) -> EquivalencyAssertionOptions)? = null) {
    val actualStructure: StringBuilder = java.lang.StringBuilder()
    val expectedStructure: StringBuilder = java.lang.StringBuilder()

    if (!not && expectedList.size != actualList.size) {
        for (i in actualList.indices) {
            actualList[i].toStructuredString(0, actualStructure)
        }
        for (i in expectedList.indices) {
            expectedList[i].toStructuredString(0, expectedStructure)
        }
        if (errorCollector.getCollectionMode() == ErrorCollectionMode.Soft) {
            try {
                fail(EquivalencyExceptionMessage.exceptionMessage(not), expectedStructure.toString().plus(System.lineSeparator()), actualStructure.toString().plus(System.lineSeparator()))
            } catch (ex: ComparisonFailure) {
                errorCollector.pushError(ex)
            }
        } else {
            fail(EquivalencyExceptionMessage.exceptionMessage(not), expectedStructure.toString().plus(System.lineSeparator()), actualStructure.toString().plus(System.lineSeparator()))
        }
    }

    val remainingItemIndicesOnExpectedList: MutableList<Int> = mutableListOf()
    for (i in expectedList.indices) {
        remainingItemIndicesOnExpectedList.add(i)
    }

    val options = equivalencyAssertionOptions?.invoke(EquivalencyAssertionOptions())
            ?: EquivalencyAssertionOptions()

    if (options.withStrictOrdering) {
        var areEquivalentWithStrictOrdering = true
        for (i in actualList.indices) {
            val deepEquals = areEquivalent(0, actualList[i], expectedList[i], options)
            if (!deepEquals) {
                areEquivalentWithStrictOrdering = false
            }
        }

        if (!not.xor(areEquivalentWithStrictOrdering)) {
            for (i in actualList.indices) {
                actualList[i].toStructuredString(0, actualStructure)
                expectedList[i].toStructuredString(0, expectedStructure)
            }
            val exceptionMessage = "Are not equivalent with strict ordering:"
            if (errorCollector.getCollectionMode() == ErrorCollectionMode.Soft) {
                try {
                    fail(exceptionMessage, expectedStructure.toString().plus(System.lineSeparator()), actualStructure.toString().plus(System.lineSeparator()))
                } catch (ex: ComparisonFailure) {
                    errorCollector.pushError(ex)
                }
            } else {
                fail(exceptionMessage, expectedStructure.toString().plus(System.lineSeparator()), actualStructure.toString().plus(System.lineSeparator()))
            }
        }
    } else {
        for (i in actualList.indices) {
            for (j in expectedList.indices) {
                if (expectedList.size > j) {
                    val deepEquals = areEquivalent(0, actualList[i], expectedList[j], options)
                    if (deepEquals) {
                        remainingItemIndicesOnExpectedList.remove(j)
                    }
                }
            }
        }
        for (i in remainingItemIndicesOnExpectedList.indices) {
            val deepEquals = areEquivalent(0, actualList[i], expectedList[remainingItemIndicesOnExpectedList[i]], options)
            if (deepEquals) {
                remainingItemIndicesOnExpectedList.remove(i)
            }
        }

        if (not.xor(remainingItemIndicesOnExpectedList.isNotEmpty())) {
            for (i in actualList.indices) {
                actualList[i].toStructuredString(0, actualStructure)
                expectedList[i].toStructuredString(0, expectedStructure)
            }
            if (errorCollector.getCollectionMode() == ErrorCollectionMode.Soft) {
                try {
                    fail(EquivalencyExceptionMessage.exceptionMessage(not), expectedStructure.toString().plus(System.lineSeparator()), actualStructure.toString().plus(System.lineSeparator()))
                } catch (ex: ComparisonFailure) {
                    errorCollector.pushError(ex)
                }
            } else {
                fail(EquivalencyExceptionMessage.exceptionMessage(not), expectedStructure.toString().plus(System.lineSeparator()), actualStructure.toString().plus(System.lineSeparator()))
            }
        }
    }
}

internal object EquivalencyExceptionMessage {
    fun exceptionMessage(not: Boolean): String {
        return "Are ${
            if (!not) {
                "not "
            } else {
                ""
            }
        }equivalent: "
    }
}