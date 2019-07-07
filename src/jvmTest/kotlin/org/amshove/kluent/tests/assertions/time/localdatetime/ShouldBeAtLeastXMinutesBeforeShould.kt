package org.amshove.kluent.tests.assertions.time.localdatetime

import org.amshove.kluent.before
import org.amshove.kluent.minutes
import org.amshove.kluent.shouldBeAtLeast
import java.time.LocalDateTime
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeAtLeastXMinutesBeforeShould {
    val loginTime = LocalDateTime.of(2017, 1, 10, 10, 54)

    @Test
    fun passWhenPassingATimeExactlyXMinutesBefore() {
        val orderTime = LocalDateTime.of(2017, 1, 10, 10, 57)
        loginTime shouldBeAtLeast 3.minutes() before orderTime
    }

    @Test
    fun passWhenPassingATimeMoreThanXMinutesBefore() {
        val orderTime = LocalDateTime.of(2017, 1, 10, 10, 59)
        loginTime shouldBeAtLeast 3.minutes() before orderTime
    }

    @Test
    fun failWhenPassingATimeLessThanXMinutesBefore() {
        val orderTime = LocalDateTime.of(2017, 1, 10, 10, 55)
        assertFails { loginTime shouldBeAtLeast 3.minutes() before orderTime }
    }
}