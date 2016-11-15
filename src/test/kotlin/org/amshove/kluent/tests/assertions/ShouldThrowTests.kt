package org.amshove.kluent.tests.assertions

import org.amshove.kluent.shouldThrow
import org.jetbrains.spek.api.Spek
import java.util.*
import kotlin.test.assertFails

class ShouldThrowTests: Spek({
    given("the shouldThrow method") {
        on("expecting the thrown exception") {
            it("should pass") {
                val func = { throw IndexOutOfBoundsException() }
                func shouldThrow IndexOutOfBoundsException::class
            }
        }
        on("expection another exception") {
            it("should fail") {
                val func = { throw IndexOutOfBoundsException() }
                assertFails({ func shouldThrow IllegalArgumentException::class })
            }
        }

        on("trying to get an out of indexed item in an empty list") {
            val funcWithReturn = { ArrayList<String>().get(-1) }
            it("should pass a failing test") {
                funcWithReturn shouldThrow ArrayIndexOutOfBoundsException::class
            }
        }
    }
})
