package org.amshove.kluent.numerical

import org.amshove.kluent.shouldNotBeGreaterOrEqualTo
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotBeGreaterOrEqualToShould {
    @Test
    fun passWhenTestingAnIntegerWhichIsSmaller() {
        2.shouldNotBeGreaterOrEqualTo(10)
    }

    @Test
    fun failWhenTestingAnIntegerWhichIsGreater() {
        assertFails { 3.shouldNotBeGreaterOrEqualTo(2) }
    }

    @Test
    fun failWhenTestingAnIntegerWhichIsEqual() {
        assertFails { 5.shouldNotBeGreaterOrEqualTo(5) }
    }

    @Test
    fun passWhenTestingADoubleWhichIsSmaller() {
        (2.1).shouldNotBeGreaterOrEqualTo(2.2)
    }

    @Test
    fun failWhenTestingADoubleWhichIsGreater() {
        assertFails { (3.0).shouldNotBeGreaterOrEqualTo(2.999) }
    }

    @Test
    fun failWhenTestingADoubleWhichIsEqual() {
        assertFails { (5.00005).shouldNotBeGreaterOrEqualTo(5.00005) }
    }

    @Test
    fun passWhenTestingAFloatWhichIsSmaller() {
        (2.1f).shouldNotBeGreaterOrEqualTo(2.2f)
    }

    @Test
    fun failWhenTestingAFloatWhichIsGreater() {
        assertFails { (3.0f).shouldNotBeGreaterOrEqualTo(2.999f) }
    }

    @Test
    fun failWhenTestingAFloatWhichIsEqual() {
        assertFails { (5.00005f).shouldNotBeGreaterOrEqualTo(5.00005f) }
    }
}