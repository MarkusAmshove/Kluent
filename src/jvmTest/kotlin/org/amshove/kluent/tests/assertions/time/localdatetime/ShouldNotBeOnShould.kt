package org.amshove.kluent.tests.assertions.time.localdatetime

import org.amshove.kluent.shouldNotBeOn
import java.time.DayOfWeek
import java.time.LocalDateTime
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotBeOnShould {
    @Test
    fun passWhenPassingADifferentDate() {
        val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)

        dateToTest shouldNotBeOn DayOfWeek.THURSDAY
    }

    @Test
    fun failWhenPassingTheSameDate() {
        val dateToTest = LocalDateTime.of(2017, 3, 1, 5, 0)

        assertFails { dateToTest shouldNotBeOn DayOfWeek.WEDNESDAY }
    }
}