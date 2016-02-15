package org.amshove.kluent.tests.mocking

import org.amshove.kluent.*
import org.amshove.kluent.tests.helpclasses.Database
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class MockTests : Spek() {
    init {
        given("a mock") {
            on("telling it to ensure that a method is called") {
                it("should fail if the method has no setup") {
                    val mock = mock(Database::class)
                    assertFails({ Verify on mock that mock.getPerson() was called })
                }
                it("should pass if the method has a setup") {
                    val mock = mock(Database::class)
                    mock.getPerson()
                    Verify on mock that mock.getPerson() was called
                }
                it("should fail if the method has another parameter") {
                    val mock = mock(Database::class)
                    mock.getPerson(5)
                    assertFails({ Verify on mock that mock.getPerson(10) was called })
                }
                it("should pass if the method has the same parameter") {
                    val mock = mock(Database::class)
                    mock.getPerson(5)
                    Verify on mock that mock.getPerson(5) was called
                }
                it("should pass if the method was called with anything") {
                    val mock = mock(Database::class)
                    mock.getPerson(200)
                    Verify on mock that mock.getPerson(any(Int::class)) was called
                }
            }
            on("telling it to verify that no interactions took place") {
                it("should pass if no interactions took place") {
                    val mock = mock(Database::class)
                    VerifyNoInteractions on mock
                }
                it("should fail if interactions took place") {
                    val mock = mock(Database::class)
                    mock.getPerson()
                    assertFails({ VerifyNoInteractions on mock })
                }
            }
            on("telling it to verify that no further interactions took place") {
                it("should pass if no further interactions took place") {
                    val mock = mock(Database::class)
                    mock.getPerson(1)
                    mock.getPerson(5)
                    Verify on mock that mock.getPerson(1) was called
                    Verify on mock that mock.getPerson(5) was called
                    VerifyNoFurtherInteractions on mock
                }
                it("should fail if further interactions took place") {
                    val mock = mock(Database::class)
                    mock.getPerson(1)
                    assertFails({ VerifyNoFurtherInteractions on mock })
                }
            }
        }
    }
}
