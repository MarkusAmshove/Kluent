package org.amshove.kluent.tests.basic

import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldNotBeTrue
import kotlin.test.Test

class ShouldNotBeTrueShould {
    @Test
    fun passWhenPassingFalse() {
        false.shouldNotBeTrue()
    }

    @Test
    fun failWhenPassingTrue() {
        assertFails { true.shouldNotBeTrue() }
    }
}