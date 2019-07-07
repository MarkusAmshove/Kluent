package org.amshove.kluent.numerical

import org.amshove.kluent.shouldBeLessOrEqualTo
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeLessOrEqualToShould {
    @Test
    fun passWhenTestingAnIntegerWhichIsSmaller() {
        1.shouldBeLessOrEqualTo(2)
    }

    @Test
    fun passWhenTestingAnIntegerWhichIsEqual() {
        5.shouldBeLessOrEqualTo(5)
    }

    @Test
    fun failWhenTestingAnIntegerWhichIsGreater() {
        assertFails { 5.shouldBeLessOrEqualTo(2) }
    }

    @Test
    fun passWhenTestingADoubleWhichIsSmaller() {
        (1.0).shouldBeLessOrEqualTo(1.001)
    }

    @Test
    fun passWhenTestingADoubleWhichIsEqual() {
        (5.0005).shouldBeLessOrEqualTo(5.0005)
    }

    @Test
    fun failWhenTestingADoubleWhichIsGreater() {
        assertFails { (5.00001).shouldBeLessOrEqualTo(5.0) }
    }

    @Test
    fun passWhenTestingAFloatWhichIsSmaller() {
        (1.0f).shouldBeLessOrEqualTo(1.001f)
    }

    @Test
    fun passWhenTestingAFloatWhichIsEqual() {
        (5.0005f).shouldBeLessOrEqualTo(5.0005f)
    }

    @Test
    fun failWhenTestingAFloatWhichIsGreater() {
        assertFails { (5.00001f).shouldBeLessOrEqualTo(5.0f) }
    }
}