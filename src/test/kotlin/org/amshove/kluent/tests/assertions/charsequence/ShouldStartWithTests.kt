package org.amshove.kluent.tests.assertions.charsequence

import org.amshove.kluent.shouldStartWith
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails


class ShouldStartWithTests : Spek({
    given("the should start with method") {
        on("checking a string which starts with a substring") {
            it("should pass") {
                "Hello".shouldStartWith("He")
            }
        }
        on("checking for a string which doesn't start with a substring") {
            it("should fail") {
                assertFails( { "Bye".shouldStartWith("H") })
            }
        }
    }
})
