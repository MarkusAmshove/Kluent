package org.amshove.kluent.tests.assertions.charsequence

import org.amshove.kluent.shouldContainSome
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldContainSomeTests : Spek({
    given("the shouldContainSome method") {
        on("testing if a string contains some substrings") {
            it("should pass") {
                val message = "I love to write fluent tests"
                val otherStrings = listOf("Berlin", "write")

                message shouldContainSome otherStrings
            }
        }
        on("testing if a string contains some substrings which it doesn't contain") {
            it("should fail") {
                val message = "I love to write fluent tests"
                val otherStrings = listOf("testing", "writing", "code")

                assertFails { message shouldContainSome otherStrings }
            }
        }
    }
})