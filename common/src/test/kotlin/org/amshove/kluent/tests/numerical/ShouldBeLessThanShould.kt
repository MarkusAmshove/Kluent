package org.amshove.kluent.tests.numerical

import org.amshove.kluent.shouldBeLessThan
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeLessThanShould {
    @Test
    fun passWhenTestingAnIntegerWhichIsSmaller() {
        2.shouldBeLessThan(5)
    }

    @Test
    fun failWhenTestingAnIntegerWhichIsEqual() {
        assertFails { 5.shouldBeLessThan(5) }
    }

    @Test
    fun failWhenTestingAnIntegerWhichIsGreater() {
        assertFails { 5.shouldBeLessThan(2) }
    }

    @Test
    fun passWhenTestingADoubleWhichIsSmaller() {
        (2.001).shouldBeLessThan(2.002)
    }

    @Test
    fun failWhenTestingADoubleWhichIsEqual() {
        assertFails { (5.0).shouldBeLessThan(5.0) }
    }

    @Test
    fun failWhenTestingADoubleWhichIsGreater() {
        assertFails { (2.000001).shouldBeLessThan(2.0) }
    }
}