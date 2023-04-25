package org.amshove.kluent.tests.assertions.file

import org.amshove.kluent.Exist
import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.should
import org.junit.Test
import java.io.File

class ShouldExistShouldBacktick {
    private val file = File("test")

    @Test
    fun passWhenTestingAFileThatExistsInfix() {
        file.useFile { it should Exist }
    }

    @Test
    fun failWhenTestingAFileThatDoesNotExistInfix() {
        assertFails { file should Exist }
    }
}
