package org.amshove.kluent.tests.assertions

import org.amshove.kluent.shouldContain
import org.amshove.kluent.tests.getFailure
import org.amshove.kluent.tests.helpclasses.Person
import org.jetbrains.spek.api.Spek
import kotlin.test.assertEquals
import kotlin.test.assertFails

class ShouldContainTests : Spek({
    given("the shouldContain method") {
        on("checking an array with the value") {
            val array = arrayOf("Hello", "World", "Wide", "Web")
            it("should pass") {
                array shouldContain "Wide"
            }
        }
        on("checking an array without the value") {
            val array = arrayOf("Hello", "Wide", "Web")
            it("should fail") {
                assertFails({ array shouldContain "World" })
            }
            it("should format the array") {
                val theFailure = getFailure { array shouldContain "World" }
                assertEquals("Hello, Wide, Web", theFailure.actual)
            }
        }
        on("checking any iterable for an object") {
            val alice = Person("Alice", "Bob")
            val jon = Person("Jon", "Doe")
            val list = listOf(alice, jon)
            it("should pass") {
                list shouldContain jon
            }
        }
        on("checking any iterable for an object which isn't contained") {
            val alice = Person("Alice", "Bob")
            val jon = Person("Jon", "Doe")
            val list = listOf(alice)
            it("should fail") {
                assertFails({ list shouldContain jon })
            }
            it("should format the output") {
                val failure = getFailure { list shouldContain jon }
                assertEquals("Person(name=Alice, surname=Bob)", failure.actual)
            }
        }
    }
})

