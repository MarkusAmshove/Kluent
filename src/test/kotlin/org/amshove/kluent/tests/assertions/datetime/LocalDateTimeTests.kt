package org.amshove.kluent.tests.assertions.datetime

import org.amshove.kluent.*
import org.jetbrains.spek.api.Spek
import java.time.DayOfWeek
import java.time.LocalDateTime
import java.time.Month
import kotlin.test.assertFails

class LocalDateTimeTests : Spek({
    given("the shouldBeAfter method") {
        on("passing an earlier date") {
            it("should pass") {
                val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)
                val dateBefore = dateToTest.minusDays(1)

                dateToTest shouldBeAfter dateBefore
            }
        }
        on("passing a later date") {
            it("should fail") {
                val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)
                val dateAfter = dateToTest.plusDays(1)

                assertFails { dateToTest shouldBeAfter dateAfter }
            }
        }
    }
    given("the shouldBeBefore method") {
        on("passing a later date") {
            it("should pass") {
                val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)
                val dateAfter = dateToTest.plusDays(1)

                dateToTest shouldBeBefore dateAfter
            }
        }
        on("passing an earlier date") {
            it("should fail") {
                val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)
                val dateBefore = dateToTest.minusDays(1)

                assertFails { dateToTest shouldBeBefore dateBefore }
            }
        }
    }
    given("the shouldBeOnOrAfter method") {
        on("passing an earlier date") {
            it("should pass") {
                val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)
                val dateBefore = dateToTest.minusDays(1)

                dateToTest shouldBeOnOrAfter dateBefore
            }
        }
        on("passing the same date") {
            it("should pass") {
                val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)

                dateToTest shouldBeOnOrAfter dateToTest
            }
        }
        on("passing a later date") {
            it("should fail") {
                val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)
                val dateAfter = dateToTest.plusDays(1)

                assertFails { dateToTest shouldBeOnOrAfter dateAfter }
            }
        }
    }
    given("the shouldBeOnOrBefore method") {
        on("passing a later date") {
            it("should pass") {
                val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)
                val dateAfter = dateToTest.plusDays(1)

                dateToTest shouldBeOnOrBefore dateAfter
            }
        }
        on("passing the same date") {
            it("should pass") {
                val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)

                dateToTest shouldBeOnOrBefore dateToTest
            }
        }
        on("passing an earlier date") {
            it("should fail") {
                val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)
                val dateBefore = dateToTest.minusDays(1)

                assertFails { dateToTest shouldBeOnOrBefore dateBefore }
            }
        }
    }
    given("the shouldBeOn method") {
        on("passing the correct day") {
            it("should pass") {
                val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)

                dateToTest shouldBeOn DayOfWeek.WEDNESDAY
            }
        }
        on("passing an incorrect day") {
            it("should fail") {
                val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)

                assertFails { dateToTest shouldBeOn DayOfWeek.MONDAY }
            }
        }
    }
    given("the shouldBeIn method") {
        on("passing the correct month") {
            it("should pass") {
                val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)

                dateToTest shouldBeIn Month.MARCH
            }
        }
        on("passing an incorrect month") {
            it("should fail") {
                val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)

                assertFails { dateToTest shouldBeIn Month.APRIL }
            }
        }
    }
    given("the shouldBeInYear method") {
        on("passing the correct year") {
            it("should pass") {
                val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)

                dateToTest shouldBeInYear 2017
            }
        }
        on("passing an incorrect year") {
            it("should fail") {
                val dateToTest = LocalDateTime.of(2017, 3, 1, 10, 0)

                assertFails { dateToTest shouldBeInYear 2018 }
            }
        }
    }
    given("the shouldBe x.days after method") {
        val orderDate = LocalDateTime.of(2017, 6, 5, 10, 0)
        on("passing a date which is exactly x days after") {
            val shippingDate = LocalDateTime.of(2017, 6, 10, 10, 0)
            it("should pass") {
                shippingDate shouldBe 5.days() after orderDate
            }
        }
        on("passing a date which is more than x days after") {
            val shippingDate = LocalDateTime.of(2017, 6, 15, 10, 0)
            it("should fail") {
                assertFails { shippingDate shouldBe 5.days() after orderDate }
            }
        }
        on("passing a date which is less than x days after") {
            val shippingDate = LocalDateTime.of(2017, 6, 7, 10, 0)
            it("should fail") {
                assertFails { shippingDate shouldBe 5.days() after orderDate }
            }
        }
    }
    given("the shouldBeAtLeast x.days after method") {
        val orderDate = LocalDateTime.of(2017, 6, 5, 10, 0)
        on("passing a date which is exactly x days after") {
            val shippingDate = LocalDateTime.of(2017, 6, 10, 10, 0)
            it("should pass") {
                shippingDate shouldBeAtLeast 5.days() after orderDate
            }
        }
        on("passing a date which is more than x days after") {
            val shippingDate = LocalDateTime.of(2017, 6, 15, 10, 0)
            it("should pass") {
                shippingDate shouldBeAtLeast 5.days() after orderDate
            }
        }
        on("passing a date which is less than x days after") {
            val shippingDate = LocalDateTime.of(2017, 6, 7, 10, 0)
            it("should fail") {
                assertFails { shippingDate shouldBeAtLeast 5.days() after orderDate }
            }
        }
    }
    given("the shouldBeAtMost x.days after method") {
        val orderDate = LocalDateTime.of(2017, 6, 5, 10, 0)
        on("passing a date which is exactly x days after") {
            val shippingDate = LocalDateTime.of(2017, 6, 10, 10, 0)
            it("should pass") {
                shippingDate shouldBeAtMost 5.days() after orderDate
            }
        }
        on("passing a date which is more than x days after") {
            val shippingDate = LocalDateTime.of(2017, 6, 15, 10, 0)
            it("should fail") {
                assertFails { shippingDate shouldBeAtMost 5.days() after orderDate }
            }
        }
        on("passing a date which is less than x days after") {
            val shippingDate = LocalDateTime.of(2017, 6, 7, 10, 0)
            it("should pass") {
                shippingDate shouldBeAtMost 5.days() after orderDate
            }
        }
    }
    given("the shouldBe x.days before method") {
        val orderDate = LocalDateTime.of(2017, 6, 15, 10, 0)
        on("passing a date which is exactly x days before") {
            val shippingDate = LocalDateTime.of(2017, 6, 10, 10, 0)
            it("should pass") {
                shippingDate shouldBe 5.days() before orderDate
            }
        }
        on("passing a date which is more than x days before") {
            val shippingDate = LocalDateTime.of(2017, 6, 9, 10, 0)
            it("should fail") {
                assertFails { shippingDate shouldBe 5.days() before orderDate }
            }
        }
        on("passing a date which is less than x days before") {
            val shippingDate = LocalDateTime.of(2017, 6, 12, 10, 0)
            it("should fail") {
                assertFails { shippingDate shouldBe 5.days() before orderDate }
            }
        }
    }
    given("the shouldBeAtLeast x.days before method") {
        val orderDate = LocalDateTime.of(2017, 6, 15, 10, 0)
        on("passing a date which is exactly x before after") {
            val shippingDate = LocalDateTime.of(2017, 6, 10, 10, 0)
            it("should pass") {
                shippingDate shouldBeAtLeast 5.days() before orderDate
            }
        }
        on("passing a date which is more than x days before") {
            val shippingDate = LocalDateTime.of(2017, 6, 9, 10, 0)
            it("should pass") {
                shippingDate shouldBeAtLeast 5.days() before orderDate
            }
        }
        on("passing a date which is less than x days before") {
            val shippingDate = LocalDateTime.of(2017, 6, 12, 10, 0)
            it("should fail") {
                assertFails { shippingDate shouldBeAtLeast 5.days() before orderDate }
            }
        }
    }
    given("the shouldBeAtMost x.days before method") {
        val orderDate = LocalDateTime.of(2017, 6, 15, 10, 0)
        on("passing a date which is exactly x days before") {
            val shippingDate = LocalDateTime.of(2017, 6, 10, 10, 0)
            it("should pass") {
                shippingDate shouldBeAtMost 5.days() before orderDate
            }
        }
        on("passing a date which is more than x days before") {
            val shippingDate = LocalDateTime.of(2017, 6, 5, 10, 0)
            it("should fail") {
                assertFails { shippingDate shouldBeAtMost 5.days() before orderDate }
            }
        }
        on("passing a date which is less than x days before") {
            val shippingDate = LocalDateTime.of(2017, 6, 7, 10, 0)
            it("should fail") {
                assertFails { shippingDate shouldBeAtMost 5.days() before orderDate }
            }
        }
    }
    given("the shouldBe after method") {
        val loginTime = LocalDateTime.of(2017, 1, 10, 10, 59)
        on("passing a time 5 minutes after") {
            val orderTime = LocalDateTime.of(2017, 1, 10, 11, 4)
            it("should pass") {
                orderTime shouldBe 5.minutes() after loginTime
            }
        }
        on("passing a time 6 minutes after") {
            val orderTime = LocalDateTime.of(2017, 1, 10, 11, 5)
            it("should fail") {
                assertFails { orderTime shouldBe 5.minutes() after loginTime }
            }
        }
    }
    given("the shouldBe before method") {
        val loginTime = LocalDateTime.of(2017, 1, 10, 10, 59)
        on("passing a time 5 minutes before") {
            val orderTime = LocalDateTime.of(2017, 1, 10, 10, 54)
            it("should pass") {
                orderTime shouldBe 5.minutes() before loginTime
            }
        }
        on("passing a time 6 minutes before") {
            val orderTime = LocalDateTime.of(2017, 1, 10, 10, 53)
            it("should fail") {
                assertFails { orderTime shouldBe 5.minutes() before loginTime }
            }
        }
    }
    given("the shouldBeAtLeast after method") {
        val loginTime = LocalDateTime.of(2017, 1, 10, 10, 59)
        on("passing a time 5 minutes after") {
            val orderTime = LocalDateTime.of(2017, 1, 10, 11, 4)
            it("should pass testing for at least 3 minutes") {
                orderTime shouldBeAtLeast 3.minutes() after loginTime
            }
        }
        on("passing a time 5 minutes after") {
            val orderTime = LocalDateTime.of(2017, 1, 10, 11, 4)
            it("should fail testing for at least 6 minutes") {
                assertFails { orderTime shouldBeAtLeast 6.minutes() after loginTime }
            }
        }
    }
    given("the shouldBeAtLeast before method") {
        val loginTime = LocalDateTime.of(2017, 1, 10, 10, 54)
        on("passing a time 5 minutes before") {
            val orderTime = LocalDateTime.of(2017, 1, 10, 10, 59)
            it("should pass testing for at least 3 minutes") {
                loginTime shouldBeAtLeast 3.minutes() before orderTime
            }
        }
        on("passing a time 6 minutes before") {
            val orderTime = LocalDateTime.of(2017, 1, 10, 10, 53)
            it("should fail testing for at least 7 minutes") {
                assertFails { loginTime shouldBeAtLeast 7.minutes() before orderTime }
            }
        }
    }
    given("the shouldBeAtMost before method") {
        val orderTime = LocalDateTime.of(2017, 1, 10, 10, 10)
        on("passing a time matching exactly at most 5 minutes before") {
            val loginTime = LocalDateTime.of(2017, 1, 10, 10, 5)
            it("should pass") {
                loginTime shouldBeAtMost 5.minutes() before orderTime
            }
        }
        on("passing a time within 5 minutes before") {
            val loginTime = LocalDateTime.of(2017, 1, 10, 10, 8)
            it("should pass") {
                loginTime shouldBeAtMost 5.minutes() before orderTime
            }
        }
        on("passing a time more than 5 minutes before") {
            val loginTime = LocalDateTime.of(2017, 1, 10, 10, 0)
            it("should fail") {
                assertFails { loginTime shouldBeAtMost 5.minutes() before orderTime }
            }
        }
    }
    given("the shouldBeAtMost after method") {
        val loginTime = LocalDateTime.of(2017, 1, 10, 10, 10)
        on("passing a time matching exactly at most 5 minutes after") {
            val orderTime = LocalDateTime.of(2017, 1, 10, 10, 15)
            it("should pass") {
                orderTime shouldBeAtMost 5.minutes() after loginTime
            }
        }
        on("passing a time within 5 minutes before") {
            val orderTime = LocalDateTime.of(2017, 1, 10, 10, 12)
            it("should pass") {
                orderTime shouldBeAtMost 5.minutes() after loginTime
            }
        }
        on("passing a time more than 5 minutes before") {
            val orderTime = LocalDateTime.of(2017, 1, 10, 10, 20)
            it("should fail") {
                assertFails { orderTime shouldBeAtMost 5.minutes() after loginTime }
            }
        }
    }
    given("the Int.hours() extension") {
        val loginTime = LocalDateTime.of(2017, 1, 10, 10, 0)
        val orderTime = LocalDateTime.of(2017, 1, 10, 11, 0)
        on("testing for 1 hour after") {
            it("should pass") {
                orderTime shouldBe 1.hours() after loginTime
            }
        }
        on("testing for 2 hours after") {
            it("should fail") {
                assertFails { orderTime shouldBe 2.hours() after loginTime }
            }
        }
    }
    given("the Int.seconds() extension") {
        val loginTime = LocalDateTime.of(2017, 1, 10, 10, 0, 30)
        val orderTime = LocalDateTime.of(2017, 1, 10, 10, 0, 45)
        on("testing for 15 seconds after") {
            it("should pass") {
                orderTime shouldBe 15.seconds() after loginTime
            }
        }
        on("testing for 30 seconds after") {
            it("should fail") {
                assertFails { orderTime shouldBe 30.seconds() after loginTime }
            }
        }
        on("checking a time with minute overlay") {
            it("should pass given the correct seconds") {
                val logoutTime = LocalDateTime.of(2017, 1, 10, 10, 1, 15)
                logoutTime shouldBe 45.seconds() after loginTime
            }
        }
    }
})

