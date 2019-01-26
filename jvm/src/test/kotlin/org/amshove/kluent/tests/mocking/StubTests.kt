package org.amshove.kluent.tests.mocking

import com.nhaarman.mockitokotlin2.anyVararg
import com.nhaarman.mockitokotlin2.reset
import org.amshove.kluent.*
import org.amshove.kluent.tests.helpclasses.Database
import org.amshove.kluent.tests.helpclasses.Person
import org.amshove.kluent.tests.helpclasses.Sizes
import org.jetbrains.spek.api.Spek
import org.junit.Assert.assertSame
import org.mockito.ArgumentMatchers.anyList
import org.mockito.exceptions.misusing.InvalidUseOfMatchersException
import java.io.IOException
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
        on("telling it to throw a checked exception") {
            it("should throw the checked exception") {
                val mock = mock(Database::class)
                When calling mock.getPersonChecked() itThrows IOException("This is checked")
                mock.getPerson()
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
                invoking { mock.getPerson() } shouldThrow InvalidUseOfMatchersException::class
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
                    When calling mock.getValue(any(), any(), any(), any(), any(), any()) itAnswers withFirstArg()

                    val result = mock.getValue(firstArg, secondArg, thirdArg, fourthArg, fifthArg, sixthArg)
                    assertEquals(firstArg, result)
                }
            }
            on("telling it to return the second argument") {
                it("returns the second argument") {
                    When calling mock.getValue(any(), any(), any(), any(), any(), any()) itAnswers withSecondArg()

                    val result = mock.getValue(firstArg, secondArg, thirdArg, fourthArg, fifthArg, sixthArg)
                    assertEquals(secondArg, result)
                }
            }
            on("telling it to return the third argument") {
                it("returns the third argument") {
                    When calling mock.getValue(any(), any(), any(), any(), any(), any()) itAnswers withThirdArg()

                    val result = mock.getValue(firstArg, secondArg, thirdArg, fourthArg, fifthArg, sixthArg)
                    assertEquals(thirdArg, result)
                }
            }
            on("telling it to return the fourth argument") {
                it("returns the fourth argument") {
                    When calling mock.getValue(any(), any(), any(), any(), any(), any()) itAnswers withFourthArg()

                    val result = mock.getValue(firstArg, secondArg, thirdArg, fourthArg, fifthArg, sixthArg)
                    assertEquals(fourthArg, result)
                }
            }
            on("telling it to return the argument in the fifth spot") {
                it("returns the fifth spot argument") {
                    When calling mock.getValue(any(), any(), any(), any(), any(), any()) itAnswers withArgAt(4)

                    val result = mock.getValue(firstArg, secondArg, thirdArg, fourthArg, fifthArg, sixthArg)
                    assertEquals(fifthArg, result)
                }
            }
            on("telling it to return the argument in the last spot") {
                it("returns the last argument") {
                    When calling mock.getValue(any(), any(), any(), any(), any(), any()) itAnswers withLastArg()

                    val result = mock.getValue(firstArg, secondArg, thirdArg, fourthArg, fifthArg, sixthArg)
                    assertEquals(sixthArg, result)
                }
            }
        }
    }
})
