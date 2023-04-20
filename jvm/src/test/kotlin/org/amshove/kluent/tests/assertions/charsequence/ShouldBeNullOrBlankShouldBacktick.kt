package org.amshove.kluent.tests.charsequence

import org.amshove.kluent.NullOrBlank
import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.`should be`
import kotlin.test.Test

class ShouldBeNullOrBlankShouldBacktick {
    @Test
    fun passWhenTestingABlankCharSequence() {
        "  " `should be` NullOrBlank
    }

    @Test
    fun passWhenTestingANullReference() {
        val seq: CharSequence? = null
        seq `should be` NullOrBlank
    }

    @Test
    fun failWhenTestingANonBlankCharSequence() {
        assertFails { "abc" `should be` NullOrBlank }
    }
}
