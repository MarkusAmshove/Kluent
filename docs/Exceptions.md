# Assert Exceptions

```kt
fun myThrowingFunction() { throw RuntimeException("oops!") }

// Wrap the function which might throw an exception
val theFunction = { myThrowingFunction() }

// Expect any exception
theFunction shouldThrow AnyException
theFunction shouldNotThrow AnyException


// Expect a specific type of exception
theFunction shouldThrow RuntimeException::class
theFunction shouldNotThrow RuntimeException::class


// Expect a specific exception with a specific message
theFunction shouldThrow RuntimeException::class withMessage "oops!"
theFunction shouldNotThrow RuntimeException::class withMessage "oops!"


// Expect a specific type of cause
theFunction shouldThrow RuntimeException::class withCause IllegalArgumentException::class
theFunction shouldNotThrow RuntimeException::class withCause IllegalArgumentException::class

// Expecting a specific type and message can be chained
val func = { throw IllegalArgumentException("hello", IOException()) }
func shouldThrow IllegalArgumentException::class withCause IOException::class withMessage "hello"
```