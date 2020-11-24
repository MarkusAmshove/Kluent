package org.amshove.kluent.tests.assertions.time.localdate

import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldBeAfter
import java.time.LocalDate
import kotlin.test.Test

class ShouldBeAfterShould {
    @Test
    fun passWhenTestingALaterDate() {
        val dateToTest = LocalDate.of(2017, 3, 1)
        val dateBefore = dateToTest.minusDays(1)

        dateToTest shouldBeAfter dateBefore
    }

    @Test
    fun failWhenTestingAnEarlierDate() {
        val dateToTest = LocalDate.of(2017, 3, 1)
        val dateAfter = dateToTest.plusDays(1)

        assertFails { dateToTest shouldBeAfter dateAfter }
    }

    @Test
    fun failWhenPassingTheSameDate() {
        val dateToTest = LocalDate.of(2017, 3, 1)
        assertFails { dateToTest shouldBeAfter dateToTest }
    }
}