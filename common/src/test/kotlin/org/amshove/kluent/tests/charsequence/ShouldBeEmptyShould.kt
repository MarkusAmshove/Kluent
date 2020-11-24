package org.amshove.kluent.tests.charsequence

import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldBeEmpty
import kotlin.test.Test

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