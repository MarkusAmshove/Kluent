package org.amshove.kluent

import org.junit.rules.TemporaryFolder
import java.io.File
import java.nio.charset.Charset
import java.nio.file.Paths

fun temporaryFolder(init: TemporaryFolderBuilder.() -> Unit): TemporaryFolder {
    val folder = TemporaryFolder()
    folder.create()
    val builder = TemporaryFolderBuilder(folder)
    init(builder)
    return folder
}

class TemporaryFolderBuilder(private val temporaryFolder: TemporaryFolder) {
    fun dir(name: String, init: (FolderBuilder.() -> Unit)? = null): FolderBuilder {
        val folder = createFolder(name)
        val folderBuilder = FolderBuilder(folder)
        init?.invoke(folderBuilder)
        return folderBuilder
    }

    fun file(name: String, init: FileBuilder.() -> Unit): FileBuilder {
        val file = temporaryFolder.newFile(name)
        val fileBuilder = FileBuilder(file)
        file.createNewFile()
        init(fileBuilder)
        return fileBuilder
    }

    private fun createFolder(name: String): File {
        if (name.contains("/")) {
            var currentPath = temporaryFolder.root.toPath()
            var lastFile = File(currentPath.toUri())
            lastFile.mkdir()
            name.split("/").forEach {
                if (!it.isEmpty()) {
                    currentPath = Paths.get(currentPath.toString(), it)
                    lastFile = File(currentPath.toUri())
                    lastFile.mkdir()
                }
            }

            return lastFile
        } else {
            return temporaryFolder.newFolder(name)
        }
    }
}

class FolderBuilder(private val folder: File) {
    fun dir(name: String, init: FolderBuilder.() -> Unit): FolderBuilder {
        val folder = File(folder, name)
        val folderBuilder = FolderBuilder(folder)
        folder.mkdir()
        init(folderBuilder)
        return folderBuilder
    }

    fun file(name: String, init: (FileBuilder.() -> Unit)? = null): FileBuilder {
        val file = File(folder, name)
        val fileBuilder = FileBuilder(file)
        file.createNewFile()
        init?.invoke(fileBuilder)
        return fileBuilder
    }
}

class FileBuilder(private val file: File) {
    fun content(charset: Charset = Charset.defaultCharset(), content: () -> String) {
        val theContent = content()
        file.writeText(theContent, charset)
    }

    fun trimContent(charset: Charset = Charset.defaultCharset(), content: () -> String) {
        val theContent = content().trimIndent()
        file.writeText(theContent, charset)
    }

}
