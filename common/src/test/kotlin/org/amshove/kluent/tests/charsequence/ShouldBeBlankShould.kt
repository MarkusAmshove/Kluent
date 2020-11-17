package org.amshove.kluent.tests.charsequence

import org.amshove.kluent.shouldBeBlank
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeBlankShould {
    @Test
    fun passWhenTestingABlankCharSequence() {
        "   ".shouldBeBlank()
    }

    @Test
    fun failWhenTestingANonBlankCharSequence() {
        assertFails { " a ".shouldBeBlank() }
    }
}