package org.amshove.kluent.tests.assertions.time.localtime

import org.amshove.kluent.shouldNotBeInMinute
import java.time.LocalTime
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotBeInMinuteShould {
    val loginTime = LocalTime.of(15, 40)

    @Test
    fun passWhenTestingATimeOutsideTheMinute() {
        loginTime shouldNotBeInMinute 39
        loginTime shouldNotBeInMinute 41
    }

    @Test
    fun failWhenTestingATimeWithinTheMinute() {
        assertFails { loginTime shouldNotBeInMinute 40 }
    }
}