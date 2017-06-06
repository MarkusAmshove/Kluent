# Temporary Folder

Unit provides a `@Rule` for the class `TemporaryFolder` which creates a folder hierarchy before each test and deletes them afterwards.

Kluent provides a builder to create a directory structure fluently with `org.amshove.kluent.temporaryFolder`.

This documentation will use `Spek` to write the tests.


## Creating a temporary folder

```kt
class ExampleTests {
    @JvmField
    @Rule
    var folder = temporaryFolder {

    }

    @Test
    fun `the root folder should be created`() {
        folder.root.shouldExist()
    }

}
```

This will create a folder for each test and delete it afterwards.

## Creating a folder within the temporary folder

```kt
var folder : TemporaryFolder? = null
beforeEach {
    folder = temporaryFolder {
        dir("subfolder")
    }
}
afterEach {
    folder!!.delete()
}

it("the subdirectory should exist") {
    folder!!.root.listFiles().count().shouldBe(1)
    folder!!.root.listFiles()[0].shouldExist()
    folder!!.root.listFiles()[0].shouldHaveName("subfolder")
}
```

## Creating a file without content

```kt
var folder : TemporaryFolder? = null
beforeEach {
    folder = temporaryFolder {
        dir("subfolder") {
            file("emptyfile.txt")
        }
    }
}
afterEach {
    folder!!.delete()
}

it("the file should exist") {
   folder!!.root.listFiles()[0].listFiles()[0].shouldExist()
    folder!!.root.listFiles()[0].listFiles()[0].shouldHaveName("emptyfile.txt")
}
```

## Creating a file with content and charset

## Creating a deep hierarchy
