package org.amshove.kluent.tests.assertions.charsequence

import org.amshove.kluent.shouldMatch
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldMatchTests : Spek({
    given("the should match method") {
        on("checking if a correct string matches a regex represented by a pattern") {
            it("should pass") {
                "1234".shouldMatch("\\d+")
            }
        }
        on("checking if a correct string matches a regex represented by a Regex") {
            it("should pass") {
                "1234".shouldMatch(Regex("\\d+"))
            }
        }
        on("checking if an incorrect string matches a regex represented by a pattern") {
            it("should fail") {
                assertFails { "abc".shouldMatch("\\d+") }
            }
        }
        on("checking if an incorrect string matches a regex represented by a Regex") {
            it("should fail") {
                assertFails { "abc".shouldMatch(Regex("\\d+")) }
            }
        }
    }
})
