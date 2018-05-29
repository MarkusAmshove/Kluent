package org.amshove.kluent.tests.backtickassertions.charsequence

import org.amshove.kluent.`should not be blank`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotBeBlankTests : Spek({
    given("the `should not be blank` method") {
        on("passing a non blank CharSequence") {
            it("should pass") {
                "   a   ".`should not be blank`()
            }
        }
        on("passing a blank CharSequence") {
            it("should fail") {
                assertFails({ "     ".`should not be blank`() })
            }
        }
    }
})
