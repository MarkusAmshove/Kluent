package org.amshove.kluent.tests

import org.amshove.kluent.`should be`
import org.amshove.kluent.`should equal`
import org.amshove.kluent.tests.helpclasses.Person
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class AssertionsShould : Spek() {
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
        }

        given("the should be method") {
            on("checking objects with the same reference") {
                val firstObject = Person("Jon", "Doe")
                val secondObject = firstObject
                it("should pass") {
                    firstObject `should be` secondObject
                }
            }
            on("checking different objects") {
                val firstObject = Person("Foo", "Bar")
                val secondObject = Person("Foo", "Bar")
                it("should fail") {
                    assertFails({firstObject `should be` secondObject})
                }
            }
        }
    }
}


