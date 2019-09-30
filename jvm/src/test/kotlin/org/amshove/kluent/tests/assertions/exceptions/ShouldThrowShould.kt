package org.amshove.kluent.tests.assertions.exceptions

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.suspendCancellableCoroutine
import kotlinx.coroutines.test.runBlockingTest
import org.amshove.kluent.*
import org.junit.Test
import java.io.IOException
import kotlin.test.assertFails

class ShouldThrowShould {
    @Test
    fun passWhenTestingAFunctionThatThrowsTheExpectedException() {
        invoking { throw IndexOutOfBoundsException() } shouldThrow IndexOutOfBoundsException::class
    }

    @Test
    @ExperimentalCoroutinesApi
    fun passWhenTestingASuspendFunctionThatThrowsTheExpectedException() = runBlockingTest {
        suspend fun func() {
            suspendCancellableCoroutine<Any> { throw IndexOutOfBoundsException() }
        }
        coInvoking { func() } shouldThrow IndexOutOfBoundsException::class
    }

    @Test
    fun failWhenTestingAFunctionThatDoesNotThrowTheExpectedException() {
        assertFails {
            invoking { throw IndexOutOfBoundsException() } shouldThrow IllegalArgumentException::class
        }
    }

    @Test
    @ExperimentalCoroutinesApi
    fun failWhenTestingASuspendFunctionThatDoesNotThrowTheExpectedException() = runBlockingTest {
        suspend fun func() {
            suspendCancellableCoroutine<Any> { throw IndexOutOfBoundsException() }
        }
        assertFails {
            coInvoking { func() } shouldThrow IllegalArgumentException::class
        }
    }

    @Test
    fun passWhenTestingAFunctionThatTriesToGetAnOutOfIndexedItem() {
        invoking { listOf(0)[-1] } shouldThrow IndexOutOfBoundsException::class
    }

    @Test
    @ExperimentalCoroutinesApi
    fun passWhenTestingASuspendFunctionThatTriesToGetAnOutOfIndexedItem() = runBlockingTest {
        suspend fun func() {
            suspendCancellableCoroutine<Int> { listOf(0)[-1] }
        }
        coInvoking { func() } shouldThrow IndexOutOfBoundsException::class
    }

    @Test
    fun passWhenTestingAFunctionWhichThrowsASubtypeOfTheExpectedException() {
        invoking { throw IllegalStateException() } shouldThrow RuntimeException::class
    }

    @Test
    @ExperimentalCoroutinesApi
    fun passWhenTestingASuspendFunctionWhichThrowsASubtypeOfTheExpectedException() = runBlockingTest {
        suspend fun func() {
            suspendCancellableCoroutine<Any> { throw IllegalStateException() }
        }
        coInvoking { func() } shouldThrow RuntimeException::class
    }

    @Test
    fun passWhenTestingAFunctionWhichThrowsAnExceptionWithTheExpectedMessage() {
        invoking { throw Exception("Hello World!") } shouldThrow Exception::class withMessage "Hello World!"
    }

    @Test
    @ExperimentalCoroutinesApi
    fun passWhenTestingASuspendFunctionWhichThrowsAnExceptionWithTheExpectedMessage() = runBlockingTest {
        suspend fun func() {
            suspendCancellableCoroutine<Any> { throw Exception("Hello World!") }
        }
        coInvoking { func() } shouldThrow Exception::class withMessage "Hello World!"
    }

    @Test
    fun failWhenTestingAFunctionWhichThrowsAnExceptionWithADifferentMessage() {
        assertFails {
            invoking { throw Exception("Hello World!") } shouldThrow Exception::class withMessage "Hello"
        }
    }

    @Test
    @ExperimentalCoroutinesApi
    fun failWhenTestingASuspendFunctionWhichThrowsAnExceptionWithADifferentMessage() = runBlockingTest {
        suspend fun func() {
            suspendCancellableCoroutine<Any> { throw Exception("Hello World!") }
        }
        assertFails {
            coInvoking { func() } shouldThrow Exception::class withMessage "Hello"
        }
    }

    @Test
    fun passWhenTestingAFunctionWhichThrowsAnExceptionWithTheExpectedCause() {
        invoking { throw Exception(RuntimeException()) } shouldThrow Exception::class withCause RuntimeException::class
    }

    @Test
    @ExperimentalCoroutinesApi
    fun passWhenTestingASuspendFunctionWhichThrowsAnExceptionWithTheExpectedCause() = runBlockingTest {
        suspend fun func() {
            suspendCancellableCoroutine<Any> { throw Exception(RuntimeException()) }
        }
        coInvoking { func() } shouldThrow Exception::class withCause RuntimeException::class
    }

    @Test
    fun failWhenTestingAFunctionWhichThrowsAnExceptionWithAnUnexpectedCause() {
        assertFails {
            invoking { throw Exception(RuntimeException()) } shouldThrow Exception::class withCause IOException::class
        }
    }

    @Test
    @ExperimentalCoroutinesApi
    fun failWhenTestingASuspendFunctionWhichThrowsAnExceptionWithAnUnexpectedCause() = runBlockingTest {
        suspend fun func() {
            suspendCancellableCoroutine<Any> { throw RuntimeException() }
        }
        assertFails {
            coInvoking { func() } shouldThrow Exception::class withCause IOException::class
        }
    }

    @Test
    fun passWhenTestingAFunctionWhichThrowsWhenAnyExceptionIsExpected() {
        invoking { throw Exception() } shouldThrow AnyException
    }

    @Test
    @ExperimentalCoroutinesApi
    fun passWhenTestingASuspendFunctionWhichThrowsWhenAnyExceptionIsExpected() = runBlockingTest {
        suspend fun func() {
            suspendCancellableCoroutine<Any> { throw Exception() }
        }
        coInvoking { func() } shouldThrow AnyException
    }

    @Test
    fun failWhenTestingAFunctionWhichDoesNotThrowButAnyExceptionIsExpected() {
        assertFails { invoking { Unit } shouldThrow AnyException }
    }

    @Test
    @ExperimentalCoroutinesApi
    fun failWhenTestingASuspendFunctionWhichDoesNotThrowButAnyExceptionIsExpected() = runBlockingTest {
        suspend fun func() {
            coroutineScope { Unit }
        }
        assertFails { coInvoking { func() } shouldThrow AnyException }
    }

    @Test
    fun passWhenTestingAFunctionWhichThrowsAnExceptionWithMessageAndCause() {
        invoking { throw IllegalArgumentException("hello", IOException()) } shouldThrow
                IllegalArgumentException::class withCause IOException::class withMessage "hello"
    }

    @Test
    @ExperimentalCoroutinesApi
    fun passWhenTestingASuspendFunctionWhichThrowsAnExceptionWithMessageAndCause() = runBlockingTest {
        suspend fun func() {
            suspendCancellableCoroutine<Any> { throw IllegalArgumentException("hello", IOException()) }
        }
        coInvoking { func() } shouldThrow
                IllegalArgumentException::class withCause IOException::class withMessage "hello"
    }

    @Test
    fun failWhenTestingAFunctionWhichThrowsAnExceptionWithMessageAndCauseExceptingADifferentMessage() {
        assertFails {
            invoking { throw IllegalArgumentException("not hello", IOException()) } shouldThrow
                    IllegalArgumentException::class withCause IOException::class withMessage "hello"
        }
    }

    @Test
    @ExperimentalCoroutinesApi
    fun failWhenTestingASuspendFunctionWhichThrowsAnExceptionWithMessageAndCauseExceptingADifferentMessage() = runBlockingTest {
        suspend fun func() {
            suspendCancellableCoroutine<Any> { throw IllegalArgumentException("not hello", IOException()) }
        }
        assertFails {
            coInvoking { func() } shouldThrow
                    IllegalArgumentException::class withCause IOException::class withMessage "hello"
        }
    }

    @Test
    fun validatedCustomValuesOfThrownException() {
        class CustomException(val value: String, val num: Int): Exception(value)
        invoking { throw CustomException("Hello World", 25) } shouldThrow CustomException::class with {
            value shouldEqual "Hello World"
            num shouldEqual 25
        }
    }

    @Test
    fun returnTheExceptionWhenPassing() {
        val exception = invoking { throw CustomException(10) }.shouldThrow(CustomException::class).exception

        exception.code.shouldEqual(10)
    }

    @Test
    @ExperimentalCoroutinesApi
    fun returnTheExceptionWhenPassingWithASuspendFunction() = runBlockingTest {
        suspend fun func() {
            suspendCancellableCoroutine<Any> { throw CustomException(10) }
        }

        val exception = coInvoking { func() }.shouldThrow(CustomException::class).exception

        exception.code.shouldEqual(10)
    }

    @Test
    fun passWhenTestingForAnExactThrownException() {
        invoking { throw CustomException(12345) } shouldThrow CustomException(12345)
    }

    @Test
    @ExperimentalCoroutinesApi
    fun passWhenTestingASuspendFunctionForAnExactThrownException() = runBlockingTest {
        suspend fun func() {
            suspendCancellableCoroutine<Any> { throw CustomException(12345) }
        }
        coInvoking { func() } shouldThrow CustomException(12345)
    }

    @Test
    fun failWhenTestingForAnExactThrownExceptionWhenTheExceptionDiffers() {
        assertFails { invoking { throw CustomException(12345) } shouldThrow CustomException(54321) }
    }

    @Test
    @ExperimentalCoroutinesApi
    fun failWhenTestingASuspendFunctionForAnExactThrownExceptionWhenTheExceptionDiffers() = runBlockingTest {
        suspend fun func() {
            suspendCancellableCoroutine<Any> { throw CustomException(12345) }
        }
        assertFails { coInvoking { func() } shouldThrow CustomException(54321) }
    }
}

data class CustomException(val code: Int) : Exception("code is $code")
