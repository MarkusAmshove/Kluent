package org.amshove.kluent.tests.charsequence

import org.amshove.kluent.shouldNotBeEmpty
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotBeEmptyShould {
    @Test
    fun passWhenTestingANonEmptyCharSequence() {
        "test".shouldNotBeEmpty()
    }

    @Test
    fun failWhenTestingAnEmptyCharSequence() {
        assertFails { "".shouldNotBeEmpty() }
    }
}