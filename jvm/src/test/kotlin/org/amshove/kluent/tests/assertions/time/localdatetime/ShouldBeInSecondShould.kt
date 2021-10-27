package org.amshove.kluent.tests.assertions.time.localdatetime

import org.amshove.kluent.shouldBeInSecond
import java.time.LocalDateTime
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeInSecondShould {
    val loginTime = LocalDateTime.of(2017, 1, 10, 23, 10, 52)

    @Test
    fun passWhenPassingTheSameSecond() {
        loginTime shouldBeInSecond 52
    }

    @Test
    fun failWhenPassingADifferentSecond() {
        assertFails { loginTime shouldBeInSecond 22 }
    }
}

