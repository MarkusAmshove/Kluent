package org.amshove.kluent.tests.assertions.time.localdatetime

import org.amshove.kluent.before
import org.amshove.kluent.days
import org.amshove.kluent.shouldBeAtMost
import java.time.LocalDateTime
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeAtMostXDaysBeforeShould {
    val orderDate = LocalDateTime.of(2017, 6, 15, 10, 0)

    @Test
    fun passWhenPassingADateWhichIsExactlyXDaysBefore() {
        val shippingDate = LocalDateTime.of(2017, 6, 10, 10, 0)
        shippingDate shouldBeAtMost 5.days() before orderDate
    }

    @Test
    fun failWhenPassingADateWhichIsMoreThanXDaysBefore() {
        val shippingDate = LocalDateTime.of(2017, 6, 5, 10, 0)
        assertFails { shippingDate shouldBeAtMost 5.days() before orderDate }
    }

    @Test
    fun passWhenPassingADateWhichIsLessThanXDaysBefore() {
        val shippingDate = LocalDateTime.of(2017, 6, 12, 10, 0)
        shippingDate shouldBeAtMost 5.days() before orderDate
    }


}