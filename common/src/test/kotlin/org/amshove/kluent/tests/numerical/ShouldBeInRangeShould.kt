package org.amshove.kluent.tests.numerical

import org.amshove.kluent.shouldBeInRange
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeInRangeShould {
    @Test
    fun passWhenTestingAnIntegerWhichIsWithinTheRange() {
        5.shouldBeInRange(0, 10)
        5.shouldBeInRange(0..10)
    }

    @Test
    fun passWhenTestingAnIntegerWhichIsTheLowerBound() {
        5.shouldBeInRange(5, 6)
        5.shouldBeInRange(5..6)
    }

    @Test
    fun passWhenTestingAnIntegerWhichIsTheUpperBound() {
        5.shouldBeInRange(2, 5)
        5.shouldBeInRange(2..5)
    }

    @Test
    fun failWhenTestingAnIntegerWhichIsBelowTheRange() {
        assertFails {
            1.shouldBeInRange(2, 5)
            1.shouldBeInRange(2..5)
        }
    }

    @Test
    fun failWhenTestingAnIntegerWhichIsAboveTheRange() {
        assertFails {
            10.shouldBeInRange(5, 7)
            10.shouldBeInRange(5..7)
        }
    }

    @Test
    fun passWhenTestingADoubleWhichIsWithinTheRange() {
        (5.5).shouldBeInRange(5.0, 6.0)
        (5.5).shouldBeInRange((5.0)..(6.0))
    }

    @Test
    fun passWhenTestingADoubleWhichIsTheLowerBound() {
        (5.0).shouldBeInRange(5.0, 6.0)
        (5.0).shouldBeInRange((5.0)..(6.0))
    }

    @Test
    fun passWhenTestingADoubleWhichIsTheUpperBound() {
        (5.0).shouldBeInRange(5.0, 5.0)
        (5.0).shouldBeInRange((2.0)..(5.0))
    }

    @Test
    fun failWhenTestingADoubleWhichIsBelowTheRange() {
        assertFails {
            (1.0).shouldBeInRange(1.1, 1.5)
            (1.0).shouldBeInRange((1.1)..(1.5))
        }
    }

    @Test
    fun failWhenTestingADoubleWhichIsAboveTheRange() {
        assertFails {
            (10.0).shouldBeInRange(5.0, 9.99)
            (10.0).shouldBeInRange((5.0)..(9.99))
        }
    }

    @Test
    fun passWhenTestingAFloatWhichIsWithinTheRange() {
        (5.5f).shouldBeInRange(5.0f, 6.0f)
        (5.5f).shouldBeInRange((5.0f)..(6.0f))
    }

    @Test
    fun passWhenTestingAFloatWhichIsTheLowerBound() {
        (5.0f).shouldBeInRange(5.0f, 6.0f)
        (5.0f).shouldBeInRange((5.0f)..(6.0f))
    }

    @Test
    fun passWhenTestingAFloatWhichIsTheUpperBound() {
        (5.0f).shouldBeInRange(5.0f, 5.0f)
        (5.0f).shouldBeInRange((2.0f)..(5.0f))
    }

    @Test
    fun failWhenTestingAFloatWhichIsBelowTheRange() {
        assertFails {
            (1.0f).shouldBeInRange(1.1f, 1.5f)
            (1.0f).shouldBeInRange((1.1f)..(1.5f))
        }
    }

    @Test
    fun failWhenTestingAFloatWhichIsAboveTheRange() {
        assertFails {
            (10.0f).shouldBeInRange(5.0f, 9.99f)
            (10.0f).shouldBeInRange((5.0f)..(9.99f))
        }
    }
}