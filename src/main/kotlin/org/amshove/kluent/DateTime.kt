package org.amshove.kluent

import org.junit.jupiter.api.Assertions.assertTrue
import java.time.*

infix fun LocalDateTime.shouldBeAfter(theOther: LocalDateTime) = assertTrue(this > theOther, "Expected $this to be after $theOther")

infix fun LocalDateTime.shouldBeAfter(theTime: LocalTime) = assertTrue(this.toLocalTime() > theTime, "Expected $this to be after $theTime")

infix fun LocalDateTime.shouldBeBefore(theOther: LocalDateTime) = assertTrue(this < theOther, "Expected $this to be before $theOther")

infix fun LocalDateTime.shouldBeBefore(theTime: LocalTime) = assertTrue(this.toLocalTime() < theTime, "Expected $this to be before $theTime")

infix fun LocalDateTime.shouldBeInHour(theHour: Int) = this.toLocalTime() shouldBeInHour theHour

infix fun LocalDateTime.shouldNotBeInHour(theHour: Int) = this.toLocalTime() shouldNotBeInHour theHour

infix fun LocalDateTime.shouldBeInMinute(theMinute: Int) = this.toLocalTime() shouldBeInMinute theMinute

infix fun LocalDateTime.shouldNotBeInMinute(theMinute: Int) = this.toLocalTime() shouldNotBeInMinute theMinute

infix fun LocalDateTime.shouldBeInSecond(theSecond: Int) = this.toLocalTime() shouldBeInSecond theSecond

infix fun LocalDateTime.shouldNotBeInSecond(theSecond: Int) = this.toLocalTime() shouldNotBeInSecond theSecond

infix fun LocalDateTime.shouldBeOnOrAfter(theDate: LocalDateTime) = assertTrue(this >= theDate, "Expected $this to be on or after $theDate")

infix fun LocalDateTime.shouldBeOnOrBefore(theDate: LocalDateTime) = assertTrue(this <= theDate, "Expected $this to be on or before $theDate")

infix fun LocalDateTime.shouldBeOn(theDay: DayOfWeek) = assertTrue(this.dayOfWeek == theDay, "Expected $this to be a $theDay, but was ${this.dayOfWeek}")

infix fun LocalDateTime.shouldNotBeOn(theDay: DayOfWeek) = this.toLocalDate() shouldNotBeOn theDay

infix fun LocalDateTime.shouldBeIn(theMonth: Month) = assertTrue(this.month == theMonth, "Expected $this to be in $theMonth, but was ${this.month}")

infix fun LocalDateTime.shouldNotBeIn(theMonth: Month) = this.toLocalDate() shouldNotBeIn theMonth

infix fun LocalDateTime.shouldBeInYear(theYear: Int) = assertTrue(this.year == theYear, "Expected $this to be in $theYear, but was ${this.year}")

infix fun LocalDateTime.shouldNotBeInYear(theYear: Int) = this.toLocalDate() shouldNotBeInYear theYear

infix fun LocalDate.shouldBeAfter(theOther: LocalDate) = assertTrue(this > theOther, "Expected $this to be after $theOther")

infix fun LocalDate.shouldBeBefore(theOther: LocalDate) = assertTrue(this < theOther, "Expected $this to be before $theOther")

infix fun LocalDate.shouldBeOnOrAfter(theDate: LocalDate) = assertTrue(this >= theDate, "Expected $this to be on or after $theDate")

infix fun LocalDate.shouldBeOnOrBefore(theDate: LocalDate) = assertTrue(this <= theDate, "Expected $this to be on or before $theDate")

infix fun LocalDate.shouldBeOn(theDay: DayOfWeek) = assertTrue(this.dayOfWeek == theDay, "Expected $this to be a $theDay, but was ${this.dayOfWeek}")

infix fun LocalDate.shouldNotBeOn(theDay: DayOfWeek) = assertTrue(this.dayOfWeek != theDay, "Expected $this to not be a $theDay, but was ${this.dayOfWeek}")

infix fun LocalDate.shouldBeIn(theMonth: Month) = assertTrue(this.month == theMonth, "Expected $this to be in $theMonth, but was ${this.month}")

infix fun LocalDate.shouldNotBeIn(theMonth: Month) = assertTrue(this.month != theMonth, "Expected $this to not be in $theMonth, but was ${this.month}")

infix fun LocalDate.shouldBeInYear(theYear: Int) = assertTrue(this.year == theYear, "Expected $this to be in $theYear, but was ${this.year}")

infix fun LocalDate.shouldNotBeInYear(theYear: Int) = assertTrue(this.year != theYear, "Expected $this to not be in $theYear, but was ${this.year}")

fun Int.hours() = TimeComparator(addedHours = this)
fun Int.minutes() = TimeComparator(addedMinutes = this)
fun Int.seconds() = TimeComparator(addedSeconds = this)
fun Int.years() = DateComparator(addedYears = this)
fun Int.months() = DateComparator(addedMonths = this)
fun Int.days() = DateComparator(addedDays = this)

infix fun LocalTime.shouldBe(timeComparator: TimeComparator) = timeComparator.withStartValue(this)

infix fun LocalTime.shouldBeAtLeast(timeComparator: TimeComparator) = timeComparator.withStartValue(this).withComparatorType(ComparatorType.AtLeast)

infix fun LocalTime.shouldBeAtMost(timeComparator: TimeComparator) = timeComparator.withStartValue(this).withComparatorType(ComparatorType.AtMost)

infix fun LocalTime.shouldBeInHour(theHour: Int) = assertTrue(this.hour == theHour, "Expected $this to be in hour $theHour")

infix fun LocalTime.shouldNotBeInHour(theHour: Int) = assertTrue(this.hour != theHour, "Expected $this to not be in hour $theHour")

infix fun LocalTime.shouldBeInMinute(theMinute: Int) = assertTrue(this.minute == theMinute, "Expected $this to be in minute $theMinute")

infix fun LocalTime.shouldNotBeInMinute(theMinute: Int) = assertTrue(this.minute != theMinute, "Expected $this to not be in minute $theMinute")

infix fun LocalTime.shouldBeInSecond(theSecond: Int) = assertTrue(this.second == theSecond, "Expected $this to be in second $theSecond")

infix fun LocalTime.shouldNotBeInSecond(theSecond: Int) = assertTrue(this.second != theSecond, "Expected $this to not be in second $theSecond")

infix fun LocalDate.shouldBe(dateComparator: DateComparator) = dateComparator.withStartValue(this)

infix fun LocalDate.shouldBeAtLeast(dateComparator: DateComparator) = dateComparator.withStartValue(this).withComparatorType(ComparatorType.AtLeast)

infix fun LocalDate.shouldBeAtMost(dateComparator: DateComparator) = dateComparator.withStartValue(this).withComparatorType(ComparatorType.AtMost)

infix fun LocalDateTime.shouldBe(dateComparator: DateComparator): DateTimeComparator = DateTimeComparator(dateComparator).withStartValue(this) as DateTimeComparator

infix fun LocalDateTime.shouldBeAtLeast(dateComparator: DateComparator) = DateTimeComparator(dateComparator).withStartValue(this).withComparatorType(ComparatorType.AtLeast)

infix fun LocalDateTime.shouldBeAtMost(dateComparator: DateComparator) = DateTimeComparator(dateComparator).withStartValue(this).withComparatorType(ComparatorType.AtMost)

infix fun LocalDateTime.shouldBe(timeComparator: TimeComparator) = DateTimeComparator(timeComparator = timeComparator).withStartValue(this) as DateTimeComparator

infix fun LocalDateTime.shouldBeAtLeast(timeComparator: TimeComparator) = DateTimeComparator(timeComparator = timeComparator).withStartValue(this).withComparatorType(ComparatorType.AtLeast)

infix fun LocalDateTime.shouldBeAtMost(timeComparator: TimeComparator) = DateTimeComparator(timeComparator = timeComparator).withStartValue(this).withComparatorType(ComparatorType.AtMost)

infix fun <T : Comparable<T>> AbstractJavaTimeComparator<T>.after(theOther: T) = this.assertAfter(theOther)
infix fun <T : Comparable<T>> AbstractJavaTimeComparator<T>.before(theOther: T) = this.assertBefore(theOther)

infix fun DateTimeComparator.after(theDate: LocalDate) = this.assertAfter(theDate)
infix fun DateTimeComparator.before(theDate: LocalDate) = this.assertBefore(theDate)

infix fun DateTimeComparator.after(theTime: LocalTime) = this.assertAfter(theTime)
infix fun DateTimeComparator.before(theTime: LocalTime) = this.assertBefore(theTime)

internal enum class ComparatorType {
    AtMost,
    AtLeast,
    Exactly
}
