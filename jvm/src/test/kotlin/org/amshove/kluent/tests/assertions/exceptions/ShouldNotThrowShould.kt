package org.amshove.kluent.tests.assertions.exceptions

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.test.runBlockingTest
import org.amshove.kluent.*
import org.junit.Test
import kotlin.test.assertFails

class ShouldNotThrowShould {
    @Test
    fun passWhenTestingAFunctionThatDoesNotThrowAnException() {
        invoking { Unit } shouldNotThrow AnyException
    }

    @Test
    @ExperimentalCoroutinesApi
    fun passWhenTestingASuspendFunctionThatDoesNotThrowAnException() = runBlockingTest {
        suspend fun func() {
            coroutineScope { Unit }
        }
        coInvoking { func() } shouldNotThrow AnyException
    }

    @Test
    fun failWhenTestingAFunctionThatDoesThrowAnException() {
        assertFails {
            invoking { throw IllegalArgumentException() } shouldNotThrow AnyException
        }
    }

    @Test
    @ExperimentalCoroutinesApi
    fun failWhenTestingASuspendFunctionThatDoesThrowAnException() = runBlockingTest {
        suspend fun func() {
            suspendCancellableCoroutine<Any> { throw IllegalArgumentException() }
        }
        assertFails {
            coInvoking { func() } shouldNotThrow AnyException
        }
    }

    @Test
    fun passWhenTestingAFunctionThatDoesNotThrowTheExpectedException() {
        invoking { throw IllegalArgumentException() } shouldNotThrow ArrayIndexOutOfBoundsException::class
    }

    @Test
    @ExperimentalCoroutinesApi
    fun passWhenTestingASuspendFunctionThatDoesNotThrowTheExpectedException() = runBlockingTest {
        suspend fun func() {
            suspendCancellableCoroutine<Any> { throw IllegalArgumentException() }
        }
        coInvoking { func() } shouldNotThrow ArrayIndexOutOfBoundsException::class
    }

    @Test
    fun passWhenTestingAFunctionThatReturnsNull() {
        invoking { null } shouldNotThrow AnyException
    }

    @Test
    @ExperimentalCoroutinesApi
    fun passWhenTestingASuspendFunctionThatReturnsNull() = runBlockingTest {
        suspend fun func(): String? {
            return coroutineScope { null }
        }
        coInvoking { func() } shouldNotThrow AnyException
    }

    @Test
    fun passWhenTestingAFunctionThatThrowsAnExceptionWithADifferentMessage() {
        invoking { throw IllegalArgumentException("Actual Message") } shouldNotThrow
                IllegalAccessException::class withMessage "Expected Message"
    }

    @Test
    @ExperimentalCoroutinesApi
    fun passWhenTestingASuspendFunctionThatThrowsAnExceptionWithADifferentMessage() = runBlockingTest {
        suspend fun func() {
            suspendCancellableCoroutine<Any> { throw IllegalArgumentException("Actual Message") }
        }
        coInvoking { func() } shouldNotThrow
                IllegalAccessException::class withMessage "Expected Message"
    }

    @Test
    fun failWhenTestingAFunctionThatThrowsAnExceptionWithTheSameMessage() {
        assertFails {
            invoking { throw IllegalArgumentException("Actual Message") } shouldNotThrow
                    IllegalAccessException::class withMessage "Actual Message"
        }
    }

    @Test
    @ExperimentalCoroutinesApi
    fun failWhenTestingASuspendFunctionThatThrowsAnExceptionWithTheSameMessage() = runBlockingTest {
        suspend fun func() {
            suspendCancellableCoroutine<Any> { throw IllegalArgumentException("Actual Message") }
        }
        assertFails {
            coInvoking { func() } shouldNotThrow
                    IllegalAccessException::class withMessage "Actual Message"
        }
    }

    @Test
    fun failWhenTestingAFunctionThatDoesThrowAnExceptionWithTheExpectedCause() {
        assertFails {
            invoking { throw Exception(RuntimeException()) } shouldNotThrow
                    Exception::class withCause RuntimeException::class
        }
    }

    @Test
    @ExperimentalCoroutinesApi
    fun failWhenTestingASuspendFunctionThatDoesThrowAnExceptionWithTheExpectedCause() = runBlockingTest {
        suspend fun func() {
            suspendCancellableCoroutine<Any> { throw Exception(RuntimeException()) }
        }
        assertFails {
            coInvoking { func() } shouldNotThrow
                    Exception::class withCause RuntimeException::class
        }
    }

    @Test
    fun failWhenTestingAFunctionThatThrowsAnExpectedException() {
        assertFails {
            invoking { throw Exception() } shouldNotThrow Exception::class
        }
    }

    @Test
    @ExperimentalCoroutinesApi
    fun failWhenTestingASuspendFunctionThatThrowsAnExpectedException() = runBlockingTest {
        suspend fun func() {
            suspendCancellableCoroutine<Any> { throw Exception() }
        }
        assertFails {
            coInvoking { func() } shouldNotThrow Exception::class
        }
    }
}