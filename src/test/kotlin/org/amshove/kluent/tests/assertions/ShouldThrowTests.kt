package org.amshove.kluent.tests.assertions

import org.amshove.kluent.*
import org.jetbrains.spek.api.Spek
import java.io.IOException
import java.util.*
import kotlin.test.assertFails

class ShouldThrowTests : Spek({
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
        on("throwing subtype of an exception") {
            val func = { throw IllegalStateException() }
            it("should pass a shouldThrow with expected super type") {
                func shouldThrow RuntimeException::class
            }
        }
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

        given("a lambda that returns null") {
            val func = { null }
            it("should not throw exception") {
                func shouldNotThrow AnyException
            }
        }

        given("a lambda that can return null") {
            val func = { if (0 == 1) null else throw IllegalStateException() }
            it("should throw exception") {
                func shouldThrow IllegalStateException::class
            }
        }
    }
})
