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
theFunction shouldThrowTheException RuntimeException::class withMessage "oops!"
theFunction shouldNotThrowTheException RuntimeException::class withMessage "oops!"


// Expect a specific type of cause
theFunction shouldThrowTheException RuntimeException::class withCause IllegalArgumentException::class
theFunction shouldNotThrowTheException RuntimeException::class withCause IllegalArgumentException::class
```