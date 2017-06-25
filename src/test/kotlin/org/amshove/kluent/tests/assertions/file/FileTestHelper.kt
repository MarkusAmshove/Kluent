package org.amshove.kluent.tests.assertions.file

import java.io.File

/**
 * Constructs a directory or a plain file with no content and deletes it after the body has run
 */
fun File.useFile(isDir: Boolean = false, body: (file: File) -> Unit) = try {
    if (isDir) this.mkdir() else this.writeText("")
    body(this)
} finally {
    if (!this.delete()) throw Exception("Could not delete file")
}

fun File.useDir(body: (file: File) -> Unit) = this.useFile(true, body)