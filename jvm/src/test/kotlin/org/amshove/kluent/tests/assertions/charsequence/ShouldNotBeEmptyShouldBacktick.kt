package org.amshove.kluent.tests.charsequence

import org.amshove.kluent.Empty
import org.amshove.kluent.`should not be`
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotBeEmptyShouldBacktick {
    @Test
    fun passWhenTestingANonEmptyCharSequence() {
        "test" `should not be` Empty
    }

    @Test
    fun failWhenTestingAnEmptyCharSequence() {
        assertFails { "" `should not be` Empty }
    }
}
