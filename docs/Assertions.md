# Assertions

This file contains examples on supported assertions.

## assertEquals ##
JUnit:

    assertEquals("hello", "hello");

Kluent:

    "hello" shouldEqual "hello"

## assertNotEquals ##
JUnit:

    assertNotEquals("hello", "world");

Kluent:

    "hello" shouldNotEqual "world"

## assertSame ##
JUnit:

    assertSame(firstObject, secondObject);

Kluent:

    firstObject shouldBe secondObject

## assertNotSame ##
JUnit:

    assertNotSame(firstObject, secondObject);

Kluent:

    firstObject shouldNotBe secondObject

## Assert that Arrays are equal ##
JUnit:

     assertArrayEquals(firstArray, secondArray);

Kluent:

    firstArray shouldEqual secondArray

## Assert that Iterables are equal ##
Kluent:

    firstIterable shouldEqual secondIterable

## Assert that an Array/Iterable contains something ##

    val alice = Person("Alice", "Bob")
    val jon = Person("Jon", "Doe")
    val list = listOf(alice, jon)
    list shouldContain jon

## Assert that an Array/Iterable doesn't contain something ##

    val alice = Person("Alice", "Bob")
    val jon = Person("Jon", "Doe")
    val list = listOf(alice, jon)
    list shouldNotContain alice

## Assert that something throws an Exception ##

    val func = { throw IndexOutOfBoundsException() }
    func shouldThrow IndexOutOfBoundsException::class

## Assert that something throws an Exception with a specific message ##

    val func = { throw Exception("Hello World!") }
    func shouldThrowTheException Exception::class withMessage "Hello World!"

## Assert that something throws any Exception (we don't care about the type) ##

    val func = { throw Exception("Hello World!") }
    func shouldThrow AnyException

## Assert that something doesn't throw an Exception of given type ##

    val func = { throw Exception("Hello World!") }
    func shouldNotThrow IndexOutOfBoundsException::class

## Assert that something doesn't throw an Exception with a specific message ##

    val func = { throw Exception("Hello World!") }
    func shouldNotThrowTheException IndexOutOfBoundsException::class withMessage "Nothing here"

## Assert that something doesn't throw any Exception of any type ##

    val func = { Unit }
    func shouldNotThrow AnyException
