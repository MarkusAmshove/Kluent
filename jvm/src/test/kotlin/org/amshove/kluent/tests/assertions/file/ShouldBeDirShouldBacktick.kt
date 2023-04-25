package org.amshove.kluent.tests.assertions.file

import org.amshove.kluent.Dir
import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.`should be`
import org.junit.Before
import org.junit.Test
import java.io.File

class ShouldBeDirShouldBacktick {
    lateinit var dir: File
    lateinit var file: File

    @Before
    fun setup() {
        dir = File("testDir")
        file = File("test")
    }

    @Test
    fun passWhenTestingADirectoryBacktick() {
        dir.useDir { it `should be` Dir }
    }

    @Test
    fun passWhenTestingAFileBacktick() {
        file.useFile { assertFails { it `should be` Dir } }
    }
}
