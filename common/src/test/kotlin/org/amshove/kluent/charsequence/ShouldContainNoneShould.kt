package org.amshove.kluent.charsequence

import org.amshove.kluent.shouldContainNone
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldContainNoneShould {
    @Test
    fun passWhenTestingCharSequencesWhereNoneIsContainedInTheOriginalSequence() {
        val message = "I love to write fluent tests"
        val notContained = listOf("testing", "writing", "code")

        message.shouldContainNone(notContained)
    }

    @Test
    fun failWhenTestingCharSequencesWhereAtleastOneIsContainedInTheOriginalSequence() {
        val message = "I love to write fluent tests"
        val notContained = listOf("Berlin", "write")

        assertFails { message.shouldContainNone(notContained) }
    }
}