package org.amshove.kluent.tests.mocking

import org.amshove.kluent.*
import org.amshove.kluent.tests.helpclasses.Person
import org.jetbrains.spek.api.Spek

class MockTests : Spek() {
    init {
        given("a mock") {
            val mock = mock(Database::class)
            val person = Person("Bob", "Guy")
            on("telling it to ensure that a method is called") {
                // Arrange
                When calling mock.getPerson() itReturns person

                // Act
                println(mock.getPerson())

                it("should verify it") {
                    // Verify
                    Verify on mock that mock.getPerson() was called
                }
            }
        }
    }
}
