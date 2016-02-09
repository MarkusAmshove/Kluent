package org.amshove.kluent.tests.assertions

import org.amshove.kluent.shouldBe
import org.amshove.kluent.tests.helpclasses.Person
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBeTests : Spek() {
    init {
        given("the shouldBe method") {
            on("checking objects with the same reference") {
                val firstObject = Person("Jon", "Doe")
                val secondObject = firstObject
                it("should pass") {
                    firstObject shouldBe secondObject
                }
            }
            on("checking different objects") {
                val firstObject = Person("Foo", "Bar")
                val secondObject = Person("Foo", "Bar")
                it("should fail") {
                    assertFails({ firstObject shouldBe secondObject })
                }
            }
        }
    }
}



