package org.amshove.kluent.tests.mocking

import org.amshove.kluent.*
import org.amshove.kluent.tests.helpclasses.Database
import kotlin.test.Test
import kotlin.test.assertFails

class VerifyUsingTimesShould {

    @Test
    fun passWhenAMethodWasCalledSpecifiedTimes() {
        val mock = mock(Database::class)
        mock.getPerson(1)
        mock.getPerson(5)
        Verify on mock that mock.getPerson(1) was called
        Verify on mock that mock.getPerson(5) was called
        Verify times 2 on mock that mock.getPerson(any()) was called
    }

    @Test
    fun failWhenAMethodWasNotCalled() {
        val mock = mock(Database::class)
        mock.getPerson(1)
        Verify on mock that mock.getPerson(1) was called
        assertFails { Verify times 1 on mock that mock.getPerson(5) was called }
    }

    @Test
    fun failWhenAMethodWasCalledLessThanSpecified() {
        val mock = mock(Database::class)
        mock.getPerson(1)
        Verify on mock that mock.getPerson(1) was called
        assertFails { Verify times 2 on mock that mock.getPerson(any()) was called }
    }

    @Test
    fun failWhenAMethodWasCalledMoreThanSpecified() {
        val mock = mock(Database::class)
        mock.getPerson(1)
        mock.getPerson(5)
        Verify on mock that mock.getPerson(1) was called
        Verify on mock that mock.getPerson(5) was called
        assertFails { Verify times 1 on mock that mock.getPerson(any()) was called }
    }
}