package org.amshove.kluent.tests.assertions.exceptions

import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.test.runBlockingTest
import org.amshove.kluent.AnyException
import org.amshove.kluent.`should not throw`
import org.amshove.kluent.coInvoking
import org.amshove.kluent.internal.assertFails
import org.junit.Test

class ShouldNotThrowSuspendBackticksStyle {
    @Test
    @ExperimentalCoroutinesApi
    fun shouldNotThrowSucceedsWhenNotThrown() = runBlockingTest {
        suspend fun func() = coroutineScope {}
        coInvoking { func() } `should not throw` AnyException
    }

    @Test
    @ExperimentalCoroutinesApi
    fun shouldNotThrowFailsWhenThrown() = runBlockingTest {
        suspend fun func(): Nothing = coroutineScope { throw CustomException(12345) }

        assertFails { coInvoking { func() } `should not throw` AnyException }
    }

    @Test
    @ExperimentalCoroutinesApi
    fun shouldNotThrowSucceedsWhenDifferentExceptionClassThrown() = runBlockingTest {
        suspend fun func(): Nothing = coroutineScope { throw IllegalArgumentException() }

        coInvoking { func() } `should not throw` CustomException::class
    }
}