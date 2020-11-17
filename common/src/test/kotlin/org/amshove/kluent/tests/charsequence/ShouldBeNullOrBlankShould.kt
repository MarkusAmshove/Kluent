package org.amshove.kluent.tests.charsequence

import org.amshove.kluent.shouldBeNullOrBlank
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeNullOrBlankShould {
    @Test
    fun passWhenTestingABlankCharSequence() {
        "  ".shouldBeNullOrBlank()
    }

    @Test
    fun passWhenTestingANullReference() {
        val seq: CharSequence? = null
        seq.shouldBeNullOrBlank()
    }

    @Test
    fun failWhenTestingANonBlankCharSequence() {
        assertFails { "abc".shouldBeNullOrBlank() }
    }
}