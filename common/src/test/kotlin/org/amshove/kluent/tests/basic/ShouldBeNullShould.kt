package org.amshove.kluent.tests.basic

import org.amshove.kluent.shouldBeNull
import org.amshove.kluent.shouldNotBeNull
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeNullShould {
    @Test
    fun passWhenPassingNull() {
        val obj: Any? = null
        obj.shouldBeNull()
    }

    @Test
    fun failWhenPassingNonNull() {
        val str: String? = "Hello"
        assertFails { str.shouldBeNull() }
    }

    @Test
    fun failWhenCheckingNonNullableType() {
        val str: String = "Hello"
        assertFails { str.shouldBeNull() }
    }
}