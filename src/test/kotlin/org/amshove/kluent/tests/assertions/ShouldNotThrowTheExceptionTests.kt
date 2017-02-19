package org.amshove.kluent.tests.assertions

import org.amshove.kluent.AnyException
import org.amshove.kluent.shouldNotThrowTheException
import org.amshove.kluent.withCause
import org.amshove.kluent.withMessage
import org.jetbrains.spek.api.Spek
import java.io.IOException
import kotlin.test.assertFails

class ShouldNotThrowTheExceptionTests : Spek({
    given("the shouldNotThrow the exception method") {
        on("providing a function that throws Exception A and shouldn't throw B") {
            it("should pass") {
                val func = { throw IllegalArgumentException() }
                func shouldNotThrowTheException ArrayIndexOutOfBoundsException::class
            }
        }
        on("providing a function that doesn't throw an exception") {
            it("should pass") {
                val func = { Unit }
                func shouldNotThrowTheException AnyException
            }
        }
        on("providing a function that does throw an exception without the expected message") {
            it("should pass") {
                val func = { throw Exception("Hello!") }
                func shouldNotThrowTheException Exception::class withMessage "Another message"
            }
        }
        on("providing a function that does throw an exception with the expected message") {
            it("should fail") {
                val func = { throw Exception("The Message") }
                assertFails({ func shouldNotThrowTheException Exception::class withMessage "The Message" })
            }
        }
        on("providing a function that does throw an exception without the expected cause") {
            it("should pass") {
                val func = { throw Exception(RuntimeException()) }
                func shouldNotThrowTheException Exception::class withCause IOException::class
            }
        }
        on("providing a function that does throw an exception with the expected cause") {
            it("should fail") {
                val func = { throw Exception(RuntimeException()) }
                assertFails({ func shouldNotThrowTheException Exception::class withCause RuntimeException::class })
            }
        }
    }
})

