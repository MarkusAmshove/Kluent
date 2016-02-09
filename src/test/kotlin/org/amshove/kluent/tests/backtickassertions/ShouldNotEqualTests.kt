package org.amshove.kluent.tests.backtickassertions

import org.amshove.kluent.`should not equal`
import org.amshove.kluent.tests.helpclasses.Person
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotEqualTests : Spek() {
    init {
        given("the should equal method") {
            on("checking equality of two equal strings") {
                it("should fail") {
                    assertFails({ "hello world" `should not equal` "hello world" })
                }
            }
            on("checking equality of two strings with unequal values") {
                it("should pass") {
                    "hello word!" `should not equal` "hello"
                }
            }
            on("checking different types") {
                it("should pass") {
                    "hello world" `should not equal`  5
                }
            }
            on("checking two data objects with same values") {
                val firstObject = Person("Jon", "Doe")
                val secondObject = Person("Jon", "Doe")
                it("should fail") {
                    assertFails({ firstObject `should not equal` secondObject })
                }
            }
        }
    }
}
