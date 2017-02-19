package org.amshove.kluent.tests.assertions.charsequence

import org.amshove.kluent.shouldNotBeEmpty
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotBeEmptyTests : Spek({
    given("the shouldNotBeEmpty() method") {
        on("passing a non empty CharSequence") {
            it("should pass") {
                "test".shouldNotBeEmpty()
            }
        }
        on("passing an empty CharSequence") {
            it("should fail") {
                assertFails({ "".shouldNotBeEmpty() })
            }
        }
    }
})
