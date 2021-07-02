package org.amshove.kluent.internal

import org.amshove.kluent.hardFail
import kotlin.reflect.KClass

/** Asserts that a [blockResult] is a failure with the specific exception type being thrown. */
@PublishedApi
internal actual fun <T : Throwable> checkResultIsFailure(exceptionClass: KClass<T>, message: String?, blockResult: Result<Unit>): T {
    blockResult.fold(
            onSuccess = {
                val msg = messagePrefix(message)
                hardFail(msg + "Expected an exception of ${exceptionClass.java} to be thrown, but was completed successfully.")
            },
            onFailure = { e ->
                if (exceptionClass.java.isInstance(e)) {
                    @Suppress("UNCHECKED_CAST")
                    return e as T
                }

                hardFail(messagePrefix(message) + "Expected an exception of ${exceptionClass.java} to be thrown, but was $e")
            }
    )
}