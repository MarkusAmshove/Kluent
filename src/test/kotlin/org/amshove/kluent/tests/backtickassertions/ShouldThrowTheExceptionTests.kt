package org.amshove.kluent.tests.backtickassertions

import org.amshove.kluent.*
import org.jetbrains.spek.api.Spek
import java.io.IOException
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
        on("throwing an exception with a cause") {
            it("should pass") {
                val func = { throw Exception(RuntimeException()) }
                func `should throw the Exception` Exception::class `with cause` RuntimeException::class
            }
        }
        on("throwing an exception with a wrong cause") {
            it("should fail") {
                val func = { throw Exception(RuntimeException()) }
                assertFails({ func `should throw the Exception` Exception::class `with cause` IOException::class })
            }
        }
        on("throwing another exception") {
            it("should fail") {
                val func = { throw IllegalArgumentException() }
                assertFails({ func `should throw the Exception` IndexOutOfBoundsException::class })
            }
        }
        on("expecting any exception when any exception is thrown") {
            it("should pass") {
                val func = { throw Exception() }
                func `should throw the Exception` AnyException
            }
        }
        on("expecting any exception when no exception is thrown") {
            it("should fail") {
                val func = { Unit }
                assertFails({ func `should throw the Exception` AnyException })
            }
        }
        on("being fluent asserting both a cause and a message") {
            on("both the message and cause being right") {
                it("should pass") {
                    val func = { throw IllegalArgumentException("hello", IOException()) }
                    func `should throw the Exception` IllegalArgumentException::class `with cause` IOException::class `with message` "hello"
                }
            }

            on("on the message being wrong") {
                it("should fail") {
                    val func = { throw IllegalArgumentException("not hello", IOException()) }
                    assertFails { func `should throw the Exception` IllegalArgumentException::class `with cause` IOException::class `with message` "hello" }
                }
            }
        }

        given("a custom exception") {
            class CustomException(val code: Int) : Exception("code is $code")

            on("throwing an exception of the right type") {
                it("should return the exception result with the given type") {

                    val func = { throw CustomException(10) }

                    func.`should throw the Exception`(CustomException::class).exception.code.shouldEqualTo(10)
                }
            }
            on("throwing an exception of the wrong type") {
                it("should fail") {
                    val func = { throw IllegalArgumentException() }
                    assertFails { func.`should throw the Exception`(CustomException::class).exception.code.shouldEqualTo(10) }
                }
            }
        }
    }
})
