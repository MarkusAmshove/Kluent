package org.amshove.kluent.tests.assertions.file

import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldExist
import org.junit.Test
import java.io.File

class ShouldExistShould {
    private val file = File("test")

    @Test
    fun passWhenTestingAFileThatExists() {
        file.useFile { it.shouldExist() }
    }

    @Test
    fun failWhenTestingAFileThatDoesNotExist() {
        assertFails { file.shouldExist() }
    }
}