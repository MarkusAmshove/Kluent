package org.amshove.kluent.tests.backtickassertions.numerical

import org.amshove.kluent.`should not be greater than`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotBeGreaterThan : Spek({
    given("the should not be greater than method") {
        on("passing a lesser value") {
            it("should pass") {
                2 `should not be greater than` 5
            }
        }
        on("passing a greater value") {
            it("should fail") {
                assertFails({ 5 `should not be greater than` 2 })
            }
        }
    }
})
