package org.amshove.kluent.tests.charsequence

import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldBeBlank
import kotlin.test.Test

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