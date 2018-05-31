package org.amshove.kluent.charsequence

import org.amshove.kluent.shouldStartWith
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldStartWithShould {
    @Test
    fun passWhenTestingACharSequenceWhichStartsWithASubSequence() {
        "Hello".shouldStartWith("He")
    }

    @Test
    fun failWhenTestingACharSequenceWhichDoesNotStartWithASubSequence() {
       assertFails { "Bye" shouldStartWith "H" }
    }
}