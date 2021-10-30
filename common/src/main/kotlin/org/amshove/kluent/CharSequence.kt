package org.amshove.kluent

import org.amshove.kluent.internal.*
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

infix fun <T : CharSequence> T.shouldStartWith(expected: T) =
    this.apply { assertTrue("Expected the CharSequence $this to start with $expected", this.startsWith(expected)) }

infix fun <T : CharSequence> T.shouldStartWithIgnoringCase(expected: T) = this.apply {
    assertTrue(
        "Expected the CharSequence $this to start with $expected",
        this.startsWith(expected, true)
    )
}

infix fun <T : CharSequence> T.shouldEndWith(expected: T) =
    this.apply { assertTrue("Expected the CharSequence $this to end with $expected", this.endsWith(expected)) }

infix fun <T : CharSequence> T.shouldEndWithIgnoringCase(expected: T) =
    this.apply { assertTrue("Expected the CharSequence $this to end with $expected", this.endsWith(expected, true)) }

infix fun <T : CharSequence> T.shouldContain(char: Char) =
    this.apply { assertTrue("Expected '$this' to contain '$char'", this.contains(char)) }

infix fun <T : CharSequence> T.shouldContainIgnoringCase(char: Char) =
    this.apply { assertTrue("Expected '$this' to contain '$char'", this.contains(char, true)) }

infix fun <T : CharSequence> T.shouldContainSome(things: Iterable<CharSequence>) =
    this.apply { assertTrue("Expected '$this' to contain at least one of $things", things.any { this.contains(it) }) }

infix fun <T : CharSequence> T.shouldContainSomeIgnoringCase(things: Iterable<CharSequence>) = this.apply {
    assertTrue(
        "Expected '$this' to contain at least one of $things",
        things.any { this.contains(it, true) })
}

fun <T : CharSequence> T.shouldContainSome(vararg expected: CharSequence) = this.shouldContainSome(expected.toList())

fun <T : CharSequence> T.shouldContainSomeIgnoringCase(vararg expected: CharSequence) =
    this.shouldContainSomeIgnoringCase(expected.toList())

infix fun <T : CharSequence> T.shouldContainNone(things: Iterable<CharSequence>) =
    this.apply { assertTrue("Expected '$this' to not contain any of $things", things.none { this.contains(it) }) }

infix fun <T : CharSequence> T.shouldContainNoneIgnoringCase(things: Iterable<CharSequence>) =
    this.apply { assertTrue("Expected '$this' to not contain any of $things", things.none { this.contains(it, true) }) }

fun <T : CharSequence> T.shouldContainNone(vararg expected: CharSequence) = this.shouldContainNone(expected.toList())

fun <T : CharSequence> T.shouldContainNoneIgnoringCase(vararg expected: CharSequence) =
    this.shouldContainNoneIgnoringCase(expected.toList())

infix fun <T : CharSequence> T.shouldContain(expected: CharSequence) =
    this.apply { assertTrue("Expected the CharSequence $this to contain $expected", this.contains(expected)) }

infix fun <T : CharSequence> T.shouldContainIgnoringCase(expected: T) =
    this.apply { assertTrue("Expected the CharSequence $this to contain $expected", this.contains(expected, true)) }

infix fun <T : CharSequence> T.shouldNotContain(char: Char) =
    this.apply { assertFalse("Expected '$this' to not contain '$char'", this.contains(char)) }

infix fun <T : CharSequence> T.shouldNotContainIgnoringCase(char: Char) =
    this.apply { assertFalse("Expected '$this' to not contain '$char'", this.contains(char, true)) }

infix fun <T : CharSequence> T.shouldNotContainAny(things: Iterable<CharSequence>) =
    this.apply { this shouldContainNone things }

infix fun <T : CharSequence> T.shouldNotContainAnyIgnoringCase(things: Iterable<CharSequence>) =
    this.apply { this shouldContainNoneIgnoringCase things }

fun <T : CharSequence> T.shouldNotContainAny(vararg expected: CharSequence) =
    this.shouldNotContainAny(expected.toList())

fun <T : CharSequence> T.shouldNotContainAnyIgnoringCase(vararg expected: CharSequence) =
    this.shouldNotContainAnyIgnoringCase(expected.toList())

infix fun <T : CharSequence> T.shouldMatch(regex: String) =
    this.apply { assertTrue("Expected $this to match $regex", this.matches(Regex(regex))) }

infix fun <T : CharSequence> T.shouldMatch(regex: Regex) =
    this.apply { assertTrue("Expected $this to match ${regex.pattern}", this.matches(regex)) }

fun <T : CharSequence> T.shouldBeEmpty() =
    this.apply { assertTrue("Expected the CharSequence to be empty, but was $this", this.isEmpty()) }

fun <T : CharSequence> T?.shouldBeNullOrEmpty() =
    this.apply { assertTrue("Expected $this to be null or empty", this == null || this.isEmpty()) }

fun <T : CharSequence> T.shouldBeBlank() =
    this.apply { assertTrue("Expected the CharSequence to be blank, but was $this", this.isBlank()) }

fun <T : CharSequence> T?.shouldBeNullOrBlank() =
    this.apply { assertTrue("Expected $this to be null or blank", this == null || this.isBlank()) }

@Deprecated("Use shouldBeEqualTo", ReplaceWith("this.shouldBeEqualTo(expected)"))
infix fun String.shouldEqualTo(expected: String) = shouldBeEqualTo(expected)

infix fun String.shouldBeEqualTo(expected: String) = this.apply { assertEquals(expected, this) }

infix fun String.shouldBeEqualToIgnoringCase(expected: String) = this.apply { assertEqualsIgnoringCase(expected, this) }

@Deprecated("Use shouldNotBeEqualTo", ReplaceWith("this.shouldNotBeEqualTo(expected)"))
infix fun String.shouldNotEqualTo(expected: String) = shouldNotBeEqualTo(expected)

infix fun String.shouldNotBeEqualTo(expected: String) = this.apply { assertNotEquals(expected, this) }

infix fun String.shouldNotBeEqualToIgnoringCase(expected: String) =
    this.apply { assertNotEqualsIgnoringCase(expected, this) }

infix fun <T : CharSequence> T.shouldNotStartWith(expected: CharSequence) =
    this.apply { assertFalse("Expected the CharSequence $this to not start with $expected", this.startsWith(expected)) }

infix fun <T : CharSequence> T.shouldNotStartWithIgnoringCase(expected: CharSequence) = this.apply {
    assertFalse(
        "Expected the CharSequence $this to not start with $expected",
        this.startsWith(expected, true)
    )
}

infix fun <T : CharSequence> T.shouldNotEndWith(expected: CharSequence) =
    this.apply { assertFalse("Expected the CharSequence $this to not end with $expected", this.endsWith(expected)) }

infix fun <T : CharSequence> T.shouldNotEndWithIgnoringCase(expected: CharSequence) = this.apply {
    assertFalse(
        "Expected the CharSequence $this to not end with $expected",
        this.endsWith(expected, true)
    )
}

infix fun <T : CharSequence> T.shouldNotContain(expected: CharSequence) =
    this.apply { assertFalse("Expected the CharSequence $this to not contain $expected", this.contains(expected)) }

infix fun <T : CharSequence> T.shouldNotContainIgnoringCase(expected: CharSequence) = this.apply {
    assertFalse(
        "Expected the CharSequence $this to not contain $expected",
        this.contains(expected, true)
    )
}

infix fun <T : CharSequence> T.shouldNotMatch(regex: String) =
    this.apply { assertFalse("Expected $this to not match $regex", this.matches(Regex(regex))) }

infix fun <T : CharSequence> T.shouldNotMatch(regex: Regex) =
    this.apply { assertFalse("Expected $this to not match ${regex.pattern}", this.matches(regex)) }

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

infix fun <T : CharSequence> T.shouldContainAllIgnoringCase(items: Iterable<CharSequence>): CharSequence = this.apply {
    items.forEach { this shouldContainIgnoringCase it }
}

fun <T : CharSequence> T.shouldContainAll(vararg expected: CharSequence) = this.shouldContainAll(expected.toList())

fun <T : CharSequence> T.shouldContainAllIgnoringCase(vararg expected: CharSequence) =
    this.shouldContainAllIgnoringCase(expected.toList())

infix fun <T : CharSequence> T.shouldNotContainAll(items: Iterable<CharSequence>): CharSequence = this.apply {
    assertFalse("Expected the CharSequence to not contain all items: $items", items.all { this.contains(it) })
}

infix fun <T : CharSequence> T.shouldNotContainAllIgnoringCase(items: Iterable<CharSequence>): CharSequence =
    this.apply {
        assertFalse("Expected the CharSequence to not contain all items: $items", items.all { this.contains(it, true) })
    }

fun <T : CharSequence> T.shouldNotContainAll(vararg expected: CharSequence) =
    this.shouldNotContainAll(expected.toList())

fun <T : CharSequence> T.shouldNotContainAllIgnoringCase(vararg expected: CharSequence) =
    this.shouldNotContainAllIgnoringCase(expected.toList())

/** Asserts that the [expected] value is equal to the [actual] value ignoring case, with an optional [message]. */
fun assertEqualsIgnoringCase(expected: Any, actual: Any, message: String? = null) {
    assertEqualsIgnoringCase(message, expected, actual)
}

/** Asserts that the [expected] value is not equal to the [actual] value ignoring case, with an optional [message]. */
fun assertNotEqualsIgnoringCase(expected: Any, actual: Any, message: String? = null) {
    assertNotEqualsIgnoringCase(message, expected, actual)
}

/**
 * Asserts that the specified values are equal ignoring case.
 *
 * @param message the message to report if the assertion fails.
 */
fun assertEqualsIgnoringCase(message: String?, expected: Any, actual: Any) {
    val checkPassed = when {
        actual is CharSequence && expected is CharSequence -> actual.toString().equals(expected.toString(), true)
        actual is Char && expected is Char -> actual.equals(expected, true)
        actual is String && expected is String -> actual.equals(expected, true)
        else -> false
    }
    if (!checkPassed) {
        errorCollector.collectOrThrow(ComparisonFailedException("Case insensitive comparison failed", expected, actual))
    }
}

/**
 * Asserts that the specified values are equal ignoring case.
 *
 * @param message the message to report if the assertion fails.
 */
fun assertNotEqualsIgnoringCase(message: String?, expected: Any, actual: Any) {

    if (actual is CharSequence && expected is CharSequence) {
        assertTrue(
            !actual.toString().equals(expected.toString(), true)
        ) { messagePrefix(message) + "Expected <$expected>, actual <$actual>." }
    } else if (actual is Char && expected is Char) {
        assertTrue(
            !actual.equals(
                expected,
                true
            )
        ) { messagePrefix(message) + "Expected <$expected>, actual <$actual>." }
    } else if (actual is String && expected is String) {
        assertTrue(
            !actual.equals(
                expected,
                true
            )
        ) { messagePrefix(message) + "Expected <$expected>, actual <$actual>." }
    } else {
        assertFails { messagePrefix(message) + "Expected <$expected>, actual <$actual>." }
    }
}
