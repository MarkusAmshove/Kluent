package org.amshove.kluent.tests.backtickassertions.charsequence

import org.amshove.kluent.`should not contain all`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotContainAllTests : Spek({
    given("the shouldNotContainAll method") {
        on("passing a List where some items are not contained") {
            it("should pass") {
                "1, 2, 3" `should not contain all` listOf("1", "2", "4")
            }
        }

        on("passing a List where all items are contained") {
            it("should fail") {
                assertFails {
                    "1 2 3" `should not contain all` listOf("1", "2", "3")
                }
            }
        }
    }
})