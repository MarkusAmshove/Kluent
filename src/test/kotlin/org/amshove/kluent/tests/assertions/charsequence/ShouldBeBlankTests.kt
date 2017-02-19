package org.amshove.kluent.tests.assertions.charsequence

import org.amshove.kluent.shouldBeBlank
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBeBlankTests : Spek({
    given("the shouldBeBlank method") {
        on("passing a blank CharSequence") {
            it("should pass") {
                "         ".shouldBeBlank()
            }
        }
        on("passing a non blank CharSequence") {
            it("should fail") {
                assertFails({ "   a    ".shouldBeBlank() })
            }
        }
    }
})
