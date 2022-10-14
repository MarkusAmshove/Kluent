package org.amshove.kluent.tests.assertions.exceptions

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.test.runBlockingTest
import org.amshove.kluent.`should throw`
import org.amshove.kluent.coInvoking
import org.junit.Test
import kotlin.test.assertFails

class ShouldThrowSuspendBackticksStyle {
    @Test
    @ExperimentalCoroutinesApi
    fun shouldThrowSucceedsWhenExpectedInstanceThrown() = runBlockingTest {
        suspend fun func(): Nothing = coroutineScope { throw CustomException(12345) }

        coInvoking { func() } `should throw` CustomException(12345)
    }

    @Test
    @ExperimentalCoroutinesApi
    fun shouldThrowSucceedsWhenExpectedClassThrown() = runBlockingTest {
        suspend fun func(): Nothing = coroutineScope { throw CustomException(12345) }

        coInvoking { func() } `should throw` CustomException::class
    }

    @Test
    @ExperimentalCoroutinesApi
    fun shouldThrowFailsWhenNoExceptionThrown() = runBlockingTest {
        suspend fun func() = coroutineScope { }

        assertFails { coInvoking { func() } `should throw` CustomException(12345) }
    }

    @Test
    @ExperimentalCoroutinesApi
    fun shouldThrowFailsWhenDifferentExceptionThrown() = runBlockingTest {
        suspend fun func(): Nothing = coroutineScope { throw CustomException(54321) }

        assertFails { coInvoking { func() } `should throw` CustomException(12345) }
    }

    @Test
    @ExperimentalCoroutinesApi
    fun shouldThrowFailsWhenDifferentExceptionClassThrown() = runBlockingTest {
        suspend fun func(): Nothing = coroutineScope { throw java.lang.IllegalArgumentException() }

        assertFails { coInvoking { func() } `should throw` CustomException::class }
    }
}