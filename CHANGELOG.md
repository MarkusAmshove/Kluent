# 1.68 (WIP)
* Move more Assertions to support `assertSoftly` and the IntelliJ Compare window
* Support diffs in IntelliJ (Compare window) | [Issue](https://github.com/MarkusAmshove/Kluent/issues/200) | [PR](https://github.com/MarkusAmshove/Kluent/pull/202) | thanks to [@drcolombo](https://github.com/drcolombo)

# 1.67
* Further improve assertSoftly compatibility | [Issue](https://github.com/MarkusAmshove/Kluent/pull/196) | [PR](https://github.com/MarkusAmshove/Kluent/pull/198) | thanks to [@piotrb5e3](https://github.com/piotrb5e3)

# 1.66
* Fix exceptions failing silently with `assertSoftly` | [Issue](https://github.com/MarkusAmshove/Kluent/pull/196) | [PR](https://github.com/MarkusAmshove/Kluent/pull/197) | thanks to [@piotrb5e3](https://github.com/piotrb5e3)

# 1.65
* Add soft assertions (`assertSoftly`) | [Docs](https://github.com/MarkusAmshove/Kluent/blob/master/docs/SoftlyAssertions.md) | [Issue](https://github.com/MarkusAmshove/Kluent/issues/178) | [PR](https://github.com/MarkusAmshove/Kluent/pull/185) | thanks to [@drcolombo](https://github.com/drcolombo)
* Various bug fixes in Equivalency functionality and message formatting | [PR](https://github.com/MarkusAmshove/Kluent/pull/186) | thanks to [@drcolombo](https://github.com/drcolombo)
* New assertion `shouldBeEqualToIgnoringCase` for `Char[Sequence]` | [PR](https://github.com/MarkusAmshove/Kluent/pull/187) | thanks to [@drcolombo](https://github.com/drcolombo)
* **BREAKING** Remove mocking feature | [Issue](https://github.com/MarkusAmshove/Kluent/issues/168) | [PR](https://github.com/MarkusAmshove/Kluent/pull/188) | thanks to [@jleidgens](https://github.com/jleidgens) for reporting and [@drcolombo](https://github.com/drcolombo) for fixing

# 1.64
* Add shouldBeEquivalentTo and shouldNotBeEquivalentTo | [Docs](https://github.com/MarkusAmshove/Kluent/blob/master/docs/Equivalency.md) | [PR](https://github.com/MarkusAmshove/Kluent/pull/184) | thanks to [@drcolombo](https://github.com/drcolombo)

# 1.63
* Make numerical backtick assertions accept Comparable | [Issue](https://github.com/MarkusAmshove/Kluent/issues/182) | [PR](https://github.com/MarkusAmshove/Kluent/pull/183) | thanks to [@CiprianU](https://github.com/CiprianU)

# 1.62
* Make shouldBeNear to consider NaN as being near itself | [PR](https://github.com/MarkusAmshove/Kluent/pull/179) | thanks to [@jcornaz](https://github.com/jcornaz)
* Make the shouldBeLess/Greater family of assertion accept anything comparable | [PR](https://github.com/MarkusAmshove/Kluent/pull/180) | thanks to [@jcornaz](https://github.com/jcornaz)

# 1.61
* Add `shouldBeAfter` and `shouldBeBefore` for `Instant` | [Issue](https://github.com/MarkusAmshove/Kluent/issues/175) | [PR](https://github.com/MarkusAmshove/Kluent/pull/176) | thanks to [@samneirinck](https://github.com/samneirinck)

# 1.60
* Add `shouldBeInRange` and `shouldNotBeInRange` for ClosedRanges | [Issue](https://github.com/markusamshove/kluent/issues/119) | [PR](https://github.com/markusamshove/kluent/pull/160) | thanks to [@javatarz](https://github.com/javatarz) and [@Kshitij09](https://github.com/Kshitij09)
* Implement VerificationMode `times` | [Issue](https://github.com/MarkusAmshove/Kluent/issues/49) | [PR](https://github.com/MarkusAmshove/Kluent/pull/174) | thanks to [@Tenkei](https://github.com/Tenkei)

# 1.59
* Rename some assertions to keep consistent naming strategy | [Issue](https://github.com/MarkusAmshove/Kluent/issues/96) | [PR](https://github.com/MarkusAmshove/Kluent/pull/172/) | thanks to [@JcMinarro](https://github.com/JcMinarro)
* Support assertion for sorted collections | [Issue](https://github.com/MarkusAmshove/Kluent/issues/167) | [PR](https://github.com/MarkusAmshove/Kluent/pull/173/) | thanks to [@JcMinarro](https://github.com/JcMinarro)
# 1.58
* Fix implementation of `Map.shouldContainSame` to compare all pairs |[Issue](https://github.com/MarkusAmshove/Kluent/issues/170) | [PR](https://github.com/MarkusAmshove/Kluent/pull/171) | thanks to [@Murtaught](https://github.com/Murtaught)

# 1.57
* Add assertions for sequences | [PR](https://github.com/MarkusAmshove/Kluent/pull/159) | thanks to [@jcornaz](https://github.com/jcornaz)
* Add `shouldHaveSingleItem` assertions for various arrays | [PR](https://github.com/MarkusAmshove/Kluent/pull/165) | thanks to [@ChristianIvicevic](https://github.com/ChristianIvicevic)
* Add `shouldContainAny` with lambda predicates | [PR](https://github.com/MarkusAmshove/Kluent/pull/153) | thanks to [@javatarz](https://github.com/javatarz)
* Various gradle fixes | [PR](https://github.com/MarkusAmshove/Kluent/pull/161) | thanks to [@javatarz](https://github.com/javatarz)

# 1.56
* Support for validating custom exception values | [PR](https://github.com/MarkusAmshove/Kluent/pull/158) | thanks to [@jeggy](https://github.com/jeggy)

# 1.55
* Add `shouldBeNear` for `BigDecimal` | [Issue](https://github.com/MarkusAmshove/Kluent/issues/155) | [PR](https://github.com/MarkusAmshove/Kluent/pull/156) | thanks to [@ChristianIvicevic](https://github.com/ChristianIvicevic)

# 1.54
* Support asserting suspend function | [Issue](https://github.com/MarkusAmshove/Kluent/issues/151) | [PR](https://github.com/MarkusAmshove/Kluent/pull/154) | thanks to [@ychescale9](https://github.com/ychescale9)

# 1.53
* Add `shouldEqualUnordered` and `shouldNotEqualUnordered` | [PR](https://github.com/MarkusAmshove/Kluent/pull/150) | thanks to [@jeggy](https://github.com/jeggy)

# 1.52
* Update mockito-kotlin to add Gradle 5.1.1 compatibility | [PR](https://github.com/MarkusAmshove/Kluent/pull/147) | thanks to [@St4B](https://github.com/St4B)

# 1.51
* Add predicate matchers for collections (`shouldMatchAtLeastOneOf` and `shouldMatchAllWith`) | [PR](https://github.com/MarkusAmshove/Kluent/pull/144) | thanks to [@sheix](https://github.com/sheix)

# 1.50
* Add `shouldHaveSize` and `shouldHaveSingleItem` to collections | [Issue](https://github.com/MarkusAmshove/Kluent/issues/142)

# 1.49
* Add `shouldBeNear` for Float and Double | [PR](https://github.com/MarkusAmshove/Kluent/pull/139) | thanks to [@wangjuechen](https://github.com/wangjuechen)

# 1.48
* Add `runtime` dependencies for Android | fixes [#130](https://github.com/MarkusAmshove/Kluent/issues/130) and [#133](https://github.com/MarkusAmshove/Kluent/issues/133)

# 1.47
* Provide a wrapper function for asserting exceptions | [Issue](https://github.com/MarkusAmshove/Kluent/issues/111) | [PR](https://github.com/MarkusAmshove/Kluent/pull/132) | thanks to [@rubengees](https://github.com/rubengees)

# 1.46
* Add backtick-assertions for `should contain some` | [PR](https://github.com/MarkusAmshove/Kluent/pull/129) | thanks to [@IvanAtanasov89](https://github.com/IvanAtanasov89)

# 1.45
* Fix `shouldNotThrow` | [Issue](https://github.com/MarkusAmshove/Kluent/issues/128) | thanks to [@svenjacobs](https://github.com/svenjacobs)

# 1.44
* Implement kotlin `contracts` where possible | [PR](https://github.com/MarkusAmshove/Kluent/pull/126) | thanks to [@jcornaz](https://github.com/jcornaz)
* Allow to call `isInstanceOf` and equivalent assertions on nullable types | [PR](https://github.com/MarkusAmshove/Kluent/pull/127) | thanks to [@jcornaz](https://github.com/jcornaz)

# 1.43
* Update Kotlin to 1.3
* Update `mockito-kotlin` to 2.0.0 | [PR](https://github.com/MarkusAmshove/Kluent/pull/116) | thanks to [@floralvikings](https://github.com/floralvikings)

# 1.42
* Use jvmTarget `1.6` for Android builds

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

