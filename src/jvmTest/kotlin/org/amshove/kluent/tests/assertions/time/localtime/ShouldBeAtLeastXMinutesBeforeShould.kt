package org.amshove.kluent.tests.assertions.time.localtime

import org.amshove.kluent.before
import org.amshove.kluent.minutes
import org.amshove.kluent.shouldBeAtLeast
import java.time.LocalTime
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeAtLeastXMinutesBeforeShould {
    val loginTime = LocalTime.of(10, 54)

    /*
    All these assertions also work with `Int.hours()` and `Int.seconds()` before
     */

    @Test
    fun passWhenTestingATimeExactlyXMinutesBefore() {
        val orderTime = LocalTime.of(10, 57)
        loginTime shouldBeAtLeast 3.minutes() before orderTime
    }

    @Test
    fun passWhenTestingATimeMoreThanXMinutesBefore() {
        val orderTime = LocalTime.of(10, 59)
        loginTime shouldBeAtLeast 3.minutes() before orderTime
    }

    @Test
    fun failWhenTestingATimeLessThanXMinutesBefore() {
        val orderTime = LocalTime.of(10, 53)
        assertFails { loginTime shouldBeAtLeast 7.minutes() before orderTime }
    }
}