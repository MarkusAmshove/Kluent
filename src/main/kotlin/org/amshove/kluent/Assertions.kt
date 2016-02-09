package org.amshove.kluent

import kotlin.reflect.KClass


infix fun Any.shouldEqual(theOther: Any) = this `should equal` theOther
infix fun Any.shouldNotEqual(theOther: Any) = this `should not equal` theOther

infix fun Any.shouldBe(theOther: Any) = this `should be` theOther
infix fun Any.shouldNotBe(theOther: Any) = this `should not be` theOther

infix fun <T> Array<T>.shouldContain(theThing: T) = this `should contain` theThing
infix fun <T> Array<T>.shouldNotContain(theThing: T) = this `should not contain` theThing

infix fun <T> Iterable<T>.shouldContain(theThing: T) = this `should contain` theThing
infix fun <T> Iterable<T>.shouldNotContain(theThing: T) = this `should not contain` theThing

infix fun <T: Exception> (() -> Unit).shouldThrow(expectedException: KClass<T>) = this `should throw` expectedException
infix fun <T: Exception> (() -> Unit).shouldNotThrow(expectedException: KClass<T>) = this `should not throw` expectedException

infix fun <T: Exception> (() -> Unit).shouldThrowTheException(expectedException: KClass<T>) : ExceptionResult = this `should throw the Exception` expectedException
infix fun <T: Exception> (() -> Unit).shouldNotThrowTheException(expectedException: KClass<T>) : NotThrowExceptionResult = this `should not throw the Exception` expectedException

infix fun ExceptionResult.withMessage(theMessage: String) = this `with message` theMessage
infix fun NotThrowExceptionResult.withMessage(theMessage: String) = this `with message` theMessage
