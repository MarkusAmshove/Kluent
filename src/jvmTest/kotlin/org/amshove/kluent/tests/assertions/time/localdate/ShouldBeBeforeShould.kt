package org.amshove.kluent.tests.assertions.time.localdate

import org.amshove.kluent.shouldBeBefore
import java.time.LocalDate
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeBeforeShould {
    @Test
    fun passWhenTestingAnEarlierDate() {
        val dateToTest = LocalDate.of(2017, 3, 1)
        val dateAfter = dateToTest.plusDays(1)

        dateToTest shouldBeBefore dateAfter
    }

    @Test
    fun failWhenTestingALaterDate() {
        val dateToTest = LocalDate.of(2017, 3, 1)
        val dateBefore = dateToTest.minusDays(1)

        assertFails { dateToTest shouldBeBefore dateBefore }
    }

    @Test
    fun failWhenTestingTheSameDate() {
        val dateToTest = LocalDate.of(2017, 3, 1)

        assertFails { dateToTest shouldBeBefore dateToTest }
    }
}