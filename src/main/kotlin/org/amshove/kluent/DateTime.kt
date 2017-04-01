package org.amshove.kluent

import org.junit.Assert.assertTrue
import java.time.*
import kotlin.reflect.jvm.internal.impl.descriptors.EffectiveVisibility

infix fun LocalDateTime.`should be after`(theOther: LocalDateTime) = assertTrue("Expected $this to be after $theOther", this > theOther)
infix fun LocalDateTime.shouldBeAfter(theOther: LocalDateTime) = this `should be after` theOther

infix fun LocalDateTime.`should be before`(theOther: LocalDateTime) = assertTrue("Expected $this to be before $theOther", this < theOther)
infix fun LocalDateTime.shouldBeBefore(theOther: LocalDateTime) = this `should be before` theOther

infix fun LocalDateTime.`should be on or after`(theDate: LocalDateTime) = assertTrue("Expected $this to be on or after $theDate", this >= theDate)
infix fun LocalDateTime.shouldBeOnOrAfter(theDate: LocalDateTime) = this `should be on or after` theDate

infix fun LocalDateTime.`should be on or before`(theDate: LocalDateTime) = assertTrue("Expected $this to be on or before $theDate", this <= theDate)
infix fun LocalDateTime.shouldBeOnOrBefore(theDate: LocalDateTime) = this `should be on or before` theDate

infix fun LocalDateTime.`should be on`(theDay: DayOfWeek) = assertTrue("Expected $this to be a $theDay, but was ${this.dayOfWeek}", this.dayOfWeek == theDay)
infix fun LocalDateTime.shouldBeOn(theDay: DayOfWeek) = this `should be on` theDay

infix fun LocalDateTime.`should be in`(theMonth: Month) = assertTrue("Expected $this to be in $theMonth, but was ${this.month}", this.month == theMonth)
infix fun LocalDateTime.shouldBeIn(theMonth: Month) = this `should be in` theMonth

infix fun LocalDateTime.`should be in year`(theYear: Int) = assertTrue("Expected $this to be in $theYear, but was ${this.year}", this.year == theYear)
infix fun LocalDateTime.shouldBeInYear(theYear: Int) = this `should be in year` theYear

infix fun LocalDate.`should be after`(theOther: LocalDate) = assertTrue("Expected $this to be after $theOther", this > theOther)
infix fun LocalDate.shouldBeAfter(theOther: LocalDate) = this `should be after` theOther

infix fun LocalDate.`should be before`(theOther: LocalDate) = assertTrue("Expected $this to be before $theOther", this < theOther)
infix fun LocalDate.shouldBeBefore(theOther: LocalDate) = this `should be before` theOther

infix fun LocalDate.`should be on or after`(theDate: LocalDate) = assertTrue("Expected $this to be on or after $theDate", this >= theDate)
infix fun LocalDate.shouldBeOnOrAfter(theDate: LocalDate) = this `should be on or after` theDate

infix fun LocalDate.`should be on or before`(theDate: LocalDate) = assertTrue("Expected $this to be on or before $theDate", this <= theDate)
infix fun LocalDate.shouldBeOnOrBefore(theDate: LocalDate) = this `should be on or before` theDate

infix fun LocalDate.`should be on`(theDay: DayOfWeek) = assertTrue("Expected $this to be a $theDay, but was ${this.dayOfWeek}", this.dayOfWeek == theDay)
infix fun LocalDate.shouldBeOn(theDay: DayOfWeek) = this `should be on` theDay

infix fun LocalDate.`should be in`(theMonth: Month) = assertTrue("Expected $this to be in $theMonth, but was ${this.month}", this.month == theMonth)
infix fun LocalDate.shouldBeIn(theMonth: Month) = this `should be in` theMonth

infix fun LocalDate.`should be in year`(theYear: Int) = assertTrue("Expected $this to be in $theYear, but was ${this.year}", this.year == theYear)
infix fun LocalDate.shouldBeInYear(theYear: Int) = this `should be in year` theYear

fun Int.hours() = TimeComparator(addedHours = this)
fun Int.minutes() = TimeComparator(addedMinutes = this)
fun Int.seconds() = TimeComparator(addedSeconds = this)

infix fun LocalTime.`should be`(timeComparator: TimeComparator): TimeComparator {
    timeComparator.startTime = this
    return timeComparator
}
infix fun LocalTime.shouldBe(timeComparator: TimeComparator) = this `should be` timeComparator

infix fun LocalTime.`should be at least`(timeComparator: TimeComparator): TimeComparator {
    timeComparator.startTime = this
    timeComparator.submittedAtLeast = true
    return timeComparator
}
infix fun LocalTime.shouldBeAtLeast(timeComparator: TimeComparator) = this `should be at least` timeComparator

infix fun TimeComparator.after(theOther: LocalTime) = this.assertAfter(theOther)
infix fun TimeComparator.before(theOther: LocalTime) = this.assertBefore(theOther)

class TimeComparator(internal val addedHours: Int = 0, internal val addedMinutes: Int = 0, internal val addedSeconds: Int = 0) {
    internal lateinit var startTime: LocalTime
    internal var submittedAtLeast = false

    internal fun assertAfter(theOther: LocalTime) {
        when (submittedAtLeast) {
            true -> assertAtLeastAfter(theOther)
            false -> assertExactlyAfter(theOther)
        }
    }

    internal fun assertBefore(theOther: LocalTime) {
        when (submittedAtLeast) {
            true -> assertAtLeastBefore(theOther)
            false -> assertExactlyBefore(theOther)
        }
    }

    private fun assertAtLeastAfter(theOther: LocalTime) {
        val comparedTime = calculateComparedTime(theOther)
        assertTrue("Expected $startTime to be at least { $addedHours hours, $addedMinutes minutes, $addedSeconds seconds } after $theOther", startTime >= comparedTime)
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
        assertTrue("Expected $startTime to be atleast { $addedHours hours, $addedMinutes minutes, $addedSeconds seconds } before $theOther", startTime <= comparedTime)
    }

    private fun calculateComparedTime(time: LocalTime, multiplier: Int = 1) =
            time.plusHours(addedHours.toLong() * multiplier)
                    .plusMinutes(addedMinutes.toLong() * multiplier)
                    .plusSeconds(addedSeconds.toLong() * multiplier)

}
