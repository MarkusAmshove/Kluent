package org.amshove.kluent.tests.backtickassertions.numerical

import org.amshove.kluent.`should be positive`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBePositiveTests : Spek({
    given("the should be positive method") {
        on("checking a positive value") {
            it("should pass") {
                5.`should be positive`()
            }
        }
        on("checking a negative value") {
            it("should fail") {
                assertFails({ (-5).`should be positive`() })
            }
        }
        on("checking 0") {
            it("should fail") {
                assertFails({ 0.`should be positive`() })
            }
        }
    }
})
