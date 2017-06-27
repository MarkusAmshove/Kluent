# FileSystem assertions

The following assertions are provided as extension methods to `java.io.File`

```kt
val file = ... // of type java.io.File

file.shouldExist()
file.shouldNotExist()

file.shouldBeDir()
file.shouldNotBeDir()

file.shouldBeFile()
file.shouldNotBeFile()

file.shouldHaveExtension("txt")
file.shouldNotHaveExtension("txt")

file.shouldHaveName("myFile")
file.shouldNotHaveName("myFile")
```
