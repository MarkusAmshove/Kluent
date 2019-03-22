package org.amshove.kluent.tests.assertions.time.localdatetime

import org.amshove.kluent.shouldNotBeInYear
import java.time.LocalDateTime
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotBeInYearShould {
    @Test
    fun passWhenADifferentYearIsPassed() {
        val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)

        dateToTest shouldNotBeInYear 2015
    }

    @Test
    fun failWhenTheSameYearIsPassed() {
        val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)

        assertFails { dateToTest shouldNotBeInYear 2017 }
    }
}