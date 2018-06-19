package org.amshove.kluent.tests.backtickassertions.numerical

import org.amshove.kluent.`should not be less or equal to`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails


class ShouldNotBeLessOrEqualTo : Spek({
    given("the `should not be less or equal to` method") {
        on("checking a greater value") {
            it("should pass") {
                5 `should not be less or equal to` 2
            }
        }
        on("checking a lesser value") {
            it("should fail") {
                assertFails({ 2 `should not be less or equal to` 5 })
            }
        }
        on("checking an equal value") {
            it("should fail") {
                assertFails({ 5 `should not be less or equal to` 5 })
            }
        }
    }
})
