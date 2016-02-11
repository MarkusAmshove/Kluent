package org.amshove.kluent.tests.mocking

import org.amshove.kluent.When
import org.amshove.kluent.calling
import org.amshove.kluent.itReturns
import org.amshove.kluent.mock
import org.amshove.kluent.tests.helpclasses.Person
import org.jetbrains.spek.api.Spek
import kotlin.test.assertEquals

interface Database {
    fun getPerson(id: Int): Person;
    fun getPerson(): Person;
}

class StubTests() : Spek() {
    init {
        given("a mock") {
            val mock = mock(Database::class)
            on("telling it to return an object") {
                val person = Person(name = "Bob", surname = "Guy")
                When calling mock.getPerson() itReturns person
                it("should return the object") {
                    assertEquals(person, mock.getPerson())
                }
            }
            on("telling it to return any object") {
//                When calling mock.getPerson() itReturns null
            }
        }
    }
}

