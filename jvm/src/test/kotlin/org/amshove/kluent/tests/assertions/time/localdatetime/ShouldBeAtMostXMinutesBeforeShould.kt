package org.amshove.kluent.tests.assertions.time.localdatetime

import org.amshove.kluent.before
import org.amshove.kluent.minutes
import org.amshove.kluent.shouldBeAtMost
import java.time.LocalDateTime
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeAtMostXMinutesBeforeShould {
    val orderTime = LocalDateTime.of(2017, 1, 10, 10, 10)

    @Test
    fun passWhenPassingATimeExactlyXMinutesBefore() {

        val loginTime = LocalDateTime.of(2017, 1, 10, 10, 5)
        loginTime shouldBeAtMost 5.minutes() before orderTime
    }

    @Test
    fun passWhenPassingATimeLessThanXMinutesBefore() {
        val loginTime = LocalDateTime.of(2017, 1, 10, 10, 8)
        loginTime shouldBeAtMost 5.minutes() before orderTime
    }

    @Test
    fun failWhenPassingATimeMoreThanXMinutesBefore() {
        val loginTime = LocalDateTime.of(2017, 1, 10, 10, 0)
        assertFails { loginTime shouldBeAtMost 5.minutes() before orderTime }
    }
}