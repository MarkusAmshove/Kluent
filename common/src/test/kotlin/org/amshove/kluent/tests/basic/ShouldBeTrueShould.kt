package org.amshove.kluent.tests.basic

import org.amshove.kluent.assertMessageContain
import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldBeTrue
import kotlin.test.Test

class ShouldBeTrueShould {
    @Test
    fun passWhenPassingTrue() {
        true.shouldBeTrue()
    }

    @Test
    fun failWhenPassingFalse() {
        assertFails { false.shouldBeTrue() }
    }

    @Test
    fun provideADescriptiveMessage() {
        assertMessageContain("Expected value to be true, but was false") {
            false.shouldBeTrue()
        }
    }
}