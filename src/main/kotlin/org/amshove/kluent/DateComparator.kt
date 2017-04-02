package org.amshove.kluent

import org.junit.Assert.assertTrue
import java.time.LocalDate

class DateComparator(internal val addedYears: Int = 0, internal val addedMonths: Int = 0, internal val addedDays: Int = 0) {
    internal lateinit var startDate: LocalDate
    internal var comparatorType = ComparatorType.Exactly

    internal fun assertAfter(theOther: LocalDate) =
            when (comparatorType) {
                ComparatorType.AtLeast -> assertAtLeastAfter(theOther)
                ComparatorType.Exactly -> assertExactlyAfter(theOther)
                ComparatorType.AtMost -> assertAtMostAfter(theOther)
            }


    internal fun assertBefore(theOther: LocalDate) =
            when (comparatorType) {
                ComparatorType.AtLeast -> assertAtLeastBefore(theOther)
                ComparatorType.Exactly -> assertExactlyBefore(theOther)
                ComparatorType.AtMost -> assertAtMostBefore(theOther)
            }

    internal fun withStartDate(startDate: LocalDate): DateComparator {
        this.startDate = startDate
        return this
    }

    internal fun withComparatorType(comparatorType: ComparatorType): DateComparator {
        this.comparatorType = comparatorType
        return this
    }

    private fun assertAtLeastAfter(theOther: LocalDate) {
        val comparedTime = calculateComparedTime(theOther)
        assertTrue("Expected $startDate to be at least { $addedYears years, $addedMonths months, $addedDays days } after $theOther", startDate >= comparedTime)
    }

    private fun assertAtMostAfter(theOther: LocalDate) {
        val comparedTime = calculateComparedTime(theOther)
        assertTrue("Expected $startDate to be at most { $addedYears years, $addedMonths months, $addedDays days } after $theOther", startDate <= comparedTime)
    }

    private fun assertExactlyAfter(theOther: LocalDate) {
        val comparedTime = calculateComparedTime(theOther)
        assertTrue("Expected $startDate to be { $addedYears years, $addedMonths months, $addedDays days } after $theOther", startDate == comparedTime)
    }

    private fun assertExactlyBefore(theOther: LocalDate) {
        val comparedTime = calculateComparedTime(theOther, -1)
        assertTrue("Expected $startDate to be { $addedYears years, $addedMonths months, $addedDays days } before $theOther", startDate == comparedTime)
    }

    private fun assertAtLeastBefore(theOther: LocalDate) {
        val comparedTime = calculateComparedTime(theOther, -1)
        assertTrue("Expected $startDate to be at least { $addedYears years, $addedMonths months, $addedDays days } before $theOther", startDate <= comparedTime)
    }

    private fun assertAtMostBefore(theOther: LocalDate) {
        val comparedTime = calculateComparedTime(theOther, -1)
        assertTrue("Expected $startDate to be at most { $addedYears years, $addedMonths months, $addedDays days } before $theOther", startDate >= comparedTime)
    }

    private fun calculateComparedTime(time: LocalDate, multiplier: Int = 1) =
            time.plusYears(addedYears.toLong() * multiplier)
                    .plusMonths(addedMonths.toLong() * multiplier)
                    .plusDays(addedDays.toLong() * multiplier)

}
