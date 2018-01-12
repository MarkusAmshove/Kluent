package org.amshove.kluent.tests.assertions

import org.amshove.kluent.shouldBeTrue
import org.amshove.kluent.tests.assertMessage
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBeTrueTests : Spek({
    given("the shouldBeTrue method") {
        on("passing true") {
            it("should pass") {
                true.shouldBeTrue()
            }
        }
        on("passing false") {
            it("should fail") {
                assertFails({ false.shouldBeTrue() })
            }
        }
        on("failing") {
            it("should provide a descriptive message") {
                assertMessage("Expected value to be true, but was false") { false.shouldBeTrue() }
            }
        }
    }
})
