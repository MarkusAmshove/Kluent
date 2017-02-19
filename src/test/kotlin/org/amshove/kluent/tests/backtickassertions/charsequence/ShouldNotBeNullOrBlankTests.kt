package org.amshove.kluent.tests.backtickassertions.charsequence

import org.amshove.kluent.`should not be null or blank`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotBeNullOrBlankTests : Spek({
    given("the `should not be null or blank` method") {
        on("passing a non blank CharSequence") {
            it("should pass") {
                "a".`should not be null or blank`()
            }
        }
        on("passing a blank CharSequence") {
            it("should fail") {
                assertFails({ "   ".`should not be null or blank`() })
            }
        }
        on("passing a null CharSequence") {
            it("should fail") {
                val str: String? = null
                assertFails({ str.`should not be null or blank`() })
            }
        }
    }
})
