# Kluent

Kluent is a "Fluent Assertions" library written specifically for Kotlin.

It uses the [Infix-Notations](https://kotlinlang.org/docs/reference/functions.html#infix-notation "Infix-Notation") and [Extension Functions](https://kotlinlang.org/docs/reference/extensions.html#extension-functions "Extension Functions") of Kotlin to provide a fluent wrapper around JUnit-Asserts and Mockito.

 [ ![Download](https://api.bintray.com/packages/markusamshove/maven/Kluent/images/download.svg) ](https://bintray.com/markusamshove/maven/Kluent/_latestVersion) [![Build Status](https://travis-ci.org/MarkusAmshove/Kluent.svg?branch=master)](https://travis-ci.org/MarkusAmshove/Kluent)


# Guide

[Basic Assertions](BasicAssertions.md)

[Numerical Assertions](NumericalAssertions.md)

[CharSequence Assertions](CharSequenceAssertions.md)

[Collection Assertions](CollectionAssertions.md)

[Exception handling](Exceptions.md)

[Mocking](Mocking.md)

[java.time Assertions](JavaTime.md)

[FileSystem](FileSystem.md)

## Using backticks

Every method that is included in Kluent also has a "backtick version", to make it feel more like a describing sentence.

Some examples:

### assertEquals ##
    "hello" shouldEqual "hello"
    "hello" `should equal` "hello"

### assertNotEquals ##
    "hello" shouldNotEqual "world"
    "hello" `should not equal` "world"

# Changelog
# 1.26
* Fix wrong assertion in `shouldNotBeGreaterThan` | [Issue](https://github.com/MarkusAmshove/Kluent/issues/51) | [PR](https://github.com/MarkusAmshove/Kluent/pull/52) | thanks to [@goreRatzete](https://github.com/goreRatzete) and [@guenhter](https://github.com/guenhter)

# 1.25
* Allow Errors to be thrown from a stub  | [PR](https://github.com/MarkusAmshove/Kluent/pull/50) | thanks to [@guenhter](https://github.com/guenhter)

# 1.24
* Add assertions for `java.io.File` | [Issue](https://github.com/MarkusAmshove/Kluent/issues/47) | [PR](https://github.com/MarkusAmshove/Kluent/pull/48) | thanks to [@goreRatzete](https://github.com/goreRatzete)

# 1.23
* Add shouldContainAll and shouldNotContainAny assertions | [PR](https://github.com/MarkusAmshove/Kluent/pull/44) | thanks to [@Egorand](https://github.com/Egorand)

# 1.22
* Verify that a method was not called | [PR](https://github.com/MarkusAmshove/Kluent/pull/43) | thanks to [@miszmaniac](https://github.com/miszmaniac)

# 1.21
* Support primitive Arrays | [Issue](https://github.com/MarkusAmshove/Kluent/issues/42) | thanks to [@Tapchicoma](https://github.com/Tapchicoma)

# 1.20
* Use `Throwable` instead of `Exception` as base type for asserts on `Exception`s | [Issue](https://github.com/MarkusAmshove/Kluent/issues/40) | [PR](https://github.com/MarkusAmshove/Kluent/pull/41) | thanks to [@westonal](https://github.com/westonal)

# 1.19
* ExceptionResult is now Typed and withCause and withMessage are now fluent | [PR](https://github.com/MarkusAmshove/Kluent/pull/38) | thanks to [@vjames19](https://github.com/vjames19)

# 1.18
* Fix generation of maven poms | [Issue](https://github.com/MarkusAmshove/Kluent/issues/37) | thanks to [@binkley](https://github.com/binkley)

# 1.17
* Update Kotlin to 1.1.1 | [PR](https://github.com/MarkusAmshove/Kluent/pull/28) | thanks to [@Egorand](https://github.com/Egorand)
* Update Gradle to 3.4.1 | [PR](https://github.com/MarkusAmshove/Kluent/pull/29) | thanks to [@Egorand](https://github.com/Egorand)
* Fix compiler warnings in tests | [PR](https://github.com/MarkusAmshove/Kluent/pull/30) | thanks to [@Egorand](https://github.com/Egorand)
* Update JUnit and Mockito | [Issue](https://github.com/MarkusAmshove/Kluent/issues/31) | thanks to [@Jeevuz](https://github.com/Jeevuz))
* Fix reversed message in ShouldNotThrow | [Issue](https://github.com/MarkusAmshove/Kluent/issues/33) | [PR](https://github.com/MarkusAmshove/Kluent/pull/34) | thanks to [@goreRatzete](https://github.com/goreRatzete)
* Use mockito-kotlin for mocking | [Issue](https://github.com/MarkusAmshove/Kluent/issues/32) | [PR](https://github.com/MarkusAmshove/Kluent/pull/35) | thanks to [@fishb6nes](https://github.com/fishb6nes)
* Add Assertions for LocalDateTime, LocalTime, LocalDate | [PR](https://github.com/MarkusAmshove/Kluent/pull/36) | [Documentation](JavaTime.md)

# 1.16
* Update Kotlin to 1.1.0
* Correct assertion message for `Collection.shouldBeEmpty` | [Issue](https://github.com/MarkusAmshove/Kluent/issues/27)

# 1.15
* Rework failure messages of shouldNotContain assertions | [Issue](https://github.com/MarkusAmshove/Kluent/issues/20)
* Extract assertions into different files
* Add withCause for Exception-Assertions | [Issue](https://github.com/MarkusAmshove/Kluent/issues/24) | [PR](https://github.com/MarkusAmshove/Kluent/pull/25) | thanks to [@okkero](https://github.com/okkero)
* Add common non infix assertions | [Issue](https://github.com/MarkusAmshove/Kluent/issues/21) | [PR](https://github.com/MarkusAmshove/Kluent/pull/26)

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


# 1.14
* Introduce numerical operations | [Issue](https://github.com/MarkusAmshove/Kluent/issues/17) | [PR](https://github.com/MarkusAmshove/Kluent/pull/18)

    shouldBeGreaterOrEqualTo

    shouldBeGreaterThan

    shouldBeLessOrEqualTo

    shouldBeLessThan

    shouldBePositive

    shouldBeNegative

    shouldBeInRange

# 1.13
* Provide methods to check if an object is a given instance | [PR](https://github.com/MarkusAmshove/Kluent/pull/16) | thanks to [@GAumala](https://github.com/GAumala)

    shouldBeInstanceOf

    shouldNotBeInstanceOf

# 1.12
* Update Kotlin to 1.0.6 | [Issue](https://github.com/MarkusAmshove/Kluent/issues/14) | [PR](https://github.com/MarkusAmshove/Kluent/pull/15)

# 1.11
* Provide methods for common String operations | [Issue](https://github.com/MarkusAmshove/Kluent/issues/12) | [PR](https://github.com/MarkusAmshove/Kluent/pull/13) | thanks to [@goreRatzeze](https://github.com/goreRatzete)

    shouldStartWith

    shouldNotStartWith

    shouldEndWith

    shouldNotEndWith

    shouldContain

    shouldNotContain

    shouldMatch

    shouldNotMatch

# 1.10

* Provide methods to test maps | [Issue](https://github.com/MarkusAmshove/Kluent/issues/10) | [PR](https://github.com/MarkusAmshove/Kluent/pull/11) | thanks to [@goreRatzeze](https://github.com/goreRatzete)

    shouldHaveKey
    
    shouldNotHaveKey
    
    shouldHaveValue
    
    shouldNotHaveValue
    
    shouldContain (pair)
    
    shouldNotContain (pair)


# 1.9

* Allow subtyping of exceptions | [Issue](https://github.com/MarkusAmshove/Kluent/issues/7) | [PR](https://github.com/MarkusAmshove/Kluent/pull/8) | thanks to [@neyb](https://github.com/neyb)

