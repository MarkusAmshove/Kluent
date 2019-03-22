package org.amshove.kluent.tests.assertions.time.localtime

import org.amshove.kluent.after
import org.amshove.kluent.minutes
import org.amshove.kluent.shouldBeAtMost
import java.time.LocalTime
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeAtMostXMinutesAfterShould {
    val loginTime = LocalTime.of(10, 10)

    /*
    All these assertions also work with `Int.hours()` and `Int.seconds()` after
     */

    @Test
    fun passWhenTestingATimeExactlyXMinutesAfter() {
        val orderTime = LocalTime.of(10, 15)
        orderTime shouldBeAtMost 5.minutes() after loginTime
    }

    @Test
    fun passWhenTestingATimeLessThanXMinutesAfter() {
        val orderTime = LocalTime.of(10, 12)
        orderTime shouldBeAtMost 5.minutes() after loginTime
    }

    @Test
    fun failWhenTestingATimeMoreThanXMinutesAfter() {
        val orderTime = LocalTime.of(10, 20)
        assertFails { orderTime shouldBeAtMost 5.minutes() after loginTime }
    }
}