package org.amshove.kluent.tests

import org.amshove.kluent.`should be`
import org.amshove.kluent.tests.helpclasses.Person
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBeTests : Spek() {
    init {
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
                    assertFails({ firstObject `should be` secondObject })
                }
            }
        }
    }
}



