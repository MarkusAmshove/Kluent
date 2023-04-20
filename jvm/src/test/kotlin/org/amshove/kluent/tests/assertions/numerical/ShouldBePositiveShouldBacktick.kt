package org.amshove.kluent.tests.numerical

import org.amshove.kluent.Positive
import org.amshove.kluent.`should be`
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBePositiveShouldBacktick {
    @Test
    fun passWhenTestingAPositiveInteger() {
        5 `should be` Positive
    }

    @Test
    fun failWhenTestingANegativeInteger() {
        assertFails { -5 `should be` Positive }
    }

    @Test
    fun failWhenTestingZeroInteger() {
        assertFails { 0 `should be` Positive }
    }

    @Test
    fun passWhenTestingAPositiveDouble() {
        0.001 `should be` Positive
    }

    @Test
    fun failWhenTestingANegativeDouble() {
        assertFails { -0.00001 `should be` Positive }
    }

    @Test
    fun failWhenTestingZeroDouble() {
        assertFails { 0.0 `should be` Positive }
    }

    @Test
    fun passWhenTestingAPositiveFloat() {
        0.001f `should be` Positive
    }

    @Test
    fun failWhenTestingANegativeFloat() {
        assertFails { -0.00001f `should be` Positive }
    }

    @Test
    fun failWhenTestingZeroFloat() {
        assertFails { 0.0f `should be` Positive }
    }

    @Test
    fun passWhenTestingAPositiveLong() {
        1L `should be` Positive
    }

    @Test
    fun failWhenTestingANegativeLong() {
        assertFails { -1L `should be` Positive }
    }

    @Test
    fun failWhenTestingZeroLong() {
        assertFails { 0L `should be` Positive }
    }

    @Test
    fun passWhenTestingAPositiveByte() {
        1.toByte() `should be` Positive
    }

    @Test
    fun failWhenTestingANegativeByte() {
        assertFails { (-1).toByte() `should be` Positive }
    }

    @Test
    fun failWhenTestingZeroByte() {
        assertFails { 0.toByte() `should be` Positive }
    }

    @Test
    fun passWhenTestingAPositiveShort() {
        1.toShort() `should be` Positive
    }

    @Test
    fun failWhenTestingANegativeShort() {
        assertFails { (-1).toShort() `should be` Positive }
    }

    @Test
    fun failWhenTestingZeroShort() {
        assertFails { 0.toShort() `should be` Positive }
    }
}
