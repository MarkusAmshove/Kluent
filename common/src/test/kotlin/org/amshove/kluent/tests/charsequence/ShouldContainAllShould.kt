package org.amshove.kluent.tests.charsequence

import org.amshove.kluent.shouldContainAll
import org.amshove.kluent.shouldContainAllIgnoringCase
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldContainAllShould {
    @Test
    fun passWhenTestingAListWhereAllSequencesAreWithinTheOriginalSequence() {
        "1,2,3" shouldContainAll listOf("1", "2", "3")
        "1,2,3".shouldContainAll("1", "2", "3")
    }

    @Test
    fun passWhenTestingAListWhereAllSequencesAreWithinTheOriginalSequenceIgnoringCase() {
        "A,B,C" shouldContainAllIgnoringCase listOf("a", "B", "c")
        "A,B,C".shouldContainAllIgnoringCase("a", "B", "c")
    }

    @Test
    fun failWhenTestingAListWhereAtLeastOneSequenceIsNotWithinTheOriginalSequence() {
        assertFails {
            "A,B,C" shouldContainAll listOf("A", "b", "C")
            "A,B,C".shouldContainAll("A", "b", "C")
        }
    }
}