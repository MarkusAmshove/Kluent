package org.amshove.kluent

expect class MultiAssertionError(errors: List<Throwable>) : AssertionError

expect fun assertionError(error: Throwable): Throwable
