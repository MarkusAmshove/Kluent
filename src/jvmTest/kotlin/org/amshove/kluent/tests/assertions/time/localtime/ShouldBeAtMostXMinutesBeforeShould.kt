package org.amshove.kluent.tests.assertions.time.localtime

import org.amshove.kluent.before
import org.amshove.kluent.minutes
import org.amshove.kluent.shouldBeAtMost
import java.time.LocalTime
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeAtMostXMinutesBeforeShould {
    val orderTime = LocalTime.of(10, 10)

    /*
    All these assertions also work with `Int.hours()` and `Int.seconds()` before
     */

    @Test
    fun passWhenTestingATimeExactlyXMinutesBefore() {
        val loginTime = LocalTime.of(10, 5)
        loginTime shouldBeAtMost 5.minutes() before orderTime
    }

    @Test
    fun passWhenTestingATimeLessThanXMinutesBefore() {
        val loginTime = LocalTime.of(10, 8)
        loginTime shouldBeAtMost 5.minutes() before orderTime
    }

    @Test
    fun failWhenTestingATimeMoreThanXMinutesBefore() {
        val loginTime = LocalTime.of(10, 0)
        assertFails { loginTime shouldBeAtMost 5.minutes() before orderTime }
    }
}