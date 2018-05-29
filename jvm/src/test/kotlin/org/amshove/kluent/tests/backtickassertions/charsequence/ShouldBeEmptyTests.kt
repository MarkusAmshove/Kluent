package org.amshove.kluent.tests.backtickassertions.charsequence

import org.amshove.kluent.`should be empty`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBeEmptyTests : Spek({
    given("the `should be empty` method") {
        on("passing an empty CharSequence") {
            it("should pass") {
                "".`should be empty`()
            }
        }
        on("passing a non empty CharSequence") {
            it("should fail") {
                assertFails({ "hello".`should be empty`() })
            }
        }
    }
})
