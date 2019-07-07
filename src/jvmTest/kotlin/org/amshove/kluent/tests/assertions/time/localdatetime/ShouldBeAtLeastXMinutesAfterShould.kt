package org.amshove.kluent.tests.assertions.time.localdatetime

import org.amshove.kluent.after
import org.amshove.kluent.minutes
import org.amshove.kluent.shouldBeAtLeast
import java.time.LocalDateTime
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeAtLeastXMinutesAfterShould {
    val loginTime = LocalDateTime.of(2017, 1, 10, 10, 59)

    @Test
    fun passWhenPassingATimeExactlyXMinutesAfter() {
        val orderTime = LocalDateTime.of(2017, 1, 10, 11, 4)
        orderTime shouldBeAtLeast 3.minutes() after loginTime
    }

    @Test
    fun passWhenPassingATimeMoreThanXMinutesAfter() {
        val orderTime = LocalDateTime.of(2017, 1, 10, 11, 40)
        orderTime shouldBeAtLeast 3.minutes() after loginTime
    }

    @Test
    fun failWhenPassingATimeLessThanXMintuesAfter() {
        val orderTime = LocalDateTime.of(2017, 1, 10, 11, 1)
        assertFails { orderTime shouldBeAtLeast 3.minutes() after loginTime }
    }
}