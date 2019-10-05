package org.amshove.kluent.collections

import org.amshove.kluent.shouldContainFalse
import org.amshove.kluent.shouldContainTrue
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldContainFalseShould {
    @Test
    fun passWhenTestingAPrimitiveBooleanArrayContainsAtLeastOneElement() {
        booleanArrayOf(true, false).shouldContainFalse()
    }

    @Test
    fun failWhenTestingAPrimitiveBooleanArrayWhichDoesNotContainAtLeastOneElement() {
        assertFails { booleanArrayOf(true, true).shouldContainFalse() }
    }
}