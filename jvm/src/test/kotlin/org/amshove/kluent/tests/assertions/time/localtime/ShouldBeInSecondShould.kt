package org.amshove.kluent.tests.assertions.time.localtime

import org.amshove.kluent.shouldBeInSecond
import java.time.LocalTime
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeInSecondShould {
    val loginTime = LocalTime.of(15, 40)

    @Test
    fun passWhenTestingATimeWithinTheSameSecond() {
        loginTime shouldBeInSecond 0
    }

    @Test
    fun failWhenTestingATimeOutsideTheSecond() {
        assertFails { loginTime shouldBeInSecond 14 }
        assertFails { loginTime shouldBeInSecond 59 }
    }
}