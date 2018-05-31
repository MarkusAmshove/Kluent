package org.amshove.kluent.charsequence

import org.amshove.kluent.shouldMatch
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldMatchShould {
    @Test
    fun passWhenTestingIfACharSequenceMatchesARegexRepresentedByAPattern() {
        "1234".shouldMatch("\\d+")
    }

    @Test
    fun passWhenTestingIfACharSequenceMatchesARegex() {
        "1234".shouldMatch(Regex("\\d+"))
    }

    @Test
    fun failWhenTestingACharSequenceWhichDoesNotMatchARegexRepresentedByAPattern() {
        assertFails { "abc".shouldMatch("\\d+") }
    }

    @Test
    fun failWhenTestingACharSequenceWhichDoesNotMatchARegex() {
        assertFails { "abc".shouldMatch(Regex("\\d+")) }
    }
}