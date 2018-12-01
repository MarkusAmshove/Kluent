package org.amshove.kluent

import org.amshove.kluent.internal.assertFalse
import org.amshove.kluent.internal.assertTrue
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

infix fun <T : CharSequence> T.shouldStartWith(expected: T) = this.apply { assertTrue("Expected the CharSequence $this to start with $expected", this.startsWith(expected)) }

infix fun <T : CharSequence> T.shouldEndWith(expected: T) = this.apply { assertTrue("Expected the CharSequence $this to end with $expected", this.endsWith(expected)) }

infix fun <T : CharSequence> T.shouldContain(char: Char) = this.apply { assertTrue("Expected '$this' to contain '$char'", this.contains(char))}

infix fun <T : CharSequence> T.shouldContainSome(things: Iterable<CharSequence>) = this.apply { assertTrue("Expected '$this' to contain at least one of $things", things.any { this.contains(it) }) }

fun <T : CharSequence> T.shouldContainSome(vararg expected: CharSequence) = this.shouldContainSome(expected.toList())

infix fun <T : CharSequence> T.shouldContainNone(things: Iterable<CharSequence>) = this.apply { assertTrue("Expected '$this' to not contain any of $things", things.none { this.contains(it) }) }

fun <T : CharSequence> T.shouldContainNone(vararg expected: CharSequence) = this.shouldContainNone(expected.toList())

infix fun <T : CharSequence> T.shouldContain(expected: CharSequence) = this.apply { assertTrue("Expected the CharSequence $this to contain $expected", this.contains(expected)) }

infix fun <T : CharSequence> T.shouldNotContain(char: Char) = this.apply { assertFalse("Expected '$this' to not contain '$char'", this.contains(char))}

infix fun <T : CharSequence> T.shouldNotContainAny(things: Iterable<CharSequence>) = this.apply { this shouldContainNone things }

fun <T : CharSequence> T.shouldNotContainAny(vararg expected: CharSequence) = this.shouldNotContainAny(expected.toList())

infix fun <T : CharSequence> T.shouldMatch(regex: String) = this.apply { assertTrue("Expected $this to match $regex", this.matches(Regex(regex))) }

infix fun <T : CharSequence> T.shouldMatch(regex: Regex) = this.apply { assertTrue("Expected $this to match ${regex.pattern}", this.matches(regex)) }

fun <T : CharSequence> T.shouldBeEmpty() = this.apply { assertTrue("Expected the CharSequence to be empty, but was $this", this.isEmpty()) }

fun <T : CharSequence> T?.shouldBeNullOrEmpty() = this.apply { assertTrue("Expected $this to be null or empty", this == null || this.isEmpty()) }

fun <T : CharSequence> T.shouldBeBlank() = this.apply { assertTrue("Expected the CharSequence to be blank, but was $this", this.isBlank()) }

fun <T : CharSequence> T?.shouldBeNullOrBlank() = this.apply { assertTrue("Expected $this to be null or blank", this == null || this.isBlank()) }

@Deprecated("Use shouldBeEqualTo", ReplaceWith("this.shouldBeEqualTo(expected)"))
infix fun String.shouldEqualTo(expected: String) = shouldBeEqualTo(expected)

infix fun String.shouldBeEqualTo(expected: String) = this.apply { assertEquals(expected, this) }

@Deprecated("Use shouldNotBeEqualTo", ReplaceWith("this.shouldNotBeEqualTo(expected)"))
infix fun String.shouldNotEqualTo(expected: String) = shouldNotBeEqualTo(expected)

infix fun String.shouldNotBeEqualTo(expected: String) = this.apply { assertNotEquals(expected, this) }

infix fun <T : CharSequence> T.shouldNotStartWith(expected: CharSequence) = this.apply { assertFalse("Expected the CharSequence $this to not start with $expected", this.startsWith(expected)) }

infix fun <T : CharSequence> T.shouldNotEndWith(expected: CharSequence) = this.apply { assertFalse("Expected the CharSequence $this to not end with $expected", this.endsWith(expected)) }

infix fun <T : CharSequence> T.shouldNotContain(expected: CharSequence) = this.apply { assertFalse("Expected the CharSequence $this to not contain $expected", this.contains(expected)) }

infix fun <T : CharSequence> T.shouldNotMatch(regex: String) = this.apply { assertFalse("Expected $this to not match $regex", this.matches(Regex(regex))) }

infix fun <T : CharSequence> T.shouldNotMatch(regex: Regex) = this.apply { assertFalse("Expected $this to not match ${regex.pattern}", this.matches(regex)) }

fun <T : CharSequence> T.shouldNotBeEmpty(): T =
        this.apply { assertTrue("Expected the CharSequence to not be empty", this.isNotEmpty()) }

@UseExperimental(ExperimentalContracts::class)
fun <T : CharSequence> T?.shouldNotBeNullOrEmpty(): T {
    contract {
        returns() implies (this@shouldNotBeNullOrEmpty != null)
    }

    return this.shouldNotBeNull().shouldNotBeEmpty()
}

fun <T : CharSequence> T.shouldNotBeBlank(): T =
        this.apply { assertTrue("Expected the CharSequence to not be blank", this.isNotBlank()) }

@UseExperimental(ExperimentalContracts::class)
fun <T : CharSequence> T?.shouldNotBeNullOrBlank(): T {
    contract {
        returns() implies (this@shouldNotBeNullOrBlank != null)
    }

    return this.shouldNotBeNull().shouldNotBeBlank()
}

infix fun <T : CharSequence> T.shouldContainAll(items: Iterable<CharSequence>): CharSequence = this.apply {
    items.forEach { this shouldContain it }
}

fun <T : CharSequence> T.shouldContainAll(vararg expected: CharSequence) = this.shouldContainAll(expected.toList())

infix fun <T : CharSequence> T.shouldNotContainAll(items: Iterable<CharSequence>): CharSequence = this.apply {
    assertFalse("Expected the CharSequence to not contail all items: $items", items.all { this.contains(it) })
}

fun <T : CharSequence> T.shouldNotContainAll(vararg expected: CharSequence) = this.shouldNotContainAll(expected.toList())
