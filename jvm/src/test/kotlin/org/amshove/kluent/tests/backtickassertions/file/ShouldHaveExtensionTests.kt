package org.amshove.kluent.tests.backtickassertions.file

import org.amshove.kluent.`should have extension`
import org.amshove.kluent.`should not have extension`
import org.amshove.kluent.tests.assertions.file.useFile
import org.jetbrains.spek.api.Spek
import java.io.File
import kotlin.test.assertFails

class ShouldHaveExtensionTests : Spek({
    val txtFile = File("test.txt")
    val wavFile = File("test.wav")
    given("the shouldHaveExtension method") {

        on("passing txt on a .txt File") {
            it("should pass") {
                txtFile.useFile { it `should have extension` "txt" }
            }
        }

        on("passing txt on a File that is not .txt") {
            it("should fail") {
                wavFile.useFile { assertFails { it `should have extension` "txt" } }
            }
        }

    }

    given("the shouldNotHaveExtension method") {
        on("passing txt on a .txt File") {
            it("should fail") {
                txtFile.useFile { assertFails { it `should not have extension` "txt" } }
            }
        }
        on("passing txt on a File that is not .txt") {
            it("should pass") {
                wavFile.useFile { it `should not have extension` "txt" }
            }
        }
    }

})