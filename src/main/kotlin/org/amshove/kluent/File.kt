package org.amshove.kluent

import org.assertj.core.api.Assertions.assertThat
import java.io.File

fun File.shouldExist() = assertThat(this.exists()).`as`("The file does not exist").isTrue()
fun File.shouldNotExist() = assertThat(this.exists()).`as`("The file exists").isFalse()

fun File.shouldBeDir() = assertThat(this.isDirectory).`as`("The file is not a directory").isTrue()
fun File.shouldNotBeDir() = assertThat(this.isDirectory).`as`("The file is a directory").isFalse()

fun File.shouldBeFile() = assertThat(this.isFile).`as`("The file is not a file").isTrue()
fun File.shouldNotBeFile() = assertThat(this.isFile).`as`("The file is a file").isFalse()

infix fun File.shouldHaveExtension(other: String) = this.extension shouldEqualTo other
infix fun File.shouldNotHaveExtension(other: String) = this.extension shouldNotEqualTo other

infix fun File.shouldHaveName(other: String) = this.name shouldEqualTo other
infix fun File.shouldNotHaveName(other: String) = this.name shouldNotEqualTo other

