package org.amshove.kluent.tests.assertions.bigdecimal

import org.amshove.kluent.shouldNotEqualTo
import org.junit.Test
import java.math.BigDecimal
import kotlin.test.assertFails

class BigDecimalShouldNotEqualToShould {

    @Test
    fun passWhenComparingUnequalValues() {
        val a = BigDecimal("590125871260891762126")
        val b = BigDecimal("590125871260891762127")
        a.shouldNotEqualTo(b)
    }

    @Test
    fun failWhenComparingEqualValues() {
        val a = BigDecimal("590125871260891762126")
        val b = BigDecimal("590125871260891762126")
        assertFails { a.shouldNotEqualTo(b) }
    }
}