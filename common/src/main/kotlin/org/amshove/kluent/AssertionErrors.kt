package org.amshove.kluent


class ComparisonFailure(val customMessage: String?, val expected: String?, val actual: String?) : RuntimeException(
    """${customMessage ?: ""}
        |Expected: <$expected> but was: <$actual>
    """.trimMargin().trim()
) {
    constructor(customMessage: String?, expected: Any?, actual: Any?)
            : this(customMessage, expected?.toString(), actual?.toString())
}

/** An error that bundles multiple other [Throwable]s together */
class MultiAssertionError(errors: List<Throwable>) : AssertionError(createMessage(errors)) {
    companion object {
        private fun createMessage(errors: List<Throwable>) = buildString {
            append("\nExpected no assertion to fail, but ")

            if (errors.size == 1) {
                append("one assertion")
            } else {
                append(errors.size).append(" assertions")
            }
            append(" failed:\n")

            append("Expected: <>, but was: <")

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

            append(">")
        }
    }
}

fun assertionError(error: Throwable): Throwable {
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
