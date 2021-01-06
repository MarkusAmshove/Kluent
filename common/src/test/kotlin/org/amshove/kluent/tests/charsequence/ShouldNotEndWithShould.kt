package org.amshove.kluent.tests.charsequence

import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldNotEndWith
import org.amshove.kluent.shouldNotEndWithIgnoringCase
import kotlin.test.Test

class ShouldNotEndWithShould {
    @Test
    fun passWhenTestingACharSequenceWhichDoesNotEndWithAnotherSequence() {
        "Bye".shouldNotEndWith("Asd")
    }

    @Test
    fun passWhenTestingACharSequenceWhichDoesNotEndWithAnotherSequenceIgnoringCase() {
        "Bye".shouldNotEndWithIgnoringCase("Asd")
    }

    @Test
    fun failWhenTestingACharSequenceWhichDoesEndWithAnotherSequence() {
        assertFails { "Hello".shouldNotEndWith("llo") }
    }

    @Test
    fun failWhenTestingACharSequenceWhichDoesEndWithAnotherSequenceIgnoringCase() {
        assertFails { "Hello".shouldNotEndWithIgnoringCase("lLO") }
    }
}