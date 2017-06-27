package org.amshove.kluent.tests.assertions.file

import org.amshove.kluent.shouldBeDir
import org.amshove.kluent.shouldNotBeDir
import org.jetbrains.spek.api.Spek
import java.io.File
import kotlin.test.assertFails

class ShouldBeDirTests : Spek({
    val dir = File("testDir")
    val file = File("test")
    given("the shouldBeDir method") {
        on("passing a File that is a directory") {
            it("should pass") {
                dir.useDir { it.shouldBeDir() }
            }
        }

        on("passing a File that is not a directory") {
            it("should fail") {
                file.useFile { assertFails { it.shouldBeDir() } }
            }
        }
    }

    given("the shouldNotBeDir method") {
        on("passing a File that is a directory") {
            it("should fail") {
                dir.useDir { assertFails { it.shouldNotBeDir() } }
            }
        }
        on("passing a File that is not a directory") {
            it("should pass") {
                file.useFile { it.shouldNotBeDir() }
            }
        }
    }

})