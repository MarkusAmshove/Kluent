package org.amshove.kluent.tests.assertions.time.localtime

import org.amshove.kluent.before
import org.amshove.kluent.minutes
import org.amshove.kluent.shouldBe
import java.time.LocalTime
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeXMinutesBeforeShould {
    val loginTime = LocalTime.of(10, 59)

    /*
    All these assertions also work with `Int.hours()` and `Int.seconds()` before
     */

    @Test
    fun passWhenTestingATimeExactlyXMinutesBefore() {
        val orderTime = LocalTime.of(10, 54)
        orderTime shouldBe 5.minutes() before loginTime
    }

    @Test
    fun failWhenTestingATimeMoreThanXMinutesBefore() {
        val orderTime = LocalTime.of(10, 53)
        assertFails { orderTime shouldBe 5.minutes() before loginTime }
    }

    @Test
    fun failWhenTestingATimeLessThanXMinutesBefore() {
        val orderTime = LocalTime.of(10, 58)
        assertFails { orderTime shouldBe 5.minutes() before loginTime }
    }
}