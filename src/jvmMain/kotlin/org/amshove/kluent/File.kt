package org.amshove.kluent

import org.amshove.kluent.internal.assertFalse
import org.amshove.kluent.internal.assertTrue
import java.io.File

fun File.shouldExist() = assertTrue("The file '${this.absolutePath}' should exist, but does not", this.exists())
fun File.shouldNotExist() = assertFalse("The file '${this.absolutePath}' should not exist, but does", this.exists())

fun File.shouldBeDir() = assertTrue("The file '${this.absolutePath}' should be a directory, but is not", this.isDirectory)
fun File.shouldNotBeDir() = assertFalse("The file '${this.absolutePath}' should not be a directory, but is", this.isDirectory)

fun File.shouldBeFile() = assertTrue("The file '${this.absolutePath}' should be a file, but is not", this.isFile)
fun File.shouldNotBeFile() = assertFalse("The file '${this.absolutePath}' should not be a file, but is", this.isFile)

infix fun File.shouldHaveExtension(other: String) = this.extension shouldBeEqualTo other
infix fun File.shouldNotHaveExtension(other: String) = this.extension shouldNotBeEqualTo other

infix fun File.shouldHaveName(other: String) = this.name shouldBeEqualTo other
infix fun File.shouldNotHaveName(other: String) = this.name shouldNotBeEqualTo other

