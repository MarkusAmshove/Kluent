package org.amshove.kluent.tests.backtickassertions


import org.amshove.kluent.`should not have value`
import org.amshove.kluent.tests.getFailure
import org.amshove.kluent.tests.helpclasses.Person
import org.jetbrains.spek.api.Spek
import org.junit.Assert
import kotlin.test.assertFails

/**
 * Created by Av on 11/17/2016.
 */
class ShouldNotHaveValueTests : Spek({
    given("the should not have value method") {
        on("checking a Map with the value") {
            val map = mapOf("First" to 1, "Second" to 2)
            it("should fail") {
                assertFails { map `should not have value` 1 }
            }
        }
        on("checking a Map without the value") {
            val map = mapOf("first" to 1, "second" to 2)
            it("should pass") {
                map `should not have value` 3
            }
            it("should format the values") {
                val theFailure = getFailure { map `should not have value` 2 }
                Assert.assertEquals("1, 2", theFailure.actual)
            }
        }
        on("checking any Map for an object as value") {
            val alice = Person("Alice", "Green")
            val bob = Person("Bob", "Blue")
            val jon = Person("Jon", "Grey")
            val map = mapOf(alice to bob, bob to jon)
            it("should fail") {
                assertFails { map `should not have value` bob }
            }
        }
        on("checking any Map for an object which isn't contained") {
            val alice = Person("Alice", "Green")
            val bob = Person("Bob", "Blue")
            val jon = Person("Jon", "Grey")
            val map = mapOf(alice to bob)
            it("should pass") {
                map `should not have value` jon
            }
            it("should format the output") {
                val failure = getFailure { map `should not have value` bob }
                Assert.assertEquals("Person(name=Bob, surname=Blue)", failure.actual)
            }
        }
    }


})