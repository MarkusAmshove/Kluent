package org.amshove.kluent.tests.assertions

import org.amshove.kluent.*
import org.jetbrains.spek.api.Spek
import java.io.IOException
import kotlin.test.assertFails

class ShouldThrowTheExceptionTests : Spek({
    given("the shouldThrow method") {
        on("throwing an exception with a message") {
            it("should pass") {
                val func = { throw Exception("Hello World!") }
                func shouldThrow Exception::class withMessage "Hello World!"
            }
        }
        on("throwing an exception with a wrong message") {
            it("should fail") {
                val func = { throw Exception("Hello World!") }
                assertFails({ func shouldThrow Exception::class withMessage "Hello" })
            }
        }
        on("throwing an exception with a cause") {
            it("should pass") {
                val func = { throw Exception(RuntimeException()) }
                func shouldThrow Exception::class withCause RuntimeException::class
            }
        }
        on("throwing an exception with a wrong cause") {
            it("should fail") {
                val func = { throw Exception(RuntimeException()) }
                assertFails({ func shouldThrow Exception::class withCause IOException::class })
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
        on("being fluent asserting both a cause and a message") {
            on("both the message and cause being right") {
                it("should pass") {
                    val func = { throw IllegalArgumentException("hello", IOException()) }
                    func shouldThrow IllegalArgumentException::class withCause IOException::class withMessage "hello"
                }
            }

            on("on the message being wrong") {
                it("should fail") {
                    val func = { throw IllegalArgumentException("not hello", IOException()) }
                    assertFails { func shouldThrow IllegalArgumentException::class withCause IOException::class withMessage "hello" }
                }
            }
        }

        given("a custom exception") {
            class CustomException(val code: Int) : Exception("code is $code")

            on("throwing an exception of the right type") {
                it("should return the exception result with the given type") {

                    val func = { throw CustomException(10) }

                    func.shouldThrow(CustomException::class).exception.code.shouldEqualTo(10)
                }
            }
            on("throwing an exception of the wrong type") {
                it("should fail") {
                    val func = { throw IllegalArgumentException() }
                    assertFails { func.shouldThrow(CustomException::class).exception.code.shouldEqualTo(10) }
                }
            }
        }

    }
})



