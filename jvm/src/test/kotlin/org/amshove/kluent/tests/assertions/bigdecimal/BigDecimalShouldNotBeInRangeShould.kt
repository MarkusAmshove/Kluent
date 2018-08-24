package org.amshove.kluent.tests.assertions.bigdecimal

import org.amshove.kluent.shouldNotBeInRange
import java.math.BigDecimal
import kotlin.test.Test
import kotlin.test.assertFails

class BigDecimalShouldNotBeInRangeShould {
    @Test
    fun passWhenAValueIsBelowTheLowerBound() {
        BigDecimal("500").shouldNotBeInRange(BigDecimal("600"), BigDecimal("700"))
        BigDecimal("500").shouldNotBeInRange(BigDecimal("600") .. BigDecimal("700"))
    }

    @Test
    fun passWhenAValueIsAboveTheUpperBound() {
        BigDecimal("800").shouldNotBeInRange(BigDecimal("600"), BigDecimal("700"))
        BigDecimal("800").shouldNotBeInRange(BigDecimal("600") .. BigDecimal("700"))
    }

    @Test
    fun failWhenAValueIsWithinTheRange() {
        assertFails {
            BigDecimal("0.15").shouldNotBeInRange(BigDecimal.valueOf(10, 2), BigDecimal.valueOf(10, 1))
        }
        assertFails {
            BigDecimal("0.15").shouldNotBeInRange(BigDecimal.valueOf(10, 2)..BigDecimal.valueOf(10, 1))
        }
    }

    @Test
    fun failWhenAValueIsExactlyTheLowerBound() {
        assertFails {
            BigDecimal.valueOf(1000, -1000)
                .shouldNotBeInRange(BigDecimal.valueOf(1000, -1000), BigDecimal.valueOf(1005, -1000))
        }
        assertFails {
            BigDecimal.valueOf(1000, -1000)
                .shouldNotBeInRange(BigDecimal.valueOf(1000, -1000)..BigDecimal.valueOf(1005, -1000))
        }
    }

    @Test
    fun failWhenAValueIsExactlyTheUpperBound() {
        assertFails {
            BigDecimal.valueOf(1000, -1).shouldNotBeInRange(BigDecimal("1000"), BigDecimal("10000"))
        }
        assertFails {
            BigDecimal.valueOf(1000, -1).shouldNotBeInRange(BigDecimal("1000")..BigDecimal("10000"))
        }
    }
}