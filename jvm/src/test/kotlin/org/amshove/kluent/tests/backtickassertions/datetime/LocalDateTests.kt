package org.amshove.kluent.tests.backtickassertions.datetime

import org.amshove.kluent.*
import org.jetbrains.spek.api.Spek
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.Month
import kotlin.test.assertFails

class LocalDateTests : Spek({
    given("the `should be after` method") {
        on("passing an earlier date") {
            it("should pass") {
                val dateToTest = LocalDate.of(2017, 3, 1)
                val dateBefore = dateToTest.minusDays(1)

                dateToTest `should be after` dateBefore
            }
        }
        on("passing a later date") {
            it("should fail") {
                val dateToTest = LocalDate.of(2017, 3, 1)
                val dateAfter = dateToTest.plusDays(1)

                assertFails { dateToTest `should be after` dateAfter }
            }
        }
    }
    given("the `should be before` method") {
        on("passing a later date") {
            it("should pass") {
                val dateToTest = LocalDate.of(2017, 3, 1)
                val dateAfter = dateToTest.plusDays(1)

                dateToTest `should be before` dateAfter
            }
        }
        on("passing an earlier date") {
            it("should fail") {
                val dateToTest = LocalDate.of(2017, 3, 1)
                val dateBefore = dateToTest.minusDays(1)

                assertFails { dateToTest `should be before` dateBefore }
            }
        }
    }
    given("the `should be on or after` method") {
        on("passing an earlier date") {
            it("should pass") {
                val dateToTest = LocalDate.of(2017, 3, 1)
                val dateBefore = dateToTest.minusDays(1)

                dateToTest `should be on or after` dateBefore
            }
        }
        on("passing the same date") {
            it("should pass") {
                val dateToTest = LocalDate.of(2017, 3, 1)

                dateToTest `should be on or after` dateToTest
            }
        }
        on("passing a later date") {
            it("should fail") {
                val dateToTest = LocalDate.of(2017, 3, 1)
                val dateAfter = dateToTest.plusDays(1)

                assertFails { dateToTest `should be on or after` dateAfter }
            }
        }
    }
    given("the `should be on or before` method") {
        on("passing a later date") {
            it("should pass") {
                val dateToTest = LocalDate.of(2017, 3, 1)
                val dateAfter = dateToTest.plusDays(1)

                dateToTest `should be on or before` dateAfter
            }
        }
        on("passing the same date") {
            it("should pass") {
                val dateToTest = LocalDate.of(2017, 3, 1)

                dateToTest `should be on or before` dateToTest
            }
        }
        on("passing an earlier date") {
            it("should fail") {
                val dateToTest = LocalDate.of(2017, 3, 1)
                val dateBefore = dateToTest.minusDays(1)

                assertFails { dateToTest `should be on or before` dateBefore }
            }
        }
    }
    given("the `should be on` method") {
        on("passing the correct day") {
            it("should pass") {
                val dateToTest = LocalDate.of(2017, 3, 1)

                dateToTest `should be on` DayOfWeek.WEDNESDAY
            }
        }
        on("passing an incorrect day") {
            it("should fail") {
                val dateToTest = LocalDate.of(2017, 3, 1)

                assertFails { dateToTest `should be on` DayOfWeek.MONDAY }
            }
        }
    }
    given("the `should not be on` method") {
        on("passing a day it is not on") {
            it("should pass") {
                val dateToTest = LocalDate.of(2017, 3, 1)

                dateToTest `should not be on` DayOfWeek.THURSDAY
            }
        }
        on("passing the day it is on") {
            it("should fail") {
                val dateToTest = LocalDate.of(2017, 3, 1)

                assertFails { dateToTest `should not be on` DayOfWeek.WEDNESDAY }
            }
        }
    }
    given("the `should be in` method") {
        on("passing the correct month") {
            it("should pass") {
                val dateToTest = LocalDate.of(2017, 3, 1)

                dateToTest `should be in` Month.MARCH
            }
        }
        on("passing an incorrect month") {
            it("should fail") {
                val dateToTest = LocalDate.of(2017, 3, 1)

                assertFails { dateToTest `should be in` Month.APRIL }
            }
        }
    }
    given("the `should not be in` method") {
        on("passing a month it is not in") {
            it("should pass") {
                val dateToTest = LocalDate.of(2017, 3, 1)

                dateToTest `should not be in` Month.APRIL
            }
        }
        on("passing the month it is in") {
            it("should fail") {
                val dateToTest = LocalDate.of(2017, 3, 1)

                assertFails { dateToTest `should not be in` Month.MARCH }
            }
        }
    }
    given("the `should be in year` method") {
        on("passing the correct year") {
            it("should pass") {
                val dateToTest = LocalDate.of(2017, 3, 1)

                dateToTest `should be in year` 2017
            }
        }
        on("passing an incorrect year") {
            it("should fail") {
                val dateToTest = LocalDate.of(2017, 3, 1)

                assertFails { dateToTest `should be in year` 2018 }
            }
        }
    }
    given("the `should not be in year` method") {
        on("passing a year it is not in") {
            it("should pass") {
                val dateToTest = LocalDate.of(2017, 3, 1)

                dateToTest `should not be in year` 2015
            }
        }
        on("passing the year it is in") {
            it("should fail") {
                val dateToTest = LocalDate.of(2017, 3, 1)

                assertFails { dateToTest `should not be in year` 2017 }
            }
        }
    }
    given("the `should be` x.days after method") {
        val orderDate = LocalDate.of(2017, 6, 5)
        on("passing a date which is exactly x days after") {
            val shippingDate = LocalDate.of(2017, 6, 10)
            it("should pass") {
                shippingDate `should be` 5.days() after orderDate
            }
        }
        on("passing a date which is more than x days after") {
            val shippingDate = LocalDate.of(2017, 6, 15)
            it("should fail") {
                assertFails { shippingDate `should be` 5.days() after orderDate }
            }
        }
        on("passing a date which is less than x days after") {
            val shippingDate = LocalDate.of(2017, 6, 7)
            it("should fail") {
                assertFails { shippingDate `should be` 5.days() after orderDate }
            }
        }
    }
    given("the `should be at least` x.days after method") {
        val orderDate = LocalDate.of(2017, 6, 5)
        on("passing a date which is exactly x days after") {
            val shippingDate = LocalDate.of(2017, 6, 10)
            it("should pass") {
                shippingDate `should be at least` 5.days() after orderDate
            }
        }
        on("passing a date which is more than x days after") {
            val shippingDate = LocalDate.of(2017, 6, 15)
            it("should pass") {
                shippingDate `should be at least` 5.days() after orderDate
            }
        }
        on("passing a date which is less than x days after") {
            val shippingDate = LocalDate.of(2017, 6, 7)
            it("should fail") {
                assertFails { shippingDate `should be at least` 5.days() after orderDate }
            }
        }
    }
    given("the `should be at most` x.days after method") {
        val orderDate = LocalDate.of(2017, 6, 5)
        on("passing a date which is exactly x days after") {
            val shippingDate = LocalDate.of(2017, 6, 10)
            it("should pass") {
                shippingDate `should be at most` 5.days() after orderDate
            }
        }
        on("passing a date which is more than x days after") {
            val shippingDate = LocalDate.of(2017, 6, 15)
            it("should fail") {
                assertFails { shippingDate `should be at most` 5.days() after orderDate }
            }
        }
        on("passing a date which is less than x days after") {
            val shippingDate = LocalDate.of(2017, 6, 7)
            it("should pass") {
                shippingDate `should be at most` 5.days() after orderDate
            }
        }
    }
    given("the `should be` x.days before method") {
        val orderDate = LocalDate.of(2017, 6, 15)
        on("passing a date which is exactly x days before") {
            val shippingDate = LocalDate.of(2017, 6, 10)
            it("should pass") {
                shippingDate `should be` 5.days() before orderDate
            }
        }
        on("passing a date which is more than x days before") {
            val shippingDate = LocalDate.of(2017, 6, 9)
            it("should fail") {
                assertFails { shippingDate `should be` 5.days() before orderDate }
            }
        }
        on("passing a date which is less than x days before") {
            val shippingDate = LocalDate.of(2017, 6, 12)
            it("should fail") {
                assertFails { shippingDate `should be` 5.days() before orderDate }
            }
        }
    }
    given("the `should be at least` x.days before method") {
        val orderDate = LocalDate.of(2017, 6, 15)
        on("passing a date which is exactly x before after") {
            val shippingDate = LocalDate.of(2017, 6, 10)
            it("should pass") {
                shippingDate `should be at least` 5.days() before orderDate
            }
        }
        on("passing a date which is more than x days before") {
            val shippingDate = LocalDate.of(2017, 6, 9)
            it("should pass") {
                shippingDate `should be at least` 5.days() before orderDate
            }
        }
        on("passing a date which is less than x days before") {
            val shippingDate = LocalDate.of(2017, 6, 12)
            it("should fail") {
                assertFails { shippingDate `should be at least` 5.days() before orderDate }
            }
        }
    }
    given("the `should be at most` x.days before method") {
        val orderDate = LocalDate.of(2017, 6, 15)
        on("passing a date which is exactly x days before") {
            val shippingDate = LocalDate.of(2017, 6, 10)
            it("should pass") {
                shippingDate `should be at most` 5.days() before orderDate
            }
        }
        on("passing a date which is more than x days before") {
            val shippingDate = LocalDate.of(2017, 6, 5)
            it("should fail") {
                assertFails { shippingDate `should be at most` 5.days() before orderDate }
            }
        }
        on("passing a date which is less than x days before") {
            val shippingDate = LocalDate.of(2017, 6, 7)
            it("should fail") {
                assertFails { shippingDate `should be at most` 5.days() before orderDate }
            }
        }
    }
})

