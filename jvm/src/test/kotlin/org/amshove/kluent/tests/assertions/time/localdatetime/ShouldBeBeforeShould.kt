package org.amshove.kluent.tests.assertions.time.localdatetime

import org.amshove.kluent.shouldBeBefore
import java.time.LocalDateTime
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeBeforeShould {
    @Test
    fun passWhenPassingALaterDate() {
        val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)
        val dateAfter = dateToTest.plusDays(1)

        dateToTest shouldBeBefore dateAfter
    }

    @Test
    fun failWhenPassingAnEarlierDate() {
        val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)
        val dateBefore = dateToTest.minusDays(1)

        assertFails { dateToTest shouldBeBefore dateBefore }
    }
}