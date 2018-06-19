package org.amshove.kluent.tests.backtickassertions.numerical

import org.amshove.kluent.`should be negative`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBeNegativeTests : Spek({
    given("the should be negative method") {
        on("checking a negative value") {
            it("should pass") {
                (-5).`should be negative`()
            }
        }
        on("checking a positive value") {
            it("should fail") {
                assertFails({ 5.`should be negative`() })
            }
        }
        on("checking 0") {
            it("should fail") {
                assertFails({ 0.`should be negative`() })
            }
        }
    }
})
