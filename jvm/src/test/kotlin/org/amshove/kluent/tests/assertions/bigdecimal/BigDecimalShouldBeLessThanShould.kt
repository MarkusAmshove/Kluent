package org.amshove.kluent.tests.assertions.bigdecimal

import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldBeLessThan
import java.math.BigDecimal
import kotlin.test.Test

class BigDecimalShouldBeLessThanShould {
    @Test
    fun passWhenTestingAgainstAGreaterValue() {
        BigDecimal("12345").shouldBeLessThan(BigDecimal("1582918952"))
    }

    @Test
    fun failWhenTestingAgainstASmallerValue() {
        assertFails { BigDecimal("123124091250").shouldBeLessThan(BigDecimal("15251152")) }
    }

    @Test
    fun failWhenTestingAgainstAnEqualValue() {
        assertFails { BigDecimal("9815289512985").shouldBeLessThan(BigDecimal("9815289512985")) }
    }
}