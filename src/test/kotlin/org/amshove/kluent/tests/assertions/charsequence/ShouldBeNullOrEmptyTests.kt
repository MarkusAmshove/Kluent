package org.amshove.kluent.tests.assertions.charsequence

import org.amshove.kluent.shouldBeNullOrEmpty
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBeNullOrEmptyTests : Spek({
    given("the shouldBeNullOrEmpty method") {
        on("passing an empty CharSequence") {
            it("should pass") {
                "".shouldBeNullOrEmpty()
            }
        }
        on("passing a null CharSequence") {
            it("should pass") {
                val str: String? = null
                str.shouldBeNullOrEmpty()
            }
        }
        on("passing a non empty CharSequence") {
            it("should fail") {
                assertFails({ " abc".shouldBeNullOrEmpty() })
            }
        }
    }
})
