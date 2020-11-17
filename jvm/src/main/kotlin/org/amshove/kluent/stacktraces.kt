@file:JvmName("stacktracesjvm")

package org.amshove.kluent

actual val stacktraces: StackTraces = object : StackTraces {

    override fun throwableLocation(t: Throwable): String? {
        return throwableLocation(t, 1)?.firstOrNull()
    }

    override fun throwableLocation(t: Throwable, n: Int): List<String>? {
        return (t.cause ?: t).stackTrace?.dropWhile {
            it.className.startsWith("org.amshove.kluent") && !it.className.startsWith("org.amshove.kluent.test")
        }?.take(n)?.map { it.toString() } ?: emptyList()
    }

    override fun <T : Throwable> cleanStackTrace(throwable: T): T {
        throwable.stackTrace = UserStackTraceConverter.getUserStacktrace(throwable.stackTrace)
        return throwable
    }

    override fun root(throwable: Throwable): Throwable {
        val cause = throwable.cause
        return if (cause == null) throwable else root(cause)
    }
}
