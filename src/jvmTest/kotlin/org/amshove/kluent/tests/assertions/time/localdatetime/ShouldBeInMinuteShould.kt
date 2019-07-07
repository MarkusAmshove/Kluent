package org.amshove.kluent.tests.assertions.time.localdatetime

import org.amshove.kluent.shouldBeInMinute
import java.time.LocalDateTime
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeInMinuteShould {
    val loginTime = LocalDateTime.of(2017, 1, 10, 23, 10)

    @Test
    fun passWhenPassingTheSameMinute() {
        loginTime shouldBeInMinute 10
    }

    @Test
    fun failWhenPassingADifferentMinute() {
        assertFails { loginTime shouldBeInMinute 15 }
    }
}