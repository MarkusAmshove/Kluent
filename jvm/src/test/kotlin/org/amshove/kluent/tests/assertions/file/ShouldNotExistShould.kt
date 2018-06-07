package org.amshove.kluent.tests.assertions.file

import org.amshove.kluent.shouldNotExist
import org.junit.Test
import java.io.File
import kotlin.test.assertFails

class ShouldNotExistShould {
    val file = File("test")


    @Test
    fun passWhenTestingAFileThatDoesNotExist() {
        file.shouldNotExist()
    }

    @Test
    fun failWhenTestingAFileThatExists() {
        assertFails { file.useFile { it.shouldNotExist() } }
    }
}
