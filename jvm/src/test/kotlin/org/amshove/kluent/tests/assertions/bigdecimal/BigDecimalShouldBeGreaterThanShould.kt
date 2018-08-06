package org.amshove.kluent.tests.assertions.bigdecimal

import org.amshove.kluent.shouldBeGreaterThan
import org.junit.Test
import java.math.BigDecimal
import kotlin.test.assertFails

class BigDecimalShouldBeGreaterThanShould {
    @Test
    fun passWhenTestingAgainstASmallerValue() {
        val a = BigDecimal("1250125809125809125")
        val b = BigDecimal("125809125809125")

        a.shouldBeGreaterThan(b)
    }

    @Test
    fun failWhenTestingAgainstAnEqualValue() {
        val a = BigDecimal("1250125809125809125")
        val b = BigDecimal("1250125809125809125")

        assertFails { a.shouldBeGreaterThan(b) }
    }

    @Test
    fun failWhenTestingAgainstAGreaterValue() {
        val a = BigDecimal("1250125809125809125")
        val b = BigDecimal("125012580912580912555")

        assertFails { a.shouldBeGreaterThan(b) }
    }
}