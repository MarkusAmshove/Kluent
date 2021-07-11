package org.amshove.kluent

import org.junit.ComparisonFailure

/** An error that bundles multiple other [Throwable]s together */
actual class MultiAssertionError actual constructor(errors: List<Throwable>) : AssertionError(createMessage(errors)) {
    companion object {
        private fun createMessage(errors: List<Throwable>) = buildString {
            append("The following ")

            if (errors.size == 1) {
                append("assertion")
            } else {
                append(errors.size).append(" assertions")
            }
            append(" failed:\n")

            if (errors.size == 1) {
                append(formatException(errors[0]))
                stacktraces.throwableLocation(errors[0])?.let {
                    append("at ").append(it)
                }
            } else {
                for ((i, err) in errors.withIndex()) {
                    append(formatException(err, i))
                    stacktraces.throwableLocation(err)?.let {
                        append("at ").append(it).append(System.lineSeparator())
                    }
                }
            }
        }

        private fun formatException(error: Throwable, errorIndex: Int? = null): String {
            when (error) {
                is ComparisonFailure -> {
                    return if (errorIndex == null) {
                        "Are not equivalent:\nExpected:\n${error.expected}\nbut was:\n${error.actual}".trimMargin()
                    } else {
                        "${errorIndex + 1}) Are not equivalent:\nExpected:\n${error.expected}but was:\n${error.actual}".trimMargin()
                    }
                }
                else -> {
                    return if (errorIndex == null) {
                        if (error.message == null) {
                            ""
                        } else {
                            "${error.message!!}\n"
                        }
                    } else {
                        "${errorIndex + 1}) ${error.message}\n"
                    }
                }
            }
        }
    }
}

actual fun assertionError(error: Throwable): Throwable {
    val message = buildString {
        append("The following assertion failed:\n")

        append(error.message).append(System.lineSeparator())
        stacktraces.throwableLocation(error)?.let {
            append("at ").append(it).append(System.lineSeparator())
        }
    }
    val t = AssertionError(message)
    stacktraces.cleanStackTrace(t)
    return t
}

