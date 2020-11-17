package org.amshove.kluent.tests.charsequence

import org.amshove.kluent.shouldNotBeBlank
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotBeBlankShould {
    @Test
    fun passWhenTestingANonBlankCharSequence() {
        "  a ".shouldNotBeBlank()
    }

    @Test
    fun failWhenTestingABlankCharSequence() {
        assertFails { "   ".shouldNotBeBlank() }
    }
}