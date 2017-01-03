package org.amshove.kluent.tests.assertions.numerical

import org.amshove.kluent.shouldBeLessOrEqualTo
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBeLessOrEqualToTests : Spek({
    given("the should be less or equal to method") {
        on("checking a lesser value") {
            it("should pass") {
                2.shouldBeLessOrEqualTo(2)
            }
        }
        on("checking an equal value") {
            it("should pass") {
                5.shouldBeLessOrEqualTo(5)
            }
        }
        on("checking a greater value") {
            it("should fail") {
                assertFails({ 5.shouldBeLessOrEqualTo(2) })
            }
        }
    }
})
