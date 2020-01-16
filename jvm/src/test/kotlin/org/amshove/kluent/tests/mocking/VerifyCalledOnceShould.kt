package org.amshove.kluent.tests.mocking

import org.amshove.kluent.*
import org.amshove.kluent.tests.helpclasses.Database
import kotlin.test.Test
import kotlin.test.assertFails

class VerifyCalledOnceShould {

    @Test
    fun passWhenAMethodWasCalledOnlyOnce() {
        val mock = mock(Database::class)
        mock.getPerson(1)
        mock.getPerson(1)
        Verify times 2 on mock that mock.getPerson(1) was called
        assertFails { Verify on mock that mock.getPerson(1) was called }
    }

    @Test
    fun failWhenAMethodWasNotCalled() {
        val mock = mock(Database::class)
        mock.getPerson(1)
        Verify on mock that mock.getPerson(1) was called
        assertFails { Verify times 1 on mock that mock.getPerson(5) was called }
    }

    @Test
    fun failWhenTimesThatAMethodWasCalledDoesNotMatch() {
        val mock = mock(Database::class)
        mock.getPerson(1)
        Verify on mock that mock.getPerson(1) was called
        assertFails { Verify times 2 on mock that mock.getPerson(1) was called }
    }
}