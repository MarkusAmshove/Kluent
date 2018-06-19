package org.amshove.kluent.charsequence

import org.amshove.kluent.shouldContain
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldContainShould {
    @Test
    fun passWhenTestingACharacterThatIsContained() {
        "Hello".shouldContain('H')
    }

    @Test
    fun failWhenTestingACharacterWhichIsNotContained() {
        assertFails { "Hello".shouldContain('a') }
    }

    @Test
    fun passWhenTestingACharSequenceWhichIsContained() {
        "Hello".shouldContain("ll")
    }

    @Test
    fun failWhenTestingACharSequenceWhichIsNotContained() {
        assertFails { "Bye".shouldContain("hello") }
    }
}