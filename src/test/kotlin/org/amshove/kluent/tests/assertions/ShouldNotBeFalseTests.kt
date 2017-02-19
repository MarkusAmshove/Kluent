package org.amshove.kluent.tests.assertions

import org.amshove.kluent.shouldNotBeFalse
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotBeFalseTests : Spek({
    given("the shouldNotBeFalse method") {
        on("passing true") {
            it("should pass") {
                true.shouldNotBeFalse()
            }
        }
        on("passing false") {
            it("should fail") {
                assertFails({ false.shouldNotBeFalse() })
            }
        }
    }
})
