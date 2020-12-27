package org.amshove.kluent.tests.charsequence

import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldBeNullOrEmpty
import kotlin.test.Test

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