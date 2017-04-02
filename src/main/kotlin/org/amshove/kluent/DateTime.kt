package org.amshove.kluent

import org.junit.Assert.assertTrue
import java.time.*

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
fun Int.years() = DateComparator(addedYears = this)
fun Int.months() = DateComparator(addedMonths = this)
fun Int.days() = DateComparator(addedDays = this)

infix fun LocalTime.`should be`(timeComparator: TimeComparator) = timeComparator.withStartTime(this)
infix fun LocalTime.shouldBe(timeComparator: TimeComparator) = this `should be` timeComparator

infix fun LocalTime.`should be at least`(timeComparator: TimeComparator) = timeComparator.withStartTime(this).withComparatorType(ComparatorType.AtLeast)
infix fun LocalTime.shouldBeAtLeast(timeComparator: TimeComparator) = this `should be at least` timeComparator

infix fun LocalTime.`should be at most`(timeComparator: TimeComparator) = timeComparator.withStartTime(this).withComparatorType(ComparatorType.AtMost)
infix fun LocalTime.shouldBeAtMost(timeComparator: TimeComparator) = this `should be at most` timeComparator

infix fun TimeComparator.after(theOther: LocalTime) = this.assertAfter(theOther)
infix fun TimeComparator.before(theOther: LocalTime) = this.assertBefore(theOther)

infix fun LocalDate.`should be`(dateComparator: DateComparator) = dateComparator.withStartDate(this)
infix fun LocalDate.shouldBe(dateComparator: DateComparator) = this `should be` dateComparator

infix fun LocalDate.`should be at least`(dateComparator: DateComparator) = dateComparator.withStartDate(this).withComparatorType(ComparatorType.AtLeast)
infix fun LocalDate.shouldBeAtLeast(dateComparator: DateComparator) = this `should be at least` dateComparator

infix fun LocalDate.`should be at most`(dateComparator: DateComparator) = dateComparator.withStartDate(this).withComparatorType(ComparatorType.AtMost)
infix fun LocalDate.shouldBeAtMost(dateComparator: DateComparator) = this `should be at most` dateComparator

infix fun DateComparator.after(theOther: LocalDate) = this.assertAfter(theOther)
infix fun DateComparator.before(theOther: LocalDate) = this.assertBefore(theOther)

internal enum class ComparatorType {
    AtMost,
    AtLeast,
    Exactly
}
