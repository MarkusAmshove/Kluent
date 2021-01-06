package org.amshove.kluent.tests.charsequence

import org.amshove.kluent.shouldNotContainAll
import org.amshove.kluent.shouldNotContainAllIgnoringCase
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotContainAllShould {
    @Test
    fun passWhenTestingAListWhereSomeItemsAreNotWithinTheOriginalSequence() {
        "1, 2, 3".shouldNotContainAll(listOf("1", "2", "4"))
        "1, 2, 3".shouldNotContainAll("1", "2", "4")
    }

    @Test
    fun passWhenTestingAListWhereSomeItemsAreNotWithinTheOriginalSequenceIgnoringCase() {
        "A, B, C".shouldNotContainAllIgnoringCase(listOf("a", "B", "d"))
        "A, B, C".shouldNotContainAllIgnoringCase("a", "B", "d")
    }

    @Test
    fun failWhenTestingAListWhereAllItemsAreWithinTheOriginalSequence() {
        assertFails {
            "1, 2, 3" shouldNotContainAll listOf("1", "2", "3")
            "1, 2, 3".shouldNotContainAll("1", "2", "3")
        }
    }

    @Test
    fun failWhenTestingAListWhereAllItemsAreWithinTheOriginalSequenceIgnoringCase() {
        assertFails {
            "A, B, C" shouldNotContainAllIgnoringCase listOf("a", "B", "c")
            "A, B, C".shouldNotContainAllIgnoringCase("a", "B", "c")
        }
    }
}