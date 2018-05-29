package org.amshove.kluent.tests.assertions

import org.amshove.kluent.*
import org.jetbrains.spek.api.Spek

class ChainingNumericalTests : Spek({
    given("a number") {
        it("should be possible to chain assertions") {
            val number = 42

            number
                    .shouldBePositive()
                    .shouldBeGreaterThan(10)
                    .shouldBeLessThan(43)
                    .shouldBeInRange(40..45)
                    .shouldNotBeInRange(45..50)
        }
    }
})