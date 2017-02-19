package org.amshove.kluent.tests.backtickassertions

import org.amshove.kluent.`should be false`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBeFalseTests : Spek({
    given("the `should be false` method") {
        on("passing false") {
            it("should pass") {
                false.`should be false`()
            }
        }
        on("passing true") {
            it("should fail") {
                assertFails({ true.`should be false`() })
            }
        }
    }
})
