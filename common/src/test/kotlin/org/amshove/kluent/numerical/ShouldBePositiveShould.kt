package org.amshove.kluent.numerical

import org.amshove.kluent.shouldBePositive
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBePositiveShould {
    @Test
    fun passWhenTestingAPositiveInteger() {
        5.shouldBePositive()
    }

    @Test
    fun failWhenTestingANegativeInteger() {
        assertFails { (-5).shouldBePositive() }
    }

    @Test
    fun failWhenTestingZeroInteger() {
        assertFails { 0.shouldBePositive() }
    }

    @Test
    fun passWhenTestingAPositiveDouble() {
        (0.001).shouldBePositive()
    }

    @Test
    fun failWhenTestingANegativeDouble() {
        assertFails { (-0.00001).shouldBePositive() }
    }

    @Test
    fun failWhenTestingZeroDouble() {
        assertFails { (0.0).shouldBePositive() }
    }

    @Test
    fun passWhenTestingAPositiveFloat() {
        (0.001f).shouldBePositive()
    }

    @Test
    fun failWhenTestingANegativeFloat() {
        assertFails { (-0.00001f).shouldBePositive() }
    }

    @Test
    fun failWhenTestingZeroFloat() {
        assertFails { (0.0f).shouldBePositive() }
    }
}