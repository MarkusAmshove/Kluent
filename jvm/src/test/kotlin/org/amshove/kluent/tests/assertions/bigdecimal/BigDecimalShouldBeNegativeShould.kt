package org.amshove.kluent.tests.assertions.bigdecimal

import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldBeNegative
import kotlin.test.Test
import java.math.BigDecimal

class BigDecimalShouldBeNegativeShould {
    @Test
    fun passWhenTestingANegativeValue() {
        BigDecimal("-10").shouldBeNegative()
    }

    @Test
    fun passWhenTestingANegativeValueWithScale() {
        BigDecimal.valueOf(-5, 1).shouldBeNegative()
    }

    @Test
    fun failWhenTestingAPositiveValue() {
        assertFails { BigDecimal("123").shouldBeNegative() }
    }

    @Test
    fun failWhenTestingAPositiveValueWithScale() {
        assertFails { BigDecimal.valueOf(1, 1).shouldBeNegative() }
    }

    @Test
    fun failWhenTestingAgainstZero() {
        assertFails { BigDecimal.valueOf(0).shouldBeNegative() }
    }
}