package org.amshove.kluent.tests.charsequence

import org.amshove.kluent.Empty
import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.`should be`
import kotlin.test.Test

class ShouldBeEmptyShouldBacktick {
    @Test
    fun passWhenTestingAnEmptyCharSequence() {
        "" `should be` Empty
    }

    @Test
    fun failWhenTestingANonEmptyCharSequence() {
        assertFails { "test" `should be` Empty }
    }
}
