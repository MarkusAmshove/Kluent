package org.amshove.kluent.tests.assertions.time.localdate

import org.amshove.kluent.before
import org.amshove.kluent.days
import org.amshove.kluent.shouldBe
import java.time.LocalDate
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeXDaysBeforeShould {
    val orderDate = LocalDate.of(2017, 6, 15)

    @Test
    fun passWhenPassingExactlyXDaysBefore() {
        val shippingDate = LocalDate.of(2017, 6, 10)
        shippingDate shouldBe 5.days() before orderDate
    }

    @Test
    fun failWhenPassingMoreThanXDaysBefore() {
        val shippingDate = LocalDate.of(2017, 6, 9)
        assertFails { shippingDate shouldBe 5.days() before orderDate }
    }

    @Test
    fun failWhenPassingLessThanXDaysBefore() {
        val shippingDate = LocalDate.of(2017, 6, 12)
        assertFails { shippingDate shouldBe 5.days() before orderDate }
    }
}