package org.amshove.kluent.tests.backtickassertions.numerical

import org.amshove.kluent.`should be in range`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBeInRangeTests : Spek({
    given("the should be in range method") {
        on("checking a value within the range") {
            it("should pass with lower and upper bound") {
                5.`should be in range`(0, 10)
            }
            it("should pass with an IntRange") {
                5.`should be in range`(0..10)
            }
        }
        on("checking a value which is the lower bound") {
            it("should pass with lower and upper bound") {
                5.`should be in range`(5, 6)
            }
            it("should pass with an IntRange") {
                5.`should be in range`(5..6)
            }
        }
        on("checking a value which is the upper bound") {
            it("should pass with lower and upper bound") {
                5.`should be in range`(2, 5)
            }
            it("should pass with an IntRange") {
                5.`should be in range`(2..5)
            }
        }
        on("checking a value which is not in range") {
            it("should fail with lower and upper bound") {
                assertFails { 5.`should be in range`(6, 9) }
            }
            it("should fail with an IntRange") {
                assertFails { 5.`should be in range`(6..9) }
            }
        }
    }
})
