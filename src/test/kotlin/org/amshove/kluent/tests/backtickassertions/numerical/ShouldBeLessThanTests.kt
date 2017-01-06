package org.amshove.kluent.tests.backtickassertions.numerical

import org.amshove.kluent.`should be less than`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBeLessThanTests : Spek({
    given("the should be less than method") {
        on("checking a lesser value") {
            it("should pass") {
                2 `should be less than` 5
            }
        }
        on("checking a greater value") {
            it("should fail") {
                assertFails({ 5 `should be less than` 2 })
            }
        }
    }
})
