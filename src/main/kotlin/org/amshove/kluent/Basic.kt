package org.amshove.kluent

import org.junit.Assert.*

infix fun Any?.`should equal`(theOther: Any?) = assertEquals(theOther, this)
infix fun Any?.shouldEqual(theOther: Any?) = this `should equal` theOther

infix fun Any?.`should not equal`(theOther: Any?) = assertNotEquals(theOther, this)
infix fun Any?.shouldNotEqual(theOther: Any?) = this `should not equal` theOther

infix fun Any?.`should be`(theOther: Any?) = assertSame(theOther, this)
infix fun Any?.shouldBe(theOther: Any?) = this `should be` theOther

infix fun Any?.`should not be`(theOther: Any?) = assertNotSame(theOther, this)
infix fun Any?.shouldNotBe(theOther: Any?) = this `should not be` theOther

infix fun Any?.`should be instance of`(className: Class<*>) = assertTrue("Expected $this to be an instance of $className", className.isInstance(this))
infix fun Any?.shouldBeInstanceOf(className: Class<*>) = this `should be instance of` className

infix fun Any?.`should not be instance of`(className: Class<*>) = assertFalse("Expected $this to not be an instance of $className", className.isInstance(this))
infix fun Any?.shouldNotBeInstanceOf(className: Class<*>) = this `should not be instance of` className

fun Any?.`should be null`() = assertNull(this)
fun Any?.shouldBeNull() = this.`should be null`()

fun Any?.`should not be null`() = assertNotNull(this)
fun Any?.shouldNotBeNull() = this.`should not be null`()

fun Boolean.`should be true`() = assertTrue(this)
fun Boolean.shouldBeTrue() = this.`should be true`()

fun Boolean.`should be false`() = assertFalse(this)
fun Boolean.shouldBeFalse() = this.`should be false`()
