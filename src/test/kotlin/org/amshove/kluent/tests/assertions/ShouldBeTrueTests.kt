package org.amshove.kluent.tests.assertions

import org.amshove.kluent.shouldBeTrue
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBeTrueTests : Spek({
    given("the shouldBeTrue method") {
        on("passing true") {
            it("should pass") {
                true.shouldBeTrue()
            }
        }
        on("passing false") {
            it("should fail") {
                assertFails({ false.shouldBeTrue() })
            }
        }
    }
})
