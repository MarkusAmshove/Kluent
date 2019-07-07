package org.amshove.kluent.tests.assertions.time.localtime

import org.amshove.kluent.shouldBeInMinute
import java.time.LocalTime
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeInMinuteShould {
    val loginTime = LocalTime.of(15, 40)

    @Test
    fun passWhenTestingATimeWithinTheSameMinute() {
        loginTime shouldBeInMinute 40
    }

    @Test
    fun failWhenTestingATimeOutsideTheMinute() {
        assertFails { loginTime shouldBeInMinute 30 }
        assertFails { loginTime shouldBeInMinute 41 }
    }
}