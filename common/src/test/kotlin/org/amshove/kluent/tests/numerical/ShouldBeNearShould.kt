package org.amshove.kluent.tests.numerical

import org.amshove.kluent.shouldBeNear
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeNearShould {

    @Test
    fun passWhenTestingADoubleWhichIsWithinTheDelta() {
        (5.55).shouldBeNear(5.5, 0.1)
    }

    @Test
    fun passWhenTestingADoubleWhichIsTheUpperBound() {
        (5.6).shouldBeNear(5.5, 0.1)
    }

    @Test
    fun passWhenTestingADoubleWhichIsTheLowerBound() {
        (5.4).shouldBeNear(5.5, 0.1)
    }

    @Test
    fun passWhenTestingADoubleWhichIsEqualToExpectedAndNan() {
        Double.NaN.shouldBeNear(Double.NaN, 0.1)
    }

    @Test
    fun passWhenTestingADoubleWhichIsEqualToExpectedAndInfinite() {
        Double.POSITIVE_INFINITY.shouldBeNear(Double.POSITIVE_INFINITY, 0.1)
    }

    @Test
    fun passWhenTestingADoubleWhichIsEqualToExpectedAndNegativeInfinite() {
        Double.NEGATIVE_INFINITY.shouldBeNear(Double.NEGATIVE_INFINITY, 0.1)
    }

    @Test
    fun failWhenTestingADoubleWhichIsAboveTheBound() {
        assertFails {
            (5.7).shouldBeNear(5.5, 0.1)
        }
    }

    @Test
    fun failWhenTestingADoubleWhichIsBelowTheBound() {
        assertFails {
            (5.3).shouldBeNear(5.5, 0.1)
        }
    }

    @Test
    fun passWhenTestingAFloatWhichIsWithinTheDelta() {
        (5.55f).shouldBeNear(5.5f, 0.1f)
    }

    @Test
    fun passWhenTestingAFloatWhichIsTheLowerBound() {
        (5.4f).shouldBeNear(5.5f, 0.1f)
    }

    @Test
    fun passWhenTestingAFloatWhichIsTheUpperBound() {
        (5.6f).shouldBeNear(5.5f, 0.1f)
    }

    @Test
    fun passWhenTestingAFloatWhichIsEqualToExpectedAndNan() {
        Float.NaN.shouldBeNear(Float.NaN, 0.1f)
    }

    @Test
    fun passWhenTestingAFloatWhichIsEqualToExpectedAndInfinite() {
        Float.POSITIVE_INFINITY.shouldBeNear(Float.POSITIVE_INFINITY, 0.1f)
    }

    @Test
    fun passWhenTestingAFloatWhichIsEqualToExpectedAndNegativeInfinite() {
        Float.NEGATIVE_INFINITY.shouldBeNear(Float.NEGATIVE_INFINITY, 0.1f)
    }

    @Test
    fun failWhenTestingAFloatWhichIsBelowTheBound() {
        assertFails {
            (5.3f).shouldBeNear(5.5f, 0.1f)
        }
    }

    @Test
    fun failWhenTestingAFloatWhichIsAboveTheBound() {
        assertFails {
            (5.7f).shouldBeNear(5.5f, 0.1f)
        }
    }
}
