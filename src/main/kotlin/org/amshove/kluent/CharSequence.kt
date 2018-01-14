package org.amshove.kluent

import org.junit.Assert.*

infix fun CharSequence.shouldStartWith(theOther: CharSequence) = this.apply { assertTrue("Expected the CharSequence $this to start with $theOther", this.startsWith(theOther)) }

infix fun CharSequence.shouldEndWith(theOther: CharSequence) = this.apply { assertTrue("Expected the CharSequence $this to end with $theOther", this.endsWith(theOther)) }

infix fun CharSequence.shouldContainSome(things: Iterable<CharSequence>) = this.apply { assertTrue("Expected '$this' to contain at least one of $things", things.any { this.contains(it) }) }

infix fun CharSequence.shouldContainNone(things: Iterable<CharSequence>) = this.apply { assertTrue("Expected '$this' to not contain any of $things", things.none { this.contains(it) }) }

infix fun CharSequence.shouldContain(theOther: CharSequence) = this.apply { assertTrue("Expected the CharSequence $this to contain $theOther", this.contains(theOther)) }

infix fun CharSequence.shouldNotContainAny(things: Iterable<CharSequence>) = this.apply { this shouldContainNone things }

infix fun CharSequence.shouldMatch(regex: String) = this.apply { assertTrue("Expected $this to match $regex", this.matches(Regex(regex))) }

infix fun CharSequence.shouldMatch(regex: Regex) = this.apply { assertTrue("Expected $this to match ${regex.pattern}", this.matches(regex)) }

fun CharSequence.shouldBeEmpty() = this.apply { assertTrue("Expected the CharSequence to be empty, but was $this", this.isEmpty()) }

fun CharSequence?.shouldBeNullOrEmpty() = this.apply { assertTrue("Expected $this to be null or empty", this == null || this.isEmpty()) }

fun CharSequence.shouldBeBlank() = this.apply { assertTrue("Expected the CharSequence to be blank, but was $this", this.isBlank()) }

fun CharSequence?.shouldBeNullOrBlank() = this.apply { assertTrue("Expected $this to be null or blank", this == null || this.isBlank()) }

@Deprecated("Use shouldBeEqualTo", ReplaceWith("this.shouldBeEqualTo(theOther)"))
infix fun String.shouldEqualTo(theOther: String) = shouldBeEqualTo(theOther)

infix fun String.shouldBeEqualTo(theOther: String) = this.apply { assertEquals(theOther, this) }

@Deprecated("Use shouldNotBeEqualTo", ReplaceWith("this.shouldNotBeEqualTo(theOther)"))
infix fun String.shouldNotEqualTo(theOther: String) = shouldNotBeEqualTo(theOther)

infix fun String.shouldNotBeEqualTo(theOther: String) = this.apply { assertNotEquals(theOther, this) }

infix fun CharSequence.shouldNotStartWith(theOther: CharSequence) = this.apply { assertFalse("Expected the CharSequence $this to not start with $theOther", this.startsWith(theOther)) }

infix fun CharSequence.shouldNotEndWith(theOther: CharSequence) = this.apply { assertFalse("Expected the CharSequence $this to not end with $theOther", this.endsWith(theOther)) }

infix fun CharSequence.shouldNotContain(theOther: CharSequence) = this.apply { assertFalse("Expected the CharSequence $this to not contain $theOther", this.contains(theOther)) }

infix fun CharSequence.shouldNotMatch(regex: String) = this.apply { assertFalse("Expected $this to not match $regex", this.matches(Regex(regex))) }

infix fun CharSequence.shouldNotMatch(regex: Regex) = this.apply { assertFalse("Expected $this to not match ${regex.pattern}", this.matches(regex)) }

fun CharSequence.shouldNotBeEmpty() = this.apply { assertTrue("Expected the CharSequence to not be empty", this.isNotEmpty()) }

fun CharSequence?.shouldNotBeNullOrEmpty(): CharSequence? {
    this.shouldNotBeNull()
    this!!.shouldNotBeEmpty()
    return this
}

fun CharSequence.shouldNotBeBlank() = this.apply { assertTrue("Expected the CharSequence to not be blank", this.isNotBlank()) }

fun CharSequence?.shouldNotBeNullOrBlank(): CharSequence? {
    this.shouldNotBeNull()
    this!!.shouldNotBeBlank()
    return this
}
