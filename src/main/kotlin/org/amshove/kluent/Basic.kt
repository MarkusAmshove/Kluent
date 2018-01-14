package org.amshove.kluent

import org.junit.Assert.*
import kotlin.reflect.KClass
import kotlin.reflect.full.isSubclassOf

infix fun <T> T.shouldEqual(theOther: T?): T = this.apply { assertEquals(theOther, this) }

infix fun <T> T.shouldNotEqual(theOther: T?) = this.apply { assertNotEquals(theOther, this) }

infix fun <T> T.shouldBe(theOther: T?): T = this.apply { assertSame(theOther, this) }

infix fun <T> T.shouldNotBe(theOther: T?) = this.apply { assertNotSame(theOther, this) }

infix fun Any?.shouldBeInstanceOf(className: Class<*>) = assertTrue("Expected $this to be an instance of $className", className.isInstance(this))

infix fun Any?.shouldBeInstanceOf(className: KClass<*>) = assertTrue("Expected $this to be an instance of $className", className.isInstance(this))

inline fun <reified T : Any> Any.shouldBeInstanceOf(): T = if (this::class.isInstance(T::class) || this::class.isSubclassOf(T::class)) this as T else throw AssertionError("Expected $this to be an instance or subclass of ${T::class.qualifiedName}")

infix fun Any?.shouldNotBeInstanceOf(className: Class<*>) = assertFalse("Expected $this to not be an instance of $className", className.isInstance(this))

infix fun Any?.shouldNotBeInstanceOf(className: KClass<*>) = assertFalse("Expected $this to not be an instance of $className", className.isInstance(this))

fun Any?.shouldBeNull() = if (this != null) fail("expected value to be null, but was: $this") else Unit

fun <T : Any> T?.shouldNotBeNull(): T = this ?: throw AssertionError("Expected non null value, but value was null")

fun Boolean.shouldBeTrue() = this.apply { assertTrue("Expected value to be true, but was $this", this) }

fun Boolean.shouldBeFalse() = this.apply { assertFalse("Expected value to be false, but was $this", this) }

fun Boolean.shouldNotBeTrue() = this.shouldBeFalse()

fun Boolean.shouldNotBeFalse() = this.shouldBeTrue()

infix fun <T> T.should(assertion: T.() -> Boolean) = should("Expected the assertion to return true, but returned false", assertion)

fun <T> T.should(message: String, assertion: T.() -> Boolean): T = try {
    if (assertion()) this else throw AssertionError(message)
} catch (e: Exception) {
    throw AssertionError("""$message
        |
        | An exception occured:
        |   ${e::class.qualifiedName}: ${e.message}
        |   ${"\tat "}${e.stackTrace.joinToString("\n\tat ")}
    """.trimMargin())
}
