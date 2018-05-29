package org.amshove.kluent.tests.backtickassertions

import org.amshove.kluent.`should be true`
import org.amshove.kluent.tests.assertMessage
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBeTrueTests : Spek({
    given("the `should be true` method") {
        on("passing true") {
            it("should pass") {
                true.`should be true`()
            }
        }
        on("passing false") {
            it("should fail") {
                assertFails({ false.`should be true`() })
            }
        }
        on("failing") {
            it("should provide a descriptive message") {
                assertMessage("Expected value to be true, but was false") { false.`should be true`() }
            }
        }
    }
})
