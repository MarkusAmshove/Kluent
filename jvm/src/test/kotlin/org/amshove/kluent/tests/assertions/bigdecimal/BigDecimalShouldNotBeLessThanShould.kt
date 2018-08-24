package org.amshove.kluent.tests.assertions.bigdecimal

import org.amshove.kluent.shouldNotBeLessThan
import org.junit.Test
import java.math.BigDecimal
import kotlin.test.assertFails

class BigDecimalShouldNotBeLessThanShould {
    @Test
    fun passWhenTestingAgainstASmallerValue() {
        BigDecimal("123124091250").shouldNotBeLessThan(BigDecimal("15251152"))
    }

    @Test
    fun passWhenTestingAgainstAnEqualValue() {
        BigDecimal("9815289512985").shouldNotBeLessThan(BigDecimal("9815289512985"))
    }

    @Test
    fun failWhenTestingAgainstAGreaterValue() {
        assertFails { BigDecimal("12345").shouldNotBeLessThan(BigDecimal("1582918952")) }
    }
}
