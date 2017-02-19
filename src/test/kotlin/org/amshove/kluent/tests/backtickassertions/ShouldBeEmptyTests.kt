package org.amshove.kluent.tests.backtickassertions

import org.amshove.kluent.`should be empty`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBeEmptyTests : Spek({
    given("the `should be empty` method") {
        on("passing an empty array") {
            it("should pass") {
                val arr = arrayOf<String>()
                arr.`should be empty`()
            }
        }
        on("passing an empty iterable") {
            it("should pass") {
                val iterable: Iterable<String> = listOf()
                iterable.`should be empty`()
            }
        }
        on("passing an empty map") {
            it("should pass") {
                val map = mapOf<Int, String>()
                map.`should be empty`()
            }
        }
        on("passing a non empty array") {
            it("should fail") {
                val arr = arrayOf("Hi")
                assertFails({ arr.`should be empty`() })
            }
        }
        on("passing a non empty iterable") {
            it("should fail") {
                val iterable = listOf("Hi")
                assertFails({ iterable.`should be empty`() })
            }
        }
        on("passing a non empty map") {
            it("should fail") {
                val map = mapOf(1 to "Hi")
                assertFails({ map.`should be empty`() })
            }
        }
    }
})

