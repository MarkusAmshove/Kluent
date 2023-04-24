package org.amshove.kluent.tests.assertions.file

import org.amshove.kluent.Exist
import org.amshove.kluent.`should not`
import org.junit.Test
import java.io.File
import kotlin.test.assertFails

class ShouldNotExistShouldBacktick {
    val file = File("test")

    @Test
    fun passWhenTestingAFileThatDoesNotExistBacktick() {
        file `should not` Exist
    }

    @Test
    fun failWhenTestingAFileThatExistsBacktick() {
        assertFails { file.useFile { it `should not` Exist } }
    }
}
