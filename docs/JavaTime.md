# java.time Assertions

The following documentation is a overview around the assertions for `java.time.LocalDateTime`, `java.time.LocalDate`
and `java.time.LocalTime`

Not all cases are covered, but all methods work as appropriate to the tested datetype. All examples can be found in
the [testsuites](https://github.com/MarkusAmshove/Kluent/tree/master/src/test/kotlin/org/amshove/kluent/tests/assertions/datetime)
.

There are extension functions for x.years(), x.months(), x.days(), x.hours(), x.minutes() and x.seconds().

```kt
// Test that a LocalDateTime is after another
val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)
val dateBefore = dateToTest.minusDays(1)
dateToTest shouldBeAfter dateBefore

// Test that a LocalDateTime is before another
val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)
val dateAfter = dateToTest.plusDays(1)
dateToTest shouldBeBefore dateAfter

// Test that a LocalDateTime is on or after another
val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)
val dateBefore = dateToTest.minusDays(1)
dateToTest shouldBeOnOrAfter dateBefore

// Test that a LocalDateTime is on or before another
val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)
val dateAfter = dateToTest.plusDays(1)
dateToTest shouldBeOnOrBefore dateAfter

// Test that a LocalDateTime is on a specific day
val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)
dateToTest shouldBeOn DayOfWeek.WEDNESDAY

// Test that a LocalDateTime is not on a specific day
val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)
dateToTest shouldNotBeOn DayOfWeek.MONDAY

// Test that a LocalDateTime is in a specific month
 val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)
dateToTest shouldBeIn Month.MARCH

// Test that a LocalDateTime is not in a specific month
 val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)
dateToTest shouldBeIn Month.APRIL

// Test that a LocalDateTime is in a specific year
val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)
dateToTest shouldBeInYear 2017

// Test that a LocalDateTime is not in a specific year
val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)
dateToTest shouldNotBeInYear 2012

// Test that a LocalDateTime is within 5 days after another
val orderDate = LocalDateTime.of(2017, 6, 5, 10, 0)
val shippingDate = LocalDateTime.of(2017, 6, 10, 10, 0)
shippingDate shouldBe 5.days() after orderDate

// Test that a LocalDateTime is at least 5 days after another
val orderDate = LocalDateTime.of(2017, 6, 5, 10, 0)
val shippingDate = LocalDateTime.of(2017, 6, 11, 10, 0)
shippingDate shouldBeAtLeast 5.days() after orderDate

// Test that a LocalDateTime is at most 5 days after another
val orderDate = LocalDateTime.of(2017, 6, 5, 10, 0)
val shippingDate = LocalDateTime.of(2017, 6, 9, 10, 0)
shippingDate shouldBeAtMost 5.days() after orderDate

// Test that a LocalDateTime is within 5 days before another
val shippingDate = LocalDateTime.of(2017, 6, 15, 10, 0)
val orderDate = LocalDateTime.of(2017, 6, 10, 10, 0)
orderDate shouldBe 5.days() before shippingDate

// Test that a LocalDateTime is at least 5 days before another
val shippingDate = LocalDateTime.of(2017, 6, 15, 10, 0)
val orderDate = LocalDateTime.of(2017, 6, 9, 10, 0)
orderDate shouldBeAtLeast 5.days() before shippingDate

// Test that a LocalDateTime is at most 5 days before another
val shippingDate = LocalDateTime.of(2017, 6, 15, 10, 0)
val orderDate = LocalDateTime.of(2017, 6, 12, 10, 0)
orderDate shouldBeAtMost 5.days() before shippingDate
```
