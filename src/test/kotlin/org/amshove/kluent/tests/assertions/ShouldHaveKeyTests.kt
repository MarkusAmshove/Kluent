package org.amshove.kluent.tests.assertions

import org.amshove.kluent.shouldHaveKey
import org.amshove.kluent.tests.getFailure
import org.amshove.kluent.tests.helpclasses.Person
import org.jetbrains.spek.api.Spek
import kotlin.test.assertEquals
import kotlin.test.assertFails

/**
 * Created by Av on 11/15/2016.
 */
class ShouldHaveKeyTests : Spek({
    given("the should have key method") {
        on("checking a Map with the key") {
            val map = mapOf("First" to "valueIchi", "Second" to "valueNi")
            it("should pass") {
                map shouldHaveKey "First"
            }
        }
        on("checking a Map without the key") {
            val map = mapOf(1 to "first", 2 to "second")
            it("should fail") {
                assertFails { map shouldHaveKey 3 }
            }
            it("should format the keys") {
                val theFailure = getFailure { map shouldHaveKey 3 }
                assertEquals("1, 2", theFailure.actual)
            }
        }
        on("checking any Map for an object as key") {
            val alice = Person("Alice", "Green")
            val bob = Person("Bob", "Blue")
            val jon = Person("Jon", "Grey")
            val map = mapOf(alice to bob, bob to jon)
            it("should pass") {
                map shouldHaveKey alice
            }
        }
        on("checking any Map for an object which isn't contained") {
            val alice = Person("Alice", "Green")
            val bob = Person("Bob", "Blue")
            val jon = Person("Jon", "Grey")
            val map = mapOf(alice to bob)
            it("should fail") {
                assertFails { map shouldHaveKey jon }
            }
            it("should format the output") {
                val failure = getFailure { map shouldHaveKey jon }
                assertEquals("Person(name=Alice, surname=Green)", failure.actual)
            }
        }
    }
})