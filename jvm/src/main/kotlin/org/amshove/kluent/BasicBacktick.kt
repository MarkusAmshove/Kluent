package org.amshove.kluent

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract
import kotlin.reflect.KClass

@Deprecated("Use `should be equal to`", ReplaceWith("this.`should be equal to`(expected)"))
infix fun <T> T.`should equal`(expected: T?): T = this.`should be equal to`(expected)

infix fun <T> T.`should be equal to`(expected: T?): T = this.shouldBeEqualTo(expected)

@Deprecated("Use `should not be equal to`", ReplaceWith("this.`should not be equal to`(expected)"))
infix fun <T> T.`should not equal`(expected: T?) = this.`should not be equal to`(expected)

infix fun <T> T.`should not be equal to`(expected: T?) = this.shouldNotBeEqualTo(expected)

infix fun <T> T.`should be`(expected: T?) = this.shouldBe(expected)

infix fun Any?.`should not be`(expected: Any?) = this.shouldNotBe(expected)

infix fun Any?.`should be instance of`(className: Class<*>) = this.shouldBeInstanceOf(className)

infix fun Any?.`should be instance of`(className: KClass<*>) = this.shouldBeInstanceOf(className)

inline fun <reified T : Any> Any?.`should be instance of`() = this.shouldBeInstanceOf<T>()

infix fun Any?.`should not be instance of`(className: Class<*>) = this.shouldNotBeInstanceOf(className)

infix fun Any?.`should not be instance of`(className: KClass<*>) = this.shouldNotBeInstanceOf(className)

inline fun <reified T : Any> Any?.`should not be instance of`() = this.shouldNotBeInstanceOf<T>()

fun Any?.`should be null`() = this.shouldBeNull()

@UseExperimental(ExperimentalContracts::class)
fun <T : Any> T?.`should not be null`(): T {
    contract {
        returns() implies (this@`should not be null` != null)
    }

    return this.shouldNotBeNull()
}

@UseExperimental(ExperimentalContracts::class)
fun Boolean.`should be true`(): Boolean {
    contract {
        returns() implies this@`should be true`
    }

    return this.shouldBeTrue()
}

@UseExperimental(ExperimentalContracts::class)
fun Boolean.`should be false`(): Boolean {
    contract {
        returns() implies !this@`should be false`
    }

    return this.shouldBeFalse()
}

@UseExperimental(ExperimentalContracts::class)
fun Boolean.`should not be true`(): Boolean {
    contract {
        returns() implies !this@`should not be true`
    }

    return this.shouldBeFalse()
}

@UseExperimental(ExperimentalContracts::class)
fun Boolean.`should not be false`(): Boolean {
    contract {
        returns() implies this@`should not be false`
    }

    return this.shouldBeTrue()
}

fun Char.`should be digit`(): Char = this.shouldBeDigit()

infix fun Char.`should be`(@Suppress("UNUSED_PARAMETER") digit: Digit): Char = this.shouldBeDigit()

fun Char.`should not be digit`(): Char = this.shouldNotBeDigit()

infix fun Char.`should not be`(@Suppress("UNUSED_PARAMETER") digit: Digit): Char = this.shouldNotBeDigit()

@ExperimentalStdlibApi
infix fun <T : Any> T.`should be equivalent to`(expected: Pair<T, ((EquivalencyAssertionOptions) -> EquivalencyAssertionOptions)?>): T =
    this.shouldBeEquivalentTo(expected.first, expected.second)

@ExperimentalStdlibApi
infix fun <T : Any> T.`should not be equivalent to`(expected: Pair<T, ((EquivalencyAssertionOptions) -> EquivalencyAssertionOptions)?>): T =
    this.shouldNotBeEquivalentTo(expected.first, expected.second)
