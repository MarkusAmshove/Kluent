package org.amshove.kluent.tests.assertions.time.localdate

import org.amshove.kluent.shouldNotBeIn
import java.time.LocalDate
import java.time.Month
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotBeInMonthShould {
    @Test
    fun passWhenPassingADifferentMonth() {
        val dateToTest = LocalDate.of(2017, 3, 1)

        dateToTest shouldNotBeIn Month.APRIL
    }

    @Test
    fun failWhenPassingTheSameMonth() {
        val dateToTest = LocalDate.of(2017, 3, 1)

        assertFails { dateToTest shouldNotBeIn Month.MARCH }
    }
}