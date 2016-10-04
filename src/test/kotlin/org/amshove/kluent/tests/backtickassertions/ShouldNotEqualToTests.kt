package org.amshove.kluent.tests.backtickassertions

import org.amshove.kluent.`should not equal to`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotEqualToTests : Spek({
    given("the should not equal to method") {
        on("checking two equal boolean") {
            it("should pass") {
                true `should not equal to` false
            }
        }
        on("checking two different boolean") {
            it("should fail") {
                assertFails { true `should not equal to` true }
            }
        }
        on("checking two equal byte") {
            it("should pass") {
                5.toByte() `should not equal to` 20.toByte()
            }
        }
        on("checking two different byte") {
            it("should fail") {
                assertFails { 5.toByte() `should not equal to` 5.toByte() }
            }
        }
        on("checking two equal short") {
            it("should pass") {
                5.toShort() `should not equal to` 20.toShort()
            }
        }
        on("checking two different short") {
            it("should fail") {
                assertFails { 5.toShort() `should not equal to` 5.toShort() }
            }
        }
        on("checking two equal int") {
            it("should pass") {
                5 `should not equal to` 20
            }
        }
        on("checking two different int") {
            it("should fail") {
                assertFails { 5 `should not equal to` 5 }
            }
        }
        on("checking two equal long") {
            it("should pass") {
                5L `should not equal to` 20L
            }
        }
        on("checking two different long") {
            it("should fail") {
                assertFails { 5L `should not equal to` 5L }
            }
        }
        on("checking two equal float") {
            it("should pass") {
                5F `should not equal to` 20F
            }
        }
        on("checking two different float") {
            it("should fail") {
                assertFails { 5F `should not equal to` 5F }
            }
        }
        on("checking two equal double") {
            it("should pass") {
                5.0 `should not equal to` 20.0
            }
        }
        on("checking two different double") {
            it("should fail") {
                assertFails { 5.0 `should not equal to` 5.0 }
            }
        }
        on("checking two equal string") {
            it("should pass") {
                "hello world" `should not equal to` "hello"
            }
        }
        on("checking two different string") {
            it("should fail") {
                assertFails { "hello world" `should not equal to` "hello world" }
            }
        }
    }
})
