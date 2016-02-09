package org.amshove.kluent.tests.backtickassertions

import org.amshove.kluent.`should not be`
import org.amshove.kluent.tests.helpclasses.Person
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotBeTests : Spek() {
    init {
        given("the should be method") {
            on("checking objects with the same reference") {
                val firstObject = Person("Jon", "Doe")
                val secondObject = firstObject
                it("should fail") {
                    assertFails({ firstObject `should not be` secondObject })
                }
            }
            on("checking different objects") {
                val firstObject = Person("Foo", "Bar")
                val secondObject = Person("Foo", "Bar")
                it("should pass") {
                    firstObject `should not be` secondObject
                }
            }
        }
    }
}



