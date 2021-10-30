package org.amshove.kluent.tests.assertions.file

import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldHaveName
import java.io.File
import kotlin.test.Test

class ShouldHaveNameShould {
    private val name = "thisfilenameisweird.csv"
    private val file = File(name)

    @Test
    fun passWhenTestingAFileWithTheExpectedFileName() {
        file.useFile { it shouldHaveName name }
    }

    @Test
    fun failWhenTestingAFileWithAnUnexpectedFileName() {
        file.useFile { assertFails { it shouldHaveName "anothername" } }
    }
}

