package org.amshove.kluent.tests.assertions.bigdecimal

import org.amshove.kluent.shouldBeGreaterOrEqualTo
import kotlin.test.Test
import java.math.BigDecimal
import kotlin.test.assertFails

class BigDecimalShouldBeGreaterOrEqualTo {
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