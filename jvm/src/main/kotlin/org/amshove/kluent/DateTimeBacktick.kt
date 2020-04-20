package org.amshove.kluent

import java.time.*

infix fun LocalDateTime.`should be after`(expected: LocalDateTime) = this.shouldBeAfter(expected)

infix fun LocalDateTime.`should be after`(theTime: LocalTime) = this.shouldBeAfter(theTime)

infix fun LocalDateTime.`should be before`(expected: LocalDateTime) = this.shouldBeBefore(expected)

infix fun LocalDateTime.`should be before`(theTime: LocalTime) = this.shouldBeBefore(theTime)

infix fun LocalDateTime.`should be in hour`(theHour: Int) = this.shouldBeInHour(theHour)

infix fun LocalDateTime.`should not be in hour`(theHour: Int) = this.shouldNotBeInHour(theHour)

infix fun LocalDateTime.`should be in minute`(theMinute: Int) = this.shouldBeInMinute(theMinute)

infix fun LocalDateTime.`should not be in minute`(theMinute: Int) = this.shouldNotBeInMinute(theMinute)

infix fun LocalDateTime.`should be in second`(theSecond: Int) = this.shouldBeInSecond(theSecond)

infix fun LocalDateTime.`should not be in second`(theSecond: Int) = this.shouldNotBeInSecond(theSecond)

infix fun LocalDateTime.`should be on or after`(theDate: LocalDateTime) = this.shouldBeOnOrAfter(theDate)

infix fun LocalDateTime.`should be on or before`(theDate: LocalDateTime) = this.shouldBeOnOrBefore(theDate)

infix fun LocalDateTime.`should be on`(theDay: DayOfWeek) = this.shouldBeOn(theDay)

infix fun LocalDateTime.`should not be on`(theDay: DayOfWeek) = this.shouldNotBeOn(theDay)

infix fun LocalDateTime.`should be in`(theMonth: Month) = this.shouldBeIn(theMonth)

infix fun LocalDateTime.`should not be in`(theMonth: Month) = this.shouldNotBeIn(theMonth)

infix fun LocalDateTime.`should be in year`(theYear: Int) = this.shouldBeInYear(theYear)

infix fun LocalDateTime.`should not be in year`(theYear: Int) = this.shouldNotBeInYear(theYear)

infix fun LocalDate.`should be after`(expected: LocalDate) = this.shouldBeAfter(expected)

infix fun LocalDate.`should be before`(expected: LocalDate) = this.shouldBeBefore(expected)

infix fun LocalDate.`should be on or after`(theDate: LocalDate) = this.shouldBeOnOrAfter(theDate)

infix fun LocalDate.`should be on or before`(theDate: LocalDate) = this.shouldBeOnOrBefore(theDate)

infix fun LocalDate.`should be on`(theDay: DayOfWeek) = this.shouldBeOn(theDay)

infix fun LocalDate.`should not be on`(theDay: DayOfWeek) = this.shouldNotBeOn(theDay)

infix fun LocalDate.`should be in`(theMonth: Month) = this.shouldBeIn(theMonth)

infix fun LocalDate.`should not be in`(theMonth: Month) = this.shouldNotBeIn(theMonth)

infix fun LocalDate.`should be in year`(theYear: Int) = this.shouldBeInYear(theYear)

infix fun LocalDate.`should not be in year`(theYear: Int) = this.shouldNotBeInYear(theYear)

infix fun LocalTime.`should be`(timeComparator: TimeComparator) = this.shouldBe(timeComparator)

infix fun LocalTime.`should be at least`(timeComparator: TimeComparator) = this.shouldBeAtLeast(timeComparator)

infix fun LocalTime.`should be at most`(timeComparator: TimeComparator) = this.shouldBeAtMost(timeComparator)

infix fun LocalTime.`should be in hour`(theHour: Int) = this.shouldBeInHour(theHour)

infix fun LocalTime.`should not be in hour`(theHour: Int) = this.shouldNotBeInHour(theHour)

infix fun LocalTime.`should be in minute`(theMinute: Int) = this.shouldBeInMinute(theMinute)

infix fun LocalTime.`should not be in minute`(theMinute: Int) = this.shouldNotBeInMinute(theMinute)

infix fun LocalTime.`should be in second`(theSecond: Int) = this.shouldBeInSecond(theSecond)

infix fun LocalTime.`should not be in second`(theSecond: Int) = this.shouldNotBeInSecond(theSecond)

infix fun LocalDate.`should be`(dateComparator: DateComparator) = this.shouldBe(dateComparator)

infix fun LocalDate.`should be at least`(dateComparator: DateComparator) = this.shouldBeAtLeast(dateComparator)

infix fun LocalDate.`should be at most`(dateComparator: DateComparator) = this.shouldBeAtMost(dateComparator)

infix fun LocalDateTime.`should be`(dateComparator: DateComparator): DateTimeComparator = this.shouldBe(dateComparator)

infix fun LocalDateTime.`should be at least`(dateComparator: DateComparator) = this.shouldBeAtLeast(dateComparator)

infix fun LocalDateTime.`should be at most`(dateComparator: DateComparator) = this.shouldBeAtMost(dateComparator)

infix fun LocalDateTime.`should be`(timeComparator: TimeComparator) = this.shouldBe(timeComparator)

infix fun LocalDateTime.`should be at least`(timeComparator: TimeComparator) = this.shouldBeAtLeast(timeComparator)

infix fun LocalDateTime.`should be at most`(timeComparator: TimeComparator) = this.shouldBeAtMost(timeComparator)

infix fun Instant.`should be after`(expected: Instant) = this.shouldBeAfter(expected)

infix fun Instant.`should be before`(expected: Instant) = this.shouldBeBefore(expected)
