package org.amshove.kluent.tests.backtickassertions.numerical

import org.amshove.kluent.`should not be less than`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotBeLessThan : Spek({
    given("the should not be less than method") {
        on("checking a greater value") {
            it("should pass") {
                5 `should not be less than` 2
            }
        }
        on("checking a lesser value") {
            it("should fail") {
                assertFails({ 2 `should not be less than` 5 })
            }
        }
    }
})
