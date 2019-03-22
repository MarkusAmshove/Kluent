package org.amshove.kluent.tests.mocking

import org.amshove.kluent.*
import org.amshove.kluent.tests.helpclasses.Database
import kotlin.test.Test
import kotlin.test.assertFails

class VerifyNotCalledShould {
    @Test
    fun passWhenAMethodWasntCalled() {
        val mock = mock(Database::class)
        mock.getPerson(1)
        Verify on mock that mock.getPerson(1) was called
        VerifyNotCalled on mock that mock.getPerson(5)
    }

    @Test
    fun failWhenAMethodWasCalled() {
        val mock = mock(Database::class)
        mock.getPerson(1)
        assertFails { VerifyNotCalled on mock that mock.getPerson(1) }
    }
}