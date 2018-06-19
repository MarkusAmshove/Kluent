package org.amshove.kluent.tests.backtickassertions

import org.amshove.kluent.AnyException
import org.amshove.kluent.`should not throw`
import org.amshove.kluent.shouldNotThrow
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotThrowTests : Spek({
    given("the should not throw method") {
        on("providing a function that does throw an exception") {
            it("should fail") {
                val func = { throw IllegalArgumentException() }
                assertFails({ func `should not throw` AnyException })
            }
        }
        on("providing a function that doesn't throw an exception") {
            it("should pass") {
                val func = { Unit }
                func `should not throw` AnyException
            }
        }
        on("providing a function that throws Exception A and shouldn't throw B") {
            it("should pass") {
                val func = { throw IllegalArgumentException() }
                func `should not throw` ArrayIndexOutOfBoundsException::class
            }
        }

        on("providing a function that returns null") {
            val func = { null }
            it("should not throw exception") {
                func `should not throw` AnyException
            }
        }
    }
})
