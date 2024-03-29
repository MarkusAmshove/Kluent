package org.amshove.kluent.tests.assertions.file

import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldBeDir
import org.junit.Before
import org.junit.Test
import java.io.File

class ShouldBeDirShould {
    lateinit var dir: File
    lateinit var file: File

    @Before
    fun setup() {
        dir = File("testDir")
        file = File("test")
    }

    @Test
    fun passWhenTestingADirectory() {
        dir.useDir { it.shouldBeDir() }
    }

    @Test
    fun passWhenTestingAFile() {
        file.useFile { assertFails { it.shouldBeDir() } }
    }
}
