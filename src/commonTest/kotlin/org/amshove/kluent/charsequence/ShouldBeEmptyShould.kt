package org.amshove.kluent.charsequence

import org.amshove.kluent.shouldBeEmpty
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeEmptyShould {
    @Test
    fun passWhenTestingAnEmptyCharSequence() {
        "".shouldBeEmpty()
    }

    @Test
    fun failWhenTestingANonEmptyCharSequence() {
        assertFails { "test".shouldBeEmpty() }
    }
}