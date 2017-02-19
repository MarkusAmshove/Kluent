package org.amshove.kluent.tests.assertions

import org.amshove.kluent.AnyException
import org.amshove.kluent.shouldThrow
import org.amshove.kluent.shouldThrowTheException
import org.amshove.kluent.withCause
import org.amshove.kluent.withMessage
import org.jetbrains.spek.api.Spek
import java.io.IOException
import kotlin.test.assertFails

class ShouldThrowTheExceptionTests : Spek({
    given("the shouldThrowTheException method") {
        on("throwing an exception with a message") {
            it("should pass") {
                val func = { throw Exception("Hello World!") }
                func shouldThrowTheException Exception::class withMessage "Hello World!"
            }
        }
        on("throwing an exception with a wrong message") {
            it("should fail") {
                val func = { throw Exception("Hello World!") }
                assertFails({ func shouldThrowTheException Exception::class withMessage "Hello" })
            }
        }
        on("throwing an exception with a cause") {
            it("should pass") {
                val func = { throw Exception(RuntimeException()) }
                func shouldThrowTheException Exception::class withCause RuntimeException::class
            }
        }
        on("throwing an exception with a wrong cause") {
            it("should fail") {
                val func = { throw Exception(RuntimeException()) }
                assertFails({ func shouldThrowTheException Exception::class withCause IOException::class })
            }
        }
        on("throwing another exception") {
            it("should fail") {
                val func = { throw IllegalArgumentException() }
                assertFails({ func shouldThrow IndexOutOfBoundsException::class })
            }
        }
        on("expecting any exception when any exception is thrown") {
            it("should pass") {
                val func = { throw Exception() }
                func shouldThrow AnyException
            }
        }
        on("expecting any exception when no exception is thrown") {
            it("should fail") {
                val func = { Unit }
                assertFails({ func shouldThrow AnyException })
            }
        }
    }
})

