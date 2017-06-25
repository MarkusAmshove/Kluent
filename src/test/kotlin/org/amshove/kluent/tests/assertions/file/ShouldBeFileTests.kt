package org.amshove.kluent.tests.assertions.file

import org.amshove.kluent.shouldBeFile
import org.amshove.kluent.shouldNotBeFile
import org.jetbrains.spek.api.Spek
import java.io.File
import kotlin.test.assertFails

class ShouldBeFileTests : Spek({
    val file = File("isFile")
    val dir = File("isDir")
    given("the shouldBeFile method") {
        on("passing a File that is a file") {
            it("should pass") {
                file.useFile { it.shouldBeFile() }
            }
        }
        on("passing a File that is a directory") {
            it("should fail") {
                dir.useDir { assertFails { it.shouldBeFile() } }
            }
        }
    }

    given("the shouldNotBeFile method") {
        on("passing a File that is a file") {
            it("should fail") {
                file.useFile { assertFails { it.shouldNotBeFile() } }
            }
        }
        on("passing a File that is a directory") {
            it("should pass") {
                dir.useDir { it.shouldNotBeFile() }
            }
        }
    }

})