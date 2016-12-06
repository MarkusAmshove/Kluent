package org.amshove.kluent.tests.assertions.charsequence

import org.amshove.kluent.shouldNotMatch
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotMatchTests: Spek({
    given("the should not match method") {
        on("checking if a correct string matches a regex represented by a pattern") {
            it("should fail") {
                assertFails { "1234".shouldNotMatch("\\d+") }
            }
        }
        on("checking if a correct string matches a regex represented by a Regex") {
            it("should fail") {
                assertFails { "1234".shouldNotMatch(Regex("\\d+")) }
            }
        }
        on("checking if an incorrect string matches a regex represented by a pattern") {
            it("should pass") {
                "abc".shouldNotMatch("\\d+")
            }
        }
        on("checking if an incorrect string matches a regex represented by a Regex") {
            it("should pass") {
                "abc".shouldNotMatch(Regex("\\d+"))
            }
        }
    }
})
