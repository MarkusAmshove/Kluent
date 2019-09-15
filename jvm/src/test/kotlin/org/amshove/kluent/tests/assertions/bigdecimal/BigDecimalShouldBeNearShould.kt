package org.amshove.kluent.tests.assertions.bigdecimal

import org.amshove.kluent.shouldBeNear
import java.math.BigDecimal
import kotlin.test.Test
import kotlin.test.assertFails

class BigDecimalShouldBeNearShould {
    @Test
    fun passWhenTestingAValueWhichIsWithinTheDelta() {
        BigDecimal("5.55").shouldBeNear(BigDecimal("5.5"), BigDecimal("0.1"))
    }

    @Test
    fun passWhenTestingAValueWhichIsTheUpperBound() {
        BigDecimal("5.6").shouldBeNear(BigDecimal("5.5"), BigDecimal("0.1"))
    }

    @Test
    fun passWhenTestingAValueWhichIsTheLowerBound() {
        BigDecimal("5.5").shouldBeNear(BigDecimal("5.5"), BigDecimal("0.1"))
    }

    @Test
    fun failWhenTestingAValueWhichIsAboveTheBound() {
        assertFails {
            BigDecimal("5.7").shouldBeNear(BigDecimal("5.5"), BigDecimal("0.1"))
        }
    }

    @Test
    fun failWhenTestingAValueWhichIsBelowTheBound() {
        assertFails {
            BigDecimal("5.3").shouldBeNear(BigDecimal("5.5"), BigDecimal("0.1"))
        }
    }
}