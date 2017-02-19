package org.amshove.kluent.tests.backtickassertions.charsequence

import org.amshove.kluent.`should be blank`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBeBlankTests : Spek({
    given("the `should be blank` method") {
        on("passing a blank CharSequence") {
            it("should pass") {
                "        ".`should be blank`()
            }
        }
        on("passing a non blank CharSequence") {
            it("should fail") {
                assertFails({ "      a  ".`should be blank`() })
            }
        }
    }
})
