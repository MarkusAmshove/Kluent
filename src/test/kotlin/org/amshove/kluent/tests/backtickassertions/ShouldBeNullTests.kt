package org.amshove.kluent.tests.backtickassertions

import org.amshove.kluent.`should be null`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBeNullTests : Spek({
    given("the `should be null` method") {
        on("passing a null reference") {
            it("should pass") {
                val str: String? = null
                str.`should be null`()
            }
        }
        on("passing a non null reference") {
            it("should fail") {
                val str: String? = "Hello"
                    assertFails({ str.`should be null`() })
                }
            }
    }
})
