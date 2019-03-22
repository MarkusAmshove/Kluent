package org.amshove.kluent.tests.assertions.time.localdatetime

import org.amshove.kluent.shouldBeAfter
import java.time.LocalDateTime
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeAfterShould {
    @Test
    fun shouldPassWhenPassingAnEarlierDate() {
        val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)
        val dateBefore = dateToTest.minusDays(1)

        dateToTest shouldBeAfter dateBefore
    }

    @Test
    fun failWhenPassingALaterDate() {
        val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)
        val dateAfter = dateToTest.plusDays(1)

        assertFails { dateToTest shouldBeAfter dateAfter }
    }
}