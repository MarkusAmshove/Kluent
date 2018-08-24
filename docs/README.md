# Kluent

Kluent is a "Fluent Assertions" library written specifically for Kotlin.

It uses the [Infix-Notations](https://kotlinlang.org/docs/reference/functions.html#infix-notation "Infix-Notation") and [Extension Functions](https://kotlinlang.org/docs/reference/extensions.html#extension-functions "Extension Functions") of Kotlin to provide a fluent wrapper around JUnit-Asserts and Mockito.

[How to contribute](../CONTRIBUTING.md)

[Contributors](../AUTHORS.md)

[ ![Download](https://api.bintray.com/packages/markusamshove/maven/Kluent/images/download.svg) ](https://bintray.com/markusamshove/maven/Kluent/_latestVersion) 


| Platform  | Status  |
|     ---       |  ---    |
| MacOs / Linux |   [![Build Status](https://travis-ci.org/MarkusAmshove/Kluent.svg?branch=master)](https://travis-ci.org/MarkusAmshove/Kluent)            |
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
    "hello" shouldEqual "hello"
    "hello".shouldEqual("hello")
    "hello" `should equal` "hello"

### assertNotEquals ##
    "hello" shouldNotEqual "world"
    "hello".shouldNotEqual("world")
    "hello" `should not equal` "world"

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

# Changelog

# 1.41
* Implement numerical assertions for `BigDecimal` | [Issue](https://github.com/MarkusAmshove/Kluent/issues/114) | [PR](https://github.com/MarkusAmshove/Kluent/pull/116)

# 1.40
* Implement `shouldContainSame` | [PR](https://github.com/MarkusAmshove/Kluent/pull/113) | thanks to [@fabriciorissetto](https://github.com/fabriciorissetto)

# 1.39
* Provide `shouldBeDigit` and `shouldNotBeDigit` | [Issue](https://github.com/MarkusAmshove/Kluent/issues/107) | thanks to [@AndreasVolkmann](https://github.com/AndreasVolkmann) | [PR](https://github.com/MarkusAmshove/Kluent/pull/106)
* Implement `shouldHaveTheSameClassAs` and `shouldNotHaveTheSameClassAs` | [Issue](https://github.com/MarkusAmshove/Kluent/issues/110) | thanks to [@igorwojda](https://github.com/igorwojda) | [PR](https://github.com/MarkusAmshove/Kluent/pull/106)
* Add checked exceptions to `itThrows` | [Issue](https://github.com/MarkusAmshove/Kluent/issues/109) | thanks to [@thetric](https://github.com/thetric) | [PR](https://github.com/MarkusAmshove/Kluent/pull/106)
* Restructure project into platform modules to prepare for 2.0 | [PR](https://github.com/MarkusAmshove/Kluent/pull/106)
* Create more overloads for Collections | [Issue](https://github.com/MarkusAmshove/Kluent/issues/108) | [PR](https://github.com/MarkusAmshove/Kluent/pull/106)

# 1.38
* Return correct subtype of `CharSequence` assertions | [Issue](https://github.com/MarkusAmshove/Kluent/issues/104) | [PR](https://github.com/MarkusAmshove/Kluent/pull/105) | thanks to [@AndreasVolkmann](https://github.com/AndreasVolkmann)

# 1.37
* Add `shouldContainAll` for `CharSequence` | [Issue](https://github.com/MarkusAmshove/Kluent/issues/100) | [PR](https://github.com/MarkusAmshove/Kluent/pull/102) | thanks to [@AndreasVolkmann](https://github.com/AndreasVolkmann)

# 1.36
* Assert that a CharSequence contains a Char | [Issue](https://github.com/MarkusAmshove/Kluent/issues/98)
* Include the file path in `File` assertions | [Issue](https://github.com/MarkusAmshove/Kluent/issues/99)

# 1.35
* Revisit return types of assertions | [Issue](https://github.com/MarkusAmshove/Kluent/issues/93) | [PR](https://github.com/MarkusAmshove/Kluent/pull/94)

# 1.34
* Allow chaining of assertions | [Issue](https://github.com/MarkusAmshove/Kluent/issues/91) | [PR](https://github.com/MarkusAmshove/Kluent/pull/92)
* Return non-null instance when using `shouldNotBeNull` | [Issue](https://github.com/MarkusAmshove/Kluent/issues/90) | thanks to [@goreRatzete](https://github.com/goreRatzete)
* Add a more descriptive failure message for `shouldBeTrue` and `shouldBeFalse` | [Issue](https://github.com/MarkusAmshove/Kluent/issues/89) | thanks to [@damelines](https://github.com/damelines)
* Add a more descriptive failure message for not null | [Issue](https://github.com/MarkusAmshove/Kluent/issues/88) | thanks to [@kamilchm](https://github.com/kamilchm)


# 1.33
* Add missing backtick verifier | [Issue](https://github.com/MarkusAmshove/Kluent/issues/87) | thanks to [@athkalia](https://github.com/athkalia)
* Kluent now uses fixed dependency version

# 1.32
* More overloads for collection assertions | [Issue](https://github.com/MarkusAmshove/Kluent/issues/82) | [PR](https://github.com/MarkusAmshove/Kluent/pull/85) | Issue by [@goreRatzete](https://github.com/goreRatzete)
* Update to Kotlin 1.2 | [Issue](https://github.com/MarkusAmshove/Kluent/issues/80)
* `itAnswers` should allow original Mockito Answer types | [Issue](https://github.com/MarkusAmshove/Kluent/issues/83) | [PR](https://github.com/MarkusAmshove/Kluent/pull/84) | thanks to [@jpopadak](https://github.com/jpopadak)
* Support lambda logic assertion | [Issue](https://github.com/MarkusAmshove/Kluent/issues/77) | [PR](https://github.com/MarkusAmshove/Kluent/pull/81) | Issue by [@goreRatzete](https://github.com/goreratzete)

# 1.31
* Expect an Exception instance to be thrown compared by equals | [PR](https://github.com/MarkusAmshove/Kluent/pull/78) | thanks to [@nhellwig](https://github.com/nhellwig)

# 1.30
* Allow should(Not)Throw to on functions returning nullables | [Issue](https://github.com/MarkusAmshove/Kluent/issues/63) | [PR](https://github.com/MarkusAmshove/Kluent/pull/64) | thanks to [@gregwoodfill](https://github.com/gregwoodfill)
* Update mockito-kotlin to kt1.1 | [Issue](https://github.com/MarkusAmshove/Kluent/issues/61)

# 1.29
* Add shouldContainSome and shouldContainNone to collections | [Issue](https://github.com/MarkusAmshove/Kluent/issues/59) | [PR](https://github.com/MarkusAmshove/Kluent/pull/60)

# 1.28
* Starting with this version, Kluent is now available for Android! Thanks to [@eburke](https://github.com/eburke56) for making this possible! | [PR](https://github.com/MarkusAmshove/Kluent/pull/58) | thanks to [@eburke](https://github.com/eburke56)
* Fix order of arguments to assertArrayEquals() calls | [PR](https://github.com/MarkusAmshove/Kluent/pull/56) | thanks to [@cketti](https://github.com/cketti)

# 1.27
* Deprecate `shouldThrowTheException` for `shouldThrow` | [PR](https://github.com/MarkusAmshove/Kluent/pull/54) | thanks to [@goreRatzete](https://github.com/goreRatzete)
* Update `mockito-kotlin` to 1.5.0

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
* Provide methods for common String operations | [Issue](https://github.com/MarkusAmshove/Kluent/issues/12) | [PR](https://github.com/MarkusAmshove/Kluent/pull/13) | thanks to [@goreRatzete](https://github.com/goreRatzete)

    shouldStartWith

    shouldNotStartWith

    shouldEndWith

    shouldNotEndWith

    shouldContain

    shouldNotContain

    shouldMatch

    shouldNotMatch

# 1.10

* Provide methods to test maps | [Issue](https://github.com/MarkusAmshove/Kluent/issues/10) | [PR](https://github.com/MarkusAmshove/Kluent/pull/11) | thanks to [@goreRatzete](https://github.com/goreRatzete)

    shouldHaveKey
    
    shouldNotHaveKey
    
    shouldHaveValue
    
    shouldNotHaveValue
    
    shouldContain (pair)
    
    shouldNotContain (pair)


# 1.9

* Allow subtyping of exceptions | [Issue](https://github.com/MarkusAmshove/Kluent/issues/7) | [PR](https://github.com/MarkusAmshove/Kluent/pull/8) | thanks to [@neyb](https://github.com/neyb)

