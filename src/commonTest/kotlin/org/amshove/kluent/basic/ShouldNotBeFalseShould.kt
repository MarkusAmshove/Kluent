package org.amshove.kluent.basic

import org.amshove.kluent.shouldNotBeFalse
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotBeFalseShould {
    @Test
    fun passWhenPassingTrue() {
        true.shouldNotBeFalse()
    }

    @Test
    fun failWhenPassingFalse() {
        assertFails { false.shouldNotBeFalse() }
    }
}