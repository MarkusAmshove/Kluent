package org.amshove.kluent.tests.assertions.time.localdate

import org.amshove.kluent.after
import org.amshove.kluent.days
import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldBeAtLeast
import java.time.LocalDate
import kotlin.test.Test

class ShouldBeAtLeastXDaysAfterShould {
    val orderDate = LocalDate.of(2017, 6, 5)

    @Test
    fun passWhenPassingExactlyXDaysAfter() {
        val shippingDate = LocalDate.of(2017, 6, 10)
        shippingDate shouldBeAtLeast 5.days() after orderDate
    }

    @Test
    fun passWhenPassingMoreThanXDaysAfter() {
        val shippingDate = LocalDate.of(2017, 6, 15)
        shippingDate shouldBeAtLeast 5.days() after orderDate
    }

    @Test
    fun failWhenPassingLessThanXDaysAfter() {
        val shippingDate = LocalDate.of(2017, 6, 7)
        assertFails { shippingDate shouldBeAtLeast 5.days() after orderDate }
    }
}