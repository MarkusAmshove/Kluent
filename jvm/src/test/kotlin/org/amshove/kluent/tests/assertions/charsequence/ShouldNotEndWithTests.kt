package org.amshove.kluent.tests.assertions.charsequence

import org.amshove.kluent.shouldNotEndWith
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails


class ShouldNotEndWithTests : Spek({
    given("the should not end with method") {
        on("checking a string which ends with a substring") {
            it("should fail") {
                assertFails({ "Hello".shouldNotEndWith("llo") })
            }
        }
        on("checking for a string which doesn't end with a substring") {
            it("should pass") {
                "Bye".shouldNotEndWith("Asd")
            }
        }
    }
})
