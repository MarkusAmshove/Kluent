package org.amshove.kluent.tests.assertions.datetime

import org.amshove.kluent.*
import org.jetbrains.spek.api.Spek
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.Month
import kotlin.test.assertFails

class LocalDateTests : Spek({
    given("the shouldBeAfter method") {
        on("passing an earlier date") {
            it("should pass") {
                val dateToTest = LocalDate.of(2017, 3, 1)
                val dateBefore = dateToTest.minusDays(1)

                dateToTest shouldBeAfter dateBefore
            }
        }
        on("passing a later date") {
            it("should fail") {
                val dateToTest = LocalDate.of(2017, 3, 1)
                val dateAfter = dateToTest.plusDays(1)

                assertFails { dateToTest shouldBeAfter dateAfter }
            }
        }
    }
    given("the shouldBeBefore method") {
        on("passing a later date") {
            it("should pass") {
                val dateToTest = LocalDate.of(2017, 3, 1)
                val dateAfter = dateToTest.plusDays(1)

                dateToTest shouldBeBefore dateAfter
            }
        }
        on("passing an earlier date") {
            it("should fail") {
                val dateToTest = LocalDate.of(2017, 3, 1)
                val dateBefore = dateToTest.minusDays(1)

                assertFails { dateToTest shouldBeBefore dateBefore }
            }
        }
    }
    given("the shouldBeOnOrAfter method") {
        on("passing an earlier date") {
            it("should pass") {
                val dateToTest = LocalDate.of(2017, 3, 1)
                val dateBefore = dateToTest.minusDays(1)

                dateToTest shouldBeOnOrAfter dateBefore
            }
        }
        on("passing the same date") {
            it("should pass") {
                val dateToTest = LocalDate.of(2017, 3, 1)

                dateToTest shouldBeOnOrAfter dateToTest
            }
        }
        on("passing a later date") {
            it("should fail") {
                val dateToTest = LocalDate.of(2017, 3, 1)
                val dateAfter = dateToTest.plusDays(1)

                assertFails { dateToTest shouldBeOnOrAfter dateAfter }
            }
        }
    }
    given("the shouldBeOnOrBefore method") {
        on("passing a later date") {
            it("should pass") {
                val dateToTest = LocalDate.of(2017, 3, 1)
                val dateAfter = dateToTest.plusDays(1)

                dateToTest shouldBeOnOrBefore dateAfter
            }
        }
        on("passing the same date") {
            it("should pass") {
                val dateToTest = LocalDate.of(2017, 3, 1)

                dateToTest shouldBeOnOrBefore dateToTest
            }
        }
        on("passing an earlier date") {
            it("should fail") {
                val dateToTest = LocalDate.of(2017, 3, 1)
                val dateBefore = dateToTest.minusDays(1)

                assertFails { dateToTest shouldBeOnOrBefore dateBefore }
            }
        }
    }
    given("the shouldBeOn method") {
        on("passing the correct day") {
            it("should pass") {
                val dateToTest = LocalDate.of(2017, 3, 1)

                dateToTest shouldBeOn DayOfWeek.WEDNESDAY
            }
        }
        on("passing an incorrect day") {
            it("should fail") {
                val dateToTest = LocalDate.of(2017, 3, 1)

                assertFails { dateToTest shouldBeOn DayOfWeek.MONDAY }
            }
        }
    }
    given("the shouldNotBeOn method") {
        on("passing a day it is not on") {
            it("should pass") {
                val dateToTest = LocalDate.of(2017, 3, 1)

                dateToTest shouldNotBeOn DayOfWeek.THURSDAY
            }
        }
        on("passing the day it is on") {
            it("should fail") {
                val dateToTest = LocalDate.of(2017, 3, 1)

                assertFails { dateToTest shouldNotBeOn DayOfWeek.WEDNESDAY }
            }
        }
    }
    given("the shouldBeIn method") {
        on("passing the correct month") {
            it("should pass") {
                val dateToTest = LocalDate.of(2017, 3, 1)

                dateToTest shouldBeIn Month.MARCH
            }
        }
        on("passing an incorrect month") {
            it("should fail") {
                val dateToTest = LocalDate.of(2017, 3, 1)

                assertFails { dateToTest shouldBeIn Month.APRIL }
            }
        }
    }
    given("the shouldNotBeIn method") {
        on("passing a month it is not in") {
            it("should pass") {
                val dateToTest = LocalDate.of(2017, 3, 1)

                dateToTest shouldNotBeIn Month.APRIL
            }
        }
        on("passing the month it is in") {
            it("should fail") {
                val dateToTest = LocalDate.of(2017, 3, 1)

                assertFails { dateToTest shouldNotBeIn Month.MARCH }
            }
        }
    }
    given("the shouldBeInYear method") {
        on("passing the correct year") {
            it("should pass") {
                val dateToTest = LocalDate.of(2017, 3, 1)

                dateToTest shouldBeInYear 2017
            }
        }
        on("passing an incorrect year") {
            it("should fail") {
                val dateToTest = LocalDate.of(2017, 3, 1)

                assertFails { dateToTest shouldBeInYear 2018 }
            }
        }
    }
    given("the shouldNotBeInYear method") {
        on("passing a year it is not in") {
            it("should pass") {
                val dateToTest = LocalDate.of(2017, 3, 1)

                dateToTest shouldNotBeInYear 2015
            }
        }
        on("passing the year it is in") {
            it("should fail") {
                val dateToTest = LocalDate.of(2017, 3, 1)

                assertFails { dateToTest shouldNotBeInYear 2017 }
            }
        }
    }
    given("the shouldBe x.days after method") {
        val orderDate = LocalDate.of(2017, 6, 5)
        on("passing a date which is exactly x days after") {
            val shippingDate = LocalDate.of(2017, 6, 10)
            it("should pass") {
                shippingDate shouldBe 5.days() after orderDate
            }
        }
        on("passing a date which is more than x days after") {
            val shippingDate = LocalDate.of(2017, 6, 15)
            it("should fail") {
                assertFails { shippingDate shouldBe 5.days() after orderDate }
            }
        }
        on("passing a date which is less than x days after") {
            val shippingDate = LocalDate.of(2017, 6, 7)
            it("should fail") {
                assertFails { shippingDate shouldBe 5.days() after orderDate }
            }
        }
    }
    given("the shouldBeAtLeast x.days after method") {
        val orderDate = LocalDate.of(2017, 6, 5)
        on("passing a date which is exactly x days after") {
            val shippingDate = LocalDate.of(2017, 6, 10)
            it("should pass") {
                shippingDate shouldBeAtLeast 5.days() after orderDate
            }
        }
        on("passing a date which is more than x days after") {
            val shippingDate = LocalDate.of(2017, 6, 15)
            it("should pass") {
                shippingDate shouldBeAtLeast 5.days() after orderDate
            }
        }
        on("passing a date which is less than x days after") {
            val shippingDate = LocalDate.of(2017, 6, 7)
            it("should fail") {
                assertFails { shippingDate shouldBeAtLeast 5.days() after orderDate }
            }
        }
    }
    given("the shouldBeAtMost x.days after method") {
        val orderDate = LocalDate.of(2017, 6, 5)
        on("passing a date which is exactly x days after") {
            val shippingDate = LocalDate.of(2017, 6, 10)
            it("should pass") {
                shippingDate shouldBeAtMost 5.days() after orderDate
            }
        }
        on("passing a date which is more than x days after") {
            val shippingDate = LocalDate.of(2017, 6, 15)
            it("should fail") {
                assertFails { shippingDate shouldBeAtMost 5.days() after orderDate }
            }
        }
        on("passing a date which is less than x days after") {
            val shippingDate = LocalDate.of(2017, 6, 7)
            it("should pass") {
                shippingDate shouldBeAtMost 5.days() after orderDate
            }
        }
    }
    given("the shouldBe x.days before method") {
        val orderDate = LocalDate.of(2017, 6, 15)
        on("passing a date which is exactly x days before") {
            val shippingDate = LocalDate.of(2017, 6, 10)
            it("should pass") {
                shippingDate shouldBe 5.days() before orderDate
            }
        }
        on("passing a date which is more than x days before") {
            val shippingDate = LocalDate.of(2017, 6, 9)
            it("should fail") {
                assertFails { shippingDate shouldBe 5.days() before orderDate }
            }
        }
        on("passing a date which is less than x days before") {
            val shippingDate = LocalDate.of(2017, 6, 12)
            it("should fail") {
                assertFails { shippingDate shouldBe 5.days() before orderDate }
            }
        }
    }
    given("the shouldBeAtLeast x.days before method") {
        val orderDate = LocalDate.of(2017, 6, 15)
        on("passing a date which is exactly x before after") {
            val shippingDate = LocalDate.of(2017, 6, 10)
            it("should pass") {
                shippingDate shouldBeAtLeast 5.days() before orderDate
            }
        }
        on("passing a date which is more than x days before") {
            val shippingDate = LocalDate.of(2017, 6, 9)
            it("should pass") {
                shippingDate shouldBeAtLeast 5.days() before orderDate
            }
        }
        on("passing a date which is less than x days before") {
            val shippingDate = LocalDate.of(2017, 6, 12)
            it("should fail") {
                assertFails { shippingDate shouldBeAtLeast 5.days() before orderDate }
            }
        }
    }
    given("the shouldBeAtMost x.days before method") {
        val orderDate = LocalDate.of(2017, 6, 15)
        on("passing a date which is exactly x days before") {
            val shippingDate = LocalDate.of(2017, 6, 10)
            it("should pass") {
                shippingDate shouldBeAtMost 5.days() before orderDate
            }
        }
        on("passing a date which is more than x days before") {
            val shippingDate = LocalDate.of(2017, 6, 5)
            it("should fail") {
                assertFails { shippingDate shouldBeAtMost 5.days() before orderDate }
            }
        }
        on("passing a date which is less than x days before") {
            val shippingDate = LocalDate.of(2017, 6, 7)
            it("should fail") {
                assertFails { shippingDate shouldBeAtMost 5.days() before orderDate }
            }
        }
    }
})

