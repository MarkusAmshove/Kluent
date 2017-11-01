package org.amshove.kluent

import kotlin.reflect.KClass
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

infix fun Any?.shouldEqual(theOther: Any?) = assertEquals(theOther, this)

infix fun Any?.shouldNotEqual(theOther: Any?) = assertNotEquals(theOther, this)

infix fun Any?.shouldBe(theOther: Any?) = assert(this === theOther)

infix fun Any?.shouldNotBe(theOther: Any?) = assert(this !== theOther)

infix fun Any?.shouldBeInstanceOf(className: Class<*>) = assert(className.isInstance(this), { "Expected $this to be an instance of $className" })

infix fun Any?.shouldBeInstanceOf(className: KClass<*>) = assert(className.isInstance(this), { "Expected $this to be an instance of $className" })

infix fun Any?.shouldNotBeInstanceOf(className: Class<*>) = assert(!className.isInstance(this), { "Expected $this to not be an instance of $className" })

infix fun Any?.shouldNotBeInstanceOf(className: KClass<*>) = assert(!className.isInstance(this), { "Expected $this to not be an instance of $className" })

fun Any?.shouldBeNull() = assert(this === null)

fun Any?.shouldNotBeNull() = assert(this !== null)

fun Boolean.shouldBeTrue() = assert(this)

fun Boolean.shouldBeFalse() = assert(!this)

fun Boolean.shouldNotBeTrue() = this.shouldBeFalse()

fun Boolean.shouldNotBeFalse() = this.shouldBeTrue()
