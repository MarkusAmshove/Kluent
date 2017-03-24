The changelogs are written in non-backtick methodstyle for simplicity.
Every method that is added is still added in both styles.

# 1.17 (WIP)
* Update Kotlin to 1.1.1 ([PR](https://github.com/MarkusAmshove/Kluent/pull/28) | thanks to [@Egorand](https://github.com/Egorand))
* Update Gradle to 3.4.1 ([PR](https://github.com/MarkusAmshove/Kluent/pull/29) | thanks to [@Egorand](https://github.com/Egorand))
* Fix compiler warnings in tests ([PR](https://github.com/MarkusAmshove/Kluent/pull/30) | thanks to [@Egorand](https://github.com/Egorand))
* Update JUnit and Mockito ([Issue](https://github.com/MarkusAmshove/Kluent/issues/31) | thanks to [@Jeevuz](https://github.com/Jeevuz))

# 1.16
* Update Kotlin to 1.1.0
* Correct assertion message for `Collection.shouldBeEmpty` ([Issue](https://github.com/MarkusAmshove/Kluent/issues/27))

# 1.15
* Rework failure messages of shouldNotContain assertions ([Issue](https://github.com/MarkusAmshove/Kluent/issues/20))
* Extract assertions into different files
* Add withCause for Exception-Assertions ([Issue](https://github.com/MarkusAmshove/Kluent/issues/24) | [PR](https://github.com/MarkusAmshove/Kluent/pull/25) | thanks to [@okkero](https://github.com/okkero))
* Add common non infix assertions ([Issue](https://github.com/MarkusAmshove/Kluent/issues/21) | [PR](https://github.com/MarkusAmshove/Kluent/pull/26))

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
* Introduce numerical operations ([Issue](https://github.com/MarkusAmshove/Kluent/issues/17) | [PR](https://github.com/MarkusAmshove/Kluent/pull/18))

    shouldBeGreaterOrEqualTo

    shouldBeGreaterThan

    shouldBeLessOrEqualTo

    shouldBeLessThan

    shouldBePositive

    shouldBeNegative

    shouldBeInRange

# 1.13
* Provide methods to check if an object is a given instance ([PR](https://github.com/MarkusAmshove/Kluent/pull/16) | thanks to [@GAumala](https://github.com/GAumala))

    shouldBeInstanceOf

    shouldNotBeInstanceOf

# 1.12
* Update Kotlin to 1.0.6 ([Issue](https://github.com/MarkusAmshove/Kluent/issues/14) | [PR](https://github.com/MarkusAmshove/Kluent/pull/15))

# 1.11
* Provide methods for common String operations ([Issue](https://github.com/MarkusAmshove/Kluent/issues/12) | [PR](https://github.com/MarkusAmshove/Kluent/pull/13) | thanks to [@goreRatzeze](https://github.com/goreRatzete)):

    shouldStartWith

    shouldNotStartWith

    shouldEndWith

    shouldNotEndWith

    shouldContain

    shouldNotContain

    shouldMatch

    shouldNotMatch

# 1.10

* Provide methods to test maps ([Issue](https://github.com/MarkusAmshove/Kluent/issues/10) | [PR](https://github.com/MarkusAmshove/Kluent/pull/11) | thanks to [@goreRatzeze](https://github.com/goreRatzete)):

    shouldHaveKey
    
    shouldNotHaveKey
    
    shouldHaveValue
    
    shouldNotHaveValue
    
    shouldContain (pair)
    
    shouldNotContain (pair)


# 1.9

* Allow subtyping of exceptions ([Issue](https://github.com/MarkusAmshove/Kluent/issues/7) | [PR](https://github.com/MarkusAmshove/Kluent/pull/8) | thanks to [@neyb](https://github.com/neyb))
