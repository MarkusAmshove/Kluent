package org.amshove.kluent.tests.assertions.time.localdatetime

import org.amshove.kluent.before
import org.amshove.kluent.minutes
import org.amshove.kluent.shouldBe
import java.time.LocalDateTime
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeXMinutesBeforeShould {
    val loginTime = LocalDateTime.of(2017, 1, 10, 10, 59)

    @Test
    fun passWhenPassingATimeExactlyXMinutesBefore() {
        val orderTime = LocalDateTime.of(2017, 1, 10, 10, 54)
        orderTime shouldBe 5.minutes() before loginTime
    }

    @Test
    fun failWhenPassingATimeMoreThanXMinutesBefore() {
        val orderTime = LocalDateTime.of(2017, 1, 10, 10, 53)
        assertFails { orderTime shouldBe 5.minutes() before loginTime }
    }
}