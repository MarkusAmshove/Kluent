package org.amshove.kluent.basic

import org.amshove.kluent.assertMessage
import org.amshove.kluent.shouldBeTrue
import kotlin.test.Test
import kotlin.test.assertFails

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
        assertMessage("Expected value to be true, but was false") { false.shouldBeTrue() }
    }
}