package org.amshove.kluent.tests.assertions.charsequence

import org.amshove.kluent.shouldBeNullOrBlank
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBeNullOrBlankTests : Spek({
    given("the shouldBeNullOrBlank method") {
        on("passing a blank CharSequence") {
            it("should pass") {
                "   ".shouldBeNullOrBlank()
            }
        }
        on("passing a null CharSequence") {
            it("should pass") {
                val str: String? = null
                str.shouldBeNullOrBlank()
            }
        }
        on("passing a non blank CharSequence") {
            it("should fail") {
                assertFails({ "abc".shouldBeNullOrBlank() })
            }
        }
    }
})
