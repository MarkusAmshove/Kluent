package org.amshove.kluent.tests.assertions.file

import org.amshove.kluent.shouldHaveExtension
import org.amshove.kluent.shouldNotHaveExtension
import org.jetbrains.spek.api.Spek
import java.io.File
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldHaveExtensionShould {
    private val txtFile = File("test.txt")
    private val wavFile = File("test.wav")

    @Test
    fun passWhenTestingAFileWithTheExpectedExtension() {
        txtFile.useFile { it.shouldHaveExtension("txt") }
    }

    @Test
    fun failWhenTestingAFileWithAnUnexpectedExtension() {
        wavFile.useFile { assertFails { it.shouldHaveExtension("txt") } }
    }

}