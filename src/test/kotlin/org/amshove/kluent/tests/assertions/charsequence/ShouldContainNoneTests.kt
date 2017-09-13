package org.amshove.kluent.tests.assertions.charsequence

import org.amshove.kluent.shouldContainNone
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldContainNoneTests : Spek({
    given("the shouldContainNone method") {
        on("testing if a string contains some substrings which it doesn't contain") {
            it("should pass") {
                val message = "I love to write fluent tests"
                val otherStrings = listOf("testing", "writing", "code")

                message shouldContainNone otherStrings
            }
        }
        on("testing if a string contains some substrings") {
            it("should fail") {
                val message = "I love to write fluent tests"
                val otherStrings = listOf("Berlin", "write")

                assertFails { message shouldContainNone otherStrings }
            }
        }
    }
})