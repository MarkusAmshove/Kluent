# FileSystem assertions

The following assertions are provided as extension methods to `java.io.File`

```kt
val file = ... // of type java.io.File

file.shouldExist()
file.shouldNotExist()
file should Exist

file.shouldBeDir()
file.shouldNotBeDir()
file `should be` Dir

file.shouldBeFile()
file.shouldNotBeFile()
file `should be` aFile

file.shouldHaveExtension("txt")
file.shouldNotHaveExtension("txt")

file.shouldHaveName("myFile")
file.shouldNotHaveName("myFile")

file.shouldContainLineWithString("aSampleString")
file.shouldNotContainLineWithString("aSampleString")
```
