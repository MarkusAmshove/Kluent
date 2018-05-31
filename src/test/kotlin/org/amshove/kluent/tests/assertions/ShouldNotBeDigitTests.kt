package org.amshove.kluent.tests.assertions

import org.amshove.kluent.shouldNotBeDigit
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotBeDigitTests : Spek({
    given("the shouldNotBeDigit assertion") {
        on("testing a non digit") {
            it("should pass") {
                'a'.shouldNotBeDigit()
            }
        }
        on("testing a digit") {
            it("should fail") {
                assertFails { '1'.shouldNotBeDigit() }
            }
        }
    }
})
