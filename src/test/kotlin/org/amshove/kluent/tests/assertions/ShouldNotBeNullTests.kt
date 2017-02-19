package org.amshove.kluent.tests.assertions

import org.amshove.kluent.shouldNotBeNull
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotBeNullTests : Spek({
    given("the shouldNotBeNull method") {
        on("passing a non null reference") {
            it("should pass") {
                val str: String? = "Hello"
                str.shouldNotBeNull()
            }
        }
        on("passing a null reference") {
            it("should fail") {
                val str: String? = null
                assertFails({ str.shouldNotBeNull() })
            }
        }
    }
})
