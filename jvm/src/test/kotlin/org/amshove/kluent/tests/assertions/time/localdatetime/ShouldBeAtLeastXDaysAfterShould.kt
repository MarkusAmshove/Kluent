package org.amshove.kluent.tests.assertions.time.localdatetime

import org.amshove.kluent.after
import org.amshove.kluent.days
import org.amshove.kluent.shouldBeAtLeast
import java.time.LocalDateTime
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeAtLeastXDaysAfterShould {
    val orderDate = LocalDateTime.of(2017, 6, 5, 10, 0)

    @Test
    fun passWhenThePassedDateIsExactlyXDaysAfter() {
        val shippingDate = LocalDateTime.of(2017, 6, 10, 10, 0)
        shippingDate shouldBeAtLeast 5.days() after orderDate
    }

    @Test
    fun passWhenThePassedDateIsMoreThanXDaysAfter() {
        val shippingDate = LocalDateTime.of(2017, 6, 15, 10, 0)
        shippingDate shouldBeAtLeast 5.days() after orderDate
    }

    @Test
    fun failWhenADateIsLessThanXDaysAfter() {
        val shippingDate = LocalDateTime.of(2017, 6, 7, 10, 0)
        assertFails { shippingDate shouldBeAtLeast 5.days() after orderDate }
    }

}