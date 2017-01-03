package org.amshove.kluent.tests.assertions.numerical

import org.amshove.kluent.shouldBeGreaterOrEqualTo
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBeGreaterOrEqualToTests : Spek({
    given("the `should be greater or equal than` method") {
        on("passing a greater value") {
            it("should pass") {
                5.shouldBeGreaterOrEqualTo(2)
            }
        }
        on("passing an equal value") {
            it("should pass") {
                5.shouldBeGreaterOrEqualTo(5)
            }
        }
        on("passing a lesser value") {
            it("should fail") {
                assertFails({ 2.shouldBeGreaterOrEqualTo(5) })
            }
        }
    }
})
