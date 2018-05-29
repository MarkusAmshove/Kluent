package org.amshove.kluent.tests.assertions

import org.amshove.kluent.shouldContainSome
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldContainSomeTests : Spek({
    given("the shouldContainSome method") {
        on("testing a list which contains at least one element") {
            it("should pass") {
                val cities = listOf("Israel", "Berlin", "Phoenix", "Egypt")
                val actual = listOf("Berlin", "Stuttgart")

                actual shouldContainSome cities
            }
        }
        on("testing a list which doesn't contain at least one element") {
            it("should fail") {
                val cities = listOf("Israel", "Phoenix", "Egypt")
                val actual = listOf("Berlin", "Stuttgart")

                assertFails { actual shouldContainSome cities }
            }
        }
        on("testing if a list contains a subset of an array") {
            it("should pass") {
                val cities = arrayOf("Israel", "Phoenix", "Berlin", "Egypt")
                val actual = listOf("Berlin", "Stuttgart")

                actual.shouldContainSome(cities)
            }
        }
    }
})