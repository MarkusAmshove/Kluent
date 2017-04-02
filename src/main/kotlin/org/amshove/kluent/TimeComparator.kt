package org.amshove.kluent

import org.junit.Assert.assertTrue
import java.time.LocalTime

class TimeComparator(internal val addedHours: Int = 0, internal val addedMinutes: Int = 0, internal val addedSeconds: Int = 0) {
    internal lateinit var startTime: LocalTime
    internal var comparatorType = ComparatorType.Exactly

    internal fun assertAfter(theOther: LocalTime) =
            when (comparatorType) {
                ComparatorType.AtLeast -> assertAtLeastAfter(theOther)
                ComparatorType.Exactly -> assertExactlyAfter(theOther)
                ComparatorType.AtMost -> assertAtMostAfter(theOther)
            }


    internal fun assertBefore(theOther: LocalTime) =
            when (comparatorType) {
                ComparatorType.AtLeast -> assertAtLeastBefore(theOther)
                ComparatorType.Exactly -> assertExactlyBefore(theOther)
                ComparatorType.AtMost -> assertAtMostBefore(theOther)
            }

    internal fun withStartTime(startTime: LocalTime): TimeComparator {
        this.startTime = startTime
        return this
    }

    internal fun withComparatorType(comparatorType: ComparatorType): TimeComparator {
        this.comparatorType = comparatorType
        return this
    }

    internal fun getExpectedOffset() = "$addedHours hours, $addedMinutes minutes, $addedSeconds seconds"

    private fun assertAtLeastAfter(theOther: LocalTime) {
        val comparedTime = calculateComparedTime(theOther)
        assertTrue("Expected $startTime to be at least { ${getExpectedOffset()} } after $theOther", startTime >= comparedTime)
    }

    private fun assertAtMostAfter(theOther: LocalTime) {
        val comparedTime = calculateComparedTime(theOther)
        assertTrue("Expected $startTime to be at most { ${getExpectedOffset()} } after $theOther", startTime <= comparedTime)
    }

    private fun assertExactlyAfter(theOther: LocalTime) {
        val comparedTime = calculateComparedTime(theOther)
        assertTrue("Expected $startTime to be { ${getExpectedOffset()} } after $theOther", startTime == comparedTime)
    }

    private fun assertExactlyBefore(theOther: LocalTime) {
        val comparedTime = calculateComparedTime(theOther, -1)
        assertTrue("Expected $startTime to be { ${getExpectedOffset()} } before $theOther", startTime == comparedTime)
    }

    private fun assertAtLeastBefore(theOther: LocalTime) {
        val comparedTime = calculateComparedTime(theOther, -1)
        assertTrue("Expected $startTime to be at least { ${getExpectedOffset()} } before $theOther", startTime <= comparedTime)
    }

    private fun assertAtMostBefore(theOther: LocalTime) {
        val comparedTime = calculateComparedTime(theOther, -1)
        assertTrue("Expected $startTime to be at most { ${getExpectedOffset()} } before $theOther", startTime >= comparedTime)
    }

    private fun calculateComparedTime(time: LocalTime, multiplier: Int = 1) =
            time.plusHours(addedHours.toLong() * multiplier)
                    .plusMinutes(addedMinutes.toLong() * multiplier)
                    .plusSeconds(addedSeconds.toLong() * multiplier)

}

