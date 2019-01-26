package org.amshove.kluent.tests.assertions.exceptions

import org.amshove.kluent.*
import org.junit.Test
import kotlin.test.assertFails

class ShouldNotThrowShould {
    @Test
    fun passWhenTestingAFunctionThatDoesNotThrowAnException() {
        invoking { Unit } shouldNotThrow AnyException
    }

    @Test
    fun failWhenTestingAFunctionThatDoesThrowAnException() {
        assertFails {
            invoking { throw IllegalArgumentException() } shouldNotThrow AnyException
        }
    }

    @Test
    fun passWhenTestingAFunctionThatDoesNotThrowTheExpectedException() {
        invoking { throw IllegalArgumentException() } shouldNotThrow ArrayIndexOutOfBoundsException::class
    }

    @Test
    fun passWhenTestingAFunctionThatReturnsNull() {
        invoking { null } shouldNotThrow AnyException
    }

    @Test
    fun passWhenTestingAFunctionThatThrowsAnExceptionWithADifferentMessage() {
        invoking { throw IllegalArgumentException("Actual Message") } shouldNotThrow
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
    fun failWhenTestingAFunctionThatDoesThrowAnExceptionWithTheExpectedCause() {
        assertFails {
            invoking { throw Exception(RuntimeException()) } shouldNotThrow
                Exception::class withCause RuntimeException::class
        }
    }

    @Test
    fun failWhenExpectingAnExceptionThatWasThrown() {
        assertFails {
            invoking { throw Exception() } shouldNotThrow Exception::class
        }
    }
}