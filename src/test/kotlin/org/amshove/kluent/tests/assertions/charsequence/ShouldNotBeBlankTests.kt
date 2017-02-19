package org.amshove.kluent.tests.assertions.charsequence

import org.amshove.kluent.shouldNotBeBlank
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotBeBlankTests : Spek({
    given("the shouldNotBeBlank method") {
        on("passing a non blank CharSequence") {
            it("should pass") {
                "        a   ".shouldNotBeBlank()
            }
        }
        on("passing a blank CharSequence") {
            it("should fail") {
                assertFails({ "          ".shouldNotBeBlank() })
            }
        }
    }
})
