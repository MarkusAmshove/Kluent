package org.amshove.kluent.tests.collections

import org.amshove.kluent.shouldNotBeInRange
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotBeInRangeShould {

    @Test
    fun passWhenAllElementsOfTheInputRangeAreNotInTheTargetRange() {
        val targetRange: IntRange = 1..9
        val inputRange = 4..5

        targetRange.shouldNotBeInRange(inputRange)
    }

    @Test
    fun failWhenAllElementsOfTheInputRangeAreInTheTargetRange() {
        val targetRange = 4..5
        val inputRange = 1..9

        assertFails { targetRange.shouldNotBeInRange(inputRange) }
    }

}