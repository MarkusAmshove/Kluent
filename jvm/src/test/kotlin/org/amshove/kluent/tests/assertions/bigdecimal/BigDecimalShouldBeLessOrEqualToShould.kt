package org.amshove.kluent.tests.assertions.bigdecimal

import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldBeLessOrEqualTo
import java.math.BigDecimal
import kotlin.test.Test

class BigDecimalShouldBeLessOrEqualToShould {
    @Test
    fun passWhenTestingAgainstAGreaterValue() {
        val a = BigDecimal("100")
        val b = BigDecimal.valueOf(10, -2)

        a.shouldBeLessOrEqualTo(b)
    }

    @Test
    fun passWhenTestingAgainstAnEqualValue() {
        val a = BigDecimal("100")
        val b = BigDecimal.valueOf(10, -1)

        a.shouldBeLessOrEqualTo(b)
    }

    @Test
    fun failWhenTestingAgainstASmallerValue() {
        val a = BigDecimal("10000")
        val b = BigDecimal.valueOf(10, 1)

        assertFails { a.shouldBeLessOrEqualTo(b) }
    }
}