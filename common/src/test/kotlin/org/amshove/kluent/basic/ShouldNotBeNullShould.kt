package org.amshove.kluent.basic

import org.amshove.kluent.shouldNotBeNull
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotBeNullShould {
    @Test
    fun passWhenPassingNonNullReference() {
        val str: String? = "Hello"
        str.shouldNotBeNull()
    }

    @Test
    fun failWhenPassingNullReference() {
        val str: String? = null
        assertFails { str.shouldNotBeNull() }
    }

    @Test
    fun passWhenPassingNonNullableType() {
        val str: String = "Hello"
        str.shouldNotBeNull()
    }
}