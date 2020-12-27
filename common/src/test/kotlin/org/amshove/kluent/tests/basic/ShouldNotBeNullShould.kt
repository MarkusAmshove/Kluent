package org.amshove.kluent.tests.basic

import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldNotBeNull
import kotlin.test.Test

class ShouldNotBeNullShould {
    @Test
    fun passWhenPassingNonNullReference() {
        val str = "Hello"
        str.shouldNotBeNull()
    }

    @Test
    fun returnANonNullableInstance() {
        val str = "Hello"
        val nonNullable: String = str.shouldNotBeNull()
        nonNullable.shouldNotBeNull()
    }

    @Test
    fun failWhenPassingNullReference() {
        val str: String? = null
        assertFails { str.shouldNotBeNull() }
    }

    @Test
    fun passWhenPassingNonNullableType() {
        val str = "Hello"
        str.shouldNotBeNull()
    }
}