package org.amshove.kluent

import org.assertj.core.api.Assertions.assertThat
import java.time.*

infix fun LocalDateTime.shouldBeAfter(theOther: LocalDateTime) = assertThat(this > theOther).`as`("Expected $this to be after $theOther").isTrue()

infix fun LocalDateTime.shouldBeAfter(theTime: LocalTime) = assertThat(this.toLocalTime() > theTime).`as`("Expected $this to be after $theTime").isTrue()

infix fun LocalDateTime.shouldBeBefore(theOther: LocalDateTime) = assertThat(this < theOther).`as`("Expected $this to be before $theOther").isTrue()

infix fun LocalDateTime.shouldBeBefore(theTime: LocalTime) = assertThat(this.toLocalTime() < theTime).`as`("Expected $this to be before $theTime").isTrue()

infix fun LocalDateTime.shouldBeInHour(theHour: Int) = this.toLocalTime() shouldBeInHour theHour

infix fun LocalDateTime.shouldNotBeInHour(theHour: Int) = this.toLocalTime() shouldNotBeInHour theHour

infix fun LocalDateTime.shouldBeInMinute(theMinute: Int) = this.toLocalTime() shouldBeInMinute theMinute

infix fun LocalDateTime.shouldNotBeInMinute(theMinute: Int) = this.toLocalTime() shouldNotBeInMinute theMinute

infix fun LocalDateTime.shouldBeInSecond(theSecond: Int) = this.toLocalTime() shouldBeInSecond theSecond

infix fun LocalDateTime.shouldNotBeInSecond(theSecond: Int) = this.toLocalTime() shouldNotBeInSecond theSecond

infix fun LocalDateTime.shouldBeOnOrAfter(theDate: LocalDateTime) = assertThat(this >= theDate).`as`("Expected $this to be on or after $theDate").isTrue()

infix fun LocalDateTime.shouldBeOnOrBefore(theDate: LocalDateTime) = assertThat(this <= theDate).`as`("Expected $this to be on or before $theDate").isTrue()

infix fun LocalDateTime.shouldBeOn(theDay: DayOfWeek) = assertThat(this.dayOfWeek == theDay).`as`("Expected $this to be a $theDay, but was ${this.dayOfWeek}").isTrue()

infix fun LocalDateTime.shouldNotBeOn(theDay: DayOfWeek) = this.toLocalDate() shouldNotBeOn theDay

infix fun LocalDateTime.shouldBeIn(theMonth: Month) = assertThat(this.month == theMonth).`as`("Expected $this to be in $theMonth, but was ${this.month}").isTrue()

infix fun LocalDateTime.shouldNotBeIn(theMonth: Month) = this.toLocalDate() shouldNotBeIn theMonth

infix fun LocalDateTime.shouldBeInYear(theYear: Int) = assertThat(this.year == theYear).`as`("Expected $this to be in $theYear, but was ${this.year}").isTrue()

infix fun LocalDateTime.shouldNotBeInYear(theYear: Int) = this.toLocalDate() shouldNotBeInYear theYear

infix fun LocalDate.shouldBeAfter(theOther: LocalDate) = assertThat(this > theOther).`as`("Expected $this to be after $theOther").isTrue()

infix fun LocalDate.shouldBeBefore(theOther: LocalDate) = assertThat(this < theOther).`as`("Expected $this to be before $theOther").isTrue()

infix fun LocalDate.shouldBeOnOrAfter(theDate: LocalDate) = assertThat(this >= theDate).`as`("Expected $this to be on or after $theDate").isTrue()

infix fun LocalDate.shouldBeOnOrBefore(theDate: LocalDate) = assertThat(this <= theDate).`as`("Expected $this to be on or before $theDate").isTrue()

infix fun LocalDate.shouldBeOn(theDay: DayOfWeek) = assertThat(this.dayOfWeek == theDay).`as`("Expected $this to be a $theDay, but was ${this.dayOfWeek}").isTrue()

infix fun LocalDate.shouldNotBeOn(theDay: DayOfWeek) = assertThat(this.dayOfWeek != theDay).`as`("Expected $this to not be a $theDay, but was ${this.dayOfWeek}").isTrue()

infix fun LocalDate.shouldBeIn(theMonth: Month) = assertThat(this.month == theMonth).`as`("Expected $this to be in $theMonth, but was ${this.month}").isTrue()

infix fun LocalDate.shouldNotBeIn(theMonth: Month) = assertThat(this.month != theMonth).`as`("Expected $this to not be in $theMonth, but was ${this.month}").isTrue()

infix fun LocalDate.shouldBeInYear(theYear: Int) = assertThat(this.year == theYear).`as`("Expected $this to be in $theYear, but was ${this.year}").isTrue()

infix fun LocalDate.shouldNotBeInYear(theYear: Int) = assertThat(this.year != theYear).`as`("Expected $this to not be in $theYear, but was ${this.year}").isTrue()

fun Int.hours() = TimeComparator(addedHours = this)
fun Int.minutes() = TimeComparator(addedMinutes = this)
fun Int.seconds() = TimeComparator(addedSeconds = this)
fun Int.years() = DateComparator(addedYears = this)
fun Int.months() = DateComparator(addedMonths = this)
fun Int.days() = DateComparator(addedDays = this)

infix fun LocalTime.shouldBe(timeComparator: TimeComparator) = timeComparator.withStartValue(this)

infix fun LocalTime.shouldBeAtLeast(timeComparator: TimeComparator) = timeComparator.withStartValue(this).withComparatorType(ComparatorType.AtLeast)

infix fun LocalTime.shouldBeAtMost(timeComparator: TimeComparator) = timeComparator.withStartValue(this).withComparatorType(ComparatorType.AtMost)

infix fun LocalTime.shouldBeInHour(theHour: Int) = assertThat(this.hour == theHour).`as`("Expected $this to be in hour $theHour").isTrue()

infix fun LocalTime.shouldNotBeInHour(theHour: Int) = assertThat(this.hour != theHour).`as`("Expected $this to not be in hour $theHour").isTrue()

infix fun LocalTime.shouldBeInMinute(theMinute: Int) = assertThat(this.minute == theMinute).`as`("Expected $this to be in minute $theMinute").isTrue()

infix fun LocalTime.shouldNotBeInMinute(theMinute: Int) = assertThat(this.minute != theMinute).`as`("Expected $this to not be in minute $theMinute").isTrue()

infix fun LocalTime.shouldBeInSecond(theSecond: Int) = assertThat(this.second == theSecond).`as`("Expected $this to be in second $theSecond").isTrue()

infix fun LocalTime.shouldNotBeInSecond(theSecond: Int) = assertThat(this.second != theSecond).`as`("Expected $this to not be in second $theSecond").isTrue()

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
