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
})

