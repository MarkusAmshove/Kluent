package org.amshove.kluent

import org.junit.jupiter.api.Assertions.*
import kotlin.reflect.KClass

infix fun Any?.shouldEqual(theOther: Any?) = assertEquals(theOther, this)

infix fun Any?.shouldNotEqual(theOther: Any?) =  assertNotEquals(theOther, this)

infix fun Any?.shouldBe(theOther: Any?) = assertSame(theOther, this)

infix fun Any?.shouldNotBe(theOther: Any?) = assertNotSame(theOther, this)

infix fun Any?.shouldBeInstanceOf(className: Class<*>) = assertTrue(className.isInstance(this), "Expected $this to be an instance of $className")

infix fun Any?.shouldBeInstanceOf(className: KClass<*>) = assertTrue(className.isInstance(this), "Expected $this to be an instance of $className")

infix fun Any?.shouldNotBeInstanceOf(className: Class<*>) = assertFalse(className.isInstance(this), "Expected $this to not be an instance of $className")

infix fun Any?.shouldNotBeInstanceOf(className: KClass<*>) = assertFalse(className.isInstance(this), "Expected $this to not be an instance of $className")

fun Any?.shouldBeNull() = assertNull(this)

fun Any?.shouldNotBeNull() = assertNotNull(this)

fun Boolean.shouldBeTrue() = assertTrue(this)

fun Boolean.shouldBeFalse() =  assertFalse(this)

fun Boolean.shouldNotBeTrue() = this.shouldBeFalse()

fun Boolean.shouldNotBeFalse() = this.shouldBeTrue()
