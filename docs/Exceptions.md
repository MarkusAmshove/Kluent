# Assert Exceptions

```kt
fun myThrowingFunction() { throw RuntimeException("oops!") }

// Expect any exception
invoking { myThrowingFunction() } shouldThrow AnyException
invoking { myThrowingFunction() } shouldNotThrow AnyException


// Expect a specific type of exception
invoking { myThrowingFunction() } shouldThrow RuntimeException::class
invoking { myThrowingFunction() } shouldNotThrow RuntimeException::class


// Expect a specific exception with a specific message
invoking { myThrowingFunction() } shouldThrow RuntimeException::class withMessage "oops!"
invoking { myThrowingFunction() } shouldNotThrow RuntimeException::class withMessage "oops!"


// Expect a specific type of cause
invoking { myThrowingFunction() } shouldThrow RuntimeException::class withCause IllegalArgumentException::class
invoking { myThrowingFunction() } shouldNotThrow RuntimeException::class withCause IllegalArgumentException::class


// Expecting a specific type and message can be chained
val func = { throw IllegalArgumentException("hello", IOException()) }
func shouldThrow IllegalArgumentException::class withCause IOException::class withMessage "hello"


// Expect a specific Exception based on `equals` comparison
data class CustomException(val code: Int) : Exception("code is $code")
val func = { throw CustomException(12345) }
func shouldThrow CustomException(12345)

// The above assertions also work with suspend functions:
suspend fun myThrowingSuspendFunction() { throw RuntimeException("oops!") }

invokingSuspend { myThrowingSuspendFunction() } shouldThrow RuntimeException::class withMessage "oops!"
invokingSuspend { myThrowingSuspendFunction() } shouldNotThrow RuntimeException::class withMessage "oops!"
```
