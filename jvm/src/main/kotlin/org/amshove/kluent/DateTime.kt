package org.amshove.kluent

import org.junit.Assert.assertTrue
import java.time.*

infix fun LocalDateTime.shouldBeAfter(expected: LocalDateTime) = assertTrue("Expected $this to be after $expected", this > expected)

infix fun LocalDateTime.shouldBeAfter(theTime: LocalTime) = assertTrue("Expected $this to be after $theTime", this.toLocalTime() > theTime)

infix fun LocalDateTime.shouldBeBefore(expected: LocalDateTime) = assertTrue("Expected $this to be before $expected", this < expected)

infix fun LocalDateTime.shouldBeBefore(theTime: LocalTime) = assertTrue("Expected $this to be before $theTime", this.toLocalTime() < theTime)

infix fun LocalDateTime.shouldBeInHour(theHour: Int) = this.toLocalTime() shouldBeInHour theHour

infix fun LocalDateTime.shouldNotBeInHour(theHour: Int) = this.toLocalTime() shouldNotBeInHour theHour

infix fun LocalDateTime.shouldBeInMinute(theMinute: Int) = this.toLocalTime() shouldBeInMinute theMinute

infix fun LocalDateTime.shouldNotBeInMinute(theMinute: Int) = this.toLocalTime() shouldNotBeInMinute theMinute

infix fun LocalDateTime.shouldBeInSecond(theSecond: Int) = this.toLocalTime() shouldBeInSecond theSecond

infix fun LocalDateTime.shouldNotBeInSecond(theSecond: Int) = this.toLocalTime() shouldNotBeInSecond theSecond

infix fun LocalDateTime.shouldBeOnOrAfter(theDate: LocalDateTime) = assertTrue("Expected $this to be on or after $theDate", this >= theDate)

infix fun LocalDateTime.shouldBeOnOrBefore(theDate: LocalDateTime) = assertTrue("Expected $this to be on or before $theDate", this <= theDate)

infix fun LocalDateTime.shouldBeOn(theDay: DayOfWeek) = assertTrue("Expected $this to be a $theDay, but was ${this.dayOfWeek}", this.dayOfWeek == theDay)

infix fun LocalDateTime.shouldNotBeOn(theDay: DayOfWeek) = this.toLocalDate() shouldNotBeOn theDay

infix fun LocalDateTime.shouldBeIn(theMonth: Month) = assertTrue("Expected $this to be in $theMonth, but was ${this.month}", this.month == theMonth)

infix fun LocalDateTime.shouldNotBeIn(theMonth: Month) = this.toLocalDate() shouldNotBeIn theMonth

infix fun LocalDateTime.shouldBeInYear(theYear: Int) = assertTrue("Expected $this to be in $theYear, but was ${this.year}", this.year == theYear)

infix fun LocalDateTime.shouldNotBeInYear(theYear: Int) = this.toLocalDate() shouldNotBeInYear theYear

infix fun LocalDate.shouldBeAfter(expected: LocalDate) = assertTrue("Expected $this to be after $expected", this > expected)

infix fun LocalDate.shouldBeBefore(expected: LocalDate) = assertTrue("Expected $this to be before $expected", this < expected)

infix fun LocalDate.shouldBeOnOrAfter(theDate: LocalDate) = assertTrue("Expected $this to be on or after $theDate", this >= theDate)

infix fun LocalDate.shouldBeOnOrBefore(theDate: LocalDate) = assertTrue("Expected $this to be on or before $theDate", this <= theDate)

infix fun LocalDate.shouldBeOn(theDay: DayOfWeek) = assertTrue("Expected $this to be a $theDay, but was ${this.dayOfWeek}", this.dayOfWeek == theDay)

infix fun LocalDate.shouldNotBeOn(theDay: DayOfWeek) = assertTrue("Expected $this to not be a $theDay, but was ${this.dayOfWeek}", this.dayOfWeek != theDay)

infix fun LocalDate.shouldBeIn(theMonth: Month) = assertTrue("Expected $this to be in $theMonth, but was ${this.month}", this.month == theMonth)

infix fun LocalDate.shouldNotBeIn(theMonth: Month) = assertTrue("Expected $this to not be in $theMonth, but was ${this.month}", this.month != theMonth)

infix fun LocalDate.shouldBeInYear(theYear: Int) = assertTrue("Expected $this to be in $theYear, but was ${this.year}", this.year == theYear)

infix fun LocalDate.shouldNotBeInYear(theYear: Int) = assertTrue("Expected $this to not be in $theYear, but was ${this.year}", this.year != theYear)

fun Int.hours() = TimeComparator(addedHours = this)
fun Int.minutes() = TimeComparator(addedMinutes = this)
fun Int.seconds() = TimeComparator(addedSeconds = this)
fun Int.years() = DateComparator(addedYears = this)
fun Int.months() = DateComparator(addedMonths = this)
fun Int.days() = DateComparator(addedDays = this)

infix fun LocalTime.shouldBe(timeComparator: TimeComparator) = timeComparator.withStartValue(this)

infix fun LocalTime.shouldBeAtLeast(timeComparator: TimeComparator) = timeComparator.withStartValue(this).withComparatorType(ComparatorType.AtLeast)

infix fun LocalTime.shouldBeAtMost(timeComparator: TimeComparator) = timeComparator.withStartValue(this).withComparatorType(ComparatorType.AtMost)

infix fun LocalTime.shouldBeInHour(theHour: Int) = assertTrue("Expected $this to be in hour $theHour", this.hour == theHour)

infix fun LocalTime.shouldNotBeInHour(theHour: Int) = assertTrue("Expected $this to not be in hour $theHour", this.hour != theHour)

infix fun LocalTime.shouldBeInMinute(theMinute: Int) = assertTrue("Expected $this to be in minute $theMinute", this.minute == theMinute)

infix fun LocalTime.shouldNotBeInMinute(theMinute: Int) = assertTrue("Expected $this to not be in minute $theMinute", this.minute != theMinute)

infix fun LocalTime.shouldBeInSecond(theSecond: Int) = assertTrue("Expected $this to be in second $theSecond", this.second == theSecond)

infix fun LocalTime.shouldNotBeInSecond(theSecond: Int) = assertTrue("Expected $this to not be in second $theSecond", this.second != theSecond)

infix fun LocalDate.shouldBe(dateComparator: DateComparator) = dateComparator.withStartValue(this)

infix fun LocalDate.shouldBeAtLeast(dateComparator: DateComparator) = dateComparator.withStartValue(this).withComparatorType(ComparatorType.AtLeast)

infix fun LocalDate.shouldBeAtMost(dateComparator: DateComparator) = dateComparator.withStartValue(this).withComparatorType(ComparatorType.AtMost)

infix fun LocalDateTime.shouldBe(dateComparator: DateComparator): DateTimeComparator = DateTimeComparator(dateComparator).withStartValue(this) as DateTimeComparator

infix fun LocalDateTime.shouldBeAtLeast(dateComparator: DateComparator) = DateTimeComparator(dateComparator).withStartValue(this).withComparatorType(ComparatorType.AtLeast)

infix fun LocalDateTime.shouldBeAtMost(dateComparator: DateComparator) = DateTimeComparator(dateComparator).withStartValue(this).withComparatorType(ComparatorType.AtMost)

infix fun LocalDateTime.shouldBe(timeComparator: TimeComparator) = DateTimeComparator(timeComparator = timeComparator).withStartValue(this) as DateTimeComparator

infix fun LocalDateTime.shouldBeAtLeast(timeComparator: TimeComparator) = DateTimeComparator(timeComparator = timeComparator).withStartValue(this).withComparatorType(ComparatorType.AtLeast)

infix fun LocalDateTime.shouldBeAtMost(timeComparator: TimeComparator) = DateTimeComparator(timeComparator = timeComparator).withStartValue(this).withComparatorType(ComparatorType.AtMost)

infix fun <T : Comparable<T>> AbstractJavaTimeComparator<T>.after(expected: T) = this.assertAfter(expected)
infix fun <T : Comparable<T>> AbstractJavaTimeComparator<T>.before(expected: T) = this.assertBefore(expected)

infix fun DateTimeComparator.after(theDate: LocalDate) = this.assertAfter(theDate)
infix fun DateTimeComparator.before(theDate: LocalDate) = this.assertBefore(theDate)

infix fun DateTimeComparator.after(theTime: LocalTime) = this.assertAfter(theTime)
infix fun DateTimeComparator.before(theTime: LocalTime) = this.assertBefore(theTime)

internal enum class ComparatorType {
    AtMost,
    AtLeast,
    Exactly
}
