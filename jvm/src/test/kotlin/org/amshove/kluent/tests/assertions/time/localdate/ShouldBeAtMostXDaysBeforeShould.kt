package org.amshove.kluent.tests.assertions.time.localdate

import org.amshove.kluent.before
import org.amshove.kluent.days
import org.amshove.kluent.shouldBeAtMost
import java.time.LocalDate
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeAtMostXDaysBeforeShould {
    val orderDate = LocalDate.of(2017, 6, 15)

    @Test
    fun passWhenPassingExactlyXDaysBefore() {
        val shippingDate = LocalDate.of(2017, 6, 10)
        shippingDate shouldBeAtMost 5.days() before orderDate
    }

    @Test
    fun passWhenPassingLessThanXDaysBefore() {
        val shippingDate = LocalDate.of(2017, 6, 12)
        shippingDate shouldBeAtMost 5.days() before orderDate
    }

    @Test
    fun failWhenPassingMoreThanXDaysBefore() {
        val shippingDate = LocalDate.of(2017, 6, 5)
        assertFails { shippingDate shouldBeAtMost 5.days() before orderDate }
    }
}
