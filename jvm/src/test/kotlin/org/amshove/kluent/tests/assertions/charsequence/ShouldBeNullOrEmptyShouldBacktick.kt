package org.amshove.kluent.tests.charsequence

import org.amshove.kluent.NullOrEmpty
import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.`should be`
import kotlin.test.Test

class ShouldBeNullOrEmptyShouldBacktick {
    @Test
    fun passWhenTestingAnEmptyCharSequence() {
        "" `should be` NullOrEmpty
    }

    @Test
    fun passWhenTestingANullReference() {
        val seq: CharSequence? = null
        seq `should be` NullOrEmpty
    }

    @Test
    fun failWhenTestingANonEmptyCharSequence() {
        assertFails { "abc" `should be` NullOrEmpty }
    }
}
