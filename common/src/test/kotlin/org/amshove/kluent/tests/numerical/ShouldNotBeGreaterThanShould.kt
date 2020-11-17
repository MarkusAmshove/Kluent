package org.amshove.kluent.tests.numerical

import org.amshove.kluent.shouldNotBeGreaterThan
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotBeGreaterThanShould {
    @Test
    fun passWhenTestingAnIntegerWhichIsSmaller() {
        2.shouldNotBeGreaterThan(5)
    }

    @Test
    fun passWhenTestingAnIntegerWhichIsEqual() {
        2.shouldNotBeGreaterThan(2)
    }

    @Test
    fun failWhenTestingAnIntegerWhichIsGreater() {
        assertFails { 5.shouldNotBeGreaterThan(2) }
    }

    @Test
    fun passWhenTestingADoubleWhichIsSmaller() {
        (2.01).shouldNotBeGreaterThan(2.02)
    }

    @Test
    fun passWhenTestingADoubleWhichIsEqual() {
        (2.0).shouldNotBeGreaterThan(2.0)
    }

    @Test
    fun failWhenTestingADoubleWhichIsGreater() {
        assertFails { (9.99).shouldNotBeGreaterThan(8.99) }
    }

    @Test
    fun passWhenTestingAFloatWhichIsSmaller() {
        (2.01f).shouldNotBeGreaterThan(2.02f)
    }

    @Test
    fun passWhenTestingAFloatWhichIsEqual() {
        (2.0f).shouldNotBeGreaterThan(2.0f)
    }

    @Test
    fun failWhenTestingAFloatWhichIsGreater() {
        assertFails { (9.99f).shouldNotBeGreaterThan(8.99f) }
    }
}