package org.amshove.kluent.tests.collections

import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldContainFalse
import kotlin.test.Test

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