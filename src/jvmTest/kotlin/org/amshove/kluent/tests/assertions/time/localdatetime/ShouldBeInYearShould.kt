package org.amshove.kluent.tests.assertions.time.localdatetime

import org.amshove.kluent.shouldBeInYear
import java.time.LocalDateTime
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeInYearShould {
    @Test
    fun passWhenPassingTheSameYear() {
        val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)

        dateToTest shouldBeInYear 2017
    }

    @Test
    fun failWhenPassingADifferentYear() {
        val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)

        assertFails { dateToTest shouldBeInYear 2018 }
    }

}