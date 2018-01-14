package org.amshove.kluent

import kotlin.reflect.KClass

infix fun Any?.`should equal`(theOther: Any?) = this.shouldEqual(theOther)

infix fun Any?.`should not equal`(theOther: Any?) = this.shouldNotEqual(theOther)

infix fun Any?.`should be`(theOther: Any?) = this.shouldBe(theOther)

infix fun Any?.`should not be`(theOther: Any?) = this.shouldNotBe(theOther)

infix fun Any?.`should be instance of`(className: Class<*>) = this.shouldBeInstanceOf(className)

infix fun Any?.`should be instance of`(className: KClass<*>) = this.shouldBeInstanceOf(className)

inline fun <reified T : Any> Any.`should be instance of`() = this.shouldBeInstanceOf<T>()

infix fun Any?.`should not be instance of`(className: Class<*>) = this.shouldNotBeInstanceOf(className)

infix fun Any?.`should not be instance of`(className: KClass<*>) = this.shouldNotBeInstanceOf(className)

fun Any?.`should be null`() = this.shouldBeNull()

fun <T : Any> T?.`should not be null`() : T = this.shouldNotBeNull()

fun Boolean.`should be true`() = this.shouldBeTrue()

fun Boolean.`should be false`() = this.shouldBeFalse()

fun Boolean.`should not be true`() = this.shouldBeFalse()

fun Boolean.`should not be false`() = this.shouldBeTrue()
