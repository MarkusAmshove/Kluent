package org.amshove.kluent.tests.backtickassertions.numerical

import org.amshove.kluent.`should be less or equal to`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBeLessOrEqualToTests : Spek({
    given("the `should be less or equal to` method") {
        on("checking a lesser value") {
            it("should pass") {
                2 `should be less or equal to` 2
            }
        }
        on("checking an equal value") {
            it("should pass") {
                5 `should be less or equal to` 5
            }
        }
        on("checking a greater value") {
            it("should fail") {
                assertFails({ 5 `should be less or equal to` 2 })
            }
        }
    }
})
