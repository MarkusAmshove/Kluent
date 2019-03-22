package org.amshove.kluent.tests.mocking

import org.amshove.kluent.*
import org.amshove.kluent.tests.helpclasses.Database
import kotlin.test.Test
import kotlin.test.assertFails


class VerifyShould {
    @Test
    fun failWhenAMethodHasNoSetup() {
        val mock = mock(Database::class)
        assertFails { Verify on mock that mock.getPerson() was called }
    }

    @Test
    fun passWhenAMethodHasASetup() {
        val mock = mock(Database::class)
        mock.getPerson()
        Verify on mock that mock.getPerson() was called
    }

    @Test
    fun failWhenAMethodHasOtherParameter() {
        val mock = mock(Database::class)
        mock.getPerson(5)
        assertFails { Verify on mock that mock.getPerson(10) was called }
    }

    @Test
    fun passWhenTheCalledMethodHasTheSameParameter() {
        val mock = mock(Database::class)
        mock.getPerson(5)
        Verify on mock that mock.getPerson(5) was called
    }

    @Test
    fun passWhenTheMethodWasCalledWithAnything() {
        val mock = mock(Database::class)
        mock.getPerson(200)
        Verify on mock that mock.getPerson(any(Int::class)) was called
    }
}

