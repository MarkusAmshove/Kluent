package org.amshove.kluent.tests.backtickassertions.datetime

import org.amshove.kluent.*
import org.jetbrains.spek.api.Spek
import java.time.LocalTime
import kotlin.test.assertFails

class LocalTimeTests : Spek({
    given("the `should be` after method") {
        val loginTime = LocalTime.of(10, 59)
        on("passing a time 5 minutes after") {
            val orderTime = LocalTime.of(11, 4)
            it("should pass") {
                orderTime `should be` 5.minutes() after loginTime
            }
        }
        on("passing a time 6 minutes after") {
            val orderTime = LocalTime.of(11, 5)
            it("should fail") {
                assertFails { orderTime `should be` 5.minutes() after loginTime }
            }
        }
    }
    given("the `should be` before method") {
        val loginTime = LocalTime.of(10, 59)
        on("passing a time 5 minutes before") {
            val orderTime = LocalTime.of(10, 54)
            it("should pass") {
                orderTime `should be` 5.minutes() before loginTime
            }
        }
        on("passing a time 6 minutes before") {
            val orderTime = LocalTime.of(10, 53)
            it("should fail") {
                assertFails { orderTime `should be` 5.minutes() before loginTime }
            }
        }
    }
    given("the `should be at least` after method") {
        val loginTime = LocalTime.of(10, 59)
        on("passing a time 5 minutes after") {
            val orderTime = LocalTime.of(11, 4)
            it("should pass testing for at least 3 minutes") {
                orderTime `should be at least` 3.minutes() after loginTime
            }
        }
        on("passing a time 5 minutes after") {
            val orderTime = LocalTime.of(11, 4)
            it("should fail testing for at least 6 minutes") {
                assertFails { orderTime `should be at least` 6.minutes() after loginTime }
            }
        }
    }
    given("the `should be at least` before method") {
        val loginTime = LocalTime.of(10, 54)
        on("passing a time 5 minutes before") {
            val orderTime = LocalTime.of(10, 59)
            it("should pass testing for at least 3 minutes") {
                loginTime `should be at least` 3.minutes() before orderTime
            }
        }
        on("passing a time 6 minutes before") {
            val orderTime = LocalTime.of(10, 53)
            it("should fail testing for at least 7 minutes") {
                assertFails { loginTime `should be at least` 7.minutes() before orderTime }
            }
        }
    }
    given("the Int.hours() extension") {
        val loginTime = LocalTime.of(10, 0)
        val orderTime = LocalTime.of(11, 0)
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
        val loginTime = LocalTime.of(10, 0, 30)
        val orderTime = LocalTime.of(10, 0, 45)
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
                val logoutTime = LocalTime.of(10, 1, 15)
                logoutTime `should be` 45.seconds() after loginTime
            }
        }
    }
})
