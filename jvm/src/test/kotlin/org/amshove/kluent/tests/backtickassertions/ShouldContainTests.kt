package org.amshove.kluent.tests.backtickassertions

import org.amshove.kluent.`should contain`
import org.amshove.kluent.tests.getFailure
import org.amshove.kluent.tests.helpclasses.Person
import org.jetbrains.spek.api.Spek
import kotlin.test.assertEquals
import kotlin.test.assertFails

class ShouldContainTests : Spek({
    given("the should contain method") {
        on("checking an array with the value") {
            val array = arrayOf("Hello", "World", "Wide", "Web")
            it("should pass") {
                array `should contain` "Wide"
            }
        }
        on("checking an array without the value") {
            val array = arrayOf("Hello", "Wide", "Web")
            it("should fail") {
                assertFails({ array `should contain` "World" })
            }
            it("should format the array") {
                val theFailure = getFailure { array `should contain` "World" }
                assertEquals("Hello, Wide, Web", theFailure.actual)
            }
        }
        on("checking any iterable for an object") {
            val alice = Person("Alice", "Bob")
            val jon = Person("Jon", "Doe")
            val list = listOf(alice, jon)
            it("should pass") {
                list `should contain` jon
            }
        }
        on("checking any iterable for an object which isn't contained") {
            val alice = Person("Alice", "Bob")
            val jon = Person("Jon", "Doe")
            val list = listOf(alice)
            it("should fail") {
                assertFails({ list `should contain` jon })
            }
            it("should format the output") {
                val failure = getFailure { list `should contain` jon }
                assertEquals("Person(name=Alice, surname=Bob)", failure.actual)
            }
        }
    }
})

