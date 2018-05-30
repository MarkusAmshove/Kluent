package org.amshove.kluent

import org.amshove.kluent.internal.*
import kotlin.test.*

infix fun <T> T.shouldEqual(expected: T?): T = this.apply { assertEquals(expected, this) }

infix fun <T> T.shouldNotEqual(expected: T?) = this.apply { assertNotEquals(expected, this) }

infix fun <T> T.shouldBe(expected: T?): T = this.apply { assertSame(expected, this) }

infix fun <T> T.shouldNotBe(expected: T?) = this.apply { assertNotSame(expected, this) }

fun Any?.shouldBeNull() = if (this != null) fail("expected value to be null, but was: $this") else Unit

fun <T : Any> T?.shouldNotBeNull(): T = this ?: fail("Expected non null value, but value was null")

fun Boolean.shouldBeTrue() = this.apply { assertTrue("Expected value to be true, but was $this", this) }

fun Boolean.shouldBeFalse() = this.apply { assertFalse("Expected value to be false, but was $this", this) }

fun Boolean.shouldNotBeTrue() = this.shouldBeFalse()

fun Boolean.shouldNotBeFalse() = this.shouldBeTrue()

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
