@file:Suppress("FINAL_UPPER_BOUND")

package org.amshove.kluent

import kotlin.reflect.KClass


infix fun Any?.shouldEqual(theOther: Any?) = this `should equal` theOther
infix fun Any?.shouldNotEqual(theOther: Any?) = this `should not equal` theOther

infix fun Any?.shouldBe(theOther: Any?) = this `should be` theOther
infix fun Any?.shouldNotBe(theOther: Any?) = this `should not be` theOther

infix fun Any?.shouldBeInstanceOf(className: Class<*>) = this `should be instance of` className
infix fun Any?.shouldNotBeInstanceOf(className: Class<*>) = this `should not be instance of` className


infix fun <T : Exception> (() -> Any).shouldThrow(expectedException: KClass<T>) = this `should throw` expectedException
infix fun <T : Exception> (() -> Any).shouldNotThrow(expectedException: KClass<T>) = this `should not throw` expectedException

infix fun <T : Exception> (() -> Any).shouldThrowTheException(expectedException: KClass<T>): ExceptionResult = this `should throw the Exception` expectedException
infix fun <T : Exception> (() -> Any).shouldNotThrowTheException(expectedException: KClass<T>): NotThrowExceptionResult = this `should not throw the Exception` expectedException

infix fun ExceptionResult.withMessage(theMessage: String) = this `with message` theMessage
infix fun NotThrowExceptionResult.withMessage(theMessage: String) = this `with message` theMessage
