package org.amshove.kluent.tests.backtickassertions.numerical

import org.amshove.kluent.`should be greater or equal to`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBeGreaterOrEqualToTests : Spek({
    given("the `should be greater or equal than` method") {
        on("checking a greater value") {
            it("should pass") {
                5 `should be greater or equal to` 2
            }
        }
        on("checking an equal value") {
            it("should pass") {
                5 `should be greater or equal to` 5
            }
        }
        on("checking a lesser value") {
            it("should fail") {
                assertFails({ 2 `should be greater or equal to` 5 })
            }
        }
    }
})
