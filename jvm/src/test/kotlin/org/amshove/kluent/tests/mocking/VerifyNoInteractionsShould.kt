package org.amshove.kluent.tests.mocking

import org.amshove.kluent.*
import org.amshove.kluent.tests.helpclasses.Database
import kotlin.test.Test
import kotlin.test.assertFails

class VerifyNoInteractionsShould {
    @Test
    fun passWhenNoInteractionsTookPlace() {
        val mock = mock(Database::class)
        VerifyNoInteractions on mock
    }

    @Test
    fun failWhenInteractionsTookPlace() {
        val mock = mock(Database::class)
        mock.getPerson()
        assertFails({ VerifyNoInteractions on mock })
    }

    @Test
    fun passWhenNoFurtherInteractionsTookPlace() {

        val mock = mock(Database::class)
        mock.getPerson(1)
        mock.getPerson(5)
        Verify on mock that mock.getPerson(1) was called
        Verify on mock that mock.getPerson(5) was called
        VerifyNoFurtherInteractions on mock
    }

    @Test
    fun failWhenFurtherInteractionsTookPlace() {
        val mock = mock(Database::class)
        mock.getPerson(1)
        assertFails { VerifyNoFurtherInteractions on mock }
    }
}