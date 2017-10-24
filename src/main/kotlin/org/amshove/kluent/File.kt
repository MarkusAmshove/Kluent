package org.amshove.kluent

import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import java.io.File

fun File.shouldExist() = assertTrue(this.exists(), "The file does not exist")
fun File.shouldNotExist() = assertFalse(this.exists(), "The file exists")

fun File.shouldBeDir() = assertTrue(this.isDirectory, "The file is not a directory")
fun File.shouldNotBeDir() = assertFalse(this.isDirectory, "The file is a directory")

fun File.shouldBeFile() = assertTrue(this.isFile, "The file is not a file")
fun File.shouldNotBeFile() = assertFalse(this.isFile, "The file is a file")

infix fun File.shouldHaveExtension(other: String) = this.extension shouldEqualTo other
infix fun File.shouldNotHaveExtension(other: String) = this.extension shouldNotEqualTo other

infix fun File.shouldHaveName(other: String) = this.name shouldEqualTo other
infix fun File.shouldNotHaveName(other: String) = this.name shouldNotEqualTo other

