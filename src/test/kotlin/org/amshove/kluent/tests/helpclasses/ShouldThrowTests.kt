package org.amshove.kluent.tests.helpclasses

import org.amshove.kluent.`should throw`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldThrowTests: Spek() {
    init {
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
                    assertFails({func `should throw` IllegalArgumentException::class})
                }
            }
        }
    }
}
