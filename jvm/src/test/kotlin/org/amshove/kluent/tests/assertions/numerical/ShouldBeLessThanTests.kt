package org.amshove.kluent.tests.assertions.numerical

import org.amshove.kluent.shouldBeLessThan
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBeLessThanTests : Spek({
    given("the should be less than method") {
        on("checking a lesser value") {
            it("should pass") {
                2.shouldBeLessThan(5)
            }
        }
        on("checking an equal value") {
            it("should fail") {
                assertFails({ 5.shouldBeLessThan(5) })
            }
        }
        on("checking a greater value") {
            it("should fail") {
                assertFails({ 5.shouldBeLessThan(2) })
            }
        }
    }
})
