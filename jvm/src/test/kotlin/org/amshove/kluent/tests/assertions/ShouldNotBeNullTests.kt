package org.amshove.kluent.tests.assertions

import org.amshove.kluent.shouldEqualTo
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
            it("should return a non nullable version") {
                val str: String? = "Hello"
                val notNull = str.shouldNotBeNull()
                notNull.length.shouldEqualTo(5)
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
