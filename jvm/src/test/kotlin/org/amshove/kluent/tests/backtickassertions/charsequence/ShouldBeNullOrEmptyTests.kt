package org.amshove.kluent.tests.backtickassertions.charsequence

import org.amshove.kluent.`should be null or empty`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBeNullOrEmptyTests : Spek({
    given("the `should be null or empty` method") {
        on("passing an empty CharSequence") {
            it("should pass") {
                "".`should be null or empty`()
            }
        }
        on("passing a null CharSequence") {
            it("should pass") {
                val str: String? = null
                str.`should be null or empty`()
            }
        }
        on("passing a non empty CharSequence") {
            it("should fail") {
                assertFails({ "  abc".`should be null or empty`() })
            }
        }
    }
})
