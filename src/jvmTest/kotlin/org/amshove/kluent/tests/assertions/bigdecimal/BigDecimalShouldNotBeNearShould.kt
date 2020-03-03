package org.amshove.kluent.tests.assertions.bigdecimal

import org.amshove.kluent.shouldNotBeNear
import java.math.BigDecimal
import kotlin.test.Test
import kotlin.test.assertFails

class BigDecimalShouldNotBeNearShould {
    @Test
    fun passWhenTestingAValueWhichIsAboveTheBound() {
        BigDecimal("5.7").shouldNotBeNear(BigDecimal("5.5"), BigDecimal("0.1"))
    }

    @Test
    fun passWhenTestingAValueWhichIsBelowTheBound() {
        BigDecimal("5.3").shouldNotBeNear(BigDecimal("5.5"), BigDecimal("0.1"))
    }

    @Test
    fun failWhenTestingAValueWhichIsWithinTheDelta() {
        assertFails {
            BigDecimal("5.55").shouldNotBeNear(BigDecimal("5.5"), BigDecimal("0.1"))
        }
    }

    @Test
    fun failWhenTestingAValueWhichIsTheUpperBound() {
        assertFails {
            BigDecimal("5.6").shouldNotBeNear(BigDecimal("5.5"), BigDecimal("0.1"))
        }
    }

    @Test
    fun failWhenTestingAValueWhichIsTheLowerBound() {
        assertFails {
            BigDecimal("5.5").shouldNotBeNear(BigDecimal("5.5"), BigDecimal("0.1"))
        }
    }
}