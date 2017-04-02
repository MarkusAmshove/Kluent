package org.amshove.kluent.tests.assertions

import org.amshove.kluent.shouldEqual
import org.amshove.kluent.tests.helpclasses.Person
import org.jetbrains.spek.api.Spek
import java.time.Duration
import kotlin.test.assertFails

class ShouldEqualTests : Spek({
    given("the shouldEqual method") {
        on("checking equality of two equal strings") {
            it("should pass") {
                "hello world" shouldEqual "hello world"
            }
        }
        on("checking equality of two strings with unequal values") {
            it("should fail") {
                assertFails({ "hello word!" shouldEqual "hello" })
            }
        }
        on("checking different types") {
            it("should fail") {
                assertFails({ "hello world" shouldEqual 5 })
            }
        }
        on("checking two data objects with same values") {
            val firstObject = Person("Jon", "Doe")
            val secondObject = Person("Jon", "Doe")
            it("should pass") {
                firstObject shouldEqual secondObject
            }
        }
        on("checking two equal arrays") {
            val firstArray = arrayOf(1, 2, 3)
            val secondArray = arrayOf(1, 2, 3)
            it("should pass") {
                firstArray shouldEqual secondArray
            }
        }
        on("checking two different arrays") {
            val firstArray = arrayOf(1, 2, 3)
            val secondArray = arrayOf(4, 5, 6)
            it("should fail") {
                assertFails({ firstArray shouldEqual secondArray })
            }
        }
        on("checking two equal iterables") {
            val firstIterable = listOf(Person("Tom", "Guy"), Person("Alice", "Bob"), Person("Jon", "Doe"))
            val secondIterable = listOf(Person("Tom", "Guy"), Person("Alice", "Bob"), Person("Jon", "Doe"))
            it("should pass") {
                firstIterable shouldEqual secondIterable
            }
        }
        on("checking two different iterables") {
            val firstIterable = listOf(Person("Tom", "Guy"), Person("Jon", "Doe"), Person("Peter", "Meyer"))
            val secondIterable = listOf(Person("Tom", "Guy"), Person("Alice", "Bob"), Person("Jon", "Doe"))
            it("should fail") {
                assertFails({ firstIterable shouldEqual secondIterable })
            }
        }
    }
})
