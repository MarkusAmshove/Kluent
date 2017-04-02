package org.amshove.kluent

import org.junit.Assert.assertTrue
import java.time.LocalTime

class LocalTimeComparator(internal val addedHours: Int = 0, internal val addedMinutes: Int = 0, internal val addedSeconds: Int = 0) {
    internal lateinit var startTime: LocalTime
    internal var timeComparatorType = TimeComparatorType.Exactly

    internal fun assertAfter(theOther: LocalTime) =
            when (timeComparatorType) {
                TimeComparatorType.AtLeast -> assertAtLeastAfter(theOther)
                TimeComparatorType.Exactly -> assertExactlyAfter(theOther)
                TimeComparatorType.AtMost -> assertAtMostAfter(theOther)
            }


    internal fun assertBefore(theOther: LocalTime) =
            when (timeComparatorType) {
                TimeComparatorType.AtLeast -> assertAtLeastBefore(theOther)
                TimeComparatorType.Exactly -> assertExactlyBefore(theOther)
                TimeComparatorType.AtMost -> assertAtMostBefore(theOther)
            }

    private fun assertAtLeastAfter(theOther: LocalTime) {
        val comparedTime = calculateComparedTime(theOther)
        assertTrue("Expected $startTime to be at least { $addedHours hours, $addedMinutes minutes, $addedSeconds seconds } after $theOther", startTime >= comparedTime)
    }

    private fun assertAtMostAfter(theOther: LocalTime) {
        val comparedTime = calculateComparedTime(theOther)
        assertTrue("Expected $startTime to be at most { $addedHours hours, $addedMinutes minutes, $addedSeconds seconds } after $theOther", startTime <= comparedTime)
    }

    private fun assertExactlyAfter(theOther: LocalTime) {
        val comparedTime = calculateComparedTime(theOther)
        assertTrue("Expected $startTime to be { $addedHours hours, $addedMinutes minutes, $addedSeconds seconds } after $theOther", startTime == comparedTime)
    }

    private fun assertExactlyBefore(theOther: LocalTime) {
        val comparedTime = calculateComparedTime(theOther, -1)
        assertTrue("Expected $startTime to be { $addedHours hours, $addedMinutes minutes, $addedSeconds seconds } before $theOther", startTime == comparedTime)
    }

    private fun assertAtLeastBefore(theOther: LocalTime) {
        val comparedTime = calculateComparedTime(theOther, -1)
        assertTrue("Expected $startTime to be at least { $addedHours hours, $addedMinutes minutes, $addedSeconds seconds } before $theOther", startTime <= comparedTime)
    }

    private fun assertAtMostBefore(theOther: LocalTime) {
        val comparedTime = calculateComparedTime(theOther, -1)
        assertTrue("Expected $startTime to be at most { $addedHours hours, $addedMinutes minutes, $addedSeconds seconds } before $theOther", startTime >= comparedTime)
    }

    private fun calculateComparedTime(time: LocalTime, multiplier: Int = 1) =
            time.plusHours(addedHours.toLong() * multiplier)
                    .plusMinutes(addedMinutes.toLong() * multiplier)
                    .plusSeconds(addedSeconds.toLong() * multiplier)

}

