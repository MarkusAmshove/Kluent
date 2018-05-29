package org.amshove.kluent.tests.assertions.charsequence

import org.amshove.kluent.shouldBeEmpty
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBeEmptyTests : Spek({
    given("the shouldBeEmpty method") {
        on("passing an empty CharSequence") {
            it("should pass") {
                "".shouldBeEmpty()
            }
        }
        on("passing a non empty CharSequence") {
            it("should fail") {
                assertFails({ "test".shouldBeEmpty() })
            }
        }
    }
})
