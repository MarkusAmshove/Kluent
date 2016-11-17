package org.amshove.kluent.tests.backtickassertions.map

import org.amshove.kluent.`should contain`
import org.amshove.kluent.tests.getFailure
import org.amshove.kluent.tests.helpclasses.Person
import org.jetbrains.spek.api.Spek
import kotlin.test.assertEquals
import kotlin.test.assertFails

/**
 * Created by Av on 11/17/2016.
 */
class ShouldContainTests : Spek({
    given("the should contain method") {
        on("checking a Map with the Pair") {
            val map = mapOf(1 to "one", 2 to "two")
            it("should pass") {
                val expect = 1 to "one"
                map `should contain` expect
            }
        }
        on("checking a Map without the Pair") {
            val map = mapOf(1 to "one", 2 to "two")
            val notThere = 3 to "three"
            it("should fail") {
                assertFails({ map `should contain` notThere })
            }
            it("should format the array") {
                val theFailure = getFailure { map `should contain` notThere }
                assertEquals("1=one, 2=two", theFailure.actual)
            }
        }
        on("checking any Map for a Pair of objects") {
            val alice = Person("Alice", "Bob")
            val jon = Person("Jon", "Doe")
            val map = mapOf(alice to jon, jon to alice)
            it("should pass") {
                map `should contain` (alice to jon)
            }
        }
        on("checking any Map for Pair of objects which isn't contained") {
            val alice = Person("Alice", "Bob")
            val jon = Person("Jon", "Doe")
            val bob = Person("Bob", "Blue")
            val map = mapOf(alice to jon)
            it("should fail") {
                assertFails({ map `should contain` (alice to bob) })
            }
            it("should format the output") {
                val failure = getFailure { map `should contain` (alice to bob)}
                assertEquals("Person(name=Alice, surname=Bob)=Person(name=Jon, surname=Doe)", failure.actual)
            }
        }
    }


})