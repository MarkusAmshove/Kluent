package org.amshove.kluent

import org.junit.ComparisonFailure
import kotlin.reflect.KClass

infix fun <T : Throwable> (() -> Any).`should throw`(expectedException: KClass<T>): ExceptionResult<T> {
    try {
        this.invoke()
        fail("There was an Exception expected to be thrown, but nothing was thrown", "$expectedException", "None")
    } catch (e: Throwable) {
        @Suppress("UNCHECKED_CAST")
        if (e.isA(ComparisonFailure::class)) throw e
        else if (e.isA(expectedException)) return ExceptionResult(e as T)
        else throw ComparisonFailure("Expected ${expectedException.javaObjectType} to be thrown", "${expectedException.javaObjectType}", "${e.javaClass}")
    }
}

infix fun <T : Throwable> (() -> Any).shouldThrow(expectedException: KClass<T>) = this `should throw` expectedException


infix fun <T : Throwable> (() -> Any).`should not throw`(expectedException: KClass<T>) {
    try {
        this.invoke()
    } catch (e: Throwable) {
        if (expectedException.isAnyException()) {
            fail("Expected no Exception to be thrown", "No Exception", "${e.javaClass}")
        }
        if (e.isA(expectedException))
            fail("Expected ${expectedException.javaObjectType} to not be thrown", "${expectedException.javaObjectType}", "${e.javaClass}")
    }
}

infix fun <T : Throwable> (() -> Any).shouldNotThrow(expectedException: KClass<T>) = this `should not throw` expectedException

@Deprecated("Use `should throw` instead", ReplaceWith("x `should throw` expectedException"))
infix fun <T : Throwable> (() -> Any).`should throw the Exception`(expectedException: KClass<T>): ExceptionResult<T>
        = this `should throw` expectedException

@Deprecated("User shouldThrow instead", ReplaceWith("x shouldThrow expectedException"))
infix fun <T : Throwable> (() -> Any).shouldThrowTheException(expectedException: KClass<T>): ExceptionResult<T> = this shouldThrow expectedException

infix fun <T : Throwable> (() -> Any).`should not throw the Exception`(expectedException: KClass<T>): NotThrowExceptionResult {
    try {
        this.invoke()
        return NotThrowExceptionResult(noException)
    } catch (e: Throwable) {
        if (expectedException.isAnyException()) {
            fail("Expected no Exception to be thrown", "No Exception", "${e.javaClass}")
        }
        return NotThrowExceptionResult(e)
    }
}

infix fun <T : Throwable> (() -> Any).shouldNotThrowTheException(expectedException: KClass<T>): NotThrowExceptionResult = this `should not throw the Exception` expectedException


infix fun <T : Throwable> ExceptionResult<T>.`with message`(theMessage: String): ExceptionResult<T> {
    this.exceptionMessage `should equal` theMessage
    return this
}

infix fun <T : Throwable> ExceptionResult<T>.withMessage(theMessage: String) = this `with message` theMessage


infix fun NotThrowExceptionResult.`with message`(theMessage: String): NotThrowExceptionResult {
    this.exceptionMessage `should not equal` theMessage
    return this;
}

infix fun NotThrowExceptionResult.withMessage(theMessage: String) = this `with message` theMessage


infix fun <T : Throwable> ExceptionResult<T>.`with cause`(expectedCause: KClass<out Throwable>): ExceptionResult<T> {
    this.exceptionCause `should be instance of` expectedCause.java
    return this
}

infix fun <T : Throwable> ExceptionResult<T>.withCause(expectedCause: KClass<out Throwable>) = this `with cause` expectedCause


infix fun NotThrowExceptionResult.`with cause`(expectedCause: KClass<out Throwable>): NotThrowExceptionResult {
    this.exceptionCause `should not be instance of` expectedCause.java
    return this
}

infix fun NotThrowExceptionResult.withCause(expectedCause: KClass<out Throwable>) = this `with cause` expectedCause


val AnyException = AnyExceptionType::class

class AnyExceptionType : Throwable()

internal val noException = Exception("None")
internal fun Throwable.isA(expected: KClass<out Throwable>) = expected.isAnyException() || expected.java.isAssignableFrom(this.javaClass)
internal fun <T : Throwable> KClass<T>.isAnyException() = this.javaObjectType == AnyException.javaObjectType
internal fun fail(message: String, expected: String, actual: String): Nothing = throw ComparisonFailure(message, expected, actual)
internal fun <T> join(theArray: Array<T>): String = theArray.joinToString(", ")
internal fun <T> join(theIterable: Iterable<T>): String = theIterable.joinToString(", ")
internal fun <R, T> join(theMap: Map<R, T>): String = theMap.entries.joinToString(", ")

