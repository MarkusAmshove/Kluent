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
})

