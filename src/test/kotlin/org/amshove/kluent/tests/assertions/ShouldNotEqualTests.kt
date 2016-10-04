package org.amshove.kluent.tests.assertions

import org.amshove.kluent.shouldNotEqual
import org.amshove.kluent.tests.helpclasses.Person
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotEqualTests : Spek({
    given("the shouldEqual method") {
        on("checking equality of two equal strings") {
            it("should fail") {
                assertFails({ "hello world" shouldNotEqual "hello world" })
            }
        }
        on("checking equality of two strings with unequal values") {
            it("should pass") {
                "hello word!" shouldNotEqual "hello"
            }
        }
        on("checking different types") {
            it("should pass") {
                "hello world" shouldNotEqual 5
            }
        }
        on("checking two data objects with same values") {
            val firstObject = Person("Jon", "Doe")
            val secondObject = Person("Jon", "Doe")
            it("should fail") {
                assertFails({ firstObject shouldNotEqual secondObject })
            }
        }
    }
})
