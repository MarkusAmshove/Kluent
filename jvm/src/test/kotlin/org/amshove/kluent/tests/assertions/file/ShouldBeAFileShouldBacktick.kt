package org.amshove.kluent.tests.assertions.file

import org.amshove.kluent.aFile
import org.amshove.kluent.`should be`
import java.io.File
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeAFileShouldBacktick {
    private val file = File("isFile")
    private val dir = File("isDir")

    @Test
    fun passWhenTestingAFileThatIsAFileBacktick() {
        file.useFile { it `should be` aFile }
    }

    @Test
    fun failWhenTestingAFileThatIsNotAFileBacktick() {
        dir.useDir { assertFails { it `should be` aFile } }
    }
}

