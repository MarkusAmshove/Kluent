package org.amshove.kluent.tests.backtickassertions.map

import junit.framework.Assert.assertEquals
import org.amshove.kluent.`should not have key`
import org.amshove.kluent.tests.getFailure
import org.amshove.kluent.tests.helpclasses.Person
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

/**
 * Created by Av on 11/15/2016.
 */
class ShouldNotHaveKeyTests : Spek({
    given("the should not have key method") {
        on("checking a Map with the key") {
            val map = mapOf("First" to "valueIchi", "Second" to "valueNi")
            it("should fail") {
                assertFails { map `should not have key` "First" }
            }
        }
        on("checking a Map without the key") {
            val map = mapOf(1 to "first", 2 to "second")
            it("should pass") {
                map `should not have key` 3
            }
            it("should format the keys") {
                val theFailure = getFailure { map `should not have key` 2 }
                assertEquals("1, 2", theFailure.actual)
            }
        }
        on("checking any Map for an object as key") {
            val alice = Person("Alice", "Green")
            val bob = Person("Bob", "Blue")
            val jon = Person("Jon", "Grey")
            val map = mapOf(alice to bob, bob to jon)
            it("should fail") {
                assertFails { map `should not have key` alice }
            }
        }
        on("checking any Map for an object which isn't contained") {
            val alice = Person("Alice", "Green")
            val bob = Person("Bob", "Blue")
            val jon = Person("Jon", "Grey")
            val map = mapOf(alice to bob)
            it("should pass") {
                map `should not have key` jon
            }
            it("should format the output") {
                val failure = getFailure { map `should not have key` alice }
                assertEquals("Person(name=Alice, surname=Green)", failure.actual)
            }
        }
    }


})