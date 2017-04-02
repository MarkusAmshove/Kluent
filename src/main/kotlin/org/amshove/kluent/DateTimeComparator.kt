package org.amshove.kluent

import org.junit.Assert.assertTrue
import java.time.LocalDateTime

class DateTimeComparator(internal var dateComparator: DateComparator? = null, internal var timeComparator: TimeComparator? = null) {
    internal lateinit var startDate: LocalDateTime
    internal var comparatorType = ComparatorType.Exactly

    internal fun assertAfter(theOther: LocalDateTime) =
            when (comparatorType) {
                ComparatorType.AtLeast -> assertAtLeastAfter(theOther)
                ComparatorType.Exactly -> assertExactlyAfter(theOther)
                ComparatorType.AtMost -> assertAtMostAfter(theOther)
            }


    internal fun assertBefore(theOther: LocalDateTime) =
            when (comparatorType) {
                ComparatorType.AtLeast -> assertAtLeastBefore(theOther)
                ComparatorType.Exactly -> assertExactlyBefore(theOther)
                ComparatorType.AtMost -> assertAtMostBefore(theOther)
            }

    internal fun withStartDate(startDate: LocalDateTime): DateTimeComparator {
        this.startDate = startDate
        return this
    }

    internal fun withComparatorType(comparatorType: ComparatorType): DateTimeComparator {
        this.comparatorType = comparatorType
        return this
    }

    private fun getExpectedOffset() = "${dateComparator?.getExpectedOffset()} ${timeComparator?.getExpectedOffset()}".trim()

    private fun assertAtLeastAfter(theOther: LocalDateTime) {
        val comparedDateTime = calculateComparedDateTime(theOther)
        assertTrue("Expected $startDate to be at least { ${getExpectedOffset()} } after $theOther", startDate >= comparedDateTime)
    }

    private fun assertAtMostAfter(theOther: LocalDateTime) {
        val comparedDateTime = calculateComparedDateTime(theOther)
        assertTrue("Expected $startDate to be at most { ${getExpectedOffset()} } after $theOther", startDate <= comparedDateTime)
    }

    private fun assertExactlyAfter(theOther: LocalDateTime) {
        val comparedDateTime = calculateComparedDateTime(theOther)
        assertTrue("Expected $startDate to be { ${getExpectedOffset()} } after $theOther", startDate == comparedDateTime)
    }

    private fun assertExactlyBefore(theOther: LocalDateTime) {
        val comparedDateTime = calculateComparedDateTime(theOther, -1)
        assertTrue("Expected $startDate to be { ${getExpectedOffset()} } before $theOther", startDate == comparedDateTime)
    }

    private fun assertAtLeastBefore(theOther: LocalDateTime) {
        val comparedDateTime = calculateComparedDateTime(theOther, -1)
        assertTrue("Expected $startDate to be at least { ${getExpectedOffset()} } before $theOther", startDate <= comparedDateTime)
    }

    private fun assertAtMostBefore(theOther: LocalDateTime) {
        val comparedDateTime = calculateComparedDateTime(theOther, -1)
        assertTrue("Expected $startDate to be at most { ${getExpectedOffset()} } before $theOther", startDate >= comparedDateTime)
    }

    private fun calculateComparedDateTime(dateTime: LocalDateTime, multiplier: Int = 1) =
            dateTime.plusYears((dateComparator?.addedYears?.toLong() ?: 0) * multiplier)
                    .plusMonths((dateComparator?.addedMonths?.toLong() ?: 0) * multiplier)
                    .plusDays((dateComparator?.addedDays?.toLong() ?: 0) * multiplier)
                    .plusHours((timeComparator?.addedHours?.toLong() ?: 0) * multiplier)
                    .plusMinutes((timeComparator?.addedMinutes?.toLong() ?: 0) * multiplier)
                    .plusSeconds((timeComparator?.addedSeconds?.toLong() ?: 0) * multiplier)


}
