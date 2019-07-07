package org.amshove.kluent.tests.assertions.time.localdate

import org.amshove.kluent.shouldNotBeInYear
import java.time.LocalDate
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotBeInYearShould {
    @Test
    fun passWhenPassingADifferentYear() {
        val dateToTest = LocalDate.of(2017, 3, 1)

        dateToTest shouldNotBeInYear 2015
    }

    @Test
    fun failWhenPassingTheSameYear() {
        val dateToTest = LocalDate.of(2017, 3, 1)

        assertFails { dateToTest shouldNotBeInYear 2017 }
    }
}