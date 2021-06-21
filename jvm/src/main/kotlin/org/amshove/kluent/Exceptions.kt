package org.amshove.kluent

import java.lang.RuntimeException
import kotlin.reflect.KClass

fun invoking(function: () -> Any?): () -> Any? = function

fun coInvoking(function: suspend () -> Any?): suspend () -> Any? = function

infix fun <T : Throwable> (() -> Any?).shouldThrow(expectedException: KClass<T>): ExceptionResult<T> {
    try {
        this.invoke()
        fail("There was an Exception expected to be thrown, but nothing was thrown", "$expectedException", "None")
    } catch (e: Throwable) {
        @Suppress("UNCHECKED_CAST")
        when {
            e.isA(ComparisonFailure::class) -> throw e
            e.isA(expectedException) -> return ExceptionResult(e as T)
            else -> throw ComparisonFailure("Expected ${expectedException.javaObjectType} to be thrown", "${expectedException.javaObjectType}", "${e.javaClass}")
        }
    }
}

suspend infix fun <T : Throwable> (suspend () -> Any?).shouldThrow(expectedException: KClass<T>): ExceptionResult<T> {
    try {
        this.invoke()
        fail("There was an Exception expected to be thrown, but nothing was thrown", "$expectedException", "None")
    } catch (e: Throwable) {
        @Suppress("UNCHECKED_CAST")
        when {
            e.isA(ComparisonFailure::class) -> throw e
            e.isA(expectedException) -> return ExceptionResult(e as T)
            else -> throw ComparisonFailure("Expected ${expectedException.javaObjectType} to be thrown", "${expectedException.javaObjectType}", "${e.javaClass}")
        }
    }
}

infix fun <T : Throwable> (() -> Any?).shouldNotThrow(expectedException: KClass<T>): NotThrowExceptionResult {
    return try {
        this.invoke()
        NotThrowExceptionResult(noException)
    } catch (e: Throwable) {
        if (expectedException.isAnyException()) {
            fail("Expected no Exception to be thrown", "No Exception", "${e.javaClass}")
        }
        if (e.isA(expectedException)) {
            fail("Expected no Exception of type ${e::class.qualifiedName} to be thrown", "No Exception", e.toInformativeString())
        }
        NotThrowExceptionResult(e)
    }
}

suspend infix fun <T : Throwable> (suspend () -> Any?).shouldNotThrow(expectedException: KClass<T>): NotThrowExceptionResult {
    return try {
        this.invoke()
        NotThrowExceptionResult(noException)
    } catch (e: Throwable) {
        if (expectedException.isAnyException()) {
            fail("Expected no Exception to be thrown", "No Exception", "${e.javaClass}")
        }
        if (e.isA(expectedException)) {
            fail("Expected no Exception of type ${e::class.qualifiedName} to be thrown", "No Exception", e.toInformativeString())
        }
        NotThrowExceptionResult(e)
    }
}

infix fun <T : Throwable> (() -> Any?).shouldThrow(expectedException: T) {
    try {
        this.invoke()
        fail("There was an Exception expected to be thrown, but nothing was thrown", "$expectedException", "None")
    } catch (e: Throwable) {
        if (e != expectedException) {
            throw ComparisonFailure("Expected $expectedException to be thrown", "$expectedException", "${e.javaClass}")
        }
    }
}

suspend infix fun <T : Throwable> (suspend () -> Any?).shouldThrow(expectedException: T) {
    try {
        this.invoke()
        fail("There was an Exception expected to be thrown, but nothing was thrown", "$expectedException", "None")
    } catch (e: Throwable) {
        if (e != expectedException) {
            throw ComparisonFailure("Expected $expectedException to be thrown", "$expectedException", "${e.javaClass}")
        }
    }
}

@Deprecated("Use shouldThrow instead", ReplaceWith("this shouldThrow expectedException"))
infix fun <T : Throwable> (() -> Any).shouldThrowTheException(expectedException: KClass<T>): ExceptionResult<T> = this shouldThrow expectedException

@Deprecated("Use shouldNotThrow instead", ReplaceWith("this shouldNotThrow expectedException"))
infix fun <T : Throwable> (() -> Any).shouldNotThrowTheException(expectedException: KClass<T>): NotThrowExceptionResult = this.shouldNotThrow(expectedException)

infix fun <T : Throwable> ExceptionResult<T>.withMessage(theMessage: String): ExceptionResult<T> {
    this.exceptionMessage shouldBeEqualTo theMessage
    return this
}

infix fun NotThrowExceptionResult.withMessage(theMessage: String): NotThrowExceptionResult {
    this.exceptionMessage shouldNotBeEqualTo theMessage
    return this
}

infix fun <T : Throwable> ExceptionResult<T>.withCause(expectedCause: KClass<out Throwable>): ExceptionResult<T> {
    this.exceptionCause shouldBeInstanceOf expectedCause.java
    return this
}

infix fun NotThrowExceptionResult.withCause(expectedCause: KClass<out Throwable>): NotThrowExceptionResult {
    this.exceptionCause shouldNotBeInstanceOf expectedCause.java
    return this
}

infix fun <T: Throwable, R> ExceptionResult<T>.with(block: T.() -> R): R = block(exception)

val AnyException = AnyExceptionType::class

class AnyExceptionType : Throwable()

internal val noException = Exception("None")
internal fun Throwable.isA(expected: KClass<out Throwable>) = expected.isAnyException() || expected.java.isAssignableFrom(this.javaClass)
internal fun <T : Throwable> KClass<T>.isAnyException() = this.javaObjectType == AnyException.javaObjectType
internal fun fail(message: String, expected: String, actual: String): Nothing = throw ComparisonFailure(message, expected, actual)
internal fun <T> join(theArray: Array<T>): String = theArray.joinToString(", ")
internal fun <T> join(theIterable: Iterable<T>): String = theIterable.joinToString(", ")
internal fun <R, T> join(theMap: Map<R, T>): String = theMap.entries.joinToString(", ")

private fun Throwable.toInformativeString() = when (this.message) {
    null -> "${this::class.qualifiedName}"
    else -> "${this::class.qualifiedName} (Message: \"${this.message}\")"
}