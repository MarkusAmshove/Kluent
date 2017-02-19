package org.amshove.kluent

import org.junit.ComparisonFailure
import kotlin.reflect.KClass

infix fun <T : Exception> (() -> Any).`should throw`(expectedException: KClass<T>) {
    try {
        this.invoke()
        fail("There was an Exception expected to be thrown, but nothing was thrown", "$expectedException", "None")
    } catch (e: Exception) {
        if (!e.isA(expectedException))
            throw ComparisonFailure("Expected ${expectedException.javaObjectType} to be thrown", "${expectedException.javaObjectType}", "${e.javaClass}")
    }
}

infix fun <T : Exception> (() -> Any).shouldThrow(expectedException: KClass<T>) = this `should throw` expectedException


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

infix fun <T : Exception> (() -> Any).shouldNotThrow(expectedException: KClass<T>) = this `should not throw` expectedException


infix fun <T : Exception> (() -> Any).`should throw the Exception`(expectedException: KClass<T>): ExceptionResult {
    try {
        this.invoke()
        fail("There was an Exception expected to be thrown, but nothing was thrown", "$expectedException", "None")
    } catch (e: Exception) {
        if (e.isA(expectedException)) return ExceptionResult(e)
        else throw ComparisonFailure("Expected ${expectedException.javaObjectType} to be thrown", "${expectedException.javaObjectType}", "${e.javaClass}")
    }
}

infix fun <T : Exception> (() -> Any).shouldThrowTheException(expectedException: KClass<T>): ExceptionResult = this `should throw the Exception` expectedException


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

infix fun <T : Exception> (() -> Any).shouldNotThrowTheException(expectedException: KClass<T>): NotThrowExceptionResult = this `should not throw the Exception` expectedException


infix fun ExceptionResult.`with message`(theMessage: String) {
    this.exceptionMessage `should equal` theMessage
}

infix fun ExceptionResult.withMessage(theMessage: String) = this `with message` theMessage


infix fun NotThrowExceptionResult.`with message`(theMessage: String) {
    this.exceptionMessage `should not equal` theMessage
}

infix fun NotThrowExceptionResult.withMessage(theMessage: String) = this `with message` theMessage


infix fun ExceptionResult.`with cause`(expectedCause: KClass<out Exception>) {
    this.exceptionCause `should be instance of` expectedCause.java
}

infix fun ExceptionResult.withCause(expectedCause: KClass<out Exception>) = this `with cause` expectedCause


infix fun NotThrowExceptionResult.`with cause`(expectedCause: KClass<out Exception>) {
    this.exceptionCause `should not be instance of` expectedCause.java
}

infix fun NotThrowExceptionResult.withCause(expectedCause: KClass<out Exception>) = this `with cause` expectedCause


val AnyException = AnyExceptionType::class

class AnyExceptionType : Exception()

internal val noException = Exception("None")
internal fun Exception.isA(expected: KClass<out Exception>) = expected.isAnyException() || expected.java.isAssignableFrom(this.javaClass)
internal fun <T : Exception> KClass<T>.isAnyException() = this.javaObjectType == AnyException.javaObjectType
internal fun fail(message: String, expected: String, actual: String): Nothing = throw ComparisonFailure(message, expected, actual)
internal fun <T> join(theArray: Array<T>): String = theArray.joinToString(", ")
internal fun <T> join(theIterable: Iterable<T>): String = theIterable.joinToString(", ")
internal fun <R, T> join(theMap: Map<R, T>): String = theMap.entries.joinToString(", ")

