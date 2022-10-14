package org.amshove.kluent

import kotlin.reflect.KClass

infix fun <T : Throwable> (() -> Any?).`should throw`(expectedException: KClass<T>) =
    this.shouldThrow(expectedException)

suspend infix fun <T : Throwable> (suspend () -> Any?).`should throw`(expectedException: KClass<T>) = this.shouldThrow(expectedException)

infix fun <T : Throwable> (() -> Any?).`should not throw`(expectedException: KClass<T>) =
    this.shouldNotThrow(expectedException)

suspend infix fun <T : Throwable> (suspend () -> Any?).`should not throw`(expectedException: KClass<T>) = this.shouldNotThrow(expectedException)

@Deprecated("Use `should throw` instead", ReplaceWith("this `should throw` expectedException"))
infix fun <T : Throwable> (() -> Any).`should throw the Exception`(expectedException: KClass<T>) =
    this.shouldThrow(expectedException)

@Deprecated("Use `should not throw` instead", ReplaceWith("this `should not throw` expectedException"))
infix fun <T : Throwable> (() -> Any).`should not throw the Exception`(expectedException: KClass<T>) =
    this `should not throw` expectedException

infix fun <T : Throwable> ExceptionResult<T>.`with message`(theMessage: String) = this.withMessage(theMessage)

infix fun NotThrowExceptionResult.`with message`(theMessage: String) = this.withMessage(theMessage)

infix fun <T : Throwable> ExceptionResult<T>.`with cause`(expectedCause: KClass<out Throwable>) =
    this.withCause(expectedCause)

infix fun NotThrowExceptionResult.`with cause`(expectedCause: KClass<out Throwable>) = this.withCause(expectedCause)

infix fun <T : Throwable> (() -> Any?).`should throw`(expectedException: T) = this.shouldThrow(expectedException)

suspend infix fun <T : Throwable> (suspend () -> Any?).`should throw`(expectedException: T) = this.shouldThrow(expectedException)