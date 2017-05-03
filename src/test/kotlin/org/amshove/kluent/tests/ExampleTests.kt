package org.amshove.kluent.tests

import org.amshove.kluent.shouldBe
import org.amshove.kluent.shouldExist
import org.amshove.kluent.shouldHaveName
import org.amshove.kluent.temporaryFolder
import org.jetbrains.spek.api.Spek
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TemporaryFolder

class ExampleTests : Spek({

    var folder: TemporaryFolder? = null
    beforeEach {
        folder = temporaryFolder {
            file("document.txt") {
                charset("UTF-8")
                content { "Hello World!" }
            }
        }
    }
    afterEach {
        folder!!.delete()
    }

    it("should have the content") {
        folder!!.root.listFiles()[0].shouldHaveName("document.txt")
    }

    it("the file should exist") {
        folder!!.root.listFiles()[0].listFiles()[0].shouldExist()
        folder!!.root.listFiles()[0].listFiles()[0].shouldHaveName("emptyfile.txt")
    }


    it("the root should exist") {
        folder!!.root.shouldExist()
    }
})