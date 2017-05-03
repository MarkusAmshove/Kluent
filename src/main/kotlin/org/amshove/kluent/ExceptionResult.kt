package org.amshove.kluent

class ExceptionResult<out T : Throwable>(val exception: T) {
    val exceptionMessage = exception.message ?: ""
    val exceptionCause = exception.cause
}

class NotThrowExceptionResult(val exception: Throwable) {
    val exceptionMessage = exception.message ?: ""
    val exceptionCause = exception.cause
}
