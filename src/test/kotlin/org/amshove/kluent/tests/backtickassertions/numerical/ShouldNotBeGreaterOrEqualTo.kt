package org.amshove.kluent.tests.backtickassertions.numerical

import org.amshove.kluent.`should not be greater or equal to`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails


class ShouldNotBeGreaterOrEqualTo : Spek({
    given("the `should not be greater or equal to` method") {
        on("checking a lesser value") {
            it("should pass") {
                2 `should not be greater or equal to` 5
            }
        }
        on("checking a greater value") {
            it("should fail") {
                assertFails({ 5 `should not be greater or equal to` 2 })
            }
        }
        on("checking an equal value") {
            it("should fail") {
                assertFails({ 5 `should not be greater or equal to` 5 })
            }
        }
    }
})
