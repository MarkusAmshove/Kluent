package org.amshove.kluent.tests.backtickassertions

import org.amshove.kluent.AnyException
import org.amshove.kluent.`should not throw the Exception`
import org.amshove.kluent.`with message`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotThrowTheExceptionTests : Spek({
    given("the should not throw the exception method") {
        on("providing a function that throws Exception A and shouldn't throw B") {
            it("should pass") {
                val func = { throw IllegalArgumentException() }
                func `should not throw the Exception` ArrayIndexOutOfBoundsException::class
            }
        }
        on("providing a function that doesn't throw an exception") {
            it("should pass") {
                val func = { Unit }
                func `should not throw the Exception` AnyException
            }
        }
        on("providing a function that does throw an exception without the expected message") {
            it("should pass") {
                val func = { throw Exception("Hello!") }
                func `should not throw the Exception` Exception::class `with message` "Another message"
            }
        }
        on("providing a function that does throw an exception with the expected message") {
            it("should pass") {
                val func = { throw Exception("The Message") }
                assertFails({ func `should not throw the Exception` Exception::class `with message` "The Message" })
            }
        }
    }
})
