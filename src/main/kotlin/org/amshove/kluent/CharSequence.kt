package org.amshove.kluent

import org.junit.Assert.*

infix fun CharSequence.shouldStartWith(theOther: CharSequence) = assertTrue("Expected the CharSequence $this to start with $theOther", this.startsWith(theOther))

infix fun CharSequence.shouldEndWith(theOther: CharSequence) = assertTrue("Expected the CharSequence $this to end with $theOther", this.endsWith(theOther))

infix fun CharSequence.shouldContainSome(things: Iterable<CharSequence>) = assertTrue("Expected '$this' to contain at least one of $things", things.any { this.contains(it) })

infix fun CharSequence.shouldContainNone(things: Iterable<CharSequence>) = assertTrue("Expected '$this' to not contain any of $things", things.none { this.contains(it) })

infix fun CharSequence.shouldContain(theOther: CharSequence) = assertTrue("Expected the CharSequence $this to contain $theOther", this.contains(theOther))

infix fun CharSequence.shouldNotContainAny(things: Iterable<CharSequence>) = this shouldContainNone things

infix fun CharSequence.shouldMatch(regex: String) = assertTrue("Expected $this to match $regex", this.matches(Regex(regex)))

infix fun CharSequence.shouldMatch(regex: Regex) = assertTrue("Expected $this to match ${regex.pattern}", this.matches(regex))

fun CharSequence.shouldBeEmpty() = assertTrue("Expected the CharSequence to be empty, but was $this", this.isEmpty())

fun CharSequence?.shouldBeNullOrEmpty() = assertTrue("Expected $this to be null or empty", this == null || this.isEmpty())

fun CharSequence.shouldBeBlank() = assertTrue("Expected the CharSequence to be blank, but was $this", this.isBlank())

fun CharSequence?.shouldBeNullOrBlank() = assertTrue("Expected $this to be null or blank", this == null || this.isBlank())

@Deprecated("Use shouldBeEqualTo", ReplaceWith("this.shouldBeEqualTo(theOther)"))
infix fun String.shouldEqualTo(theOther: String) = shouldBeEqualTo(theOther)

infix fun String.shouldBeEqualTo(theOther: String) = assertEquals(theOther, this)

@Deprecated("Use shouldNotBeEqualTo", ReplaceWith("this.shouldNotBeEqualTo(theOther)"))
infix fun String.shouldNotEqualTo(theOther: String) = shouldNotBeEqualTo(theOther)

infix fun String.shouldNotBeEqualTo(theOther: String) = assertNotEquals(theOther, this)

infix fun CharSequence.shouldNotStartWith(theOther: CharSequence) = assertFalse("Expected the CharSequence $this to not start with $theOther", this.startsWith(theOther))

infix fun CharSequence.shouldNotEndWith(theOther: CharSequence) = assertFalse("Expected the CharSequence $this to not end with $theOther", this.endsWith(theOther))

infix fun CharSequence.shouldNotContain(theOther: CharSequence) = assertFalse("Expected the CharSequence $this to not contain $theOther", this.contains(theOther))

infix fun CharSequence.shouldNotMatch(regex: String) = assertFalse("Expected $this to not match $regex", this.matches(Regex(regex)))

infix fun CharSequence.shouldNotMatch(regex: Regex) = assertFalse("Expected $this to not match ${regex.pattern}", this.matches(regex))

fun CharSequence.shouldNotBeEmpty() = assertTrue("Expected the CharSequence to not be empty", this.isNotEmpty())

fun CharSequence?.shouldNotBeNullOrEmpty() {
    this.shouldNotBeNull()
    this!!.shouldNotBeEmpty()
}

fun CharSequence.shouldNotBeBlank() = assertTrue("Expected the CharSequence to not be blank", this.isNotBlank())

fun CharSequence?.shouldNotBeNullOrBlank() {
    this.shouldNotBeNull()
    this!!.shouldNotBeBlank()
}
