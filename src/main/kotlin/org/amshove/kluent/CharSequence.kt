package org.amshove.kluent

import org.junit.Assert.*

infix fun CharSequence.shouldStartWith(expected: CharSequence) =
    this.apply { assertTrue("Expected the CharSequence $this to start with $expected", this.startsWith(expected)) }

infix fun CharSequence.shouldEndWith(expected: CharSequence) =
    this.apply { assertTrue("Expected the CharSequence $this to end with $expected", this.endsWith(expected)) }

infix fun CharSequence.shouldContain(char: Char) =
    this.apply { assertTrue("Expected '$this' to contain '$char'", this.contains(char)) }

infix fun CharSequence.shouldContainSome(things: Iterable<CharSequence>) =
    this.apply { assertTrue("Expected '$this' to contain at least one of $things", things.any { this.contains(it) }) }

infix fun CharSequence.shouldContainNone(things: Iterable<CharSequence>) =
    this.apply { assertTrue("Expected '$this' to not contain any of $things", things.none { this.contains(it) }) }

infix fun CharSequence.shouldContain(expected: CharSequence) =
    this.apply { assertTrue("Expected the CharSequence $this to contain $expected", this.contains(expected)) }

infix fun CharSequence.shouldNotContain(char: Char) =
    this.apply { assertFalse("Expected '$this' to not contain '$char'", this.contains(char)) }

infix fun CharSequence.shouldNotContainAny(things: Iterable<CharSequence>) =
    this.apply { this shouldContainNone things }

infix fun CharSequence.shouldMatch(regex: String) =
    this.apply { assertTrue("Expected $this to match $regex", this.matches(Regex(regex))) }

infix fun CharSequence.shouldMatch(regex: Regex) =
    this.apply { assertTrue("Expected $this to match ${regex.pattern}", this.matches(regex)) }

fun CharSequence.shouldBeEmpty() =
    this.apply { assertTrue("Expected the CharSequence to be empty, but was $this", this.isEmpty()) }

fun CharSequence?.shouldBeNullOrEmpty() =
    this.apply { assertTrue("Expected $this to be null or empty", this == null || this.isEmpty()) }

fun CharSequence.shouldBeBlank() =
    this.apply { assertTrue("Expected the CharSequence to be blank, but was $this", this.isBlank()) }

fun CharSequence?.shouldBeNullOrBlank() =
    this.apply { assertTrue("Expected $this to be null or blank", this == null || this.isBlank()) }

@Deprecated("Use shouldBeEqualTo", ReplaceWith("this.shouldBeEqualTo(expected)"))
infix fun String.shouldEqualTo(expected: String) = shouldBeEqualTo(expected)

infix fun String.shouldBeEqualTo(expected: String) = this.apply { assertEquals(expected, this) }

@Deprecated("Use shouldNotBeEqualTo", ReplaceWith("this.shouldNotBeEqualTo(expected)"))
infix fun String.shouldNotEqualTo(expected: String) = shouldNotBeEqualTo(expected)

infix fun String.shouldNotBeEqualTo(expected: String) = this.apply { assertNotEquals(expected, this) }

infix fun CharSequence.shouldNotStartWith(expected: CharSequence) =
    this.apply { assertFalse("Expected the CharSequence $this to not start with $expected", this.startsWith(expected)) }

infix fun CharSequence.shouldNotEndWith(expected: CharSequence) =
    this.apply { assertFalse("Expected the CharSequence $this to not end with $expected", this.endsWith(expected)) }

infix fun CharSequence.shouldNotContain(expected: CharSequence) =
    this.apply { assertFalse("Expected the CharSequence $this to not contain $expected", this.contains(expected)) }

infix fun CharSequence.shouldNotMatch(regex: String) =
    this.apply { assertFalse("Expected $this to not match $regex", this.matches(Regex(regex))) }

infix fun CharSequence.shouldNotMatch(regex: Regex) =
    this.apply { assertFalse("Expected $this to not match ${regex.pattern}", this.matches(regex)) }

fun <T : CharSequence> T.shouldNotBeEmpty(): T =
    this.apply { assertTrue("Expected the CharSequence to not be empty", this.isNotEmpty()) }

fun <T : CharSequence> T?.shouldNotBeNullOrEmpty(): T = this.shouldNotBeNull().shouldNotBeEmpty()

fun <T : CharSequence> T.shouldNotBeBlank(): T =
    this.apply { assertTrue("Expected the CharSequence to not be blank", this.isNotBlank()) }

fun <T : CharSequence> T?.shouldNotBeNullOrBlank(): T = this.shouldNotBeNull().shouldNotBeBlank()

infix fun CharSequence.shouldContainAll(items: Iterable<CharSequence>): CharSequence = this.apply {
    items.forEach { this shouldContain it }
}

infix fun CharSequence.shouldNotContainAll(items: Iterable<CharSequence>): CharSequence = this.apply {
    assertFalse("Expected the CharSequence to not contail all items: $items", items.all { this.contains(it) })
}
