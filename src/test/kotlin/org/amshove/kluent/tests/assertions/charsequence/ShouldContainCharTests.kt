package org.amshove.kluent.tests.assertions.charsequence

import org.amshove.kluent.shouldContain
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldContainCharTests : Spek({
    given("the shouldContain assertion") {
        on("calling shouldContain on a Sequence that contains the Character") {
            it("should pass") {
                "Hello".shouldContain('H')
            }
        }
        on("calling shouldContain on a Sequence that doesn't contain the Character") {
            it("should fail") {
                assertFails {
                    "Hello".shouldContain('a')
                }
            }
        }
    }
})