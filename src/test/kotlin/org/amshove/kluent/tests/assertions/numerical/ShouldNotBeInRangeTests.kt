package org.amshove.kluent.tests.assertions.numerical

import org.amshove.kluent.shouldNotBeInRange
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotBeInRangeTests : Spek({
    given("the should not be in range method") {
        on("checking a value which is not in range") {
            it("should passe") {
                5.shouldNotBeInRange(6, 9)
            }
        }
        on("checking a value within the range") {
            it("should fail") {
                assertFails { 7.shouldNotBeInRange(0, 10) }
            }
        }
        on("checking a value which is the lower bound") {
            it("should fail") {
                assertFails { 5.shouldNotBeInRange(5, 6) }
            }
        }
        on("checking a value which is the upper bound") {
            it("should fail") {
                assertFails { 5.shouldNotBeInRange(2, 5) }
            }
        }
    }
})
