package org.amshove.kluent.numerical

import org.amshove.kluent.shouldBeNegative
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeNegativeShould {
    @Test
    fun passWhenTestingANegativeInteger() {
        (-5).shouldBeNegative()
    }

    @Test
    fun failWhenTestingAPositiveInteger() {
        assertFails { 5.shouldBeNegative() }
    }

    @Test
    fun failWhenTestingZeroInteger() {
        assertFails { 0.shouldBeNegative() }
    }

    @Test
    fun passWhenTestingANegativeDouble() {
        (-0.9999).shouldBeNegative()
    }

    @Test
    fun failWhenTestingAPositiveDouble() {
        assertFails { (0.0001).shouldBeNegative() }
    }

    @Test
    fun failWhenTestingZeroDouble() {
        assertFails { (0.0).shouldBeNegative() }
    }

    @Test
    fun passWhenTestingANegativeFloat() {
        (-0.9999f).shouldBeNegative()
    }

    @Test
    fun failWhenTestingAPositiveFloat() {
        assertFails { (0.0001f).shouldBeNegative() }
    }

    @Test
    fun failWhenTestingZeroFloat() {
        assertFails { (0.0f).shouldBeNegative() }
    }
}