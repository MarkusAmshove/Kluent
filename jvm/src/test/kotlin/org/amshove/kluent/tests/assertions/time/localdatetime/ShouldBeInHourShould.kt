package org.amshove.kluent.tests.assertions.time.localdatetime

import org.amshove.kluent.shouldBeInHour
import java.time.LocalDateTime
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeInHourShould {
    val loginTime = LocalDateTime.of(2017, 1, 10, 23, 10)

    @Test
    fun passWhenPassingTheSameHour() {
        loginTime shouldBeInHour 23
    }

    @Test
    fun failWhenPassingADifferentHour() {
        assertFails { loginTime shouldBeInHour 22 }
    }
}