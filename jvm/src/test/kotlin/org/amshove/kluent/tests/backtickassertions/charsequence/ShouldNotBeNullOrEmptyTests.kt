package org.amshove.kluent.tests.backtickassertions.charsequence

import org.amshove.kluent.`should not be null or empty`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotBeNullOrEmptyTests : Spek({
    given("the `should not be null or empty` method") {
        on("passing a non empty CharSequence") {
            it("should pass") {
                "abc".`should not be null or empty`()
            }
        }
        on("passing an empty CharSequence") {
            it("should fail") {
                assertFails({ "".`should not be null or empty`() })
            }
        }
        on("passing a null CharSequence") {
            it("should fail") {
                val str : String? = null
                assertFails({ str.`should not be null or empty`() })
            }
        }
    }
})
