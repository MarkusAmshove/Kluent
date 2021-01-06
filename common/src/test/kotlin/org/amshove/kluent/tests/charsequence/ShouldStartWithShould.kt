package org.amshove.kluent.tests.charsequence

import org.amshove.kluent.shouldStartWith
import org.amshove.kluent.shouldStartWithIgnoringCase
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldStartWithShould {
    @Test
    fun passWhenTestingACharSequenceWhichStartsWithASubSequence() {
        "Hello".shouldStartWith("He")
    }

    @Test
    fun passWhenTestingACharSequenceWhichStartsWithASubSequenceIgnoringCase() {
        "Hello".shouldStartWithIgnoringCase("hE")
    }

    @Test
    fun failWhenTestingACharSequenceWhichDoesNotStartWithASubSequence() {
       assertFails { "Bye" shouldStartWith "H" }
    }

    @Test
    fun failWhenTestingACharSequenceWhichDoesNotStartWithASubSequenceIgnoringCase() {
       assertFails { "Bye" shouldStartWithIgnoringCase "H" }
    }
}