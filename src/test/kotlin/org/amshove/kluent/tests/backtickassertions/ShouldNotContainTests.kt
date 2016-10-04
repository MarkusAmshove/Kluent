package org.amshove.kluent.tests.backtickassertions

import org.amshove.kluent.`should not contain`
import org.amshove.kluent.tests.getFailure
import org.amshove.kluent.tests.helpclasses.Person
import org.jetbrains.spek.api.Spek
import kotlin.test.assertEquals
import kotlin.test.assertFails

class ShouldNotContainTests : Spek({
    given("the should not contain method") {
        on("checking an array with the value") {
            val array = arrayOf("Hello", "World", "Wide", "Web")
            it("should fail") {
                assertFails({ array `should not contain` "Wide" })
            }
        }
        on("checking an array without the value") {
            val array = arrayOf("Hello", "Wide", "Web")
            it("should pass") {
                array `should not contain` "World"
            }
            it("should format the array") {
                val theFailure = getFailure { array `should not contain` "Wide" }
                assertEquals("Hello, Wide, Web", theFailure.actual)
            }
        }
        on("checking any iterable for an object") {
            val alice = Person("Alice", "Bob")
            val jon = Person("Jon", "Doe")
            val list = listOf(alice, jon)
            it("should fail") {
                assertFails({ list `should not contain` jon })
            }
        }
        on("checking any iterable for an object which isn't contained") {
            val alice = Person("Alice", "Bob")
            val jon = Person("Jon", "Doe")
            val list = listOf(alice)
            it("should pass") {
                list `should not contain` jon
            }
            it("should format the output") {
                val failure = getFailure { list `should not contain` alice }
                assertEquals("Person(name=Alice, surname=Bob)", failure.actual)
            }
        }
    }
})
