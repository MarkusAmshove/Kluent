package org.amshove.kluent.tests.numerical

import org.amshove.kluent.Negative
import org.amshove.kluent.`should be`
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeNegativeShouldBacktick {
    @Test
    fun passWhenTestingANegativeInteger() {
        -5 `should be` Negative
    }

    @Test
    fun failWhenTestingAPositiveInteger() {
        assertFails { 5 `should be` Negative }
    }

    @Test
    fun failWhenTestingZeroInteger() {
        assertFails { 0 `should be` Negative }
    }

    @Test
    fun passWhenTestingANegativeDouble() {
        -0.9999 `should be` Negative
    }

    @Test
    fun failWhenTestingAPositiveDouble() {
        assertFails { 0.0001 `should be` Negative }
    }

    @Test
    fun failWhenTestingZeroDouble() {
        assertFails { 0.0 `should be` Negative }
    }

    @Test
    fun passWhenTestingANegativeFloat() {
        -0.9999f `should be` Negative
    }

    @Test
    fun failWhenTestingAPositiveFloat() {
        assertFails { 0.0001f `should be` Negative }
    }

    @Test
    fun failWhenTestingZeroFloat() {
        assertFails { 0.0f `should be` Negative }
    }

    @Test
    fun passWhenTestingANegativeShort() {
        (-1).toShort() `should be` Negative
    }

    @Test
    fun failWhenTestingAPositiveShort() {
        assertFails { 1.toShort() `should be` Negative }
    }

    @Test
    fun failWhenTestingZeroShort() {
        assertFails { 0.toShort() `should be` Negative }
    }

    @Test
    fun passWhenTestingANegativeByte() {
        (-1).toByte() `should be` Negative
    }

    @Test
    fun failWhenTestingAPositiveByte() {
        assertFails { 1.toByte() `should be` Negative }
    }

    @Test
    fun failWhenTestingZeroByte() {
        assertFails { 0.toShort() `should be` Negative }
    }

    @Test
    fun passWhenTestingANegativeLong() {
        -1L `should be` Negative
    }

    @Test
    fun failWhenTestingAPositiveLong() {
        assertFails { 1L `should be` Negative }
    }

    @Test
    fun failWhenTestingZeroLong() {
        assertFails { 0L `should be` Negative }
    }
}
