package org.amshove.kluent.tests.assertions.file

import org.amshove.kluent.shouldNotBeFile
import java.io.File
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotBeFileShould {
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
}