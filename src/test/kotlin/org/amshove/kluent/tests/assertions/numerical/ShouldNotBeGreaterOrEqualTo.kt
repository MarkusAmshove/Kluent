package org.amshove.kluent.tests.assertions.numerical

import org.amshove.kluent.shouldNotBeGreaterOrEqualTo
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails


class ShouldNotBeGreaterOrEqualTo : Spek({
    given("the `should not be greater or equal than` method") {
        on("checking a lesser value") {
            it("should pass") {
                2.shouldNotBeGreaterOrEqualTo(5)
            }
        }
        on("checking a greater value") {
            it("should fail") {
                assertFails({ 5.shouldNotBeGreaterOrEqualTo(2) })
            }
        }
        on("checking an equal value") {
            it("should fail") {
                assertFails({ 5.shouldNotBeGreaterOrEqualTo(5) })
            }
        }
    }
})
