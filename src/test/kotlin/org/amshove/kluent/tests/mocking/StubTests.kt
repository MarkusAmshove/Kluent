package org.amshove.kluent.tests.mocking

import org.amshove.kluent.*
import org.amshove.kluent.tests.helpclasses.Database
import org.amshove.kluent.tests.helpclasses.Person
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
                When calling mock.getPerson() itReturns bob
                assertSame(bob, mock.getPerson())
            }
        }
        on("telling it to return an object with any parameter") {
            it("should return the object") {
                val mock = mock(Database::class)
                When calling mock.getPerson(any(Int::class)) itReturns alice
                assertSame(alice, mock.getPerson(5))
            }
        }
        on("telling it to throw an exception") {
            it("should throw an exception") {
                val mock = mock(Database::class)
                When calling mock.getPerson() itThrows RuntimeException("An exception")
                assertFailsWith(RuntimeException::class, { mock.getPerson() })
            }
        }
        on("telling it to throw an error") {
            it("should throw an error") {
                val mock = mock(Database::class)
                When calling mock.getPerson() itThrows Error("An exception")
                assertFailsWith(Error::class, { mock.getPerson() })
            }
        }
        on("telling it to answer") {
            it("should answer when called") {
                val mock = mock(Database::class)
                var counter = 0
                When calling mock.getPerson() itAnswers { counter++; alice }
                mock.getPerson()
                assertEquals(1, counter)
            }
            it("should not answer when not called") {
                val mock = mock(Database::class)
                var counter = 0
                When calling mock.getPerson() itAnswers { counter++; alice }
                assertEquals(0, counter)
            }
        }
        on("telling it to return any") {
            it("should throw an exception") {
                val mock = mock(Database::class)
                When calling mock.getPerson() itReturns any()
                val func = { mock.getPerson() }
                func shouldThrow InvalidUseOfMatchersException::class
            }
        }
    }
})
