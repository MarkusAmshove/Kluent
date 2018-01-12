package org.amshove.kluent.tests.backtickassertions

import org.amshove.kluent.`should be equal to`
import org.amshove.kluent.`should not be null`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotBeNullTests : Spek({
    given("the `should not be null` method") {
        on("passing a non null reference") {
            it("should pass") {
                val str: String? = "Hello"
                str.`should not be null`()
            }
        }
        it("should return a non nullable version") {
            val str: String? = "Hello"
            val notNull = str.`should not be null`()
            notNull.length.`should be equal to`(5)
        }
        on("passing a null reference") {
            it("should fail") {
                val str: String? = null
                assertFails({ str.`should not be null`() })
            }
        }
    }
})
