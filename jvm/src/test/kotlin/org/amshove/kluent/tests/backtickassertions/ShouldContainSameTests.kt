package org.amshove.kluent.tests.backtickassertions

import org.amshove.kluent.`should contain same`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldContainSameTests : Spek({
    given("the shouldContainSame method") {
        on("testing a list which contains all the same elements") {
            it("should pass") {
                val cities = listOf("Israel", "Berlin", "Phoenix")
                val actual = listOf("Israel", "Phoenix", "Berlin")

                actual `should contain same` cities
            }
        }
        on("testing a short array which contains all the same elements") {
            it("should pass") {
                val numbers = shortArrayOf(1, 2, 3)
                val actual = shortArrayOf(1, 3, 2)

                actual `should contain same` numbers
            }
        }
        on("testing a list which contains only 2 of the 3 elements") {
            it("should pass") {
                val cities = listOf("Israel", "Berlin", "Phoenix")
                val actual = listOf("Israel", "Berlin", "Liverpool")

                assertFails { actual `should contain same` cities }
            }
        }
    }
})
