package org.amshove.kluent.tests.assertions.time.localdate

import org.amshove.kluent.shouldNotBeOn
import java.time.DayOfWeek
import java.time.LocalDate
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotBeOnDayShould {

    @Test
    fun passWhenPassingADifferentDay() {
        val dateToTest = LocalDate.of(2017, 3, 1)

        dateToTest shouldNotBeOn DayOfWeek.THURSDAY
    }

    @Test
    fun failWhenPassingTheSameDay() {
        val dateToTest = LocalDate.of(2017, 3, 1)

        assertFails { dateToTest shouldNotBeOn DayOfWeek.WEDNESDAY }
    }
}