package org.amshove.kluent.tests.assertions.time.localdatetime

import org.amshove.kluent.shouldBeOnOrAfter
import java.time.LocalDateTime
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeOnOrAfterShould {
    @Test
    fun passWhenPassingAnEarlierDate() {
        val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)
        val dateBefore = dateToTest.minusDays(1)

        dateToTest shouldBeOnOrAfter dateBefore
    }


    @Test
    fun passWhenPassingTheSameDate() {
        val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)

        dateToTest shouldBeOnOrAfter dateToTest
    }

    @Test
    fun failWhenPassingALaterDate() {
        val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)
        val dateAfter = dateToTest.plusDays(1)

        assertFails { dateToTest shouldBeOnOrAfter dateAfter }
    }
}