package org.amshove.kluent.tests.backtickassertions.charsequence

import org.amshove.kluent.`should contain`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldContainCharTests : Spek({
    given("the `should contain` assertion") {
        on("calling `should contain` on a Sequence that contains the Character") {
            it("should pass") {
                "Hello".`should contain`('H')
            }
        }
        on("calling `should contain` on a Sequence that doesn't contain the Character") {
            it("should fail") {
                assertFails {
                    "Hello".`should contain`('a')
                }
            }
        }
    }
})
