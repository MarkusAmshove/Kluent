package org.amshove.kluent.tests.backtickmockings

import org.amshove.kluent.*
import org.amshove.kluent.tests.helpclasses.Database
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class MockTests : Spek({
    given("a mock") {
        on("telling it to verify that no interactions took place") {
            it("should pass if no interactions took place") {
                val mock = mock(Database::class)
                `Verify no interactions` on mock
            }
            it("should fail if interactions took place") {
                val mock = mock(Database::class)
                mock.getPerson()
                assertFails({ `Verify no interactions` on mock })
            }
        }
        on("telling it to verify that no further interactions took place") {
            it("should pass if no further interactions took place") {
                val mock = mock(Database::class)
                mock.getPerson(1)
                mock.getPerson(5)
                Verify on mock that mock.getPerson(1) was called
                Verify on mock that mock.getPerson(5) was called
                `Verify no further interactions` on mock
            }
            it("should fail if further interactions took place") {
                val mock = mock(Database::class)
                mock.getPerson(1)
                assertFails({ `Verify no further interactions` on mock })
            }
        }
        on("telling it to verify that no interactions with method was called") {
            it("should pass if method wasn't called") {
                val mock = mock(Database::class)
                mock.getPerson(1)
                Verify on mock that mock.getPerson(1) was called
                `Verify not called` on mock that mock.getPerson(5)
            }
            it("should fail pass if method was called") {
                val mock = mock(Database::class)
                mock.getPerson(1)
                assertFails({ `Verify not called` on mock that mock.getPerson(1) })
            }
        }
    }
})
