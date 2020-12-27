package org.amshove.kluent.tests.charsequence

import org.amshove.kluent.shouldEndWith
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldEndWithShould {
    @Test
    fun passWhenTestingACharSequenceWhichEndsWithASequence() {
        "Hello".shouldEndWith("llo")
    }

    @Test
    fun failWhenTestingACharSequenceWhichDoesNotEndWithASequence() {
        assertFails { "Bye".shouldEndWith("ay") }
    }
}