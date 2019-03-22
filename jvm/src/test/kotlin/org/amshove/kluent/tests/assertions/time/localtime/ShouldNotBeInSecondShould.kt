package org.amshove.kluent.tests.assertions.time.localtime

import org.amshove.kluent.*
import java.time.LocalTime
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotBeInSecondShould {
    val loginTime = LocalTime.of(15, 40)

    @Test
    fun passWhenTestingATimeOutsideTheSecond() {
        loginTime shouldNotBeInSecond 59
        loginTime shouldNotBeInSecond 15
    }

    @Test
    fun failWhenTestingTheSameSecond() {
        assertFails { loginTime shouldNotBeInSecond 0 }
    }
}
