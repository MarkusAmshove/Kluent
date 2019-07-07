package org.amshove.kluent.tests.assertions.time.localdate

import org.amshove.kluent.shouldBeOnOrBefore
import java.time.LocalDate
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeOnOrBeforeShould {
    @Test
    fun passWhenTestingAnEarlierDate() {
        val dateToTest = LocalDate.of(2017, 3, 1)
        val dateAfter = dateToTest.plusDays(1)

        dateToTest shouldBeOnOrBefore dateAfter
    }

    @Test
    fun passWhenTestingTheSameDate() {
        val dateToTest = LocalDate.of(2017, 3, 1)

        dateToTest shouldBeOnOrBefore dateToTest
    }

    @Test
    fun failWhenTestingALaterDate() {
        val dateToTest = LocalDate.of(2017, 3, 1)
        val dateBefore = dateToTest.minusDays(1)

        assertFails { dateToTest shouldBeOnOrBefore dateBefore }
    }
}