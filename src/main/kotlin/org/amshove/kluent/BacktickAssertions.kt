@file:Suppress("FINAL_UPPER_BOUND")

package org.amshove.kluent

import org.junit.Assert.*
import org.junit.ComparisonFailure
import kotlin.reflect.KClass

infix fun Any?.`should equal`(theOther: Any?) = assertEquals(theOther, this)
infix fun Any?.`should not equal`(theOther: Any?) = assertNotEquals(theOther, this)

infix fun Any?.`should be`(theOther: Any?) = assertSame(theOther, this)
infix fun Any?.`should not be`(theOther: Any?) = assertNotSame(theOther, this)

infix fun Any?.`should be instance of`(className: Class<*>) = assertTrue("Expected $this to be an instance of $className", className.isInstance(this))
infix fun Any?.`should not be instance of`(className: Class<*>) = assertFalse("Expected $this to not be an instance of $className", className.isInstance(this))


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

internal val noException = Exception("None")
internal fun Exception.isA(expected: KClass<out Exception>) = expected.isAnyException() || expected.java.isAssignableFrom(this.javaClass)
internal fun <T : Exception> KClass<T>.isAnyException() = this.javaObjectType == AnyException.javaObjectType
internal fun fail(message: String, expected: String, actual: String): Nothing = throw ComparisonFailure(message, expected, actual)
internal fun <T> join(theArray: Array<T>): String = theArray.joinToString(", ")
internal fun <T> join(theIterable: Iterable<T>): String = theIterable.joinToString(", ")
internal fun <R, T> join(theMap: Map<R, T>): String = theMap.entries.joinToString(", ")
