package org.amshove.kluent.tests.assertions.charsequence

import org.amshove.kluent.shouldContainAll
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldContainAllTests : Spek({
    given("the shouldContainAll method") {
        on("passing a List which is contained") {
            it("should pass") {
                "1,2,3" shouldContainAll listOf("1", "2", "3")
            }
        }

        on("passing an List where one item is not contained") {
            it("should fail") {
                assertFails {
                    "1,2,3" shouldContainAll listOf("1", "4")
                }
            }
        }
    }
})