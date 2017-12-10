# Define own assertions

Starting with Kluent 1.32, a generic `should` method was added to build domain specific assertions.

When the receiver function passed to `should` returns `false` *or* throws an exception, it will fail with an optional failure message.

## Example

```kt
data class Person(val name: String, val surname: String)

fun Person.shouldHaveUppercaseName() = this.should("The name of $this should be uppercase") {
    name[0].isUpperCase()
}


Person("Pan", "Peter").shouldHaveUppercaseName()
```