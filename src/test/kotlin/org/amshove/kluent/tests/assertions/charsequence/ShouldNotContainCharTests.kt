package org.amshove.kluent.tests.assertions.charsequence

import org.amshove.kluent.shouldNotContain
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotContainCharTests : Spek({
    given("the shouldNotContain assertion") {
        on("calling shouldNotContain on a Sequence that doesn't contain the Character") {
            it("should pass") {
                "Hello".shouldNotContain('a')
            }
        }
        on("calling shouldNotContain on a Sequence that contains the Character") {
            it("should fail") {
                assertFails {
                    "Hello".shouldNotContain('H')
                }
            }
        }
    }
})
