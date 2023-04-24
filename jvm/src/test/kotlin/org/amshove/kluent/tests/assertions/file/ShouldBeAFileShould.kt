package org.amshove.kluent.tests.assertions.file

import org.amshove.kluent.shouldBeFile
import java.io.File
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeAFileShould {
    private val file = File("isFile")
    private val dir = File("isDir")

    @Test
    fun passWhenTestingAFileThatIsAFile() {
        file.useFile { it.shouldBeFile() }
    }

    @Test
    fun failWhenTestingAFileThatIsNotAFile() {
        dir.useDir { assertFails { it.shouldBeFile() } }
    }
}

