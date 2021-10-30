package org.amshove.kluent.tests.collections

import org.amshove.kluent.shouldContainTrue
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldContainTrueShould {
    @Test
    fun passWhenTestingAPrimitiveBooleanArrayContainsAtLeastOneElement() {
        booleanArrayOf(true, false).shouldContainTrue()
    }

    @Test
    fun failWhenTestingAPrimitiveBooleanArrayWhichDoesNotContainAtLeastOneElement() {
        assertFails { booleanArrayOf(false, false).shouldContainTrue() }
    }
}