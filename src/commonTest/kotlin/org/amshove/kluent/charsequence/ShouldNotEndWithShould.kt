package org.amshove.kluent.charsequence

import org.amshove.kluent.shouldNotEndWith
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotEndWithShould {
    @Test
    fun passWhenTestingACharSequenceWhichDoesNotEndWithAnotherSequence() {
        "Bye".shouldNotEndWith("Asd")
    }

    @Test
    fun failWhenTestingACharSequenceWhichDoesEndWithAnotherSequence() {
        assertFails { "Hello".shouldNotEndWith("llo") }
    }
}