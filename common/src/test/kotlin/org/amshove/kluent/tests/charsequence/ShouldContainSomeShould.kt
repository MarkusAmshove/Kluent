package org.amshove.kluent.tests.charsequence

import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldContainSome
import kotlin.test.Test

class ShouldContainSomeShould {
    @Test
    fun passWhenTestingCharSequencesWithAtLeastOneBeingInTheOriginalSequence() {
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