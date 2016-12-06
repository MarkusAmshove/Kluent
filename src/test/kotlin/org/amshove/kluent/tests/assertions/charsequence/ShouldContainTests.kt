package org.amshove.kluent.tests.assertions.charsequence

import org.amshove.kluent.shouldContain
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails


class ShouldContainTests : Spek({
    given("the should contain method") {
        on("checking a string which contains a substring") {
            it("should pass") {
                "Hello".shouldContain("ll")
            }
        }
        on("checking a string which doesn't contain a substring") {
            it("should fail") {
                assertFails({ "Bye".shouldContain("hello") })
            }
        }
    }
})
