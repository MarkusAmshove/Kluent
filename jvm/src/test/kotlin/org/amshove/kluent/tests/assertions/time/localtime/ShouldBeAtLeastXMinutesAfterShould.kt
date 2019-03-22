package org.amshove.kluent.tests.assertions.time.localtime

import org.amshove.kluent.after
import org.amshove.kluent.minutes
import org.amshove.kluent.shouldBeAtLeast
import java.time.LocalTime
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeAtLeastXMinutesAfterShould {
    val loginTime = LocalTime.of(10, 59)

    /*
    All these assertions also work with `Int.hours()` and `Int.seconds()` after
     */

    @Test
    fun passWhenTestingATimeExactlyXMinutesAfter() {
        val orderTime = LocalTime.of(11, 2)
        orderTime shouldBeAtLeast 3.minutes() after loginTime
    }

    @Test
    fun passWhenTestingATimeMoreThanXMinutesAfter() {
        val orderTime = LocalTime.of(11, 10)
        orderTime shouldBeAtLeast 3.minutes() after loginTime
    }

    @Test
    fun failWhenTestingATimeLessThanXMinutesAfter() {
        val orderTime = LocalTime.of(11, 0)
        assertFails { orderTime shouldBeAtLeast 6.minutes() after loginTime }
    }
}