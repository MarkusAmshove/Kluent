package org.amshove.kluent

class ExceptionResult(val exception: Exception) {
    val exceptionMessage = exception.message!!
}

