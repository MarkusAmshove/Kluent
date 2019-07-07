package org.amshove.kluent.tests.assertions.file

import org.amshove.kluent.shouldNotHaveExtension
import org.junit.Test
import java.io.File
import kotlin.test.assertFails


class ShouldNotHaveExtensionShould {
    val txtFile = File("test.txt")
    val wavFile = File("test.wav")


    @Test
    fun passWhenTestingAFileWithAnUnexpectedExtension() {
        txtFile.useFile { it.shouldNotHaveExtension("wav") }
    }

    @Test
    fun failWhenTestingAFileWithThePassedExtension() {
        wavFile.useFile { assertFails { it.shouldNotHaveExtension("wav") } }
    }
}