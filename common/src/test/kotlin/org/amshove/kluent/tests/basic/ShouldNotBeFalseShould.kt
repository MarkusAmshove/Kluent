package org.amshove.kluent.tests.basic

import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldNotBeFalse
import kotlin.test.Test

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