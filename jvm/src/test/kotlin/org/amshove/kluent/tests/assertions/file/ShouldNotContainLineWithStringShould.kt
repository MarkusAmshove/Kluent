package org.amshove.kluent.tests.assertions.file

import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldContainLineWithString
import org.amshove.kluent.shouldNotContainLineWithString
import org.junit.Test
import java.io.File

class ShouldNotContainLineWithStringShould {
    private val file = File("test")

    @Test
    fun passWhenFileDoesNotContainsLineWithString() {
        file.useFile { it.shouldNotContainLineWithString("brown dog") }
    }

    @Test
    fun failWhenFileContainsLineWithString() {
        assertFails { file.shouldNotContainLineWithString("lazy dog") }
    }
}