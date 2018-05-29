package org.amshove.kluent.tests.assertions

import org.amshove.kluent.shouldNotBeEmpty
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotBeEmptyTests : Spek({
    given("the shouldNotBeEmpty method") {
        on("passing a non empty array") {
            it("should pass") {
                val arr = arrayOf("Hi")
                arr.shouldNotBeEmpty()
            }
        }
        on("passing a non empty iterable") {
            it("should pass") {
                val iterable = listOf("Hi")
                iterable.shouldNotBeEmpty()
            }
        }
        on("passing a non empty map") {
            it("should pass") {
                val map = mapOf(1 to "Hi")
                map.shouldNotBeEmpty()
            }
        }
        on("passing an empty array") {
            it("should fail") {
                val arr = arrayOf<String>()
                assertFails({ arr.shouldNotBeEmpty() })
            }
        }
        on("passing an empty iterable") {
            it("should fail") {
                val iterable: Iterable<String> = listOf()
                assertFails({ iterable.shouldNotBeEmpty() })
            }
        }
        on("passing an empty map") {
            it("should fail") {
                val map = mapOf<Int, String>()
                assertFails({ map.shouldNotBeEmpty() })
            }
        }
    }
})
