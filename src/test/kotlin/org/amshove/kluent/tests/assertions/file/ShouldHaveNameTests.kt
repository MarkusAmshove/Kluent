package org.amshove.kluent.tests.assertions.file

import org.amshove.kluent.shouldHaveName
import org.amshove.kluent.shouldNotHaveName
import org.jetbrains.spek.api.Spek
import java.io.File
import kotlin.test.assertFails

class ShouldHaveNameTests : Spek({
    val name = "thisfilenameisweird.csv"
    val file = File(name)
    given("the shouldHaveName method") {
        on("passing the correct name of the File") {
            it("should pass") {
                file.useFile { it shouldHaveName name }
            }
        }
        on("passing the incorrect name of the File") {
            it("should fail") {
                file.useFile { assertFails { it shouldHaveName "someothername" } }
            }
        }
    }

    given("the shouldNotHaveName method") {
        on("passing the correct name of the File") {
            it("should fail") {
                file.useFile { assertFails { it shouldNotHaveName name } }
            }
        }
        on("passing the incorrect name of the File") {
            it("should pass") {
                file.useFile { it shouldNotHaveName "someothername" }
            }
        }
    }


})