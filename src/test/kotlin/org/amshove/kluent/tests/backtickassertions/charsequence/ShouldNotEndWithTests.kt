package org.amshove.kluent.tests.backtickassertions.charsequence

import org.amshove.kluent.`should not end with`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails


class ShouldNotEndWithTests : Spek({
    given("the should not end with method") {
        on("checking a string which ends with a substring") {
            it("should fail") {
                assertFails( {"Hello" `should not end with` "llo" })
            }
        }
        on("checking for a string which doesn't end with a substring") {
            it("should pass") {
                "Bye" `should not end with` "Asd"
            }
        }
    }
})
