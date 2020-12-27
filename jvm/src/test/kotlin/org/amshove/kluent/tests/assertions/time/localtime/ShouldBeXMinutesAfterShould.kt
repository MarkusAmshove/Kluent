package org.amshove.kluent.tests.assertions.time.localtime

import org.amshove.kluent.after
import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.minutes
import org.amshove.kluent.shouldBe
import java.time.LocalTime
import kotlin.test.Test

class ShouldBeXMinutesAfterShould {
    val loginTime = LocalTime.of(10, 59)

    /*
    All these assertions also work with `Int.hours()` and `Int.seconds()` after
     */

    @Test
    fun passWhenTestingATimeExactlyXMinutesAfter() {
        val orderTime = LocalTime.of(11, 4)
        orderTime shouldBe 5.minutes() after loginTime
    }

    @Test
    fun failWhenTestingATimeMoreThanXMinutesAfter() {
        val orderTime = LocalTime.of(11, 5)
        assertFails { orderTime shouldBe 5.minutes() after loginTime }
    }

    @Test
    fun failWhenTestingATimeLessThanXMinutesAfter() {
        val orderTime = LocalTime.of(11, 0)
        assertFails { orderTime shouldBe 5.minutes() after loginTime }
    }
}