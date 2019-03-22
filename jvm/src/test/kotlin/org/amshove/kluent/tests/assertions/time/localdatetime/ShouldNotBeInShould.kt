package org.amshove.kluent.tests.assertions.time.localdatetime

import org.amshove.kluent.shouldNotBeIn
import java.time.LocalDateTime
import java.time.Month
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotBeInShould {
    @Test
    fun passWhenADifferentMonthIsPassed() {
        val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)

        dateToTest shouldNotBeIn Month.APRIL
    }

    @Test
    fun failWhenTheSameMonthIsPassed() {
        val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)

        assertFails { dateToTest shouldNotBeIn Month.MARCH }
    }
}