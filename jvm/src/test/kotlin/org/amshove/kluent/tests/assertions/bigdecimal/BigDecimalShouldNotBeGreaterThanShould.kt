package org.amshove.kluent.tests.assertions.bigdecimal

import org.amshove.kluent.shouldNotBeGreaterThan
import org.junit.Test
import java.math.BigDecimal
import kotlin.test.assertFails

class BigDecimalShouldNotBeGreaterThanShould {
    @Test
    fun passWhenTestingAgainstAGreaterValue() {
        val a = BigDecimal("9125125")
        val b = BigDecimal("12589125125")
        a.shouldNotBeGreaterThan(b)
    }

    @Test
    fun passWhenTestingAgainstAnEqualValue() {
        val a = BigDecimal("2112580125")
        val b = BigDecimal("2112580125")
        a.shouldNotBeGreaterThan(b)
    }

    @Test
    fun failWhenTestingAgainstASmallerValue() {
        val a = BigDecimal("12412491284")
        val b = BigDecimal("12412284")
        assertFails { a.shouldNotBeGreaterThan(b) }
    }
}