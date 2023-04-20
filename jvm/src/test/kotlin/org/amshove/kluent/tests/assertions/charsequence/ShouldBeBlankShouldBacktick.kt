package org.amshove.kluent.tests.charsequence

import org.amshove.kluent.Blank
import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.`should be`
import kotlin.test.Test

class ShouldBeBlankShouldBacktick {
    @Test
    fun passWhenTestingABlankCharSequence() {
        "   " `should be` Blank
    }

    @Test
    fun failWhenTestingANonBlankCharSequence() {
        assertFails { " a " `should be` Blank }
    }
}
