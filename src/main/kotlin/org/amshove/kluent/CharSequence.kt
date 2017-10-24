package org.amshove.kluent

import org.junit.jupiter.api.Assertions.*

infix fun CharSequence.shouldStartWith(theOther: CharSequence) = assertTrue(this.startsWith(theOther), "Expected the CharSequence $this to start with $theOther")

infix fun CharSequence.shouldEndWith(theOther: CharSequence) = assertTrue(this.endsWith(theOther), "Expected the CharSequence $this to end with $theOther")

infix fun CharSequence.shouldContainSome(things: Iterable<CharSequence>) = assertTrue(things.any { this.contains(it) }, "Expected '$this' to contain at least one of $things")

infix fun CharSequence.shouldContainNone(things: Iterable<CharSequence>) = assertTrue(things.none { this.contains(it) }, "Expected '$this' to not contain any of $things")

infix fun CharSequence.shouldContain(theOther: CharSequence) = assertTrue(this.contains(theOther), "Expected the CharSequence $this to contain $theOther")

infix fun CharSequence.shouldNotContainAny(things: Iterable<CharSequence>) = this shouldContainNone things

infix fun CharSequence.shouldMatch(regex: String) = assertTrue(this.matches(Regex(regex)), "Expected $this to match $regex")

infix fun CharSequence.shouldMatch(regex: Regex) = assertTrue(this.matches(regex), "Expected $this to match ${regex.pattern}")

fun CharSequence.shouldBeEmpty() = assertTrue(this.isEmpty(), "Expected the CharSequence to be empty, but was $this")

fun CharSequence?.shouldBeNullOrEmpty() = assertTrue(this == null || this.isEmpty(), "Expected $this to be null or empty")

fun CharSequence.shouldBeBlank() = assertTrue(this.isBlank(), "Expected the CharSequence to be blank, but was $this")

fun CharSequence?.shouldBeNullOrBlank() = assertTrue(this == null || this.isBlank(), "Expected $this to be null or blank")

infix fun String.shouldEqualTo(theOther: String) = assertEquals(theOther, this)

infix fun String.shouldNotEqualTo(theOther: String) = assertNotEquals(theOther, this)

infix fun CharSequence.shouldNotStartWith(theOther: CharSequence) = assertFalse(this.startsWith(theOther), "Expected the CharSequence $this to not start with $theOther")

infix fun CharSequence.shouldNotEndWith(theOther: CharSequence) = assertFalse(this.endsWith(theOther), "Expected the CharSequence $this to not end with $theOther")

infix fun CharSequence.shouldNotContain(theOther: CharSequence) = assertFalse(this.contains(theOther), "Expected the CharSequence $this to not contain $theOther")

infix fun CharSequence.shouldNotMatch(regex: String) = assertFalse(this.matches(Regex(regex)), "Expected $this to not match $regex")

infix fun CharSequence.shouldNotMatch(regex: Regex) = assertFalse(this.matches(regex), "Expected $this to not match ${regex.pattern}")

fun CharSequence.shouldNotBeEmpty() = assertTrue(this.isNotEmpty(), "Expected the CharSequence to not be empty")

fun CharSequence?.shouldNotBeNullOrEmpty() {
    this.shouldNotBeNull()
    this!!.shouldNotBeEmpty()
}

fun CharSequence.shouldNotBeBlank() = assertTrue(this.isNotBlank(), "Expected the CharSequence to not be blank")

fun CharSequence?.shouldNotBeNullOrBlank() {
    this.shouldNotBeNull()
    this!!.shouldNotBeBlank()
}

