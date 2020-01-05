package org.amshove.kluent

import org.amshove.kluent.internal.*
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.fail

@Deprecated("Use `shouldBeEqualTo`", ReplaceWith("this.shouldBeEqualTo(expected)"))
infix fun <T> T.shouldEqual(expected: T?): T = this.shouldBeEqualTo(expected)

infix fun <T> T.shouldBeEqualTo(expected: T?): T = this.apply { assertEquals(expected, this) }

@Deprecated("Use `shouldNotBeEqualTo`", ReplaceWith("this.shouldNotBeEqualTo(expected)"))
infix fun <T> T.shouldNotEqual(expected: T?) = this.shouldNotBeEqualTo(expected)

infix fun <T> T.shouldNotBeEqualTo(expected: T?) = this.apply { assertNotEquals(expected, this) }

infix fun <T> T.shouldBe(expected: T?): T = this.apply { assertSame(expected, this) }

infix fun <T> T.shouldNotBe(expected: T?) = this.apply { assertNotSame(expected, this) }

fun Any?.shouldBeNull() = if (this != null) fail("expected value to be null, but was: $this") else Unit

@UseExperimental(ExperimentalContracts::class)
fun <T : Any> T?.shouldNotBeNull(): T {
    contract {
        returns() implies (this@shouldNotBeNull != null)
    }

    return this ?: fail("Expected non null value, but value was null")
}

@UseExperimental(ExperimentalContracts::class)
fun Boolean.shouldBeTrue(): Boolean {
    contract {
        returns() implies this@shouldBeTrue
    }

    return this.apply { assertTrue("Expected value to be true, but was $this", this) }
}

@UseExperimental(ExperimentalContracts::class)
fun Boolean.shouldBeFalse(): Boolean {
    contract {
        returns() implies !this@shouldBeFalse
    }

    return this.apply { assertFalse("Expected value to be false, but was $this", this) }
}

@UseExperimental(ExperimentalContracts::class)
fun Boolean.shouldNotBeTrue(): Boolean {
    contract {
        returns() implies !this@shouldNotBeTrue
    }

    return this.shouldBeFalse()
}

@UseExperimental(ExperimentalContracts::class)
fun Boolean.shouldNotBeFalse(): Boolean {
    contract {
        returns() implies this@shouldNotBeFalse
    }

    return this.shouldBeTrue()
}

fun Char.shouldBeDigit() = this.apply { assertTrue("Expected '$this' to be a digit", this.platformIsDigit()) }

fun Char.shouldNotBeDigit() = this.apply { assertTrue("Expected '$this' to be no digit", !this.platformIsDigit()) }

infix fun <T> T.should(assertion: T.() -> Boolean) = should("Expected the assertion to return true, but returned false", assertion)

fun <T> T.should(message: String, assertion: T.() -> Boolean): T = try {
    if (assertion()) this else fail(message)
} catch (t: Throwable) {
    fail("""$message
        |
        | An exception occured:
        |   ${t.platformClassName()}: ${t.message}
        |   ${"\tat "}${t.platformJoinStackTrace()}
    """.trimMargin())
}
