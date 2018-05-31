package org.amshove.kluent.charsequence

import org.amshove.kluent.shouldNotMatch
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotMatchShould {
    @Test
    fun passWhenTestingACharSequenceWhichDoesNotMatchAPattern() {
        "1234" shouldNotMatch "\\w"
    }

    @Test
    fun passWhenTestingACharSequenceWhichDoesNotMatchARegex() {
        "1234" shouldNotMatch Regex("\\w")
    }

    @Test
    fun failWhenTestingACharSequenceWhichDoesMatchAPattern() {
        assertFails { "1234".shouldNotMatch("\\d+") }
    }

    @Test
    fun failWhenTestingACharSequenceWhichDoesMatchARegex() {
        assertFails { "1234".shouldNotMatch(Regex("\\d+")) }
    }
}