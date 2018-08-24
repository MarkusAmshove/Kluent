package org.amshove.kluent.tests.assertions.bigdecimal

import org.amshove.kluent.shouldNotBeLessOrEqualTo
import java.math.BigDecimal
import kotlin.test.Test
import kotlin.test.assertFails

class BigDecimalShouldNotBeLessOrEqualToShould {
    @Test
    fun passWhenTestingAgainstASmallerValue() {
        val a = BigDecimal("10000")
        val b = BigDecimal.valueOf(10, 1)

        a.shouldNotBeLessOrEqualTo(b)
    }

    @Test
    fun failWhenTestingAgainstAGreaterValue() {
        val a = BigDecimal("100")
        val b = BigDecimal.valueOf(10, -2)

        assertFails { a.shouldNotBeLessOrEqualTo(b) }
    }

    @Test
    fun failWhenTestingAgainstAnEqualValue() {
        val a = BigDecimal("100")
        val b = BigDecimal.valueOf(10, -1)

        assertFails { a.shouldNotBeLessOrEqualTo(b) }
    }
}