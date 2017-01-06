@file:Suppress("FINAL_UPPER_BOUND")

package org.amshove.kluent

import org.junit.Assert.*
import org.junit.ComparisonFailure
import kotlin.reflect.KClass

infix fun Any?.`should equal`(theOther: Any?) = assertEquals(theOther, this)
infix fun Any?.`should not equal`(theOther: Any?) = assertNotEquals(theOther, this)

infix fun <T : Boolean> T?.`should equal to`(theOther: T?) = assertEquals(theOther, this)
infix fun <T : Byte> T?.`should equal to`(theOther: T?) = assertEquals(theOther, this)
infix fun <T : Short> T?.`should equal to`(theOther: T?) = assertEquals(theOther, this)
infix fun <T : Int> T?.`should equal to`(theOther: T?) = assertEquals(theOther, this)
infix fun <T : Long> T?.`should equal to`(theOther: T?) = assertEquals(theOther, this)
infix fun <T : Float> T?.`should equal to`(theOther: T?) = assertEquals(theOther, this)
infix fun <T : Double> T?.`should equal to`(theOther: T?) = assertEquals(theOther, this)
infix fun <T : String> T?.`should equal to`(theOther: T?) = assertEquals(theOther, this)
infix fun CharSequence.`should start with`(theOther: CharSequence) = assertTrue("Expected the CharSequence $this to start with $theOther", this.startsWith(theOther))
infix fun CharSequence.`should end with`(theOther: CharSequence) = assertTrue("Expected the CharSequence $this to end with $theOther", this.endsWith(theOther))
infix fun CharSequence.`should contain`(theOther: CharSequence) = assertTrue("Expected the CharSequence $this to contain $theOther", this.contains(theOther))
infix fun CharSequence.`should match`(regex: String) = assertTrue("Expected $this to match $regex", this.matches(Regex(regex)))
infix fun CharSequence.`should match`(regex: Regex) = assertTrue("Expected $this to match ${regex.pattern}", this.matches(regex))

infix fun <T : Boolean> T?.`should not equal to`(theOther: T?) = assertNotEquals(theOther, this)
infix fun <T : Byte> T?.`should not equal to`(theOther: T?) = assertNotEquals(theOther, this)
infix fun <T : Short> T?.`should not equal to`(theOther: T?) = assertNotEquals(theOther, this)
infix fun <T : Int> T?.`should not equal to`(theOther: T?) = assertNotEquals(theOther, this)
infix fun <T : Long> T?.`should not equal to`(theOther: T?) = assertNotEquals(theOther, this)
infix fun <T : Float> T?.`should not equal to`(theOther: T?) = assertNotEquals(theOther, this)
infix fun <T : Double> T?.`should not equal to`(theOther: T?) = assertNotEquals(theOther, this)
infix fun <T : String> T?.`should not equal to`(theOther: T?) = assertNotEquals(theOther, this)
infix fun CharSequence.`should not start with`(theOther: CharSequence) = assertFalse("Expected the CharSequence $this to not start with $theOther", this.startsWith(theOther))
infix fun CharSequence.`should not end with`(theOther: CharSequence) = assertFalse("Expected the CharSequence $this to not end with $theOther", this.endsWith(theOther))
infix fun CharSequence.`should not contain`(theOther: CharSequence) = assertFalse("Expected the CharSequence $this to not contain $theOther", this.contains(theOther))
infix fun CharSequence.`should not match`(regex: String) = assertFalse("Expected $this to not match $regex", this.matches(Regex(regex)))
infix fun CharSequence.`should not match`(regex: Regex) = assertFalse("Expected $this to not match ${regex.pattern}", this.matches(regex))

infix fun Byte.`should be greater than`(theOther: Byte) = assertTrue("Expected $this to be greater than $theOther", this > theOther)
infix fun Short.`should be greater than`(theOther: Short) = assertTrue("Expected $this to be greater than $theOther", this > theOther)
infix fun Int.`should be greater than`(theOther: Int) = assertTrue("Expected $this to be greater than $theOther", this > theOther)
infix fun Long.`should be greater than`(theOther: Long) = assertTrue("Expected $this to be greater than $theOther", this > theOther)
infix fun Float.`should be greater than`(theOther: Float) = assertTrue("Expected $this to be greater than $theOther", this > theOther)
infix fun Double.`should be greater than`(theOther: Double) = assertTrue("Expected $this to be greater than $theOther", this > theOther)

infix fun Byte.`should not be greater than`(theOther: Byte) = assertTrue("Expected $this to not be greater than $theOther", this < theOther)
infix fun Short.`should not be greater than`(theOther: Short) = assertTrue("Expected $this to not be greater than $theOther", this < theOther)
infix fun Int.`should not be greater than`(theOther: Int) = assertTrue("Expected $this to not be greater than $theOther", this < theOther)
infix fun Long.`should not be greater than`(theOther: Long) = assertTrue("Expected $this to not be greater than $theOther", this < theOther)
infix fun Float.`should not be greater than`(theOther: Float) = assertTrue("Expected $this to not be greater than $theOther", this < theOther)
infix fun Double.`should not be greater than`(theOther: Double) = assertTrue("Expected $this to not be greater than $theOther", this < theOther)

infix fun Byte.`should be greater or equal to`(theOther: Byte) = assertTrue("Expected $this to be greater or equal to $theOther", this >= theOther)
infix fun Short.`should be greater or equal to`(theOther: Short) = assertTrue("Expected $this to be greater or equal to $theOther", this >= theOther)
infix fun Int.`should be greater or equal to`(theOther: Int) = assertTrue("Expected $this to be greater or equal to $theOther", this >= theOther)
infix fun Long.`should be greater or equal to`(theOther: Long) = assertTrue("Expected $this to be greater or equal to $theOther", this >= theOther)
infix fun Float.`should be greater or equal to`(theOther: Float) = assertTrue("Expected $this to be greater or equal to $theOther", this >= theOther)
infix fun Double.`should be greater or equal to`(theOther: Double) = assertTrue("Expected $this to be greater or equal to $theOther", this >= theOther)

infix fun Byte.`should not be greater or equal to`(theOther: Byte) = assertTrue("Expected $this to be not be greater or equal to $theOther", this < theOther)
infix fun Short.`should not be greater or equal to`(theOther: Short) = assertTrue("Expected $this to not be greater or equal to $theOther", this < theOther)
infix fun Int.`should not be greater or equal to`(theOther: Int) = assertTrue("Expected $this to not be greater or equal to $theOther", this < theOther)
infix fun Long.`should not be greater or equal to`(theOther: Long) = assertTrue("Expected $this to not be greater or equal to $theOther", this < theOther)
infix fun Float.`should not be greater or equal to`(theOther: Float) = assertTrue("Expected $this to not be greater or equal to $theOther", this < theOther)
infix fun Double.`should not be greater or equal to`(theOther: Double) = assertTrue("Expected $this to not be greater or equal to $theOther", this < theOther)

infix fun Byte.`should be less than`(theOther: Byte) = assertTrue("Expected $this to be less than $theOther", this < theOther)
infix fun Short.`should be less than`(theOther: Short) = assertTrue("Expected $this to be less than $theOther", this < theOther)
infix fun Int.`should be less than`(theOther: Int) = assertTrue("Expected $this to be less than $theOther", this < theOther)
infix fun Long.`should be less than`(theOther: Long) = assertTrue("Expected $this to be less than $theOther", this < theOther)
infix fun Float.`should be less than`(theOther: Float) = assertTrue("Expected $this to be less than $theOther", this < theOther)
infix fun Double.`should be less than`(theOther: Double) = assertTrue("Expected $this to be less than $theOther", this < theOther)

infix fun Byte.`should not be less than`(theOther: Byte) = assertTrue("Expected $this to not be less than $theOther", this >= theOther)
infix fun Short.`should not be less than`(theOther: Short) = assertTrue("Expected $this to not be less than $theOther", this >= theOther)
infix fun Int.`should not be less than`(theOther: Int) = assertTrue("Expected $this to not be less than $theOther", this >= theOther)
infix fun Long.`should not be less than`(theOther: Long) = assertTrue("Expected $this to not be less than $theOther", this >= theOther)
infix fun Float.`should not be less than`(theOther: Float) = assertTrue("Expected $this to not be less than $theOther", this >= theOther)
infix fun Double.`should not be less than`(theOther: Double) = assertTrue("Expected $this to not be less than $theOther", this >= theOther)

infix fun Byte.`should be less or equal to`(theOther: Byte) = assertTrue("Expected $this to be less or equal to $theOther", this <= theOther)
infix fun Short.`should be less or equal to`(theOther: Short) = assertTrue("Expected $this to be less or equal to $theOther", this <= theOther)
infix fun Int.`should be less or equal to`(theOther: Int) = assertTrue("Expected $this to be less or equal to $theOther", this <= theOther)
infix fun Long.`should be less or equal to`(theOther: Long) = assertTrue("Expected $this to be less or equal to $theOther", this <= theOther)
infix fun Float.`should be less or equal to`(theOther: Float) = assertTrue("Expected $this to be less or equal to $theOther", this <= theOther)
infix fun Double.`should be less or equal to`(theOther: Double) = assertTrue("Expected $this to be less or equal to $theOther", this <= theOther)

infix fun Byte.`should not be less or equal to`(theOther: Byte) = assertTrue("Expected $this to not be less or equal to $theOther", this > theOther)
infix fun Short.`should not be less or equal to`(theOther: Short) = assertTrue("Expected $this to not be less or equal to $theOther", this > theOther)
infix fun Int.`should not be less or equal to`(theOther: Int) = assertTrue("Expected $this to not be less or equal to $theOther", this > theOther)
infix fun Long.`should not be less or equal to`(theOther: Long) = assertTrue("Expected $this to not be less or equal to $theOther", this > theOther)
infix fun Float.`should not be less or equal to`(theOther: Float) = assertTrue("Expected $this to not be less or equal to $theOther", this > theOther)
infix fun Double.`should not be less or equal to`(theOther: Double) = assertTrue("Expected $this to not be less or equal to $theOther", this > theOther)

fun Byte.`should be positive`() = assertTrue("Expected $this to be positive", this > 0)
fun Short.`should be positive`() = assertTrue("Expected $this to be positive", this > 0)
fun Int.`should be positive`() = assertTrue("Expected $this to be positive", this > 0)
fun Long.`should be positive`() = assertTrue("Expected $this to be positive", this > 0)
fun Float.`should be positive`() = assertTrue("Expected $this to be positive", this > 0)
fun Double.`should be positive`() = assertTrue("Expected $this to be positive", this > 0)

fun Byte.`should be negative`() = assertTrue("Expected $this to be negative", this < 0)
fun Short.`should be negative`() = assertTrue("Expected $this to be negative", this < 0)
fun Int.`should be negative`() = assertTrue("Expected $this to be negative", this < 0)
fun Long.`should be negative`() = assertTrue("Expected $this to be negative", this < 0)
fun Float.`should be negative`() = assertTrue("Expected $this to be negative", this < 0)
fun Double.`should be negative`() = assertTrue("Expected $this to be negative", this < 0)

fun Byte.`should be in range`(lowerBound: Byte, upperBound: Byte) = assertTrue("Expected $this to be between (and including) $lowerBound and $upperBound", this >= lowerBound && this <= upperBound)
fun Short.`should be in range`(lowerBound: Short, upperBound: Short) = assertTrue("Expected $this to be between (and including) $lowerBound and $upperBound", this >= lowerBound && this <= upperBound)
fun Int.`should be in range`(lowerBound: Int, upperBound: Int) = assertTrue("Expected $this to be between (and including) $lowerBound and $upperBound", this >= lowerBound && this <= upperBound)
fun Long.`should be in range`(lowerBound: Long, upperBound: Long) = assertTrue("Expected $this to be between (and including) $lowerBound and $upperBound", this >= lowerBound && this <= upperBound)
fun Float.`should be in range`(lowerBound: Float, upperBound: Float) = assertTrue("Expected $this to be between (and including) $lowerBound and $upperBound", this >= lowerBound && this <= upperBound)
fun Double.`should be in range`(lowerBound: Double, upperBound: Double) = assertTrue("Expected $this to be between (and including) $lowerBound and $upperBound", this >= lowerBound && this <= upperBound)

fun Byte.`should not be in range`(lowerBound: Byte, upperBound: Byte) = assertTrue("Expected $this to not be between (and including) $lowerBound and $upperBound", this < lowerBound || this > upperBound)
fun Short.`should not be in range`(lowerBound: Short, upperBound: Short) = assertTrue("Expected $this to not be between (and including) $lowerBound and $upperBound", this < lowerBound || this > upperBound)
fun Int.`should not be in range`(lowerBound: Int, upperBound: Int) = assertTrue("Expected $this to not be between (and including) $lowerBound and $upperBound", this < lowerBound || this > upperBound)
fun Long.`should not be in range`(lowerBound: Long, upperBound: Long) = assertTrue("Expected $this to not be between (and including) $lowerBound and $upperBound", this < lowerBound || this > upperBound)
fun Float.`should not be in range`(lowerBound: Float, upperBound: Float) = assertTrue("Expected $this to not be between (and including) $lowerBound and $upperBound", this < lowerBound || this > upperBound)
fun Double.`should not be in range`(lowerBound: Double, upperBound: Double) = assertTrue("Expected $this to not be between (and including) $lowerBound and $upperBound", this < lowerBound || this > upperBound)

infix fun Byte.`should be in range`(range: IntRange) = (this as Int).`should be in range`(range)
infix fun Short.`should be in range`(range: IntRange) = (this as Int).`should be in range`(range)
infix fun Int.`should be in range`(range: IntRange) = this.`should be in range`(range.first, range.last)
infix fun Long.`should be in range`(range: LongRange) = this.`should be in range`(range.first, range.last)

infix fun Byte.`should not be in range`(range: IntRange) = (this as Int).`should not be in range`(range)
infix fun Short.`should not be in range`(range: IntRange) = (this as Int).`should not be in range`(range)
infix fun Int.`should not be in range`(range: IntRange) = this.`should not be in range`(range.first, range.last)
infix fun Long.`should not be in range`(range: LongRange) = this.`should not be in range`(range.first, range.last)

infix fun <T> Array<T>?.`should equal`(theOther: Array<T>?) = assertArrayEquals(theOther, this)
infix fun <T> Iterable<T>?.`should equal`(theOther: Iterable<T>?) = assertEquals(theOther, this)

infix fun Any?.`should be`(theOther: Any?) = assertSame(theOther, this)
infix fun Any?.`should not be`(theOther: Any?) = assertNotSame(theOther, this)

infix fun Any?.`should be instance of`(className: Class<*>) = assertTrue("Expected $this to be an instance of $className", className.isInstance(this))
infix fun Any?.`should not be instance of`(className: Class<*>) = assertFalse("Expected $this to not be an instance of $className", className.isInstance(this))

infix fun <T> Array<T>.`should contain`(theThing: T) = if (this.contains(theThing)) Unit else fail("$this should contain $theThing", "$theThing", join(this))
infix fun <T> Array<T>.`should not contain`(theThing: T) = if (!this.contains(theThing)) Unit else fail("$this should not contain $theThing", "$theThing", join(this))

infix fun <T> Iterable<T>.`should contain`(theThing: T) = if (this.contains(theThing)) Unit else fail("$this should contain $theThing", "$theThing", join(this))
infix fun <T> Iterable<T>.`should not contain`(theThing: T) = if (!this.contains(theThing)) Unit else fail("$this should not contain $theThing", "$theThing", join(this))

/*
MAP
 */

infix fun <R, T> Map<R, T>.`should have key`(theKey: R) = if (this.containsKey(theKey)) Unit else fail("$this should contain key $theKey", "$theKey", join(this.keys))
infix fun <R, T> Map<R, T>.`should not have key`(theKey: R) = if (!this.containsKey(theKey)) Unit else fail("$this should not contain key $theKey", "$theKey", join(this.keys))

infix fun <R, T> Map<R, T>.`should have value`(theValue: T) = if (this.values.contains(theValue)) Unit else fail("$this should contain the value $theValue", "$theValue", join(this.values))
infix fun <R, T> Map<R, T>.`should not have value`(theValue: T) = if (!this.values.contains(theValue)) Unit else fail("$this should not contain the value $theValue", "$theValue", join(this.values))

infix fun <R, T> Map<R, T>.`should contain`(theThing: Pair<R, T>) = if (this[theThing.first] == theThing.second) Unit else fail("$this should contain $theThing", "$theThing", join(this))
infix fun <R, T> Map<R, T>.`should not contain`(theThing: Pair<R, T>) = if (this[theThing.first] != theThing.second) Unit else fail("$this should not contain $theThing", "$theThing", join(this))

infix fun <T> Any?.`should be in`(array: Array<T>) = if (array.contains(this)) Unit else fail("$this should be in $array", "$this", join(array))
infix fun <T> Any?.`should not be in`(array: Array<T>) = if (!array.contains(this)) Unit else fail("$this should not be in $array", "$this", join(array))

infix fun <T> Any?.`should be in`(iterable: Iterable<T>) = if (iterable.contains(this)) Unit else fail("$this should be in $iterable", "$this", join(iterable))
infix fun <T> Any?.`should not be in`(iterable: Iterable<T>) = if (!iterable.contains(this)) Unit else fail("$this should not be in $iterable", "$this", join(iterable))

infix fun <T : Exception> (() -> Any).`should throw`(expectedException: KClass<T>) {
    try {
        this.invoke()
        fail("There was an Exception expected to be thrown, but nothing was thrown", "$expectedException", "None")
    } catch (e: Exception) {
        if (!e.isA(expectedException))
            throw ComparisonFailure("Expected ${expectedException.javaObjectType} to be thrown", "${expectedException.javaObjectType}", "${e.javaClass}")
    }
}

infix fun <T : Exception> (() -> Any).`should throw the Exception`(expectedException: KClass<T>): ExceptionResult {
    try {
        this.invoke()
        fail("There was an Exception expected to be thrown, but nothing was thrown", "$expectedException", "None")
    } catch (e: Exception) {
        if (e.isA(expectedException)) return ExceptionResult(e)
        else throw ComparisonFailure("Expected ${expectedException.javaObjectType} to be thrown", "${expectedException.javaObjectType}", "${e.javaClass}")
    }
}

infix fun <T : Exception> (() -> Any).`should not throw`(expectedException: KClass<T>) {
    try {
        this.invoke()
    } catch (e: Exception) {
        if (expectedException.isAnyException()) {
            fail("Expected no Exception to be thrown", "No Exception", "${e.javaClass}")
        }
        if (e.isA(expectedException))
            fail("Expected ${expectedException.javaObjectType} to not be thrown", "${e.javaClass}", "${expectedException.javaObjectType}")
    }
}

infix fun <T : Exception> (() -> Any).`should not throw the Exception`(expectedException: KClass<T>): NotThrowExceptionResult {
    try {
        this.invoke()
        return NotThrowExceptionResult(noException)
    } catch (e: Exception) {
        if (expectedException.isAnyException()) {
            fail("Expected no Exception to be thrown", "No Exception", "${e.javaClass}")
        }
        return NotThrowExceptionResult(e)
    }
}

infix fun ExceptionResult.`with message`(theMessage: String) {
    this.exceptionMessage `should equal` theMessage
}

infix fun NotThrowExceptionResult.`with message`(theMessage: String) {
    this.exceptionMessage `should not equal` theMessage
}

val AnyException = AnyExceptionType::class

class AnyExceptionType : Exception()

private val noException = Exception("None")
private fun Exception.isA(expected: KClass<out Exception>) = expected.isAnyException() || expected.java.isAssignableFrom(this.javaClass)
private fun <T : Exception> KClass<T>.isAnyException() = this.javaObjectType == AnyException.javaObjectType
private fun fail(message: String, expected: String, actual: String): Nothing = throw ComparisonFailure(message, expected, actual)
private fun <T> join(theArray: Array<T>): String = theArray.joinToString(", ")
private fun <T> join(theIterable: Iterable<T>): String = theIterable.joinToString(", ")
private fun <R, T> join(theMap: Map<R, T>): String = theMap.entries.joinToString(", ")
