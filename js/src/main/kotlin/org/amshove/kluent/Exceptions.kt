package org.amshove.kluent

import kotlin.reflect.KClass

/**
 * Provides an assertSoftly-compatible way of reporting a failed assertion
 * All assertions should rely on it for error reporting.
 * Assertions that don't work with assertSoftly (for example shouldNotBeNull) can use hardFail
 */
actual fun fail(message: String?) {
    try {
        throw AssertionError(message)
    } catch (ex: AssertionError) {
        if (errorCollector.getCollectionMode() == ErrorCollectionMode.Soft) {
            errorCollector.pushError(ex)
        } else {
            throw assertionError(ex)
        }
    }
}

actual fun fail(message: String, expected: Any?, actual: Any?) {
    try {
        throw AssertionError(message)
    } catch (ex: AssertionError) {
        if (errorCollector.getCollectionMode() == ErrorCollectionMode.Soft) {
            errorCollector.pushError(ex)
        } else {
            kotlin.test.asserter.fail(ex.message)
        }
    }
}

actual infix fun <T : Throwable> (() -> Any?).shouldThrow(expectedException: KClass<T>): ExceptionResult<T> {
    try {
        this.invoke()
        fail("There was an Exception expected to be thrown, but nothing was thrown", "$expectedException", "None")
        return ExceptionResult(expectedException as T)
    } catch (e: Throwable) {
        @Suppress("UNCHECKED_CAST")
        when (e) {
//            e.isA(ComparisonFailure::class) -> throw e
            is Throwable -> return ExceptionResult(e as T)
//            else -> throw ComparisonFailure("Expected ${expectedException.javaObjectType} to be thrown", "${expectedException.javaObjectType}", "${e.javaClass}")
            else -> throw AssertionError("Expected ${expectedException::class.simpleName} to be thrown but was ${e::class.simpleName}")
        }
    }
}

