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
infix fun CharSequence.shouldStartWith(theOther: CharSequence) = this `should start with` theOther
infix fun CharSequence.shouldEndWith(theOther: CharSequence) = this `should end with` theOther
infix fun CharSequence.shouldContain(theOther: CharSequence) = this `should contain` theOther
infix fun CharSequence.shouldMatch(regex: String) = this `should match` regex
infix fun CharSequence.shouldMatch(regex: Regex) = this `should match` regex

infix fun <T : Boolean> T?.shouldNotEqualTo(theOther: T?) = this `should not equal to` theOther
infix fun <T : Byte> T?.shouldNotEqualTo(theOther: T?) = this `should not equal to` theOther
infix fun <T : Short> T?.shouldNotEqualTo(theOther: T?) = this `should not equal to` theOther
infix fun <T : Int> T?.shouldNotEqualTo(theOther: T?) = this `should not equal to` theOther
infix fun <T : Long> T?.shouldNotEqualTo(theOther: T?) = this `should not equal to` theOther
infix fun <T : Float> T?.shouldNotEqualTo(theOther: T?) = this `should not equal to` theOther
infix fun <T : Double> T?.shouldNotEqualTo(theOther: T?) = this `should not equal to` theOther
infix fun <T : String> T?.shouldNotEqualTo(theOther: T?) = this `should not equal to` theOther
infix fun CharSequence.shouldNotStartWith(theOther: CharSequence) = this `should not start with` theOther
infix fun CharSequence.shouldNotEndWith(theOther: CharSequence) = this `should not end with` theOther
infix fun CharSequence.shouldNotContain(theOther: CharSequence) = this `should not contain` theOther
infix fun CharSequence.shouldNotMatch(regex: String) = this `should not match` regex
infix fun CharSequence.shouldNotMatch(regex: Regex) = this `should not match` regex

infix fun Byte.shouldBeGreaterThan(theOther: Byte) = this `should be greater than` theOther
infix fun Short.shouldBeGreaterThan(theOther: Short) = this `should be greater than` theOther
infix fun Int.shouldBeGreaterThan(theOther: Int) = this `should be greater than` theOther
infix fun Long.shouldBeGreaterThan(theOther: Long) = this `should be greater than` theOther
infix fun Float.shouldBeGreaterThan(theOther: Float) = this `should be greater than` theOther
infix fun Double.shouldBeGreaterThan(theOther: Double) = this `should be greater than` theOther

infix fun Byte.shouldNotBeGreaterThan(theOther: Byte) = this `should not be greater than` theOther
infix fun Short.shouldNotBeGreaterThan(theOther: Short) = this `should not be greater than` theOther
infix fun Int.shouldNotBeGreaterThan(theOther: Int) = this `should not be greater than` theOther
infix fun Long.shouldNotBeGreaterThan(theOther: Long) = this `should not be greater than` theOther
infix fun Float.shouldNotBeGreaterThan(theOther: Float) = this `should not be greater than` theOther
infix fun Double.shouldNotBeGreaterThan(theOther: Double) = this `should not be greater than` theOther

infix fun Byte.shouldBeGreaterOrEqualTo(theOther: Byte) = this `should be greater or equal to` theOther
infix fun Short.shouldBeGreaterOrEqualTo(theOther: Short) = this `should be greater or equal to` theOther
infix fun Int.shouldBeGreaterOrEqualTo(theOther: Int) = this `should be greater or equal to` theOther
infix fun Long.shouldBeGreaterOrEqualTo(theOther: Long) = this `should be greater or equal to` theOther
infix fun Float.shouldBeGreaterOrEqualTo(theOther: Float) = this `should be greater or equal to` theOther
infix fun Double.shouldBeGreaterOrEqualTo(theOther: Double) = this `should be greater or equal to` theOther

infix fun Byte.shouldNotBeGreaterOrEqualTo(theOther: Byte) = this `should not be greater or equal to` theOther
infix fun Short.shouldNotBeGreaterOrEqualTo(theOther: Short) = this `should not be greater or equal to` theOther
infix fun Int.shouldNotBeGreaterOrEqualTo(theOther: Int) = this `should not be greater or equal to` theOther
infix fun Long.shouldNotBeGreaterOrEqualTo(theOther: Long) = this `should not be greater or equal to` theOther
infix fun Float.shouldNotBeGreaterOrEqualTo(theOther: Float) = this `should not be greater or equal to` theOther
infix fun Double.shouldNotBeGreaterOrEqualTo(theOther: Double) = this `should not be greater or equal to` theOther

infix fun Byte.shouldBeLessThan(theOther: Byte) = this `should be less than` theOther
infix fun Short.shouldBeLessThan(theOther: Short) = this `should be less than` theOther
infix fun Int.shouldBeLessThan(theOther: Int) = this `should be less than` theOther
infix fun Long.shouldBeLessThan(theOther: Long) = this `should be less than` theOther
infix fun Float.shouldBeLessThan(theOther: Float) = this `should be less than` theOther
infix fun Double.shouldBeLessThan(theOther: Double) = this `should be less than` theOther

infix fun Byte.shouldNotBeLessThan(theOther: Byte) = this `should not be less than` theOther
infix fun Short.shouldNotBeLessThan(theOther: Short) = this `should not be less than` theOther
infix fun Int.shouldNotBeLessThan(theOther: Int) = this `should not be less than` theOther
infix fun Long.shouldNotBeLessThan(theOther: Long) = this `should not be less than` theOther
infix fun Float.shouldNotBeLessThan(theOther: Float) = this `should not be less than` theOther
infix fun Double.shouldNotBeLessThan(theOther: Double) = this `should not be less than` theOther

infix fun Byte.shouldBeLessOrEqualTo(theOther: Byte) = this `should be less or equal to` theOther
infix fun Short.shouldBeLessOrEqualTo(theOther: Short) = this `should be less or equal to` theOther
infix fun Int.shouldBeLessOrEqualTo(theOther: Int) = this `should be less or equal to` theOther
infix fun Long.shouldBeLessOrEqualTo(theOther: Long) = this `should be less or equal to` theOther
infix fun Float.shouldBeLessOrEqualTo(theOther: Float) = this `should be less or equal to` theOther
infix fun Double.shouldBeLessOrEqualTo(theOther: Double) = this `should be less or equal to` theOther

infix fun Byte.shouldNotBeLessOrEqualTo(theOther: Byte) = this `should not be less or equal to` theOther
infix fun Short.shouldNotBeLessOrEqualTo(theOther: Short) = this `should not be less or equal to` theOther
infix fun Int.shouldNotBeLessOrEqualTo(theOther: Int) = this `should not be less or equal to` theOther
infix fun Long.shouldNotBeLessOrEqualTo(theOther: Long) = this `should not be less or equal to` theOther
infix fun Float.shouldNotBeLessOrEqualTo(theOther: Float) = this `should not be less or equal to` theOther
infix fun Double.shouldNotBeLessOrEqualTo(theOther: Double) = this `should not be less or equal to` theOther

fun Byte.shouldBePositive() = this.`should be positive`()
fun Short.shouldBePositive() = this.`should be positive`()
fun Int.shouldBePositive() = this.`should be positive`()
fun Long.shouldBePositive() = this.`should be positive`()
fun Float.shouldBePositive() = this.`should be positive`()
fun Double.shouldBePositive() = this.`should be positive`()

fun Byte.shouldBeNegative() = this.`should be negative`()
fun Short.shouldBeNegative() = this.`should be negative`()
fun Int.shouldBeNegative() = this.`should be negative`()
fun Long.shouldBeNegative() = this.`should be negative`()
fun Float.shouldBeNegative() = this.`should be negative`()
fun Double.shouldBeNegative() = this.`should be negative`()

fun Byte.shouldBeInRange(lowerBound: Byte, upperBound: Byte) = this.`should be in range`(lowerBound, upperBound)
fun Short.shouldBeInRange(lowerBound: Short, upperBound: Short) = this.`should be in range`(lowerBound, upperBound)
fun Int.shouldBeInRange(lowerBound: Int, upperBound: Int) = this.`should be in range`(lowerBound, upperBound)
fun Long.shouldBeInRange(lowerBound: Long, upperBound: Long) = this.`should be in range`(lowerBound, upperBound)
fun Float.shouldBeInRange(lowerBound: Float, upperBound: Float) = this.`should be in range`(lowerBound, upperBound)
fun Double.shouldBeInRange(lowerBound: Double, upperBound: Double) = this.`should be in range`(lowerBound, upperBound)

fun Byte.shouldNotBeInRange(lowerBound: Byte, upperBound: Byte) = this.`should not be in range`(lowerBound, upperBound)
fun Short.shouldNotBeInRange(lowerBound: Short, upperBound: Short) = this.`should not be in range`(lowerBound, upperBound)
fun Int.shouldNotBeInRange(lowerBound: Int, upperBound: Int) = this.`should not be in range`(lowerBound, upperBound)
fun Long.shouldNotBeInRange(lowerBound: Long, upperBound: Long) = this.`should not be in range`(lowerBound, upperBound)
fun Float.shouldNotBeInRange(lowerBound: Float, upperBound: Float) = this.`should not be in range`(lowerBound, upperBound)
fun Double.shouldNotBeInRange(lowerBound: Double, upperBound: Double) = this.`should not be in range`(lowerBound, upperBound)

infix fun Byte.shouldBeInRange(range: IntRange) = this.`should be in range`(range)
infix fun Short.shouldBeInRange(range: IntRange) = this.`should be in range`(range)
infix fun Int.shouldBeInRange(range: IntRange) = this.`should be in range`(range)
infix fun Long.shouldBeInRange(range: LongRange) = this.`should be in range`(range)

infix fun Byte.shouldNotBeInRange(range: IntRange) = this.`should not be in range`(range)
infix fun Short.shouldNotBeInRange(range: IntRange) = this.`should not be in range`(range)
infix fun Int.shouldNotBeInRange(range: IntRange) = this.`should not be in range`(range)
infix fun Long.shouldNotBeInRange(range: LongRange) = this.`should not be in range`(range)

infix fun <T> Array<T>?.shouldEqual(theOther: Array<T>?) = this `should equal` theOther
infix fun <T> Iterable<T>?.shouldEqual(theOther: Iterable<T>?) = this `should equal` theOther

infix fun Any?.shouldBe(theOther: Any?) = this `should be` theOther
infix fun Any?.shouldNotBe(theOther: Any?) = this `should not be` theOther

infix fun <T> Array<T>.shouldContain(theThing: T) = this `should contain` theThing
infix fun <T> Array<T>.shouldNotContain(theThing: T) = this `should not contain` theThing

infix fun <T> Iterable<T>.shouldContain(theThing: T) = this `should contain` theThing
infix fun <T> Iterable<T>.shouldNotContain(theThing: T) = this `should not contain` theThing

infix fun Any?.shouldBeInstanceOf(className: Class<*>) = this `should be instance of` className
infix fun Any?.shouldNotBeInstanceOf(className: Class<*>) = this `should not be instance of` className

/*
Map
 */

infix fun <R, T> Map<R, T>.shouldHaveKey(theKey: R) = this `should have key` theKey
infix fun <R, T> Map<R, T>.shouldNotHaveKey(theKey: R) = this `should not have key` theKey

infix fun <R, T> Map<R, T>.shouldHaveValue(theValue: T) = this `should have value` theValue
infix fun <R, T> Map<R, T>.shouldNotHaveValue(theValue: T) = this `should not have value` theValue

infix fun <R, T> Map<R, T>.shouldContain(thePair: Pair<R, T>) = this `should contain` thePair
infix fun <R, T> Map<R, T>.shouldNotContain(thePair: Pair<R, T>) = this `should not contain` thePair

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
