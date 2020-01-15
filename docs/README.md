# Kluent

Kluent is a "Fluent Assertions" library written specifically for Kotlin.

It uses the [Infix-Notations](https://kotlinlang.org/docs/reference/functions.html#infix-notation "Infix-Notation") and [Extension Functions](https://kotlinlang.org/docs/reference/extensions.html#extension-functions "Extension Functions") of Kotlin to provide a fluent wrapper around JUnit-Asserts and Mockito.

[How to contribute](../CONTRIBUTING.md)

[Contributors](../AUTHORS.md)

[Changelog](https://github.com/MarkusAmshove/Kluent/blob/master/CHANGELOG.md)

[ ![Download](https://api.bintray.com/packages/markusamshove/maven/kluent/images/download.svg) ](https://bintray.com/markusamshove/maven/Kluent/_latestVersion) 


| Platform  | Status  |
|     ---       |  ---    |
| MacOS / Linux |   [![Build Status](https://travis-ci.org/MarkusAmshove/Kluent.svg?branch=master)](https://travis-ci.org/MarkusAmshove/Kluent)            |
| Windows       |  [![Build status](https://ci.appveyor.com/api/projects/status/c8j2nkwb5nc8b55a?svg=true)](https://ci.appveyor.com/project/magges/kluent) |

# Guide

[Basic Assertions](BasicAssertions.md)

[Numerical Assertions](NumericalAssertions.md)

[CharSequence Assertions](CharSequenceAssertions.md)

[Collection Assertions](CollectionAssertions.md)

[Exception handling](Exceptions.md)

[Mocking](Mocking.md)

[java.time Assertions](JavaTime.md)

[FileSystem](FileSystem.md)

[Define own assertions](DefineOwn.md)

## Using backticks

Every method that is included in Kluent also has a "backtick version", to make it feel more like a describing sentence.

Some examples:

### assertEquals ##
    "hello" shouldBeEqualTo "hello"
    "hello".shouldBeEqualTo("hello")
    "hello" `should be equal to` "hello"

### assertNotEquals ##
    "hello" shouldNotBeEqualTo "world"
    "hello".shouldNotBeEqualTo("world")
    "hello" `should not be equal to` "world"

## Collections

    shouldBeEmpty

    shouldNotBeEmpty

## CharSequence

    shouldBeEmpty

    shouldNotBeEmpty

    shouldBeBlank

    shouldNotBeBlank

## CharSequence?

    shouldBeNullOrEmpty

    shouldNotBeNullOrEmpty

    shouldBeNullOrBlank

    shouldNotBeNullOrBlank

## Nullables

    shouldBeNull

    shouldNotBeNull

## Boolean

    shouldBeTrue

    shouldBeFalse

    shouldNotBeTrue

    shouldNotBeFalse

## Chaining of assertions

```kt
val number = 42

number
        .shouldBePositive()
        .shouldBeGreaterThan(10)
        .shouldBeLessThan(43)
        .shouldBeInRange(40..45)
        .shouldNotBeInRange(45..50)
```

