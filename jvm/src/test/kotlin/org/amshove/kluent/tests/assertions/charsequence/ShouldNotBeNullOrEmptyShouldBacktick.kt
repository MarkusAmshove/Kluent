package org.amshove.kluent.tests.charsequence

import org.amshove.kluent.NullOrEmpty
import org.amshove.kluent.`should not be`
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails
import kotlin.test.assertNotNull

class ShouldNotBeNullOrEmptyShouldBacktick {
    @Test
    fun passWhenTestingANonEmptyCharSequence() {
        "abc" `should not be` NullOrEmpty
    }

    @Test
    fun failWhenTestingAnEmptyCharSequence() {
        assertFails { "" `should not be` NullOrEmpty }
    }

    @Test
    fun failWhenTestingNull() {
        val str: CharSequence? = null
        assertFails { str `should not be` NullOrEmpty }
    }

    @Test
    fun returnANonNullableInstance() {
        val nullable: CharSequence? = "is this null?"
        val result: CharSequence = nullable `should not be` NullOrEmpty
        assertNotNull(result)
        assertEquals("is this null?", result)
    }
}
