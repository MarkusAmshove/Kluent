package org.amshove.kluent.tests.assertions.exceptions

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
    fun failWhenTestingAFunctionThatDoesNotThrowTheExpectedException() {
        assertFails {
            invoking { throw IndexOutOfBoundsException() } shouldThrow IllegalArgumentException::class
        }
    }

    @Test
    fun passWhenTestingAFunctionThatTriesToGetAnOutOfIndexedItem() {
        invoking { listOf(0)[-1] } shouldThrow IndexOutOfBoundsException::class
    }

    @Test
    fun passWhenTestingAFunctionWhichThrowsASubtypeOfTheExpectedException() {
        invoking { throw IllegalStateException() } shouldThrow RuntimeException::class
    }

    @Test
    fun passWhenTestingAFunctionWhichThrowsAnExceptionWithTheExpectedMessage() {
        invoking { throw Exception("Hello World!") } shouldThrow Exception::class withMessage "Hello World!"
    }

    @Test
    fun failWhenTestingAFunctionWhichThrowsAnExceptionWithADifferentMessage() {
        assertFails {
            invoking { throw Exception("Hello World!") } shouldThrow Exception::class withMessage "Hello"
        }
    }

    @Test
    fun passWhenTestingAFunctionWhichThrowsAnExceptionWithTheExpectedCause() {
        invoking { throw Exception(RuntimeException()) } shouldThrow Exception::class withCause RuntimeException::class
    }

    @Test
    fun failWhenTestingAFunctionWhichThrowsAnExceptionWithAnUnexpectedCause() {
        assertFails {
            invoking { throw Exception(RuntimeException()) } shouldThrow Exception::class withCause IOException::class
        }
    }

    @Test
    fun passWhenTestingAFunctionWhichThrowsWhenAnyExceptionIsExpected() {
        invoking { throw Exception() } shouldThrow AnyException
    }

    @Test
    fun failWhenTestingAFunctionWhichDoesNotThrowButAnyExceptionIsExpected() {
        assertFails { invoking { Unit } shouldThrow AnyException }
    }

    @Test
    fun passWhenTestingAFunctionWhichThrowsAnExceptionWithMessageAndCause() {
        invoking { throw IllegalArgumentException("hello", IOException()) } shouldThrow
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
    fun returnTheExceptionWhenPassing() {
        val exception = invoking { throw CustomException(10) }.shouldThrow(CustomException::class).exception

        exception.code.shouldEqual(10)
    }

    @Test
    fun passWhenTestingForAnExactThrownException() {
        invoking { throw CustomException(12345) } shouldThrow CustomException(12345)
    }

    @Test
    fun failWhenTestisngForAnExactThrownExceptionWhenTheExceptionDiffers() {
        assertFails { invoking { throw CustomException(12345) } shouldThrow CustomException(54321) }
    }

}

data class CustomException(val code: Int) : Exception("code is $code")
