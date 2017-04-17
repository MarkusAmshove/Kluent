package org.amshove.kluent.tests.builder

import org.amshove.kluent.shouldBeTrue
import org.amshove.kluent.shouldEqual
import org.amshove.kluent.temporaryFolder
import org.jetbrains.spek.api.Spek
import org.junit.rules.TemporaryFolder
import java.io.File

class TemporaryFolderTests : Spek({
    given("the temporaryFolder method") {
        var testFolder: TemporaryFolder? = null
        on("building a single file") {
            beforeEach {
                testFolder = temporaryFolder {
                    file("myFile.txt") {
                        content { "Hello World!" }
                    }
                }
            }

            it("should exist") {
                File(testFolder!!.root.absolutePath, "myFile.txt").exists().shouldBeTrue()
            }

            it("should write the content") {
                File(testFolder!!.root.absolutePath, "myFile.txt").readText().shouldEqual("Hello World!")
            }
        }
        afterEach {
            testFolder!!.delete()
        }
        on("building a folder") {
            beforeEach {
                testFolder = temporaryFolder {
                    dir("myDirectory") {}
                }
            }

            it("should exist") {
                File(testFolder!!.root.absolutePath, "myDirectory").exists().shouldBeTrue()
            }

            it("should be a folder") {
                File(testFolder!!.root.absolutePath, "myDirectory").isDirectory.shouldBeTrue()
            }
        }
        on("building a file within a folder") {
            beforeEach {
                testFolder = temporaryFolder {
                    dir("src") {
                        dir("main") {
                            dir("java") {
                                file("Main.java") {
                                    content { "Hello World!" }
                                }
                            }
                        }
                    }
                }
            }

            it("should exist") {
                File(testFolder!!.root.absolutePath, "src/main/java/Main.Java").exists().shouldBeTrue()
            }

            it("should contain the content") {
                File(testFolder!!.root.absolutePath, "src/main/java/Main.Java").readText().shouldEqual("Hello World!")
            }
        }
        on("building a file within a folder hierarchy") {
            beforeEach {
                testFolder = temporaryFolder {
                    dir("src/main/java") {
                        file("Main.java") {
                            content { "Hello World!" }
                        }
                    }
                }
            }

            it("should exist") {
                File(testFolder!!.root.absolutePath, "src/main/java/Main.Java").exists().shouldBeTrue()
            }

            it("should contain the content") {
                File(testFolder!!.root.absolutePath, "src/main/java/Main.Java").readText().shouldEqual("Hello World!")
            }
        }
        on("building a file with trimmed indent") {
            beforeEach {
                testFolder = temporaryFolder {
                    dir("src") {
                        file("Main.java") {
                            trimContent {
                                """
                                public static void main(String[] args) { System.out.println("Hello World!"); }
                                """
                            }
                        }
                    }
                }
            }

            it("should exist") {
                File(testFolder!!.root.absolutePath, "src/Main.Java").exists().shouldBeTrue()
            }

            it("should contain the trimmed content") {
                File(testFolder!!.root.absolutePath, "src/Main.Java").readText().shouldEqual("""public static void main(String[] args) { System.out.println("Hello World!"); }""")
            }
        }
    }
})

