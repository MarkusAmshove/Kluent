package org.amshove.kluent.tests.assertions.time.localtime

import org.amshove.kluent.shouldNotBeInHour
import java.time.LocalTime
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotBeInHourShould {
    val loginTime = LocalTime.of(15, 40)

    @Test
    fun passWhenTestingATimeOutsideTheHour() {
        loginTime shouldNotBeInHour 14
        loginTime shouldNotBeInHour 16
    }

    @Test
    fun failWhenPassingATimeWithinTheSameHour() {
        assertFails { loginTime shouldNotBeInHour 15 }
    }
}