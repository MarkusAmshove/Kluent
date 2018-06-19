package org.amshove.kluent.tests.backtickassertions.charsequence

import org.amshove.kluent.`should not contain`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails


class ShouldNotContainTests : Spek({
    given("the should not contain method") {
        on("checking a string which doesn't contain a substring") {
            it("should pass") {
                "Hello" `should not contain` "bye"
            }
        }
        on("checking a string which does contain a substring") {
            it("should fail") {
                assertFails({ "Bye" `should not contain` "ye" })
            }
        }
    }
})
