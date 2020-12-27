package org.amshove.kluent.tests.basic

import org.amshove.kluent.assertMessageContain
import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldBeFalse
import kotlin.test.Test

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
        assertMessageContain("Expected value to be false, but was true") {
            true.shouldBeFalse()
        }
    }
}