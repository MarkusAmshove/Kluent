package org.amshove.kluent.tests.assertions.time.localdatetime

import org.amshove.kluent.shouldBeIn
import java.time.LocalDateTime
import java.time.Month
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeInShould {
    @Test
    fun passWhenTheSameMonthIsPassed() {
        val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)

        dateToTest shouldBeIn Month.MARCH
    }

    @Test
    fun failWhenADifferentMonthIsPassed() {
        val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)

        assertFails { dateToTest shouldBeIn Month.APRIL }
    }
}