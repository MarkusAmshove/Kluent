package org.amshove.kluent.numerical

import org.amshove.kluent.shouldNotBeInRange
import kotlin.test.assertFails
import kotlin.test.Test

class ShouldNotBeInRangeShould {
    @Test
    fun passWhenTestingAnIntegerWhichIsBelowTheRange() {
        1.shouldNotBeInRange(2, 5)
        1.shouldNotBeInRange(2..5)
    }

    @Test
    fun passWhenTestingAnIntegerWhichIsAboveTheRange() {
        10.shouldNotBeInRange(5, 7)
        10.shouldNotBeInRange(5..7)
    }

    @Test
    fun failWhenTestingAnIntegerWhichIsWithinTheRange() {
        assertFails {
            5.shouldNotBeInRange(0, 10)
            5.shouldNotBeInRange(0..10)
        }
    }

    @Test
    fun failWhenTestingAnIntegerWhichIsTheLowerBound() {
        assertFails {
            5.shouldNotBeInRange(5, 6)
            5.shouldNotBeInRange(5..6)
        }
    }

    @Test
    fun failWhenTestingAnIntegerWhichIsTheUpperBound() {
        assertFails {
            5.shouldNotBeInRange(2, 5)
            5.shouldNotBeInRange(2..5)
        }
    }

    @Test
    fun passWhenTestingADoubleWhichIsBelowTheRange() {
        (1.0).shouldNotBeInRange(1.1, 1.5)
        (1.0).shouldNotBeInRange((1.1)..(1.5))
    }

    @Test
    fun passWhenTestingADoubleWhichIsAboveTheRange() {
        (10.0).shouldNotBeInRange(5.0, 9.99)
        (10.0).shouldNotBeInRange((5.0)..(9.99))
    }

    @Test
    fun failWhenTestingADoubleWhichIsWithinTheRange() {
        assertFails {
            (5.5).shouldNotBeInRange(5.0, 6.0)
            (5.5).shouldNotBeInRange((5.0)..(6.0))
        }
    }

    @Test
    fun failWhenTestingADoubleWhichIsTheLowerBound() {
        assertFails {
            (5.0).shouldNotBeInRange(5.0, 6.0)
            (5.0).shouldNotBeInRange((5.0)..(6.0))
        }
    }

    @Test
    fun failWhenTestingADoubleWhichIsTheUpperBound() {
        assertFails {
            (5.0).shouldNotBeInRange(5.0, 5.0)
            (5.0).shouldNotBeInRange((2.0)..(5.0))
        }
    }

    @Test
    fun passWhenTestingAFloatWhichIsBelowTheRange() {
        (1.0f).shouldNotBeInRange(1.1f, 1.5f)
        (1.0f).shouldNotBeInRange((1.1f)..(1.5f))
    }

    @Test
    fun passWhenTestingAFloatWhichIsAboveTheRange() {
        (10.0f).shouldNotBeInRange(5.0f, 9.99f)
        (10.0f).shouldNotBeInRange((5.0f)..(9.99f))
    }

    @Test
    fun failWhenTestingAFloatWhichIsWithinTheRange() {
        assertFails {
            (5.5f).shouldNotBeInRange(5.0f, 6.0f)
            (5.5f).shouldNotBeInRange((5.0f)..(6.0f))
        }
    }

    @Test
    fun failWhenTestingAFloatWhichIsTheLowerBound() {
        assertFails {
            (5.0f).shouldNotBeInRange(5.0f, 6.0f)
            (5.0f).shouldNotBeInRange((5.0f)..(6.0f))
        }
    }

    @Test
    fun failWhenTestingAFloatWhichIsTheUpperBound() {
        assertFails {
            (5.0f).shouldNotBeInRange(5.0f, 5.0f)
            (5.0f).shouldNotBeInRange((2.0f)..(5.0f))
        }
    }
}