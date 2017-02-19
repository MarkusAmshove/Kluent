package org.amshove.kluent.tests.backtickassertions

import org.amshove.kluent.`should not be empty`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotBeEmptyTests : Spek({
    given("the `should not be empty` method") {
        on("passing a non empty array") {
            it("should pass") {
                val arr = arrayOf("Hi")
                arr.`should not be empty`()
            }
        }
        on("passing a non empty iterable") {
            it("should pass") {
                val iterable = listOf("Hi")
                iterable.`should not be empty`()
            }
        }
        on("passing a non empty map") {
            it("should pass") {
                val map = mapOf(1 to "Hi")
                map.`should not be empty`()
            }
        }
        on("passing an empty array") {
            it("should fail") {
                val arr = arrayOf<String>()
                assertFails({ arr.`should not be empty`() })
            }
        }
        on("passing an empty iterable") {
            it("should fail") {
                val iterable: Iterable<String> = listOf()
                assertFails({ iterable.`should not be empty`() })
            }
        }
        on("passing an empty map") {
            it("should fail") {
                val map = mapOf<Int, String>()
                assertFails({ map.`should not be empty`() })
            }
        }
    }
})
