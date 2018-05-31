package org.amshove.kluent.charsequence

import org.amshove.kluent.shouldBeNullOrEmpty
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeNullOrEmptyShould {
    @Test
    fun passWhenTestingAnEmptyCharSequence() {
        "".shouldBeNullOrEmpty()
    }

    @Test
    fun passWhenTestingANullReference() {
        val seq: CharSequence? = null
        seq.shouldBeNullOrEmpty()
    }

    @Test
    fun failWhenTestingANonEmptyCharSequence() {
        assertFails { "abc".shouldBeNullOrEmpty() }
    }
}