package org.amshove.kluent.tests.assertions.time.localtime

import org.amshove.kluent.shouldBeInHour
import java.time.LocalTime
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeInHourShould {
    val loginTime = LocalTime.of(15, 40)

    @Test
    fun passWhenTestingATimeWithinTheSameHour() {
        loginTime shouldBeInHour 15
    }

    @Test
    fun failWhenTestingATimeOutsideTheHour() {
        assertFails { loginTime shouldBeInHour 14 }
        assertFails { loginTime shouldBeInHour 16 }
    }
}