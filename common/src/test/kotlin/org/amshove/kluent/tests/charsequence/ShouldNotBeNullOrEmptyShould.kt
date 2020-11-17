package org.amshove.kluent.tests.charsequence

import org.amshove.kluent.shouldNotBeNullOrEmpty
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails
import kotlin.test.assertNotNull

class ShouldNotBeNullOrEmptyShould {
    @Test
    fun passWhenTestingANonEmptyCharSequence() {
        "abc".shouldNotBeNullOrEmpty()
    }

    @Test
    fun failWhenTestingAnEmptyCharSequence() {
        assertFails { "".shouldNotBeNullOrEmpty() }
    }

    @Test
    fun failWhenTestingNull() {
        val str: CharSequence? = null
        assertFails { str.shouldNotBeNullOrEmpty() }
    }

    @Test
    fun returnANonNullableInstance() {
        val nullable: CharSequence? = "is this null?"
        val result: CharSequence = nullable.shouldNotBeNullOrEmpty()
        assertNotNull(result)
        assertEquals("is this null?", result)
    }
}