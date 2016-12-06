package org.amshove.kluent.tests.assertions.charsequence

import org.amshove.kluent.shouldNotContain
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails


class ShouldNotContainTests : Spek({
    given("the should not contain method") {
        on("checking a string which doesn't contain a substring") {
            it("should pass") {
                "Hello".shouldNotContain("bye")
            }
        }
        on("checking a string which does contain a substring") {
            it("should fail") {
                assertFails( { "Bye".shouldNotContain("ye") })
            }
        }
    }
})
