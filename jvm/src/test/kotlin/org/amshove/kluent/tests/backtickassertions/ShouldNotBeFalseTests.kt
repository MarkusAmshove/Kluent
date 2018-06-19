package org.amshove.kluent.tests.backtickassertions

import org.amshove.kluent.`should not be false`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotBeFalseTests : Spek({
    given("the `should not be false` method") {
        on("passing true") {
            it("should pass") {
                true.`should not be false`()
            }
        }
        on("passing false") {
            it("should fail") {
                assertFails({ false.`should not be false`() })
            }
        }
    }
})
