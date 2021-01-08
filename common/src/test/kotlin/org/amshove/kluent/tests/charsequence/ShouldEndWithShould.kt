package org.amshove.kluent.tests.charsequence

import org.amshove.kluent.shouldEndWith
import org.amshove.kluent.shouldEndWithIgnoringCase
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldEndWithShould {
    @Test
    fun passWhenTestingACharSequenceWhichEndsWithASequence() {
        "Hello".shouldEndWith("llo")
    }

    @Test
    fun passWhenTestingACharSequenceWhichEndsWithASequenceIgnoringCase() {
        "Hello".shouldEndWithIgnoringCase("lLO")
    }

    @Test
    fun failWhenTestingACharSequenceWhichDoesNotEndWithASequence() {
        assertFails { "Bye".shouldEndWith("ay") }
    }

    @Test
    fun failWhenTestingACharSequenceWhichDoesNotEndWithASequenceIgnoringCase() {
        assertFails { "Bye".shouldEndWith("aY") }
    }
}