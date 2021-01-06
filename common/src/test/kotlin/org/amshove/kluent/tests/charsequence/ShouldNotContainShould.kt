package org.amshove.kluent.tests.charsequence

import org.amshove.kluent.shouldNotContain
import org.amshove.kluent.shouldNotContainIgnoringCase
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotContainShould {
    @Test
    fun passWhenTestingACharSequenceWhichDoesNotContainTheCharacter() {
        "Hello".shouldNotContain('a')
    }

    @Test
    fun passWhenTestingACharSequenceWhichDoesNotContainTheCharacterIgnoringCase() {
        "Hello".shouldNotContainIgnoringCase('a')
    }

    @Test
    fun failWhenTestingACharSequenceWhichDoesContainTheCharacter() {
        assertFails { "Hello" shouldNotContain ('H') }
    }

    @Test
    fun failWhenTestingACharSequenceWhichDoesContainTheCharacterIgnoringCase() {
        assertFails { "Hello" shouldNotContainIgnoringCase ('h') }
    }

    @Test
    fun passWhenTestingACharSequenceWhichDoesNotContainASubsequence() {
        "Hello".shouldNotContain("bye")
    }

    @Test
    fun passWhenTestingACharSequenceWhichDoesNotContainASubsequenceIgnoringCase() {
        "Hello".shouldNotContainIgnoringCase("byE")
    }

    @Test
    fun failWhenTestingACharSequenceWhichDoesContainASubsequence() {
        assertFails { "Bye".shouldNotContain("ye") }
    }
}