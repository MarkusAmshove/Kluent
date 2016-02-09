package org.amshove.kluent.tests.assertions

import org.amshove.kluent.shouldThrow
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldThrowTests: Spek() {
    init {
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
        }
    }
}
