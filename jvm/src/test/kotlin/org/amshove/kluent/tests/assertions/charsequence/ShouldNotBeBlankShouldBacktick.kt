package org.amshove.kluent.tests.charsequence

import org.amshove.kluent.Blank
import org.amshove.kluent.`should not be`
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotBeBlankShouldBacktick {
    @Test
    fun passWhenTestingANonBlankCharSequence() {
        "  a " `should not be` Blank
    }

    @Test
    fun failWhenTestingABlankCharSequence() {
        assertFails { "   " `should not be` Blank }
    }
}
