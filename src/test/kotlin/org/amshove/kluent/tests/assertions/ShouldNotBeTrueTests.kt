package org.amshove.kluent.tests.assertions

import org.amshove.kluent.shouldNotBeTrue
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotBeTrueTests : Spek({
    given("the shouldNotBeTrue method") {
        on("passing false") {
            it("should pass") {
                false.shouldNotBeTrue()
            }
        }
        on("passing true") {
            it("should fail") {
                assertFails({ true.shouldNotBeTrue() })
            }
        }
    }
})
