package org.amshove.kluent.basic

import org.amshove.kluent.assertMessage
import org.amshove.kluent.shouldBeFalse
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeFalseShould {
    @Test
    fun passWhenPassingFalse() {
        false.shouldBeFalse()
    }

    @Test
    fun failWhenPassingTrue() {
        assertFails { true.shouldBeFalse() }
    }

    @Test
    fun provideADescriptiveMessage() {
        assertMessage("Expected value to be false, but was true") { true.shouldBeFalse() }
    }
}