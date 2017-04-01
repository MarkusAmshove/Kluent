package org.amshove.kluent

import org.junit.Assert.*
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
