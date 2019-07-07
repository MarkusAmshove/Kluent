package org.amshove.kluent.tests.assertions.time.localdatetime

import org.amshove.kluent.shouldBeOn
import java.time.DayOfWeek
import java.time.LocalDateTime
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeOnShould {
    @Test
    fun passWhenPassingTheSameDate() {
        val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)

        dateToTest shouldBeOn DayOfWeek.WEDNESDAY
    }

    @Test
    fun passWhenPassingADifferentDate() {
        val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)

        assertFails { dateToTest shouldBeOn DayOfWeek.MONDAY }
    }
}