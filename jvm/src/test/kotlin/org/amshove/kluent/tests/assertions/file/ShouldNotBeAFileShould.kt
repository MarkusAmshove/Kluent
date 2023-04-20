package org.amshove.kluent.tests.assertions.file

import org.amshove.kluent.aFile
import org.amshove.kluent.`should not be`
import org.amshove.kluent.shouldNotBeFile
import java.io.File
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotBeAFileShould {
    private val file = File("isFile")
    private val dir = File("isDir")

    @Test
    fun passWhenTestingAFileThatIsNotAFile() {
        dir.useDir { it.shouldNotBeFile() }
    }

    @Test
    fun failWhenTestingAFileThatIsAFile() {
        file.useFile { assertFails { it.shouldNotBeFile() } }
    }

    @Test
    fun passWhenTestingAFileThatIsNotAFileBacktick() {
        dir.useDir { it `should not be` aFile }
    }

    @Test
    fun failWhenTestingAFileThatIsAFileBacktick() {
        file.useFile { assertFails { it `should not be` aFile } }
    }
}
