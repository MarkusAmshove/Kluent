@file:Suppress("FINAL_UPPER_BOUND")

package org.amshove.kluent

import kotlin.reflect.KClass


infix fun Any?.shouldEqual(theOther: Any?) = this `should equal` theOther
infix fun Any?.shouldNotEqual(theOther: Any?) = this `should not equal` theOther

infix fun <T : Boolean> T?.shouldEqualTo(theOther: T?) = this `should equal to` theOther
infix fun <T : Byte> T?.shouldEqualTo(theOther: T?) = this `should equal to` theOther
infix fun <T : Short> T?.shouldEqualTo(theOther: T?) = this `should equal to` theOther
infix fun <T : Int> T?.shouldEqualTo(theOther: T?) = this `should equal to` theOther
infix fun <T : Long> T?.shouldEqualTo(theOther: T?) = this `should equal to` theOther
infix fun <T : Float> T?.shouldEqualTo(theOther: T?) = this `should equal to` theOther
infix fun <T : Double> T?.shouldEqualTo(theOther: T?) = this `should equal to` theOther
infix fun <T : String> T?.shouldEqualTo(theOther: T?) = this `should equal to` theOther

infix fun <T : Boolean> T?.shouldNotEqualTo(theOther: T?) = this `should not equal to` theOther
infix fun <T : Byte> T?.shouldNotEqualTo(theOther: T?) = this `should not equal to` theOther
infix fun <T : Short> T?.shouldNotEqualTo(theOther: T?) = this `should not equal to` theOther
infix fun <T : Int> T?.shouldNotEqualTo(theOther: T?) = this `should not equal to` theOther
infix fun <T : Long> T?.shouldNotEqualTo(theOther: T?) = this `should not equal to` theOther
infix fun <T : Float> T?.shouldNotEqualTo(theOther: T?) = this `should not equal to` theOther
infix fun <T : Double> T?.shouldNotEqualTo(theOther: T?) = this `should not equal to` theOther
infix fun <T : String> T?.shouldNotEqualTo(theOther: T?) = this `should not equal to` theOther

infix fun <T> Array<T>?.shouldEqual(theOther: Array<T>?) = this `should equal` theOther
infix fun <T> Iterable<T>?.shouldEqual(theOther: Iterable<T>?) = this `should equal` theOther

infix fun Any?.shouldBe(theOther: Any?) = this `should be` theOther
infix fun Any?.shouldNotBe(theOther: Any?) = this `should not be` theOther

infix fun <T> Array<T>.shouldContain(theThing: T) = this `should contain` theThing
infix fun <T> Array<T>.shouldNotContain(theThing: T) = this `should not contain` theThing

infix fun <T> Iterable<T>.shouldContain(theThing: T) = this `should contain` theThing
infix fun <T> Iterable<T>.shouldNotContain(theThing: T) = this `should not contain` theThing

infix fun <R, T> Map<R, T>.shouldHaveKey(theKey: R) = this `should have key` theKey
infix fun <R, T> Map<R, T>.shouldNotHaveKey(theKey: R) = this `should not have key` theKey

infix fun <T> Any?.shouldBeIn(array: Array<T>) = this `should be in` array
infix fun <T> Any?.shouldNotBeIn(array: Array<T>) = this `should not be in` array

infix fun <T> Any?.shouldBeIn(iterable: Iterable<T>) = this `should be in` iterable
infix fun <T> Any?.shouldNotBeIn(iterable: Iterable<T>) = this `should not be in` iterable

infix fun <T : Exception> (() -> Any).shouldThrow(expectedException: KClass<T>) = this `should throw` expectedException
infix fun <T : Exception> (() -> Any).shouldNotThrow(expectedException: KClass<T>) = this `should not throw` expectedException

infix fun <T : Exception> (() -> Any).shouldThrowTheException(expectedException: KClass<T>): ExceptionResult = this `should throw the Exception` expectedException
infix fun <T : Exception> (() -> Any).shouldNotThrowTheException(expectedException: KClass<T>): NotThrowExceptionResult = this `should not throw the Exception` expectedException

infix fun ExceptionResult.withMessage(theMessage: String) = this `with message` theMessage
infix fun NotThrowExceptionResult.withMessage(theMessage: String) = this `with message` theMessage
