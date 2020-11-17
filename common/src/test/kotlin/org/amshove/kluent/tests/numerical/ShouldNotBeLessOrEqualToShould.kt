package org.amshove.kluent.tests.numerical

import org.amshove.kluent.shouldNotBeLessOrEqualTo
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotBeLessOrEqualToShould {
    @Test
    fun passWhenTestingAnIntegerWhichIsGreater() {
        5.shouldNotBeLessOrEqualTo(2)
    }

    @Test
    fun failWhenTestingAnIntegerWhichIsEqual() {
        assertFails { 2.shouldNotBeLessOrEqualTo(2) }
    }

    @Test
    fun failWhenTestingAnIntegerWhichIsSmaller() {
        assertFails { 2.shouldNotBeLessOrEqualTo(5) }
    }

    @Test
    fun passWhenTestingADoubleWhichIsGreater() {
        (5.5).shouldNotBeLessOrEqualTo(4.9)
    }

    @Test
    fun failWhenTestingADoubleWhichIsEqual() {
        assertFails { (2.01).shouldNotBeLessOrEqualTo(2.01) }
    }

    @Test
    fun failWhenTestingADoubleWhichIsSmaller() {
        assertFails { (1.59).shouldNotBeLessOrEqualTo(1.6) }
    }

    @Test
    fun passWhenTestingAFloatWhichIsGreater() {
        (5.5f).shouldNotBeLessOrEqualTo(4.9f)
    }

    @Test
    fun failWhenTestingAFloatWhichIsEqual() {
        assertFails { (2.01f).shouldNotBeLessOrEqualTo(2.01f) }
    }

    @Test
    fun failWhenTestingAFloatWhichIsSmaller() {
        assertFails { (1.59f).shouldNotBeLessOrEqualTo(1.6f) }
    }
}