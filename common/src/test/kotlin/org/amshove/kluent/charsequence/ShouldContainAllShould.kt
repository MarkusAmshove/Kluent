package org.amshove.kluent.charsequence

import org.amshove.kluent.shouldContainAll
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldContainAllShould {
    @Test
    fun passWhenTestingAListWhereAllSequencesAreWithinTheOriginalSequence() {
        "1,2,3" shouldContainAll listOf("1", "2", "3")
    }

    @Test
    fun failWhenTestingAListWhereAtleastOneSequenceIsNotWithinTheOriginalSequence() {
        assertFails {
            "1,2,3" shouldContainAll listOf("1", "4")
        }
    }
}