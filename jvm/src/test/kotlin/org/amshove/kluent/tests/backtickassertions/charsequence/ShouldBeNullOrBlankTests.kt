package org.amshove.kluent.tests.backtickassertions.charsequence

import org.amshove.kluent.`should be null or blank`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBeNullOrBlankTests : Spek({
    given("the `should be null or blank` method") {
        on("passing a blank CharSequence") {
            it("should pass") {
                "   ".`should be null or blank`()
            }
        }
        on("passing a null CharSequence") {
            it("should pass") {
                val str: String? = null
                str.`should be null or blank`()
            }
        }
        on("passing a non blank CharSequence") {
            it("should fail") {
                assertFails({ "a".`should be null or blank`() })
            }
        }
    }
})
