package org.amshove.kluent

infix fun CharSequence.`should start with`(expected: CharSequence) = this.shouldStartWith(expected)

infix fun CharSequence.`should end with`(expected: CharSequence) = this.shouldEndWith(expected)

infix fun CharSequence.`should contain`(char: Char) = this.shouldContain(char)

infix fun CharSequence.`should contain some`(things: Iterable<CharSequence>) = this.shouldContainSome(things)

infix fun CharSequence.`should contain none`(things: Iterable<CharSequence>) = this.shouldContainNone(things)

infix fun CharSequence.`should contain`(expected: CharSequence) = this.shouldContain(expected)

infix fun CharSequence.`should not contain`(char: Char) = this.shouldNotContain(char)

infix fun CharSequence.`should not contain any`(things: Iterable<CharSequence>) = this.shouldNotContainAny(things)

infix fun CharSequence.`should match`(regex: String) = this.shouldMatch(regex)

infix fun CharSequence.`should match`(regex: Regex) = this.shouldMatch(regex)

fun CharSequence.`should be empty`() = this.shouldBeEmpty()

fun CharSequence?.`should be null or empty`() = this.shouldBeNullOrEmpty()

fun CharSequence.`should be blank`() = this.shouldBeBlank()

fun CharSequence?.`should be null or blank`() = this.shouldBeNullOrBlank()

@Deprecated("Use #`should be equal to`", ReplaceWith("this.`should be equal to`(expected)"))
infix fun String.`should equal to`(expected: String) = this.`should be equal to`(expected)

infix fun String.`should be equal to`(expected: String) = this.shouldBeEqualTo(expected)

@Deprecated("Use #`should not be equal to`", ReplaceWith("this.`should not be equal to`(expected)"))
infix fun String.`should not equal to`(expected: String) = this.`should not be equal to`(expected)

infix fun String.`should not be equal to`(expected: String) = this.shouldNotBeEqualTo(expected)

infix fun CharSequence.`should not start with`(expected: CharSequence) = this.shouldNotStartWith(expected)

infix fun CharSequence.`should not end with`(expected: CharSequence) = this.shouldNotEndWith(expected)

infix fun CharSequence.`should not contain`(expected: CharSequence) = this.shouldNotContain(expected)

infix fun CharSequence.`should not match`(regex: String) = this.shouldNotMatch(regex)

infix fun CharSequence.`should not match`(regex: Regex) = this.shouldNotMatch(regex)

fun <T: CharSequence> T.`should not be empty`(): T = this.shouldNotBeEmpty()

fun <T: CharSequence> T?.`should not be null or empty`(): T = this.shouldNotBeNullOrEmpty()

fun <T: CharSequence> T.`should not be blank`(): T = this.shouldNotBeBlank()

fun <T: CharSequence> T?.`should not be null or blank`(): T = this.shouldNotBeNullOrBlank()

infix fun CharSequence.`should contain all`(items: Iterable<CharSequence>): CharSequence = this shouldContainAll items

infix fun CharSequence.`should not contain all`(items: Iterable<CharSequence>): CharSequence =
    this shouldNotContainAll items
