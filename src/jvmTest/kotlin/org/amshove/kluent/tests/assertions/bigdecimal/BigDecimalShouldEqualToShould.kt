package org.amshove.kluent.tests.assertions.bigdecimal

import org.amshove.kluent.shouldEqualTo
import java.math.BigDecimal
import java.math.BigInteger
import kotlin.test.Test
import kotlin.test.assertFails


class BigDecimalShouldEqualToShould {

    @Test
    fun passWhenComparingTwoEqualValues() {
        val a = BigDecimal(1925112616126126)
        val b = BigDecimal(1925112616126126)
        a.shouldEqualTo(b)
    }

    @Test
    fun passWhenComparingTwoEqualValuesWithDifferentScale() {
        val a = BigDecimal(BigInteger.valueOf(1), -1) // 10
        val b = BigDecimal(BigInteger.valueOf(10)) // 10

        a.shouldEqualTo(b)
    }

    @Test
    fun failWhenComparingUnequalValues() {
        val a = BigDecimal(1925112616126126)
        val b = BigDecimal(1925112616126127)
        assertFails { a.shouldEqualTo(b) }
    }

}