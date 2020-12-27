package org.amshove.kluent.tests.collections

import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldBeInRange
import kotlin.test.Test

class ShouldBeInRangeShould {

    @Test
    fun passWhenAllElementsOfTheInputRangeAreInTheTargetRange() {
        val targetRange: IntRange = 1..9
        val inputRange = 4..5

        targetRange.shouldBeInRange(inputRange)
    }

    @Test
    fun failWhenAllElementsOfTheInputRangeAreNotInTheTargetRange() {
        val targetRange = 4..5
        val inputRange = 1..9

        assertFails { targetRange.shouldBeInRange(inputRange) }
    }

}