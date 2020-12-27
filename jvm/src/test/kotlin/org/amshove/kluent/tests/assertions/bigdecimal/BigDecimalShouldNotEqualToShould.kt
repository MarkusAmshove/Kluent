package org.amshove.kluent.tests.assertions.bigdecimal

import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldNotBeEqualTo
import org.junit.Test
import java.math.BigDecimal

class BigDecimalShouldNotEqualToShould {

    @Test
    fun passWhenComparingUnequalValues() {
        val a = BigDecimal("590125871260891762126")
        val b = BigDecimal("590125871260891762127")
        a.shouldNotBeEqualTo(b)
    }

    @Test
    fun failWhenComparingEqualValues() {
        val a = BigDecimal("590125871260891762126")
        val b = BigDecimal("590125871260891762126")
        assertFails { a.shouldNotBeEqualTo(b) }
    }
}