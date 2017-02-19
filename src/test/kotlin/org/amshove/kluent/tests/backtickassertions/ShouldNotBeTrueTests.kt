package org.amshove.kluent.tests.backtickassertions

import org.amshove.kluent.`should not be true`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotBeTrueTests : Spek({
    given("the `should not be true` method") {
        on("passing false") {
            it("should pass") {
                false.`should not be true`()
            }
        }
        on("passing true") {
            it("should fail") {
                assertFails({ true.`should not be true`() })
            }
        }
    }
})
