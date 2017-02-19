package org.amshove.kluent.tests.backtickassertions

import org.amshove.kluent.`should be true`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBeTrueTests : Spek({
    given("the `should be true` method") {
        on("passing true") {
            it("should pass") {
                true.`should be true`()
            }
        }
        on("passing false") {
            it("should fail") {
                assertFails({ false.`should be true`() })
            }
        }
    }
})
