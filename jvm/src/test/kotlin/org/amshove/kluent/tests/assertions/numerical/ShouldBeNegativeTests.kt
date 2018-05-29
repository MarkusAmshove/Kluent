package org.amshove.kluent.tests.assertions.numerical

import org.amshove.kluent.shouldBeNegative
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBeNegativeTests : Spek({
    given("the should be negative method") {
        on("checking a negative value") {
            it("should pass") {
                (-5).shouldBeNegative()
            }
        }
        on("checking a positive value") {
            it("should fail") {
                assertFails({ 5.shouldBeNegative() })
            }
        }
        on("checking 0") {
            it("should fail") {
                assertFails({ 0.shouldBeNegative() })
            }
        }
    }
})
