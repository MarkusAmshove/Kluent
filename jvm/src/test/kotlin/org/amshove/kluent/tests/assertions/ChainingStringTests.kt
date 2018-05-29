package org.amshove.kluent.tests.assertions

import org.amshove.kluent.shouldEndWith
import org.amshove.kluent.shouldNotBeBlank
import org.amshove.kluent.shouldNotBeEmpty
import org.amshove.kluent.shouldStartWith
import org.jetbrains.spek.api.Spek

class ChainingStringTests : Spek({
    given("a string") {
        it("should be possible to chain assertions") {
            val str = "Hello World!"

            str
                    .shouldNotBeEmpty()
                    .shouldNotBeBlank()
                    .shouldStartWith("Hello")
                    .shouldEndWith("!")
        }
    }
})