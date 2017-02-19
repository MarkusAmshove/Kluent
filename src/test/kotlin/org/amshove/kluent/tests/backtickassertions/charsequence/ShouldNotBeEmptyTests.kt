package org.amshove.kluent.tests.backtickassertions.charsequence

import org.amshove.kluent.`should not be empty`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotBeEmptyTests : Spek({
    given("the `should not be empty` method") {
        on("passing a non empty CharSequence") {
            it("should pass") {
                "Hello!".`should not be empty`()
            }
        }
        on("passing an empty CharSequence") {
            it("should fail") {
                assertFails({ "".`should not be empty`() })
            }
        }
    }
})
