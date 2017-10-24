package org.amshove.kluent

infix fun CharSequence.`should start with`(theOther: CharSequence) = this.shouldStartWith(theOther)

infix fun CharSequence.`should end with`(theOther: CharSequence) = this.shouldEndWith(theOther)

infix fun CharSequence.`should contain some`(things: Iterable<CharSequence>) = this.shouldContainSome(things)

infix fun CharSequence.`should contain none`(things: Iterable<CharSequence>) = this.shouldContainNone(things)

infix fun CharSequence.`should contain`(theOther: CharSequence) = this.shouldContain(theOther)

infix fun CharSequence.`should not contain any`(things: Iterable<CharSequence>) = this.shouldNotContainAny(things)

infix fun CharSequence.`should match`(regex: String) = this.shouldMatch(regex)

infix fun CharSequence.`should match`(regex: Regex) = this.shouldMatch(regex)

fun CharSequence.`should be empty`() = this.shouldBeEmpty()

fun CharSequence?.`should be null or empty`() = this.shouldBeNullOrEmpty()

fun CharSequence.`should be blank`() = this.shouldBeBlank()

fun CharSequence?.`should be null or blank`() = this.shouldBeNullOrBlank()

infix fun String.`should be equal to`(theOther: String) = this.shouldEqualTo(theOther)

infix fun String.`should not be equal to`(theOther: String) = this.shouldNotEqualTo(theOther)

infix fun CharSequence.`should not start with`(theOther: CharSequence) = this.shouldNotStartWith(theOther)

infix fun CharSequence.`should not end with`(theOther: CharSequence) = this.shouldNotEndWith(theOther)

infix fun CharSequence.`should not contain`(theOther: CharSequence) = this.shouldNotContain(theOther)

infix fun CharSequence.`should not match`(regex: String) = this.shouldNotMatch(regex)

infix fun CharSequence.`should not match`(regex: Regex) = this.shouldNotMatch(regex)

fun CharSequence.`should not be empty`() = this.shouldNotBeEmpty()

fun CharSequence?.`should not be null or empty`() = this.shouldNotBeNullOrEmpty()

fun CharSequence.`should not be blank`() = this.shouldNotBeBlank()

fun CharSequence?.`should not be null or blank`() = this.shouldNotBeNullOrBlank()
