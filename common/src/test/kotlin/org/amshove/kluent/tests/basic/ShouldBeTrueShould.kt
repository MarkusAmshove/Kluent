package org.amshove.kluent.tests.basic

import org.amshove.kluent.shouldBeTrue
import org.amshove.kluent.assertMessage
import org.amshove.kluent.assertMessageContain
import org.amshove.kluent.shouldBeFalse
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
        assertMessageContain("Expected value to be true, but was false") {
            false.shouldBeTrue()
        }
    }
}