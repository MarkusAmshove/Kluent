package org.amshove.kluent.tests.assertions.charsequence

import org.amshove.kluent.shouldNotBeNullOrBlank
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotBeNullOrBlankTests : Spek({
    given("the shouldNotBeNullOrBlank method") {
        on("passing a non empty CharSequence") {
            it("should pass") {
                "a".shouldNotBeNullOrBlank()
            }
        }
        on("passing an blank CharSequence") {
            it("should fail") {
                assertFails({ "   ".shouldNotBeNullOrBlank() })
            }
        }
        on("passing a null CharSequence") {
            it("should fail") {
                val str: String? = null
                assertFails({ str.shouldNotBeNullOrBlank() })
            }
        }
    }
})
