package org.amshove.kluent.tests.assertions.file

import org.amshove.kluent.shouldHaveExtension
import org.amshove.kluent.shouldNotHaveExtension
import org.jetbrains.spek.api.Spek
import java.io.File
import kotlin.test.assertFails

class ShouldHaveExtensionTests : Spek({
    val txtFile = File("test.txt")
    val wavFile = File("test.wav")
    given("the shouldHaveExtension method") {

        on("passing txt on a .txt File") {
            it("should pass") {
                txtFile.useFile { it shouldHaveExtension "txt" }
            }
        }

        on("passing txt on a File that is not .txt") {
            it("should fail") {
                wavFile.useFile { assertFails { it shouldHaveExtension "txt" } }
            }
        }

    }

    given("the shouldNotHaveExtension method") {
        on("passing txt on a .txt File") {
            it("should fail") {
                txtFile.useFile { assertFails { it shouldNotHaveExtension "txt" } }
            }
        }
        on("passing txt on a File that is not .txt") {
            it("should pass") {
                wavFile.useFile { it shouldNotHaveExtension "txt" }
            }
        }
    }

})