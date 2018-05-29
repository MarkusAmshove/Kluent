package org.amshove.kluent.tests.assertions.numerical

import org.amshove.kluent.shouldNotBeGreaterThan
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotBeGreaterThan : Spek({
    given("the should not be greater than method") {
        on("checking a lesser value") {
            it("should pass") {
                2.shouldNotBeGreaterThan(5)
            }
        }
        on("checking a greater value") {
            it("should fail") {
                assertFails({ 5.shouldNotBeGreaterThan(2) })
            }
        }
        on("checking an equal value") {
            it("should pass") {
                5.shouldNotBeGreaterThan(5)
                5.toByte().shouldNotBeGreaterThan(5)
                5.toShort().shouldNotBeGreaterThan(5)
                5L.shouldNotBeGreaterThan(5)
                5.0.shouldNotBeGreaterThan(5.0)
                5.0f.shouldNotBeGreaterThan(5.0f)
            }
        }
    }
})
