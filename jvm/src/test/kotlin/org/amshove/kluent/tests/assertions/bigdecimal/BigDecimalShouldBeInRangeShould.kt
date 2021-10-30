package org.amshove.kluent.tests.assertions.bigdecimal

import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldBeInRange
import java.math.BigDecimal
import kotlin.test.Test

class BigDecimalShouldBeInRangeShould {
    @Test
    fun passWhenAValueIsWithinTheRange() {
        BigDecimal("0.15").shouldBeInRange(BigDecimal.valueOf(10, 2), BigDecimal.valueOf(10, 1))
        BigDecimal("0.15").shouldBeInRange(BigDecimal.valueOf(10, 2)..BigDecimal.valueOf(10, 1))
    }

    @Test
    fun passWhenAValueIsExactlyTheLowerBound() {
        BigDecimal.valueOf(1000, -1000)
            .shouldBeInRange(BigDecimal.valueOf(1000, -1000), BigDecimal.valueOf(1005, -1000))
        BigDecimal.valueOf(1000, -1000)
            .shouldBeInRange(BigDecimal.valueOf(1000, -1000)..BigDecimal.valueOf(1005, -1000))
    }

    @Test
    fun passWhenAValueIsExactlyTheUpperBound() {
        BigDecimal.valueOf(1000, -1).shouldBeInRange(BigDecimal("1000"), BigDecimal("10000"))
        BigDecimal.valueOf(1000, -1).shouldBeInRange(BigDecimal("1000")..BigDecimal("10000"))
    }

    @Test
    fun failWhenAValueIsBelowTheLowerBound() {
        assertFails {
            BigDecimal("500").shouldBeInRange(BigDecimal("600"), BigDecimal("700"))
        }
        assertFails {
            BigDecimal("500").shouldBeInRange(BigDecimal("600")..BigDecimal("700"))
        }
    }

    @Test
    fun failWhenAValueIsAboveTheUpperBound() {
        assertFails {
            BigDecimal("800").shouldBeInRange(BigDecimal("600"), BigDecimal("700"))
        }
        assertFails {
            BigDecimal("800").shouldBeInRange(BigDecimal("600")..BigDecimal("700"))
        }
    }
}