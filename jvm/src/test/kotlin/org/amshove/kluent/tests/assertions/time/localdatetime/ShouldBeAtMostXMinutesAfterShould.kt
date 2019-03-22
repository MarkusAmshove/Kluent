package org.amshove.kluent.tests.assertions.time.localdatetime

import org.amshove.kluent.after
import org.amshove.kluent.minutes
import org.amshove.kluent.shouldBeAtMost
import java.time.LocalDateTime
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeAtMostXMinutesAfterShould {
    val loginTime = LocalDateTime.of(2017, 1, 10, 10, 10)

    @Test
    fun passWhenPassingATimeExactlyXMinutesAfter() {
        val orderTime = LocalDateTime.of(2017, 1, 10, 10, 15)
        orderTime shouldBeAtMost 5.minutes() after loginTime
    }

    @Test
    fun passWhenPassingATimeLessThanXMinutesAfter() {
        val orderTime = LocalDateTime.of(2017, 1, 10, 10, 12)
        orderTime shouldBeAtMost 5.minutes() after loginTime
    }

    @Test
    fun failWhenPassingATimeMoreThanXMinutesAfter() {
        val orderTime = LocalDateTime.of(2017, 1, 10, 10, 20)
        assertFails { orderTime shouldBeAtMost 5.minutes() after loginTime }
    }
}