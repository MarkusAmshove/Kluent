package org.amshove.kluent.tests.charsequence

import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldNotEndWith
import kotlin.test.Test

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