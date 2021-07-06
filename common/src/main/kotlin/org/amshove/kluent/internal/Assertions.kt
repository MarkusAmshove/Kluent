package org.amshove.kluent.internal

import org.amshove.kluent.fail
import kotlin.jvm.JvmName
import kotlin.reflect.KClass
import kotlin.test.asserter

internal fun assertTrue(message: String, boolean: Boolean) = assertTrue(boolean, message)
internal fun assertTrue(actual: Boolean, message: String? = null) {
    if (!actual) {
        fail(message)
    }
}

internal inline fun assertTrue(actual: Boolean, lazyMessage: () -> String) {
    assertTrue(actual, lazyMessage())
}

internal fun assertFalse(message: String, boolean: Boolean) = assertFalse(boolean, message)
fun assertFalse(actual: Boolean, message: String? = null) {
    return assertTrue(message ?: "Expected value to be false.", !actual)
}

internal fun <T> assertArrayEquals(a1: Array<T>?, a2: Array<T>?) {
    if (!arraysEqual(a1, a2)) {
        failFirstSecond("Expected Arrays to be equal, but were different", join(a1), join(a2))
    }
}

internal fun <T> assertArrayNotEquals(a1: Array<T>?, a2: Array<T>?) {
    if (arraysEqual(a1, a2)) {
        failFirstSecond("Expected Arrays to be different, but were equal", join(a1), join(a2))
    }
}

internal fun <T> arraysEqual(a1: Array<T>?, a2: Array<T>?): Boolean {
    if (a1 == null || a2 == null) return false
    return a1 contentEquals a2
}

internal fun <K, V, M : Map<K, V>> assertMapEquals(m1: M, m2: M) {
    if (!mapsEqual(m1, m2)) {
        failFirstSecond("Expected Maps to be equal, but were different", joinPairs(m1), joinPairs(m2))
    }
}

internal fun <K, V, M : Map<K, V>> assertMapNotEquals(m1: M, m2: M) {
    if (mapsEqual(m1, m2)) {
        failFirstSecond("Expected Maps to be different, but were equal", joinPairs(m1), joinPairs(m2))
    }
}

internal fun <K, V, M : Map<K, V>> assertMapEqualsUnordered(m1: M, m2: M) {
    if (!mapsEqualUnordered(m1, m2)) {
        failFirstSecond("Expected Maps to contain same values, but were different", joinPairs(m1), joinPairs(m2))
    }
}

internal fun <K, V, M : Map<K, V>> assertMapNotEqualsUnordered(m1: M, m2: M) {
    if (mapsEqualUnordered(m1, m2)) {
        failFirstSecond("Expected Maps to not contain same values, but did", joinPairs(m1), joinPairs(m2))
    }
}

internal fun <K, V, M : Map<K, V>> mapsEqual(m1: M?, m2: M?): Boolean {
    if (m1 == null || m2 == null) return false
    if (m1.size != m2.size) return false

    val m1Iter = m1.toList()
    val m2Iter = m2.toList()
    for (index in m1Iter.indices) {
        if (m1Iter[index] != m2Iter[index]) {
            return false
        }
    }
    return true
}

internal fun <K, V, M : Map<K, V>> mapsEqualUnordered(m1: M?, m2: M?): Boolean {
    if (m1 == null || m2 == null) return false
    if (m1.size != m2.size) return false

    for ((key, value) in m1) {
        if (m2[key] != value) {
            return false
        }
    }
    return true
}

internal fun failExpectedActual(message: String, expected: String?, actual: String?) = fail("""
    |$message
    |   Expected:   $expected
    |   Actual:     $actual
""".trimMargin())

internal fun failCollectionWithDifferentItems(message: String, expected: String?, actual: String?) = fail("""
    |$message
    |${if (!expected.isNullOrEmpty()) "Items included on the expected collection but not in the actual: $expected" else ""}
    |${if (!actual.isNullOrEmpty()) "Items included on the actual collection but not in the expected: $actual" else ""}
""".trimMargin())

internal fun failFirstSecond(message: String, first: String?, second: String?) = fail("""
    |$message
    |   First:      $first
    |   Second:     $second
""".trimMargin())

// TODO: assertSame and notSame currently not implemented in native 0.6
fun assertSame(expected: Any?, actual: Any?) {
    assertTrue("Expected <$expected>, actual <$actual> are not the same instance.", actual === expected)
}

fun assertNotSame(expected: Any?, actual: Any?) {
    assertTrue("Expected <$expected>, actual <$actual> are the same instance.", actual !== expected)
}

/** Asserts that the [expected] value is equal to the [actual] value, with an optional [message]. */
fun <T> assertEquals(expected: T, actual: T, message: String? = null) {
    assertEquals(message, expected, actual)
}

/**
 * Asserts that the specified values are equal.
 *
 * @param message the message to report if the assertion fails.
 */
fun assertEquals(message: String?, expected: Any?, actual: Any?): Unit {
//    kotlin.test.assertEquals(expected, actual, message)
    assertTrue(actual == expected) { messagePrefix(message) + "Expected <$expected>, actual <$actual>." }
}

/** Asserts that the [actual] value is not equal to the illegal value, with an optional [message]. */
fun <T> assertNotEquals(illegal: T, actual: T, message: String? = null) {
    assertNotEquals(message, illegal, actual)
}

/**
 * Asserts that the specified values are not equal.
 *
 * @param message the message to report if the assertion fails.
 */
fun assertNotEquals(message: String?, illegal: Any?, actual: Any?): Unit {
    assertTrue(actual != illegal) { messagePrefix(message) + "Illegal value: <$actual>." }
}

/**
 * Asserts that given function [block] fails by throwing an exception.
 *
 * @return An exception that was expected to be thrown and was successfully caught.
 * The returned exception can be inspected further, for example by asserting its property values.
 */
@JvmName("assertFailsInline")
inline fun assertFails(block: () -> Unit): Throwable =
        checkResultIsFailure(null, runCatching(block))

/**
 * Asserts that given function [block] fails by throwing an exception.
 *
 * If the assertion fails, the specified [message] is used unless it is null as a prefix for the failure message.
 *
 * @return An exception that was expected to be thrown and was successfully caught.
 * The returned exception can be inspected further, for example by asserting its property values.
 */
@JvmName("assertFailsInline")
inline fun assertFails(message: String?, block: () -> Unit): Throwable =
        checkResultIsFailure(message, runCatching(block))

@PublishedApi
internal fun checkResultIsFailure(message: String?, blockResult: Result<Unit>): Throwable {
    blockResult.fold(
            onSuccess = {
                asserter.fail(messagePrefix(message) + "Expected an exception to be thrown, but was completed successfully.")
            },
            onFailure = { e ->
                return e
            }
    )
}

/** Asserts that a [block] fails with a specific exception of type [T] being thrown.
 *
 * If the assertion fails, the specified [message] is used unless it is null as a prefix for the failure message.
 *
 * @return An exception of the expected exception type [T] that successfully caught.
 * The returned exception can be inspected further, for example by asserting its property values.
 */
inline fun <reified T : Throwable> assertFailsWith(message: String? = null, block: () -> Unit): T =
        assertFailsWith(T::class, message, block)

/**
 * Asserts that a [block] fails with a specific exception of type [exceptionClass] being thrown.
 *
 * @return An exception of the expected exception type [T] that successfully caught.
 * The returned exception can be inspected further, for example by asserting its property values.
 */
@JvmName("assertFailsWithInline")
inline fun <T : Throwable> assertFailsWith(exceptionClass: KClass<T>, block: () -> Unit): T = assertFailsWith(exceptionClass, null, block)

/**
 * Asserts that a [block] fails with a specific exception of type [exceptionClass] being thrown.
 *
 * If the assertion fails, the specified [message] is used unless it is null as a prefix for the failure message.
 *
 * @return An exception of the expected exception type [T] that successfully caught.
 * The returned exception can be inspected further, for example by asserting its property values.
 */
@JvmName("assertFailsWithInline")
inline fun <T : Throwable> assertFailsWith(exceptionClass: KClass<T>, message: String?, block: () -> Unit): T =
        checkResultIsFailure(exceptionClass, message, runCatching(block))
