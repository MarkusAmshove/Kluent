package org.amshove.kluent.tests.basic

import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldBeNull
import kotlin.test.Test

class ShouldBeNullShould {
    @Test
    fun passWhenPassingNull() {
        val obj: Any? = null
        obj.shouldBeNull()
    }

    @Test
    fun failWhenPassingNonNull() {
        val str = "Hello"
        assertFails { str.shouldBeNull() }
    }

    @Test
    fun failWhenCheckingNonNullableType() {
        val str = "Hello"
        assertFails { str.shouldBeNull() }
    }
}