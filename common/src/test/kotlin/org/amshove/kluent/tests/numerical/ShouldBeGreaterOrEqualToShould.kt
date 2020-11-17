package org.amshove.kluent.tests.numerical

import org.amshove.kluent.shouldBeGreaterOrEqualTo
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeGreaterOrEqualToShould {

    @Test
    fun passWhenTestingAnIntegerWhichIsGreater() {
        5.shouldBeGreaterOrEqualTo(2)
    }

    @Test
    fun passWhenTestingAnIntegerWhichIsEqual() {
        5.shouldBeGreaterOrEqualTo(5)
    }

    @Test
    fun failWhenTestingAnIntegerWhichIsSmaller() {
        assertFails { 2.shouldBeGreaterOrEqualTo(5) }
    }

    @Test
    fun passWhenTestingADoubleWhichIsGreater() {
        (5.0).shouldBeGreaterOrEqualTo(2.0)
    }

    @Test
    fun passWhenTestingADoubleWhichIsEqual() {
        (5.0).shouldBeGreaterOrEqualTo(5.0)
    }

    @Test
    fun failWhenTestingADoubleWhichIsSmaller() {
        assertFails { (2.0).shouldBeGreaterOrEqualTo(5.0) }
    }

    @Test
    fun passWhenTestingAFloatWhichIsGreater() {
        (5.0f).shouldBeGreaterOrEqualTo(2.0f)
    }

    @Test
    fun passWhenTestingAFloatWhichIsEqual() {
        (5.0f).shouldBeGreaterOrEqualTo(5.0f)
    }

    @Test
    fun failWhenTestingAFloatWhichIsSmaller() {
        assertFails { (2.0f).shouldBeGreaterOrEqualTo(5.0f) }
    }
}