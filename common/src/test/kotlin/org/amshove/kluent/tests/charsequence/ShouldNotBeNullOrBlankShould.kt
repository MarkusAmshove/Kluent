package org.amshove.kluent.tests.charsequence

import org.amshove.kluent.shouldNotBeNullOrBlank
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails
import kotlin.test.assertNotNull

class ShouldNotBeNullOrBlankShould {
    @Test
    fun passWhenTestingANonEmptyCharSequence() {
        "a".shouldNotBeNullOrBlank()
    }

    @Test
    fun failWhenTestingABlankCharSequence() {
        assertFails { "   ".shouldNotBeNullOrBlank() }
    }

    @Test
    fun failWhenTestingANullReference() {
        val str: CharSequence? = null
        assertFails { str.shouldNotBeNullOrBlank() }
    }

    @Test
    fun returnANonNullableInstance() {
        val nullable: CharSequence? = "is this null?"
        val result: CharSequence = nullable.shouldNotBeNullOrBlank()
        assertNotNull(result)
        assertEquals("is this null?", result)
    }
}