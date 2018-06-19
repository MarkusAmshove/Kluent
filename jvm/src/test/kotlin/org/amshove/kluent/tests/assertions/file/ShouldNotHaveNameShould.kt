package org.amshove.kluent.tests.assertions.file

import org.amshove.kluent.shouldNotHaveName
import java.io.File
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotHaveNameShould {
    private val name = "thisfilenameisweird.csv"
    private val file = File(name)

    @Test
    fun passWhenTestingAFileWithADifferentFileName() {
        file.useFile { it.shouldNotHaveName("anothername") }
    }

    @Test
    fun failWhenTestingAFileWithTheCorrectFileName() {
        file.useFile { assertFails { it shouldNotHaveName name } }
    }
}