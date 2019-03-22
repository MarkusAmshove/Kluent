package org.amshove.kluent.tests.assertions.time.localdate

import org.amshove.kluent.shouldBeInYear
import java.time.LocalDate
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeInYearShould {

    @Test
    fun passWhenPassingTheSameYear() {
        val dateToTest = LocalDate.of(2017, 3, 1)

        dateToTest shouldBeInYear 2017
    }

    @Test
    fun failWhenPassingADifferentYear() {
        val dateToTest = LocalDate.of(2017, 3, 1)

        assertFails { dateToTest shouldBeInYear 2018 }
    }
}