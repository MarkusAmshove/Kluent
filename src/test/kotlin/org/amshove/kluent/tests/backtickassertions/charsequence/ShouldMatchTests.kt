package org.amshove.kluent.tests.backtickassertions.charsequence

import org.amshove.kluent.`should match`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldMatchTests: Spek({
    given("the should match method") {
        on("checking if a correct string matches a regex represented by a pattern") {
            it("should pass") {
                "1234" `should match` "\\d+"
            }
        }
        on("checking if a correct string matches a regex represented by a Regex") {
            it("should pass") {
                "1234" `should match` Regex("\\d+")
            }
        }
        on("checking if an incorrect string matches a regex represented by a pattern") {
            it("should fail") {
                assertFails { "abc" `should match` "\\d+" }
            }
        }
        on("checking if an incorrect string matches a regex represented by a Regex") {
            it("should fail") {
                assertFails { "abc" `should match` Regex("\\d+") }
            }
        }
    }
})
