package org.amshove.kluent.tests.charsequence

import org.amshove.kluent.NullOrBlank
import org.amshove.kluent.`should not be`
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails
import kotlin.test.assertNotNull

class ShouldNotBeNullOrBlankShouldBacktick {
    @Test
    fun passWhenTestingANonEmptyCharSequence() {
        "a" `should not be` NullOrBlank
    }

    @Test
    fun failWhenTestingABlankCharSequence() {
        assertFails { "   " `should not be` NullOrBlank }
    }

    @Test
    fun failWhenTestingANullReference() {
        val str: CharSequence? = null
        assertFails { str `should not be` NullOrBlank }
    }

    @Test
    fun returnANonNullableInstance() {
        val nullable: CharSequence? = "is this null?"
        val result: CharSequence = nullable `should not be` NullOrBlank
        assertNotNull(result)
        assertEquals("is this null?", result)
    }
}
