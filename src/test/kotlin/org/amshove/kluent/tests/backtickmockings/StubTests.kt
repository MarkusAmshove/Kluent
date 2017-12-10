package org.amshove.kluent.tests.backtickmockings

import com.nhaarman.mockito_kotlin.reset
import org.amshove.kluent.*
import org.amshove.kluent.tests.helpclasses.Database
import org.amshove.kluent.tests.helpclasses.Person
import org.amshove.kluent.tests.helpclasses.Sizes
import org.jetbrains.spek.api.Spek
import org.junit.Assert.assertSame
import org.mockito.exceptions.misusing.InvalidUseOfMatchersException
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class StubTests : Spek({
    val bob = Person("Bob", "Guy")
    val alice = Person("Alice", "Person")
    given("a stub") {
        on("telling it to return an object") {
            it("should return the object") {
                val mock = mock(Database::class)
                When calling mock.getPerson() `it returns` bob
                assertSame(bob, mock.getPerson())
            }
        }
        on("telling it to return an object with any parameter") {
            it("should return the object") {
                val mock = mock(Database::class)
                When calling mock.getPerson(any(Int::class)) `it returns` alice
                assertSame(alice, mock.getPerson(5))
            }
        }
        on("telling it to throw an exception") {
            it("should throw an exception") {
                val mock = mock(Database::class)
                When calling mock.getPerson() `it throws` RuntimeException("An exception")
                assertFailsWith(RuntimeException::class, { mock.getPerson() })
            }
        }
        on("telling it to answer") {
            it("should answer when called") {
                val mock = mock(Database::class)
                var counter = 0
                When calling mock.getPerson() `it answers` { counter++; alice }
                mock.getPerson()
                assertEquals(1, counter)
            }
            it("should not answer when not called") {
                val mock = mock(Database::class)
                var counter = 0
                When calling mock.getPerson() `it answers` { counter++; alice }
                assertEquals(0, counter)
            }
        }
        on("telling it to return any") {
            it("should throw an exception") {
                val mock = mock(Database::class)
                When calling mock.getPerson() `it returns` any()
                val func = { mock.getPerson() }
                func `should throw` InvalidUseOfMatchersException::class
            }
        }
        context("with specific arguments") {
            val mock = mock(Sizes::class)
            val firstArg = 1
            val secondArg = 2
            val thirdArg = 3
            val fourthArg = 4
            val fifthArg = 5
            val sixthArg = 6

            afterEach {
                reset(mock)
            }

            on("telling it to return the first argument") {
                it("returns the first argument") {
                    When calling mock.getValue(any(), any(), any(), any(), any(), any()) `it answers` withFirstArg()

                    val result = mock.getValue(firstArg, secondArg, thirdArg, fourthArg, fifthArg, sixthArg)
                    assertEquals(firstArg, result)
                }
            }
            on("telling it to return the argument in the last spot") {
                it("returns the last argument") {
                    When calling mock.getValue(any(), any(), any(), any(), any(), any()) `it answers` withLastArg()

                    val result = mock.getValue(firstArg, secondArg, thirdArg, fourthArg, fifthArg, sixthArg)
                    assertEquals(sixthArg, result)
                }
            }
        }
    }
})
