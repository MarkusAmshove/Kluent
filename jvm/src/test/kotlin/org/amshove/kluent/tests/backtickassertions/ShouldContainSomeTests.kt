package org.amshove.kluent.tests.backtickassertions

import org.amshove.kluent.`should contain some`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldContainSomeTests : Spek({
    given("the shouldContainSome method") {
        on("testing a list which contains at least one element") {
            it("should pass") {
                val cities = listOf("Israel", "Berlin", "Phoenix", "Egypt")
                val actual = listOf("Berlin", "Stuttgart")

                actual `should contain some` cities
            }
        }
        on("testing a list which doesn't contain at least one element") {
            it("should fail") {
                val cities = listOf("Israel", "Phoenix", "Egypt")
                val actual = listOf("Berlin", "Stuttgart")

                assertFails { actual `should contain some` cities }
            }
        }
    }
})