package org.amshove.kluent.tests.charsequence

import org.amshove.kluent.shouldContainSome
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldContainSomeShould {
    @Test
    fun passWhenTestingCharSequencesWithAtleastOneBeingInTheOriginalSequence() {
        val message = "I love to write fluent tests"
        val otherStrings = listOf("Berlin", "write")

        message shouldContainSome otherStrings
        message.shouldContainSome("Berlin", "write")
    }

    @Test
    fun failWhenTestingCharSequencesWithNoneBeingInTheOriginalSequence() {
        val message = "I love to write fluent tests"
        val otherStrings = listOf("testing", "writing", "code")

        assertFails {
            message shouldContainSome otherStrings
            message.shouldContainSome("testing", "writing", "code")
        }
    }
}