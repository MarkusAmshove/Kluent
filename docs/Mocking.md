# Mocking

Kluent wraps [mockito-kotlin](https://github.com/nhaarman/mockito-kotlin) to provide a fluent API

## Mocking

```kt
interface Database {
    fun getPerson(): Person
    fun getPerson(id: Int): Person
}

// Verify that a method was called
val mock = mock(Database::class)
mock.getPerson(5)
Verify on mock that mock.getPerson() was called

// Verify that a method with any parameter was called
val mock = mock(Database::class)
mock.getPerson(200)
Verify on mock that mock.getPerson(any()) was called

// Verify no interactions
val mock = mock(Database::class)
VerifyNoInteractions on mock

// Verify no further interactions
val mock = mock(Database::class)
mock.getPerson(1)
mock.getPerson(5)
Verify on mock that mock.getPerson(1) was called
Verify on mock that mock.getPerson(5) was called
VerifyNoFurtherInteractions on mock
```

## Stubbing

```kt
interface Database {
    fun getPerson(): Person
    fun getPerson(id: Int): Person
}
data class Person(val name: String, val surname: String)
val bob = Person("Bob", "Guy")
val alice = Person("Alice", "Person")

// Let a stub return an instance
val stub = mock(Database::class)
When calling stub.getPerson() itReturns bob
val stub = mock(Database::class)
When calling stub.getPerson(any()) itReturns alice

// Let a stub throw an exception
val stub = mock(Database::class)
When calling stub.getPerson() itThrows RuntimeException("An exception")
```
