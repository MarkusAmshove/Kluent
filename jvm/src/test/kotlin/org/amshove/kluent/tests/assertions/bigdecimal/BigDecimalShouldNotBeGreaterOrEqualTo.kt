package org.amshove.kluent.tests.assertions.bigdecimal

import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldNotBeGreaterOrEqualTo
import java.math.BigDecimal
import kotlin.test.Test

class BigDecimalShouldNotBeGreaterOrEqualTo {
    @Test
    fun passWhenTestingAgainstAGreaterValue() {
        val a = BigDecimal("1234567890")
        val b = BigDecimal("1234567895125")

        a.shouldNotBeGreaterOrEqualTo(b)
    }

    @Test
    fun failWhenTestingAgainstASmallerValue() {
        assertFails { BigDecimal("12345").shouldNotBeGreaterOrEqualTo(BigDecimal("123")) }
    }

    @Test
    fun failWhenTestingAgainstAnEqualValue() {
        assertFails { BigDecimal("12345").shouldNotBeGreaterOrEqualTo(BigDecimal("12345")) }
    }
}