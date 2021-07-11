package org.amshove.kluent.internal

import kotlin.reflect.KClass

@PublishedApi
internal actual fun hardFail(message: String?): Nothing {
    throw AssertionError(message)
}

@PublishedApi
internal actual fun <T : Throwable> checkResultIsFailure(exceptionClass: KClass<T>, message: String?, blockResult: Result<Unit>): T {
    blockResult.fold(
            onSuccess = {
                hardFail(messagePrefix(message) + "Expected an exception of $exceptionClass to be thrown, but was completed successfully.")
            },
            onFailure = { e ->
                if (exceptionClass.isInstance(e)) {
                    @Suppress("UNCHECKED_CAST")
                    return e as T
                }
                hardFail(messagePrefix(message) + "Expected an exception of $exceptionClass to be thrown, but was $e")
            }
    )
}
