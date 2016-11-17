package org.amshove.kluent.tests.assertions

import org.amshove.kluent.shouldHaveValue
import org.amshove.kluent.tests.getFailure
import org.amshove.kluent.tests.helpclasses.Person
import org.jetbrains.spek.api.Spek
import kotlin.test.assertEquals
import kotlin.test.assertFails

/**
 * Created by Av on 11/17/2016.
 */
class ShouldHaveValueTests : Spek({
    given("the should have value method") {
        on("checking a Map with the value") {
            val map = mapOf("ichi" to 1, "ni" to 2)
            it("should pass") {
                map shouldHaveValue 1
            }
        }
        on("checking a Map without the value") {
            val map = mapOf("ichi" to 1, "ni" to 2)
            it("should fail") {
                assertFails { map shouldHaveValue 3 }
            }
            it("should format the values") {
                val theFailure = getFailure { map shouldHaveValue 3 }
                assertEquals("1, 2", theFailure.actual)
            }
        }
        on("checking any Map for an object as value") {
            val alice = Person("Alice", "Green")
            val bob = Person("Bob", "Blue")
            val jon = Person("Jon", "Grey")
            val map = mapOf(alice to bob, bob to jon)
            it("should pass") {
                map shouldHaveValue jon
            }
        }
        on("checking any Map for an object which is not contained") {
            val alice = Person("Alice", "Green")
            val bob = Person("Bob", "Blue")
            val map = mapOf(alice to bob)
            it("should fail") {
                assertFails { map shouldHaveValue alice }
            }
            it("should format the output") {
                val failure = getFailure { map shouldHaveValue alice }
                assertEquals("Person(name=Bob, surname=Blue)", failure.actual)
            }
        }
    }

})