package org.amshove.kluent.tests.assertions.charsequence

import org.amshove.kluent.shouldEndWith
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails


class ShouldEndWithTests : Spek({
    given("the should end with method") {
        on("checking a string which ends with a substring") {
            it("should pass") {
                "Hello".shouldEndWith("llo")
            }
        }
        on("checking for a string which doesn't end with a substring") {
            it("should fail") {
                assertFails({ "Bye".shouldEndWith("ay") })
            }
        }
    }
})
