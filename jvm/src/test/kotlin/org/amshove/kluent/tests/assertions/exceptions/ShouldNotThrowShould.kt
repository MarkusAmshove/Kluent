package org.amshove.kluent.tests.assertions.exceptions

import org.amshove.kluent.*
import org.junit.Test
import java.io.IOException
import kotlin.test.assertFails

class ShouldNotThrowShould {
    @Test
    fun passWhenTestingAFunctionThatDoesNotThrowAnException() {
        val func = { Unit }
        func shouldNotThrow AnyException
    }

    @Test
    fun failWhenTestingAFunctionThatDoesThrowAnException() {
        val func = { throw IllegalArgumentException() }
        assertFails { func shouldNotThrow AnyException }
    }

    @Test
    fun passWhenTestingAFunctionThatDoesNotThrowTheExpectedException() {
        val func = { throw IllegalArgumentException() }
        func shouldNotThrow ArrayIndexOutOfBoundsException::class
    }

    @Test
    fun passWhenTestingAFunctionThatReturnsNull() {
        val func = { null }
        func shouldNotThrow AnyException
    }

    @Test
    fun passWhenTestingAFunctionThatThrowsAnExceptionWithADifferentMessage() {
        val func = { throw IllegalArgumentException("Actual Message") }
        func shouldNotThrow IllegalAccessException::class withMessage "Expected Message"
    }

    @Test
    fun failWhenTestingAFunctionThatThrowsAnExceptionWithTheSameMessage() {
        val func = { throw IllegalArgumentException("Actual Message") }
        assertFails { func shouldNotThrow IllegalAccessException::class withMessage "Actual Message" }
    }

    @Test
    fun passWhenTestingAFunctionThatDoesThrowAnExceptionWithoutTheExpectedCause() {
        val func = { throw Exception(RuntimeException()) }
        func shouldNotThrow Exception::class withCause IOException::class
    }

    @Test
    fun failWhenTestingAFunctionThatDoesThrowAnExceptionWithTheExpectedCause() {
        val func = { throw Exception(RuntimeException()) }
        assertFails { func shouldNotThrow Exception::class withCause RuntimeException::class }
    }
}