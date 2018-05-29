package org.amshove.kluent.tests.assertions.numerical

import org.amshove.kluent.shouldBePositive
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBePositiveTests : Spek({
    given("the should be positive method") {
        on("checking a positive value") {
            it("should pass") {
                5.shouldBePositive()
            }
        }
        on("checking a negative value") {
            it("should fail") {
                assertFails({ (-5).shouldBePositive() })
            }
        }
        on("checking 0") {
            it("should fail") {
                assertFails({ 0.shouldBePositive() })
            }
        }
    }
})
