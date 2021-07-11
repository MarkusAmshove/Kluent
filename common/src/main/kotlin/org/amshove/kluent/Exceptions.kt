package org.amshove.kluent

import kotlin.reflect.KClass

/**
 * Provides an assertSoftly-compatible way of reporting a failed assertion
 * All assertions should rely on it for error reporting.
 * Assertions that don't work with assertSoftly (for example shouldNotBeNull) can use hardFail
 */
expect fun fail(message: String?)

expect fun fail(message: String, expected: Any?, actual: Any?)

expect infix fun <T : Throwable> (() -> Any?).shouldThrow(expectedException: KClass<T>): ExceptionResult<T>
