package org.amshove.kluent.tests.charsequence

import org.amshove.kluent.shouldNotStartWith
import org.amshove.kluent.shouldNotStartWithIgnoringCase
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotStartWithShould {
    @Test
    fun passWhenTestingACharSequenceWhichDoesNotStartWithAnotherSequence() {
        "Bye".shouldNotStartWith("Hel")
    }

    @Test
    fun passWhenTestingACharSequenceWhichDoesNotStartWithAnotherSequenceIgnoringCase() {
        "Bye".shouldNotStartWithIgnoringCase("Hel")
    }

    @Test
    fun failWhenTestingACharSequenceWhichStartsWithAnotherSequence() {
        assertFails { "Hello".shouldNotStartWith("He") }
    }

    @Test
    fun failWhenTestingACharSequenceWhichStartsWithAnotherSequenceIgnoringCase() {
        assertFails { "Hello".shouldNotStartWithIgnoringCase("hE") }
    }
}