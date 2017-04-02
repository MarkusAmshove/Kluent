package org.amshove.kluent.tests.backtickassertions.datetime

import org.amshove.kluent.*
import org.jetbrains.spek.api.Spek
import java.time.*
import kotlin.test.assertFails

class LocalDateTimeTests : Spek({
    given("the `should be after` method") {
        on("passing an earlier date") {
            it("should pass") {
                val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)
                val dateBefore = dateToTest.minusDays(1)

                dateToTest `should be after` dateBefore
            }
        }
        on("passing a later date") {
            it("should fail") {
                val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)
                val dateAfter = dateToTest.plusDays(1)

                assertFails { dateToTest `should be after` dateAfter }
            }
        }
    }
    given("the `should be before` method") {
        on("passing a later date") {
            it("should pass") {
                val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)
                val dateAfter = dateToTest.plusDays(1)

                dateToTest `should be before` dateAfter
            }
        }
        on("passing an earlier date") {
            it("should fail") {
                val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)
                val dateBefore = dateToTest.minusDays(1)

                assertFails { dateToTest `should be before` dateBefore }
            }
        }
    }
    given("the `should be on or after` method") {
        on("passing an earlier date") {
            it("should pass") {
                val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)
                val dateBefore = dateToTest.minusDays(1)

                dateToTest `should be on or after` dateBefore
            }
        }
        on("passing the same date") {
            it("should pass") {
                val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)

                dateToTest `should be on or after` dateToTest
            }
        }
        on("passing a later date") {
            it("should fail") {
                val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)
                val dateAfter = dateToTest.plusDays(1)

                assertFails { dateToTest `should be on or after` dateAfter }
            }
        }
    }
    given("the `should be on or before` method") {
        on("passing a later date") {
            it("should pass") {
                val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)
                val dateAfter = dateToTest.plusDays(1)

                dateToTest `should be on or before` dateAfter
            }
        }
        on("passing the same date") {
            it("should pass") {
                val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)

                dateToTest `should be on or before` dateToTest
            }
        }
        on("passing an earlier date") {
            it("should fail") {
                val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)
                val dateBefore = dateToTest.minusDays(1)

                assertFails { dateToTest `should be on or before` dateBefore }
            }
        }
    }
    given("the `should be on` method") {
        on("passing the correct day") {
            it("should pass") {
                val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)

                dateToTest `should be on` DayOfWeek.WEDNESDAY
            }
        }
        on("passing an incorrect day") {
            it("should fail") {
                val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)

                assertFails { dateToTest `should be on` DayOfWeek.MONDAY }
            }
        }
    }
    given("the `should be in` method") {
        on("passing the correct month") {
            it("should pass") {
                val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)

                dateToTest `should be in` Month.MARCH
            }
        }
        on("passing an incorrect month") {
            it("should fail") {
                val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)

                assertFails { dateToTest `should be in` Month.APRIL }
            }
        }
    }
    given("the `should be in year` method") {
        on("passing the correct year") {
            it("should pass") {
                val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)

                dateToTest `should be in year` 2017
            }
        }
        on("passing an incorrect year") {
            it("should fail") {
                val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)

                assertFails { dateToTest `should be in year` 2018 }
            }
        }
    }
    given("the `should be` x.days after method") {
        val orderDate = LocalDateTime.of(2017, 6, 5, 10, 0)
        on("passing a date which is exactly x days after") {
            val shippingDate = LocalDateTime.of(2017, 6, 10, 10, 0)
            it("should pass") {
                shippingDate `should be` 5.days() after orderDate
            }
        }
        on("passing a date which is more than x days after") {
            val shippingDate = LocalDateTime.of(2017, 6, 15, 10, 0)
            it("should fail") {
                assertFails { shippingDate `should be` 5.days() after orderDate }
            }
        }
        on("passing a date which is less than x days after") {
            val shippingDate = LocalDateTime.of(2017, 6, 7, 10, 0)
            it("should fail") {
                assertFails { shippingDate `should be` 5.days() after orderDate }
            }
        }
    }
    given("the `should be at least` x.days after method") {
        val orderDate = LocalDateTime.of(2017, 6, 5, 10, 0)
        on("passing a date which is exactly x days after") {
            val shippingDate = LocalDateTime.of(2017, 6, 10, 10, 0)
            it("should pass") {
                shippingDate `should be at least` 5.days() after orderDate
            }
        }
        on("passing a date which is more than x days after") {
            val shippingDate = LocalDateTime.of(2017, 6, 15, 10, 0)
            it("should pass") {
                shippingDate `should be at least` 5.days() after orderDate
            }
        }
        on("passing a date which is less than x days after") {
            val shippingDate = LocalDateTime.of(2017, 6, 7, 10, 0)
            it("should fail") {
                assertFails { shippingDate `should be at least` 5.days() after orderDate }
            }
        }
    }
    given("the `should be at most` x.days after method") {
        val orderDate = LocalDateTime.of(2017, 6, 5, 10, 0)
        on("passing a date which is exactly x days after") {
            val shippingDate = LocalDateTime.of(2017, 6, 10, 10, 0)
            it("should pass") {
                shippingDate `should be at most` 5.days() after orderDate
            }
        }
        on("passing a date which is more than x days after") {
            val shippingDate = LocalDateTime.of(2017, 6, 15, 10, 0)
            it("should fail") {
                assertFails { shippingDate `should be at most` 5.days() after orderDate }
            }
        }
        on("passing a date which is less than x days after") {
            val shippingDate = LocalDateTime.of(2017, 6, 7, 10, 0)
            it("should pass") {
                shippingDate `should be at most` 5.days() after orderDate
            }
        }
    }
    given("the `should be` x.days before method") {
        val orderDate = LocalDateTime.of(2017, 6, 15, 10, 0)
        on("passing a date which is exactly x days before") {
            val shippingDate = LocalDateTime.of(2017, 6, 10, 10, 0)
            it("should pass") {
                shippingDate `should be` 5.days() before orderDate
            }
        }
        on("passing a date which is more than x days before") {
            val shippingDate = LocalDateTime.of(2017, 6, 9, 10, 0)
            it("should fail") {
                assertFails { shippingDate `should be` 5.days() before orderDate }
            }
        }
        on("passing a date which is less than x days before") {
            val shippingDate = LocalDateTime.of(2017, 6, 12, 10, 0)
            it("should fail") {
                assertFails { shippingDate `should be` 5.days() before orderDate }
            }
        }
    }
    given("the `should be at least` x.days before method") {
        val orderDate = LocalDateTime.of(2017, 6, 15, 10, 0)
        on("passing a date which is exactly x before after") {
            val shippingDate = LocalDateTime.of(2017, 6, 10, 10, 0)
            it("should pass") {
                shippingDate `should be at least` 5.days() before orderDate
            }
        }
        on("passing a date which is more than x days before") {
            val shippingDate = LocalDateTime.of(2017, 6, 9, 10, 0)
            it("should pass") {
                shippingDate `should be at least` 5.days() before orderDate
            }
        }
        on("passing a date which is less than x days before") {
            val shippingDate = LocalDateTime.of(2017, 6, 12, 10, 0)
            it("should fail") {
                assertFails { shippingDate `should be at least` 5.days() before orderDate }
            }
        }
    }
    given("the `should be at most` x.days before method") {
        val orderDate = LocalDateTime.of(2017, 6, 15, 10, 0)
        on("passing a date which is exactly x days before") {
            val shippingDate = LocalDateTime.of(2017, 6, 10, 10, 0)
            it("should pass") {
                shippingDate `should be at most` 5.days() before orderDate
            }
        }
        on("passing a date which is more than x days before") {
            val shippingDate = LocalDateTime.of(2017, 6, 5, 10, 0)
            it("should fail") {
                assertFails { shippingDate `should be at most` 5.days() before orderDate }
            }
        }
        on("passing a date which is less than x days before") {
            val shippingDate = LocalDateTime.of(2017, 6, 7, 10, 0)
            it("should fail") {
                assertFails { shippingDate `should be at most` 5.days() before orderDate }
            }
        }
    }
    given("the `should be` after method") {
        val loginTime = LocalDateTime.of(2017, 1, 10, 10, 59)
        on("passing a time 5 minutes after") {
            val orderTime = LocalDateTime.of(2017, 1, 10, 11, 4)
            it("should pass") {
                orderTime `should be` 5.minutes() after loginTime
            }
        }
        on("passing a time 6 minutes after") {
            val orderTime = LocalDateTime.of(2017, 1, 10, 11, 5)
            it("should fail") {
                assertFails { orderTime `should be` 5.minutes() after loginTime }
            }
        }
    }
    given("the `should be` before method") {
        val loginTime = LocalDateTime.of(2017, 1, 10, 10, 59)
        on("passing a time 5 minutes before") {
            val orderTime = LocalDateTime.of(2017, 1, 10, 10, 54)
            it("should pass") {
                orderTime `should be` 5.minutes() before loginTime
            }
        }
        on("passing a time 6 minutes before") {
            val orderTime = LocalDateTime.of(2017, 1, 10, 10, 53)
            it("should fail") {
                assertFails { orderTime `should be` 5.minutes() before loginTime }
            }
        }
    }
    given("the `should be at least` after method") {
        val loginTime = LocalDateTime.of(2017, 1, 10, 10, 59)
        on("passing a time 5 minutes after") {
            val orderTime = LocalDateTime.of(2017, 1, 10, 11, 4)
            it("should pass testing for at least 3 minutes") {
                orderTime `should be at least` 3.minutes() after loginTime
            }
        }
        on("passing a time 5 minutes after") {
            val orderTime = LocalDateTime.of(2017, 1, 10, 11, 4)
            it("should fail testing for at least 6 minutes") {
                assertFails { orderTime `should be at least` 6.minutes() after loginTime }
            }
        }
    }
    given("the `should be at least` before method") {
        val loginTime = LocalDateTime.of(2017, 1, 10, 10, 54)
        on("passing a time 5 minutes before") {
            val orderTime = LocalDateTime.of(2017, 1, 10, 10, 59)
            it("should pass testing for at least 3 minutes") {
                loginTime `should be at least` 3.minutes() before orderTime
            }
        }
        on("passing a time 6 minutes before") {
            val orderTime = LocalDateTime.of(2017, 1, 10, 10, 53)
            it("should fail testing for at least 7 minutes") {
                assertFails { loginTime `should be at least` 7.minutes() before orderTime }
            }
        }
    }
    given("the `should be at most` before method") {
        val orderTime = LocalDateTime.of(2017, 1, 10, 10, 10)
        on("passing a time matching exactly at most 5 minutes before") {
            val loginTime = LocalDateTime.of(2017, 1, 10, 10, 5)
            it("should pass") {
                loginTime `should be at most` 5.minutes() before orderTime
            }
        }
        on("passing a time within 5 minutes before") {
            val loginTime = LocalDateTime.of(2017, 1, 10, 10, 8)
            it("should pass") {
                loginTime `should be at most` 5.minutes() before orderTime
            }
        }
        on("passing a time more than 5 minutes before") {
            val loginTime = LocalDateTime.of(2017, 1, 10, 10, 0)
            it("should fail") {
                assertFails { loginTime `should be at most` 5.minutes() before orderTime }
            }
        }
    }
    given("the `should be at most` after method") {
        val loginTime = LocalDateTime.of(2017, 1, 10, 10, 10)
        on("passing a time matching exactly at most 5 minutes after") {
            val orderTime = LocalDateTime.of(2017, 1, 10, 10, 15)
            it("should pass") {
                orderTime `should be at most` 5.minutes() after loginTime
            }
        }
        on("passing a time within 5 minutes before") {
            val orderTime = LocalDateTime.of(2017, 1, 10, 10, 12)
            it("should pass") {
                orderTime `should be at most` 5.minutes() after loginTime
            }
        }
        on("passing a time more than 5 minutes before") {
            val orderTime = LocalDateTime.of(2017, 1, 10, 10, 20)
            it("should fail") {
                assertFails { orderTime `should be at most` 5.minutes() after loginTime }
            }
        }
    }
    given("the Int.hours() extension") {
        val loginTime = LocalDateTime.of(2017, 1, 10, 10, 0)
        val orderTime = LocalDateTime.of(2017, 1, 10, 11, 0)
        on("testing for 1 hour after") {
            it("should pass") {
                orderTime `should be` 1.hours() after loginTime
            }
        }
        on("testing for 2 hours after") {
            it("should fail") {
                assertFails { orderTime `should be` 2.hours() after loginTime }
            }
        }
    }
    given("the Int.seconds() extension") {
        val loginTime = LocalDateTime.of(2017, 1, 10, 10, 0, 30)
        val orderTime = LocalDateTime.of(2017, 1, 10, 10, 0, 45)
        on("testing for 15 seconds after") {
            it("should pass") {
                orderTime `should be` 15.seconds() after loginTime
            }
        }
        on("testing for 30 seconds after") {
            it("should fail") {
                assertFails { orderTime `should be` 30.seconds() after loginTime }
            }
        }
        on("checking a time with minute overlay") {
            it("should pass given the correct seconds") {
                val logoutTime = LocalDateTime.of(2017, 1, 10, 10, 1, 15)
                logoutTime `should be` 45.seconds() after loginTime
            }
        }
    }
    given("a LocalDateTime") {
        val loginTime = LocalDateTime.of(2017, 2, 27, 23, 55)
        on("checking if it is before a LocalTime which is later") {
            val midnight = LocalTime.of(0, 0)
            it("should pass") {
                loginTime `should be` 5.minutes() before midnight
            }
        }
        on("checking if it is before a LocalTime which is earlier") {
            val theTime = LocalTime.of(23, 50)
            it("should fail") {
                assertFails { loginTime `should be` 5.minutes() before theTime }
            }
        }
        on("checking if it is after a LocalTime which is earlier") {
            val midday = LocalTime.of(12, 0)
            it("should pass") {
                loginTime `should be after` midday
            }
        }
        on("checking if it is after a LocalDate which is later") {
            val twentyEighths = LocalDate.of(2017, 2, 28)
            it("should fail") {
                assertFails { loginTime `should be` 1.days() after twentyEighths }
            }
        }
        on("checking if it is before a LocalDate which is later") {
            val twentyEighths = LocalDate.of(2017, 2, 28)
            it("should pass") {
                loginTime `should be` 1.days() before twentyEighths
            }
        }
        on("checking if it is before a LocalDate which is earlier") {
            val twentySixths = LocalDate.of(2017, 2, 26)
            it("should fail") {
                assertFails { loginTime `should be` 1.days() before twentySixths }
            }
        }
        on("checking if it is in an hour which it is in") {
            it("should pass") {
                loginTime `should be in hour` 23
            }
        }
        on("checking if it is in an hour which it is not in") {
            it("should fail") {
                assertFails { loginTime `should be in hour` 22 }
            }
        }
        on("checking if it is in a minute which it is in") {
            it("should pass") {
                loginTime `should be in minute` 55
            }
        }
        on("checking if it is in a minute which it is not in") {
            it("should fail") {
                assertFails { loginTime `should be in minute` 22 }
            }
        }
        on("checking if it is in a second which it is in") {
            it("should pass") {
                loginTime `should be in second` 0
            }
        }
        on("checking if it is in a second which it is not in") {
            it("should fail") {
                assertFails { loginTime `should be in second` 22 }
            }
        }
    }
})

