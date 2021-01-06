package org.amshove.kluent.tests.charsequence

import org.amshove.kluent.shouldContain
import org.amshove.kluent.shouldContainIgnoringCase
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldContainShould {
    @Test
    fun passWhenTestingACharacterThatIsContained() {
        "Hello".shouldContain('H')
    }

    @Test
    fun passWhenTestingACharacterThatIsContainedIgnoringCase() {
        "Hello".shouldContainIgnoringCase('h')
    }

    @Test
    fun failWhenTestingACharacterWhichIsNotContained() {
        assertFails { "Hello".shouldContain('a') }
    }

    @Test
    fun failWhenTestingACharacterWhichIsNotContainedNotIgnoringCase() {
        assertFails { "Hello".shouldContain('E') }
    }

    @Test
    fun failWhenTestingACharacterWhichIsNotContainedIgnoringCase() {
        assertFails { "Hello".shouldContainIgnoringCase('a') }
    }

    @Test
    fun passWhenTestingACharSequenceWhichIsContained() {
        "Hello".shouldContain("ll")
    }

    @Test
    fun passWhenTestingACharSequenceWhichIsContainedIgnoringCase() {
        "Hello".shouldContainIgnoringCase("lL")
    }

    @Test
    fun failWhenTestingACharSequenceWhichIsNotContained() {
        assertFails { "Bye".shouldContain("hello") }
    }
}