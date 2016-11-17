package org.amshove.kluent.tests.assertions.map

import org.amshove.kluent.shouldNotContain
import org.amshove.kluent.tests.getFailure
import org.amshove.kluent.tests.helpclasses.Person
import org.jetbrains.spek.api.Spek
import kotlin.test.assertEquals
import kotlin.test.assertFails

/**
 * Created by Av on 11/17/2016.
 */
class ShouldNotContainTests : Spek({
    given("the Map should not contain method") {
        on("checking a Map with the Pair") {
            val pairInMap = "one" to 1
            val map = mapOf(pairInMap)
            it("should fail") {
                assertFails({ map shouldNotContain pairInMap })
            }
        }
        on("checking a Map without the Pair") {
            val map = mapOf("one" to 1, "two" to 2)
            it("should pass") {
                map shouldNotContain ("three" to 3)
            }
            it("should format the array") {
                val theFailure = getFailure { map shouldNotContain ("one" to 1) }
                assertEquals("one=1, two=2", theFailure.actual)
            }
        }
        on("checking any Map for a Pair of objects") {
            val alice = Person("Alice", "Bob")
            val jon = Person("Jon", "Doe")
            val map = mapOf(alice to jon)
            it("should fail") {
                assertFails({ map shouldNotContain (alice to jon) })
            }
        }
        on("checking any Map for a Pair of objects which isn't contained") {
            val alice = Person("Alice", "Bob")
            val jon = Person("Jon", "Doe")
            val map = mapOf(alice to jon)
            it("should pass") {
                map shouldNotContain (jon to alice)
            }
            it("should format the output") {
                val failure = getFailure { map shouldNotContain (alice to jon) }
                assertEquals("Person(name=Alice, surname=Bob)=Person(name=Jon, surname=Doe)", failure.actual)
            }
        }
    }
})