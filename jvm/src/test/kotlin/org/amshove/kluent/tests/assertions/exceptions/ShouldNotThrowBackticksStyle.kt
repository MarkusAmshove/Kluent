package org.amshove.kluent.tests.assertions.exceptions

import org.amshove.kluent.AnyException
import org.amshove.kluent.`should not throw`
import org.amshove.kluent.invoking
import org.junit.Test
import kotlin.test.assertFails

class ShouldNotThrowBackticksStyle {
    @Test
    fun shouldNotThrowSucceedsWhenNotThrown() {
        invoking { } `should not throw` AnyException
    }

    @Test
    fun shouldNotThrowFailsWhenThrown() {
        assertFails { invoking { throw CustomException(12345) } `should not throw` AnyException }
    }

    @Test
    fun shouldNotThrowSucceedsWhenDifferentExceptionClassThrown() {
        invoking { throw IllegalArgumentException() } `should not throw` CustomException::class
    }
}