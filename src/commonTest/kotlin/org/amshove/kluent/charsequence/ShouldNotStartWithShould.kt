package org.amshove.kluent.charsequence

import org.amshove.kluent.shouldNotStartWith
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotStartWithShould {
    @Test
    fun passWhenTestingACharSequenceWhichDoesNotStartWithAnotherSequence() {
        "Bye".shouldNotStartWith("Hel")
    }

    @Test
    fun failWhenTestingACharSequenceWhichStartsWithAnotherSequence() {
        assertFails { "Hello".shouldNotStartWith("He") }
    }
}