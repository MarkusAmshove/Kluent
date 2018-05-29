package org.amshove.kluent.tests.assertions

import org.amshove.kluent.shouldContainNone
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldContainNoneTests : Spek({
    given("the shouldContainNone method") {
        on("testing a list which doesn't contain at least one element") {
            it("should pass") {
                val cities = listOf("Israel", "Phoenix", "Egypt")
                val actual = listOf("Berlin", "Stuttgart")

                actual shouldContainNone cities
            }
        }
        on("testing a list which contains at least one element") {
            it("should fail") {
                val cities = listOf("Israel", "Phoenix", "Stuttgart", "Egypt")
                val actual = listOf("Berlin", "Stuttgart")

                assertFails { actual shouldContainNone cities }
            }
        }
    }
})
