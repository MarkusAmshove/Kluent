package org.amshove.kluent.tests.assertions.file

import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldContainLineWithString
import org.junit.Test
import java.io.File

class ShouldContainLineWithStringShould {
    private val file = File("test")

    @Test
    fun passWhenFileContainsLineWithString() {
        file.useFile { it.shouldContainLineWithString("brown fox") }
    }

    @Test
    fun failWhenFileDoesNotContainLineWithString() {
        assertFails { file.shouldContainLineWithString("blue whale") }
    }
}