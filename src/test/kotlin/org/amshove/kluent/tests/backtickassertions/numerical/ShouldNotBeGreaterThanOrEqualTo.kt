package org.amshove.kluent.tests.backtickassertions.numerical

import org.amshove.kluent.`should not be greater than or equal to`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails


class ShouldNotBeGreaterThanOrEqualTo : Spek({
    given("the `should not be greater or equal than` method") {
        on("passing a lesser value") {
            it("should pass") {
                2 `should not be greater than or equal to` 5
            }
        }
        on("passing a greater value") {
            it("should fail") {
                assertFails({ 5 `should not be greater than or equal to` 2 })
            }
        }
        on("passing an equal value") {
            it("should fail") {
                assertFails({ 5 `should not be greater than or equal to` 5 })
            }
        }
    }
})
