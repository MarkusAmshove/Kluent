package org.amshove.kluent

import java.io.File

fun File.shouldExist() = assert(this.exists()) {
    "The file does not exist"
}

fun File.shouldNotExist() = assert(!this.exists()) {
    "The file exists"
}

fun File.shouldBeDir() = assert(this.isDirectory) {
    "The file is not a directory"
}

fun File.shouldNotBeDir() = assert(!this.isDirectory) {
    "The file is a directory"
}

fun File.shouldBeFile() = assert(this.isFile) {
    "The file is not a file"
}

fun File.shouldNotBeFile() = assert(!this.isFile) {
    "The file is a file"
}

infix fun File.shouldHaveExtension(other: String) = this.extension shouldEqualTo other
infix fun File.shouldNotHaveExtension(other: String) = this.extension shouldNotEqualTo other

infix fun File.shouldHaveName(other: String) = this.name shouldEqualTo other
infix fun File.shouldNotHaveName(other: String) = this.name shouldNotEqualTo other

