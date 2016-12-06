package org.amshove.kluent.tests.backtickassertions.charsequence

import org.amshove.kluent.`should contain`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails


class ShouldContainTests : Spek({
    given("the should contain method") {
        on("checking a string which contains a substring") {
            it("should pass") {
                "Hello" `should contain` "ll"
            }
        }
        on("checking a string which doesn't contain a substring") {
            it("should fail") {
                assertFails( { "Bye" `should contain` "hello" })
            }
        }
    }
})
