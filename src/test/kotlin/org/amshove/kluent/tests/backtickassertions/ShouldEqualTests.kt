package org.amshove.kluent.tests.backtickassertions

import org.amshove.kluent.`should equal`
import org.amshove.kluent.tests.helpclasses.Person
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldEqualTests : Spek() {
    init {
        given("the should equal method") {
            on("checking equality of two equal strings") {
                it("should pass") {
                    "hello world" `should equal` "hello world"
                }
            }
            on("checking equality of two strings with unequal values") {
                it("should fail") {
                    assertFails({ "hello word!" `should equal` "hello" })
                }
            }
            on("checking different types") {
                it("should fail") {
                    assertFails({ "hello world" `should equal`  5 })
                }
            }
            on("checking two data objects with same values") {
                val firstObject = Person("Jon", "Doe")
                val secondObject = Person("Jon", "Doe")
                it("should pass") {
                    firstObject `should equal` secondObject
                }
            }
        }
    }
}
