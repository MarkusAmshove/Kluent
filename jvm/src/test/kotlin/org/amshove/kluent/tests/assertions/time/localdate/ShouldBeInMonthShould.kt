package org.amshove.kluent.tests.assertions.time.localdate

import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldBeIn
import java.time.LocalDate
import java.time.Month
import kotlin.test.Test

class ShouldBeInMonthShould {

    @Test
    fun passWhenPassingTheSameMonth() {
        val dateToTest = LocalDate.of(2017, 3, 1)

        dateToTest shouldBeIn Month.MARCH
    }

    @Test
    fun failWhenPassingADifferentMonth() {
        val dateToTest = LocalDate.of(2017, 3, 1)

        assertFails { dateToTest shouldBeIn Month.APRIL }
    }
}