package org.amshove.kluent.tests.assertions.time.localdate

import org.amshove.kluent.shouldBeOn
import java.time.DayOfWeek
import java.time.LocalDate
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeOnDayShould {
    @Test
    fun passWhenPassingTheSameDay() {
        val dateToTest = LocalDate.of(2017, 3, 1)

        dateToTest shouldBeOn DayOfWeek.WEDNESDAY
    }

    @Test
    fun failWhenPassingADifferentDay() {
        val dateToTest = LocalDate.of(2017, 3, 1)

        assertFails { dateToTest shouldBeOn DayOfWeek.MONDAY }
    }
}