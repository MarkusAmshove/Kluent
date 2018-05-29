package org.amshove.kluent.tests.assertions.file

import org.amshove.kluent.shouldExist
import org.amshove.kluent.shouldNotExist
import org.jetbrains.spek.api.Spek
import java.io.File
import kotlin.test.assertFails

class ShouldExistTests : Spek({
    val file = File("test")
    given("the shouldExist method") {
        on("passing a File that exists") {
            it("should pass") {
                file.useFile { it.shouldExist() }
            }
        }
        on("passing a File that doesn't exist") {
            it("should fail") {
                assertFails { file.shouldExist() }
            }
        }
    }

    given("the shouldNotExist method") {
        on("passing a File that exists") {
            it("should fail") {
                file.useFile { assertFails { it.shouldNotExist() } }
            }
        }
        on("passing a File that doesn't exist") {
            it("should pass") {
                file.shouldNotExist()
            }
        }
    }
})