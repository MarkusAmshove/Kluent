package org.amshove.kluent.tests.assertions.exceptions

import org.amshove.kluent.*
import org.junit.Test
import java.io.IOException
import kotlin.test.assertFails

class ShouldThrowShould {
    @Test
    fun passWhenTestingAFunctionThatThrowsTheExpectedException() {
        val func = { throw IndexOutOfBoundsException() }
        func shouldThrow IndexOutOfBoundsException::class
    }

    @Test
    fun failWhenTestingAFunctionThatDoesNotThrowTheExpectedException() {
        val func = { throw IndexOutOfBoundsException() }
        assertFails { func shouldThrow IllegalArgumentException::class }
    }

    @Test
    fun passWhenTestingAFunctionThatTriesToGetAnOutOfIndexedItem() {
        val funcWithReturn = { listOf(0).get(-1) }
        funcWithReturn shouldThrow IndexOutOfBoundsException::class
    }

    @Test
    fun passWhenTestingAFunctionWhichThrowsASubtypeOfTheExpectedException() {
        val func = { throw IllegalStateException() }
        func shouldThrow RuntimeException::class
    }

    @Test
    fun passWhenTestingAFunctionWhichThrowsAnExceptionWithTheExpectedMessage() {
        val func = { throw Exception("Hello World!") }
        func shouldThrow Exception::class withMessage "Hello World!"
    }

    @Test
    fun failWhenTestingAFunctionWhichThrowsAnExceptionWithADifferentMessage() {
        val func = { throw Exception("Hello World!") }
        assertFails { func shouldThrow Exception::class withMessage "Hello" }
    }

    @Test
    fun passWhenTestingAFunctionWhichThrowsAnExceptionWithTheExpectedCause() {
        val func = { throw Exception(RuntimeException()) }
        func shouldThrow Exception::class withCause RuntimeException::class
    }

    @Test
    fun failWhenTestingAFunctionWhichThrowsAnExceptionWithAnUnexpectedCause() {
        val func = { throw Exception(RuntimeException()) }
        assertFails { func shouldThrow Exception::class withCause IOException::class }
    }

    @Test
    fun passWhenTestingAFunctionWhichThrowsWhenAnyExceptionIsExpected() {
        val func = { throw Exception() }
        func shouldThrow AnyException
    }

    @Test
    fun failWhenTestingAFunctionWhichDoesNotThrowButAnyExceptionIsExpected() {
        val func = { Unit }
        assertFails { func shouldThrow AnyException }
    }

    @Test
    fun passWhenTestingAFunctionWhichThrowsAnExceptionWithMessageAndCause() {
        val func = { throw IllegalArgumentException("hello", IOException()) }
        func shouldThrow IllegalArgumentException::class withCause IOException::class withMessage "hello"
    }

    @Test
    fun failWhenTestingAFunctionWhichThrowsAnExceptionWithMessageAndCauseExceptingADifferentMessage() {
        val func = { throw IllegalArgumentException("not hello", IOException()) }
        assertFails { func shouldThrow IllegalArgumentException::class withCause IOException::class withMessage "hello" }
    }

    @Test
    fun returnTheExceptionWhenPassing() {

        val func = { throw CustomException(10) }

        val exception = func.shouldThrow(CustomException::class).exception
        exception.code.shouldEqual(10)
    }

    @Test
    fun passWhenTestingForAnExactThrownException() {

        val func = { throw CustomException(12345) }
        func shouldThrow CustomException(12345)
    }

    @Test
    fun failWhenTestingForAnExactThrownExceptionWhenTheExceptionDiffers() {
        val func = { throw CustomException(12345) }
        assertFails { func shouldThrow CustomException(54321) }
    }

}

data class CustomException(val code: Int) : Exception("code is $code")
