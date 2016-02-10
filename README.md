# Kluent

Kluent is a "Fluent Assertions" library written specifically for Kotlin.

It uses the [Infix-Notations](https://kotlinlang.org/docs/reference/functions.html#infix-notation "Infix-Notation") and [Extension Functions](https://kotlinlang.org/docs/reference/extensions.html#extension-functions "Extension Functions") of Kotlin to provide a fluent wrapper around the JUnit-Asserts.

 [ ![Download](https://api.bintray.com/packages/markusamshove/maven/Kluent/images/download.svg) ](https://bintray.com/markusamshove/maven/Kluent/_latestVersion) [![Build Status](https://travis-ci.org/MarkusAmshove/Kluent.svg?branch=master)](https://travis-ci.org/MarkusAmshove/Kluent)

# Include it via gradle/maven

Kluent is hosted in [jCenter](https://bintray.com/markusamshove/maven/Kluent/view# "jCenter")

## Gradle
    dependencies {
        testCompile 'org.amshove.kluent:kluent:1.1'
    }
    
## Maven
    <dependency> 
        <groupId>org.amshove.kluent</groupId>
        <artifactId>kluent</artifactId>
        <version>1.1</version>
        <type>pom</type>
    </dependency>

# Examples
All examples contain the infixNotation as well as the \`backtick Notation\`.

All examples can also be seen in Kluent's tests.

## assertEquals ##
JUnit:

    assertEquals("hello", "hello");

Kluent:

    "hello" shouldEqual "hello"
    OR
    "hello" `should equal` "hello"

## assertNotEquals ##
JUnit:

    assertNotEquals("hello", "world");

Kluent:

    "hello" shouldNotEqual "world"
    OR
    "hello" `should not equal` "world"

## assertSame ##
JUnit:

    assertSame(firstObject, secondObject);

Kluent:

    firstObject shouldBe secondObject
    OR
    firstObject `should be` secondObject;

## assertNotSame ##
JUnit:

    assertNotSame(firstObject, secondObject);

Kluent:

    firstObject shouldNotBe secondObject
    OR
    firstObject `should not be` secondObject

## Assert that an Array/Iterable contains something ##

    val alice = Person("Alice", "Bob")
    val jon = Person("Jon", "Doe")
    val list = listOf(alice, jon)
    list shouldContain jon
    OR
    list `should contain` jon

## Assert that an Array/Iterable doesn't contain something ##

    val alice = Person("Alice", "Bob")
    val jon = Person("Jon", "Doe")
    val list = listOf(alice, jon)
    list shouldNotContain alice
    OR
    list `should not contain` alice

## Assert that something throws an Exception ##

    val func = { throw IndexOutOfBoundsException() }
    func shouldThrow IndexOutOfBoundsException::class
    OR
    func `should throw` IndexOutOfBoundsException::class

## Assert that something throws an Exception with a specific message ##

    val func = { throw Exception("Hello World!") }
    func shouldThrowTheException Exception::class withMessage "Hello World!"
    OR
    func `should throw the Exception` Exception::class `with message` "Hello World!"

## Assert that something throws any Exception (we don't care about the type) ##

    val func = { throw Exception("Hello World!") }
    func shouldThrow AnyException
    OR
    func `should throw` AnyException

## Assert that something doesn't throw an Exception of given type ##

    val func = { throw Exception("Hello World!") }
    func shouldNotThrow IndexOutOfBoundsException::class
    OR
    func `should not throw` IndexOutOfBoundsException::class

## Assert that something doesn't throw an Exception with a specific message ##

    val func = { throw Exception("Hello World!") }
    func shouldNotThrowTheException IndexOutOfBoundsException::class withMessage "Nothing here"
    OR
    func `should not throw the Exception` IndexOutOfBoundsException::class `with message` "Nothing here"

## Assert that something doesn't throw any Exception of any type ##

    val func = { Unit }
    func shouldNotThrow AnyException
    OR
    func `should not throw` AnyException
