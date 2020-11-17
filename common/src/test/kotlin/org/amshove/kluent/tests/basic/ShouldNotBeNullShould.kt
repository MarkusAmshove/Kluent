package org.amshove.kluent.tests.basic

import org.amshove.kluent.shouldNotBe
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
    fun returnANonNullableInstance() {
        val str: String? = "Hello"
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
        val str: String = "Hello"
        str.shouldNotBeNull()
    }
}