package org.amshove.kluent.tests.assertions.file

import org.amshove.kluent.Dir
import org.amshove.kluent.`should not be`
import org.amshove.kluent.shouldNotBeDir
import org.junit.Before
import org.junit.Test
import java.io.File
import kotlin.test.assertFails

class ShouldNotBeDirShould {
    lateinit var dir: File
    lateinit var file: File

    @Before
    fun setup() {
        dir = File("testDir")
        file = File("test")
    }

    @Test
    fun passWhenTestingAFile() {
        dir.useFile { it.shouldNotBeDir() }
    }

    @Test
    fun failWhenTestingADir() {
        file.useDir { assertFails { it.shouldNotBeDir() } }
    }

    @Test
    fun passWhenTestingAFileBacktick() {
        dir.useFile { it `should not be` Dir }
    }

    @Test
    fun failWhenTestingADirBacktick() {
        file.useDir { assertFails { it `should not be` Dir } }
    }
}
