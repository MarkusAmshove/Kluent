package org.amshove.kluent.tests.assertions.time.localdatetime

import org.amshove.kluent.after
import org.amshove.kluent.days
import org.amshove.kluent.shouldBeAtMost
import java.time.LocalDateTime
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeAtMostXDaysAfterShould {
    val orderDate = LocalDateTime.of(2017, 6, 5, 10, 0)

    @Test
    fun passWhenPassingADateWhichIsExactlyXDaysAfter() {
        val shippingDate = LocalDateTime.of(2017, 6, 10, 10, 0)
        shippingDate shouldBeAtMost 5.days() after orderDate
    }

    @Test
    fun failWhenPassingADateWhichIsMoreThanXDaysAfter() {
        val shippingDate = LocalDateTime.of(2017, 6, 15, 10, 0)
        assertFails { shippingDate shouldBeAtMost 5.days() after orderDate }
    }

    @Test
    fun passWhenPassingADateWhichIsLessThanXDaysAfter() {
        val shippingDate = LocalDateTime.of(2017, 6, 7, 10, 0)
        shippingDate shouldBeAtMost 5.days() after orderDate
    }


}