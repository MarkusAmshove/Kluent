package org.amshove.kluent.tests.charsequence

import org.amshove.kluent.shouldNotContain
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotContainShould {
    @Test
    fun passWhenTestingACharSequenceWhichDoesNotContainTheCharacter() {
        "Hello".shouldNotContain('a')
    }

    @Test
    fun failWhenTestingACharSequenceWhichDoesContainTheCharacter() {
        assertFails { "Hello" shouldNotContain ('H') }
    }

    @Test
    fun passWhenTestingACharSequenceWhichDoesNotContainASubsequence() {
        "Hello".shouldNotContain("bye")
    }

    @Test
    fun failWhenTestingACharSequenceWhichDoesContainASubsequence() {
        assertFails { "Bye".shouldNotContain("ye") }
    }
}