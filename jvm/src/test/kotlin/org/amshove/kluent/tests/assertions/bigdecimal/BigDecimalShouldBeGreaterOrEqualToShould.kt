package org.amshove.kluent.tests.assertions.bigdecimal

import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldBeGreaterOrEqualTo
import java.math.BigDecimal
import kotlin.test.Test

class BigDecimalShouldBeGreaterOrEqualToShould {
    @Test
    fun passWhenTestingAgainstASmallerValue() {
        val a = BigDecimal("158295189289152")
        val b = BigDecimal("125081258125")

        a.shouldBeGreaterOrEqualTo(b)
    }

    @Test
    fun passWhenTestingAgainstAnEqualValue() {
        val a = BigDecimal("5821995812")
        val b = BigDecimal("5821995812")

        a.shouldBeGreaterOrEqualTo(b)
    }

    @Test
    fun failWhenTestingAgainstAGreaterValue() {
        val a = BigDecimal("125102951205")
        val b = BigDecimal("2215091250125")

        assertFails { a.shouldBeGreaterOrEqualTo(b) }
    }

}