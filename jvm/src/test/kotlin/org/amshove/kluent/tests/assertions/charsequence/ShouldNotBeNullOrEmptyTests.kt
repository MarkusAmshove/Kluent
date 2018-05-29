package org.amshove.kluent.tests.assertions.charsequence

import org.amshove.kluent.shouldNotBeNullOrEmpty
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotBeNullOrEmptyTests : Spek({
    given("the shouldNotBeNullOrEmpty method") {
        on("passing a non empty CharSequence") {
            it("should pass") {
                "abc".shouldNotBeNullOrEmpty()
            }
        }
        on("passing an empty CharSequence") {
            it("should fail") {
                assertFails({ "".shouldNotBeNullOrEmpty() })
            }
        }
        on("passing a null CharSequence") {
            it("should fail") {
                val str: String? = null
                assertFails({ str.shouldNotBeNullOrEmpty() })
            }
        }
        on("checking a nullable string") {
            it("should return non null") {
                val nullable: String? = "is this null?"
                val result: String = nullable.shouldNotBeNullOrEmpty()
            }
        }
    }
})
