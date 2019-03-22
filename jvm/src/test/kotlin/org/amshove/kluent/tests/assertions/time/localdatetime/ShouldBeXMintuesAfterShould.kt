package org.amshove.kluent.tests.assertions.time.localdatetime

import org.amshove.kluent.after
import org.amshove.kluent.minutes
import org.amshove.kluent.shouldBe
import java.time.LocalDateTime
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeXMintuesAfterShould {
    val loginTime = LocalDateTime.of(2017, 1, 10, 10, 59)

    @Test
    fun passWhenPassingATimeExactlyXMinutesAfter() {
        val orderTime = LocalDateTime.of(2017, 1, 10, 11, 4)
        orderTime shouldBe 5.minutes() after loginTime
    }

    @Test
    fun failWhenPassingADateMoreThanXMinutesAfter() {
        val orderTime = LocalDateTime.of(2017, 1, 10, 11, 5)
        assertFails { orderTime shouldBe 5.minutes() after loginTime }
    }
}