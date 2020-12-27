package org.amshove.kluent.tests.charsequence

import org.amshove.kluent.shouldNotContainAll
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotContainAllShould {
    @Test
    fun passWhenTestingAListWhereSomeItemsAreNotWithinTheOriginalSequence() {
        "1, 2, 3".shouldNotContainAll(listOf("1", "2", "4"))
        "1, 2, 3".shouldNotContainAll("1", "2", "4")
    }

    @Test
    fun failWhenTestingAListWhereAllItemsAreWithinTheOriginalSequence() {
        assertFails {
            "1, 2, 3" shouldNotContainAll listOf("1", "2", "3")
            "1, 2, 3".shouldNotContainAll("1", "2", "3")
        }
    }
}