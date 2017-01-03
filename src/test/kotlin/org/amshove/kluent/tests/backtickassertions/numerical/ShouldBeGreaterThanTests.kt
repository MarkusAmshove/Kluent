package org.amshove.kluent.tests.backtickassertions.numerical

import org.amshove.kluent.`should be greater than`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBeGreaterThanTests : Spek({
    given("the should be greater than method") {
        on("passing a greater value") {
            it("should pass") {
                5 `should be greater than` 2
            }
        }
        on("passing a lesser value") {
            it("should fail") {
                assertFails({ 2 `should be greater than` 5 })
            }
        }
    }
})
