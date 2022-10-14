package org.amshove.kluent.tests.assertions.exceptions


import org.amshove.kluent.`should throw`
import org.amshove.kluent.invoking
import org.junit.Test
import kotlin.test.assertFails

class ShouldThrowBackticksStyle {
    @Test
    fun shouldThrowSucceedsWhenExpectedInstanceThrown() {
        invoking { throw CustomException(12345) } `should throw` CustomException(12345)
    }

    @Test
    fun shouldThrowSucceedsWhenExpectedClassThrown() {
        invoking { throw CustomException(12345) } `should throw` CustomException::class
    }

    @Test
    fun shouldThrowFailsWhenNoExceptionThrown() {
        assertFails { invoking {  } `should throw` CustomException(12345) }
    }

    @Test
    fun shouldThrowFailsWhenDifferentExceptionThrown() {
        assertFails { invoking { throw CustomException(54321)  } `should throw` CustomException(12345) }
    }

    @Test
    fun shouldThrowFailsWhenDifferentExceptionClassThrown() {
        assertFails { invoking { throw IllegalArgumentException()  } `should throw` CustomException::class }
    }
}