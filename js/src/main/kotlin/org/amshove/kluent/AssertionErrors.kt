package org.amshove.kluent

/** An error that bundles multiple other [Throwable]s together */
actual class MultiAssertionError actual constructor(errors: List<Throwable>) : AssertionError(createMessage(errors)) {
    companion object {
        private fun createMessage(errors: List<Throwable>) = buildString {
            append("\nThe following ")

            if (errors.size == 1) {
                append("assertion")
            } else {
                append(errors.size).append(" assertions")
            }
            append(" failed:\n")

            if (errors.size == 1) {
                append(errors[0].message).append("\n")
                stacktraces.throwableLocation(errors[0])?.let {
                    append("\tat ").append(it).append("\n")
                }
            } else {
                for ((i, err) in errors.withIndex()) {
                    append(i + 1).append(") ").append(err.message).append("\n")
                    stacktraces.throwableLocation(err)?.let {
                        append("\tat ").append(it).append("\n")
                    }
                }
            }
        }
    }
}

actual fun assertionError(error: Throwable): Throwable {
    val message = buildString {
        append("\nThe following assertion failed:\n")

        append(error.message).append("\n")
        stacktraces.throwableLocation(error)?.let {
            append("\tat ").append(it).append("\n")
        }
    }
    val t = AssertionError(message)
    stacktraces.cleanStackTrace(t)
    return t
}

