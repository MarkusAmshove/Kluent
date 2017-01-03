package org.amshove.kluent.tests.assertions.numerical

import org.amshove.kluent.shouldNotBeGreaterOrEqualTo
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails


class ShouldNotBeGreaterOrEqualTo : Spek({
    given("the `should not be greater or equal than` method") {
        on("passing a lesser value") {
            it("should pass") {
                2.shouldNotBeGreaterOrEqualTo(5)
            }
        }
        on("passing a greater value") {
            it("should fail") {
                assertFails({ 5.shouldNotBeGreaterOrEqualTo(2) })
            }
        }
        on("passing an equal value") {
            it("should fail") {
                assertFails({ 5.shouldNotBeGreaterOrEqualTo(5) })
            }
        }
    }
})
