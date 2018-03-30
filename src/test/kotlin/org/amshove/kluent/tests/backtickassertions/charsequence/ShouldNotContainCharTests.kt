package org.amshove.kluent.tests.backtickassertions.charsequence

import org.amshove.kluent.`should not contain`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotContainCharTests : Spek({
    given("the `should not contain` assertion") {
        on("calling `should not contain` on a Sequence that doesn't contain the Character") {
            it("should pass") {
                "Hello".`should not contain`('a')
            }
        }
        on("calling `should not contain` on a Sequence that contains the Character") {
            it("should fail") {
                assertFails {
                    "Hello".`should not contain`('H')
                }
            }
        }
    }
})
