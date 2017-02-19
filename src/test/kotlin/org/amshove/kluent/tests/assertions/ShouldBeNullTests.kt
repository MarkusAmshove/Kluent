package org.amshove.kluent.tests.assertions

import org.amshove.kluent.shouldBeNull
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBeNullTests : Spek({
    given("the shouldBeNull method") {
        on("passing a null reference") {
            it("should pass") {
                val obj: Any? = null
                obj.shouldBeNull()
            }
        }
        on("passing a non null reference") {
            it("should fail") {
                val str: String? = "Hello"
                assertFails({ str.shouldBeNull() })
            }
        }
    }
})
