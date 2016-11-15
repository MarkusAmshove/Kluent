package org.amshove.kluent.tests.backtickassertions

import org.amshove.kluent.`should throw`
import org.jetbrains.spek.api.Spek
import java.util.*
import kotlin.test.assertFails

class ShouldThrowTests : Spek({
    given("the should throw method") {
        on("expecting the thrown exception") {
            it("should pass") {
                val func = { throw IndexOutOfBoundsException() }
                func `should throw` IndexOutOfBoundsException::class
            }
        }
        on("expection another exception") {
            it("should fail") {
                val func = { throw IndexOutOfBoundsException() }
                assertFails({ func `should throw` IllegalArgumentException::class })
            }
        }
        on("trying to get an out of indexed item in an empty list") {
            val funcWithReturn = { ArrayList<String>().get(-1) }
            it("should pass a failing test") {
                funcWithReturn `should throw` ArrayIndexOutOfBoundsException::class
            }
        }
        on("throwing subtype of an exception") {
            val func = { throw IllegalStateException() }
            it("should pass a shouldThrow with expected super type") {
                func `should throw` RuntimeException::class
            }
        }
    }
})
