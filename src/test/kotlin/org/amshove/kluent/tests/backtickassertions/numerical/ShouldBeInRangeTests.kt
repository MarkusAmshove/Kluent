package org.amshove.kluent.tests.backtickassertions.numerical

import org.amshove.kluent.`should be in range`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBeInRangeTests : Spek({
    given("the should be in range method") {
        on("checking a value within the range") {
            it("should pass") {
                5.`should be in range`(0, 10)
            }
        }
        on("checking a value which is the lower bound") {
            it("should pass") {
                5.`should be in range`(5, 6)
            }
        }
        on("checking a value which is the upper bound") {
            it("should pass") {
                5.`should be in range`(2, 5)
            }
        }
        on("checking a value which is not in range") {
            it("should fail") {
                assertFails{ 5.`should be in range`(6, 9) }
            }
        }
    }
})
