package org.amshove.kluent.tests.assertions.time.localdate

import org.amshove.kluent.shouldBeOnOrAfter
import java.time.LocalDate
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeOnOrAfterShould {
    @Test
    fun passWhenTestingTheSameDate() {
        val dateToTest = LocalDate.of(2017, 3, 1)

        dateToTest shouldBeOnOrAfter dateToTest
    }

    @Test
    fun passWhenTestingALaterDate() {
        val dateToTest = LocalDate.of(2017, 3, 1)
        val dateAfter = dateToTest.plusDays(1)

        dateAfter shouldBeOnOrAfter dateToTest
    }

    @Test
    fun failWhenPassingAnEarlierDate() {
        val dateToTest = LocalDate.of(2017, 3, 1)
        val dateAfter = dateToTest.plusDays(1)

        assertFails { dateToTest shouldBeOnOrAfter dateAfter }
    }
}