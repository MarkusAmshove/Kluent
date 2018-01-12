package org.amshove.kluent.tests.assertions

import org.amshove.kluent.shouldBeFalse
import org.amshove.kluent.tests.assertMessage
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBeFalseTests : Spek({
    given("the shouldBeFalse method") {
        on("passing false") {
            it("should pass") {
                false.shouldBeFalse()
            }
        }
        on("passing true") {
            it("should fail") {
                assertFails({ true.shouldBeFalse() })
            }
        }
        on("failing") {
            it("should provide a descriptive message") {
                assertMessage("Expected value to be false, but was true") { true.shouldBeFalse() }
            }
        }
    }
})
