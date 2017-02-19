package org.amshove.kluent

class ExceptionResult(val exception: Exception) {
    val exceptionMessage = exception.message ?: ""
    val exceptionCause = exception.cause
}

class NotThrowExceptionResult(val exception: Exception) {
    val exceptionMessage = exception.message ?: ""
    val exceptionCause = exception.cause
}