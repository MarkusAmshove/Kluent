package org.amshove.kluent.numerical

import org.amshove.kluent.shouldBeGreaterThan
import kotlin.test.assertFails
import kotlin.test.Test

class ShouldBeGreaterThanShould {
    @Test
    fun passWhenTestingAnIntegerWhichIsGreater() {
        5.shouldBeGreaterThan(2)
    }

    @Test
    fun failWhenTestingAnIntegerWhichIsEqual() {
        assertFails { 5.shouldBeGreaterThan(5) }
    }

    @Test
    fun failWhenTestingAnIntegerWhichIsSmaller() {
        assertFails { 2.shouldBeGreaterThan(5) }
    }

    @Test
    fun passWhenTestingADoubleWhichIsGreater() {
        (5.0).shouldBeGreaterThan(4.999)
    }

    @Test
    fun failWhenTestingADoubleWhichIsEqual() {
        assertFails { (5.0).shouldBeGreaterThan(5.0) }
    }

    @Test
    fun failWhenTestingADoubleWhichIsSmaller() {
        assertFails { (2.999).shouldBeGreaterThan(3.0) }
    }

    @Test
    fun passWhenTestingAFloatWhichIsGreater() {
        (5.0f).shouldBeGreaterThan(4.999f)
    }

    @Test
    fun failWhenTestingAFloatWhichIsEqual() {
        assertFails { (5.0f).shouldBeGreaterThan(5.0f) }
    }

    @Test
    fun failWhenTestingAFloatWhichIsSmaller() {
        assertFails { (2.999f).shouldBeGreaterThan(3.0f) }
    }
}
