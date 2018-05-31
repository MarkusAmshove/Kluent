package org.amshove.kluent.tests.assertions

import org.amshove.kluent.shouldBeDigit
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBeDigitTests : Spek({
    given("the shouldBeDigit assertion") {
        on("testing a digit") {
            it("should pass") {
                '1'.shouldBeDigit()
            }
        }
        on("testing a non digit") {
            it("should fail") {
                assertFails { 'a'.shouldBeDigit() }
            }
        }
    }
})