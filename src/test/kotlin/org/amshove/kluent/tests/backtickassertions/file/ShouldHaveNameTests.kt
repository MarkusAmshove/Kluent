package org.amshove.kluent.tests.backtickassertions.file

import org.amshove.kluent.`should have name`
import org.amshove.kluent.`should not have name`
import org.amshove.kluent.tests.assertions.file.useFile
import org.jetbrains.spek.api.Spek
import java.io.File
import kotlin.test.assertFails

class ShouldHaveNameTests : Spek({
    val name = "thisfilenameisweird.csv"
    val file = File(name)
    given("the shouldHaveName method") {
        on("passing the correct name of the File") {
            it("should pass") {
                file.useFile { it `should have name` name }
            }
        }
        on("passing the incorrect name of the File") {
            it("should fail") {
                file.useFile { assertFails { it `should have name` "someothername" } }
            }
        }
    }

    given("the shouldNotHaveName method") {
        on("passing the correct name of the File") {
            it("should fail") {
                file.useFile { assertFails { it `should not have name` name } }
            }
        }
        on("passing the incorrect name of the File") {
            it("should pass") {
                file.useFile { it `should not have name` "someothername" }
            }
        }
    }

})