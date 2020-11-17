package org.amshove.kluent.tests.charsequence

import org.amshove.kluent.shouldContainNone
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldContainNoneShould {
    @Test
    fun passWhenTestingCharSequencesWhereNoneIsContainedInTheOriginalSequence() {
        val message = "I love to write fluent tests"
        val notContained = listOf("testing", "writing", "code")

        message.shouldContainNone(notContained)
        message.shouldContainNone("testing", "writing", "code")
    }

    @Test
    fun failWhenTestingCharSequencesWhereAtleastOneIsContainedInTheOriginalSequence() {
        val message = "I love to write fluent tests"
        val notContained = listOf("Berlin", "write")

        assertFails {
            message.shouldContainNone(notContained)
            message.shouldContainNone("Berlin", "write")
        }
    }
}