package org.amshove.kluent.tests.backtickassertions

import org.amshove.kluent.AnyException
import org.amshove.kluent.`should throw the Exception`
import org.amshove.kluent.`should throw`
import org.amshove.kluent.`with message`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldThrowTheExceptionTests : Spek({
    given("the should throw the Exception method") {
        on("throwing an exception with a message") {
            it("should pass") {
                val func = { throw Exception("Hello World!") }
                func `should throw the Exception` Exception::class `with message` "Hello World!"
            }
        }
        on("throwing an exception with a wrong message") {
            it("should fail") {
                val func = { throw Exception("Hello World!") }
                assertFails({ func `should throw the Exception` Exception::class `with message` "Hello" })
            }
        }
        on("throwing another exception") {
            it("should fail") {
                val func = { throw IllegalArgumentException() }
                assertFails({ func `should throw` IndexOutOfBoundsException::class })
            }
        }
        on("expecting any exception when any exception is thrown") {
            it("should pass") {
                val func = { throw Exception() }
                func `should throw` AnyException
            }
        }
        on("expecting any exception when no exception is thrown") {
            it("should fail") {
                val func = { Unit }
                assertFails({ func `should throw` AnyException })
            }
        }
    }
})
