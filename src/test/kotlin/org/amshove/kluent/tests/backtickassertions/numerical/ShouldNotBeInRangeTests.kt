package org.amshove.kluent.tests.backtickassertions.numerical

import org.amshove.kluent.`should not be in range`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotBeInRangeTests : Spek({
    given("the should not be in range method") {
        on("checking a value which is not in range") {
            it("should passe with lower and upper bound") {
                5.`should not be in range`(6, 9)
            }
            it("should pass with an IntRange") {
                5.`should not be in range`(6..9)
            }
        }
        on("checking a value within the range") {
            it("should fail with lower and upper bound") {
                assertFails { 7.`should not be in range`(0, 10) }
            }
            it("should fail with lower an IntRange") {
                assertFails { 7.`should not be in range`(0..10) }
            }
        }
        on("checking a value which is the lower bound") {
            it("should fail with lower and upper bound") {
                assertFails { 5.`should not be in range`(5, 6) }
            }
            it("should fail with lower an IntRange") {
                assertFails { 5.`should not be in range`(5..6) }
            }
        }
        on("checking a value which is the upper bound") {
            it("should fail with lower and upper bound") {
                assertFails { 5.`should not be in range`(2, 5) }
            }
            it("should fail with an IntRange") {
                assertFails { 5.`should not be in range`(2..5) }
            }
        }
    }
})
