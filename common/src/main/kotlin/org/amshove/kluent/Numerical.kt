package org.amshove.kluent

import org.amshove.kluent.internal.assertTrue
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

@Deprecated("Use `shouldBeEqualTo`", ReplaceWith("this.shouldBeEqualTo(expected)"))
infix fun Boolean.shouldEqualTo(expected: Boolean) = this.shouldBeEqualTo(expected)

infix fun Boolean.shouldBeEqualTo(expected: Boolean) = this.apply { assertEquals(expected, this) }

@Deprecated("Use `shouldBeEqualTo`", ReplaceWith("this.shouldBeEqualTo(expected)"))
infix fun Byte.shouldEqualTo(expected: Byte) = this.shouldBeEqualTo(expected)

infix fun Byte.shouldBeEqualTo(expected: Byte) = this.apply { assertEquals(expected, this) }

@Deprecated("Use `shouldBeEqualTo`", ReplaceWith("this.shouldBeEqualTo(expected)"))
infix fun Short.shouldEqualTo(expected: Short) = this.shouldBeEqualTo(expected)

infix fun Short.shouldBeEqualTo(expected: Short) = this.apply { assertEquals(expected, this) }

@Deprecated("Use `shouldBeEqualTo`", ReplaceWith("this.shouldBeEqualTo(expected)"))
infix fun Int.shouldEqualTo(expected: Int) = this.shouldBeEqualTo(expected)

infix fun Int.shouldBeEqualTo(expected: Int) = this.apply { assertEquals(expected, this) }

@Deprecated("Use `shouldBeEqualTo`", ReplaceWith("this.shouldBeEqualTo(expected)"))
infix fun Long.shouldEqualTo(expected: Long) = this.shouldBeEqualTo(expected)

infix fun Long.shouldBeEqualTo(expected: Long) = this.apply { assertEquals(expected, this) }

@Deprecated("Use `shouldBeEqualTo`", ReplaceWith("this.shouldBeEqualTo(expected)"))
infix fun Float.shouldEqualTo(expected: Float) = this.shouldBeEqualTo(expected)

infix fun Float.shouldBeEqualTo(expected: Float) = this.apply { assertEquals(expected, this) }

@Deprecated("Use `shouldBeEqualTo`", ReplaceWith("this.shouldBeEqualTo(expected)"))
infix fun Double.shouldEqualTo(expected: Double) = this.shouldBeEqualTo(expected)

infix fun Double.shouldBeEqualTo(expected: Double) = this.apply { assertEquals(expected, this) }

@Deprecated("Use `shouldNotBeEqualTo`", ReplaceWith("this.shouldNotBeEqualTo(expected)"))
infix fun Boolean.shouldNotEqualTo(expected: Boolean) = this.shouldNotBeEqualTo(expected)

infix fun Boolean.shouldNotBeEqualTo(expected: Boolean) = this.apply { assertNotEquals(expected, this) }

@Deprecated("Use `shouldNotBeEqualTo`", ReplaceWith("this.shouldNotBeEqualTo(expected)"))
infix fun Byte.shouldNotEqualTo(expected: Byte) = this.shouldNotBeEqualTo(expected)

infix fun Byte.shouldNotBeEqualTo(expected: Byte) = this.apply { assertNotEquals(expected, this) }

@Deprecated("Use `shouldNotBeEqualTo`", ReplaceWith("this.shouldNotBeEqualTo(expected)"))
infix fun Short.shouldNotEqualTo(expected: Short) = this.shouldNotBeEqualTo(expected)

infix fun Short.shouldNotBeEqualTo(expected: Short) = this.apply { assertNotEquals(expected, this) }

@Deprecated("Use `shouldNotBeEqualTo`", ReplaceWith("this.shouldNotBeEqualTo(expected)"))
infix fun Int.shouldNotEqualTo(expected: Int) = this.shouldNotBeEqualTo(expected)

infix fun Int.shouldNotBeEqualTo(expected: Int) = this.apply { assertNotEquals(expected, this) }

@Deprecated("Use `shouldNotBeEqualTo`", ReplaceWith("this.shouldNotBeEqualTo(expected)"))
infix fun Long.shouldNotEqualTo(expected: Long) = this.shouldNotBeEqualTo(expected)

infix fun Long.shouldNotBeEqualTo(expected: Long) = this.apply { assertNotEquals(expected, this) }

@Deprecated("Use `shouldNotBeEqualTo`", ReplaceWith("this.shouldNotBeEqualTo(expected)"))
infix fun Float.shouldNotEqualTo(expected: Float) = this.shouldNotBeEqualTo(expected)

infix fun Float.shouldNotBeEqualTo(expected: Float) = this.apply { assertNotEquals(expected, this) }

@Deprecated("Use `shouldNotBeEqualTo`", ReplaceWith("this.shouldNotBeEqualTo(expected)"))
infix fun Double.shouldNotEqualTo(expected: Double) = this.shouldNotBeEqualTo(expected)

infix fun Double.shouldNotBeEqualTo(expected: Double) = this.apply { assertNotEquals(expected, this) }

infix fun <T : Comparable<T>> T.shouldBeGreaterThan(expected: T) = this.apply { assertTrue("Expected $this to be greater than $expected", this > expected) }

infix fun <T : Comparable<T>> T.shouldNotBeGreaterThan(expected: T) = this.apply { assertTrue("Expected $this to not be greater than $expected", this <= expected) }

infix fun <T : Comparable<T>> T.shouldBeGreaterOrEqualTo(expected: T) = this.apply { assertTrue("Expected $this to be greater or equal to $expected", this >= expected) }

infix fun <T : Comparable<T>> T.shouldNotBeGreaterOrEqualTo(expected: T) = this.apply { assertTrue("Expected $this to be not be greater or equal to $expected", this < expected) }

infix fun <T : Comparable<T>> T.shouldBeLessThan(expected: T) = this.apply { assertTrue("Expected $this to be less than $expected", this < expected) }

infix fun <T : Comparable<T>> T.shouldNotBeLessThan(expected: T) = this.apply { assertTrue("Expected $this to not be less than $expected", this >= expected) }

infix fun <T : Comparable<T>> T.shouldBeLessOrEqualTo(expected: T) = this.apply { assertTrue("Expected $this to be less or equal to $expected", this <= expected) }

infix fun <T : Comparable<T>> T.shouldNotBeLessOrEqualTo(expected: T) = this.apply { assertTrue("Expected $this to not be less or equal to $expected", this > expected) }

fun Byte.shouldBePositive() = this.apply { assertTrue("Expected $this to be positive", this > 0) }

fun Short.shouldBePositive() = this.apply { assertTrue("Expected $this to be positive", this > 0) }

fun Int.shouldBePositive() = this.apply { assertTrue("Expected $this to be positive", this > 0) }

fun Long.shouldBePositive() = this.apply { assertTrue("Expected $this to be positive", this > 0) }

fun Float.shouldBePositive() = this.apply { assertTrue("Expected $this to be positive", this > 0) }

fun Double.shouldBePositive() = this.apply { assertTrue("Expected $this to be positive", this > 0) }

fun Byte.shouldBeNegative() = this.apply { assertTrue("Expected $this to be negative", this < 0) }

fun Short.shouldBeNegative() = this.apply { assertTrue("Expected $this to be negative", this < 0) }

fun Int.shouldBeNegative() = this.apply { assertTrue("Expected $this to be negative", this < 0) }

fun Long.shouldBeNegative() = this.apply { assertTrue("Expected $this to be negative", this < 0) }

fun Float.shouldBeNegative() = this.apply { assertTrue("Expected $this to be negative", this < 0) }

fun Double.shouldBeNegative() = this.apply { assertTrue("Expected $this to be negative", this < 0) }

fun Float.shouldBeNear(expected: Float, delta: Float) = shouldBeInRange(expected - delta, expected + delta)

fun Double.shouldBeNear(expected: Double, delta: Double) = shouldBeInRange(expected - delta, expected + delta)

fun <T : Comparable<T>> T.shouldBeInRange(lowerBound: T, upperBound: T) = this.apply { assertTrue("Expected $this to be between (and including) $lowerBound and $upperBound", this >= lowerBound && this <= upperBound) }

fun <T : Comparable<T>> T.shouldNotBeInRange(lowerBound: T, upperBound: T) = this.apply { assertTrue("Expected $this to not be between (and including) $lowerBound and $upperBound", this < lowerBound || this > upperBound) }

infix fun Byte.shouldBeInRange(range: IntRange) = this.apply { (this.toInt()).shouldBeInRange(range) }

infix fun Short.shouldBeInRange(range: IntRange) = this.apply { (this.toInt()).shouldBeInRange(range) }

infix fun Int.shouldBeInRange(range: IntRange) = this.apply { this.shouldBeInRange(range.first, range.last) }

infix fun Double.shouldBeInRange(range: ClosedFloatingPointRange<Double>) = this.assertIsInFloatingRange(range)

infix fun <T : Comparable<T>> T.shouldBeInRange(range: ClosedRange<T>) = this.assertIsInFloatingRange(range)

infix fun Long.shouldBeInRange(range: LongRange) = this.apply { this.shouldBeInRange(range.first, range.last) }

infix fun Byte.shouldNotBeInRange(range: IntRange) = this.apply { (this.toInt()).shouldNotBeInRange(range) }

infix fun Short.shouldNotBeInRange(range: IntRange) = this.apply { (this.toInt()).shouldNotBeInRange(range) }

infix fun Int.shouldNotBeInRange(range: IntRange) = this.apply { this.shouldNotBeInRange(range.first, range.last) }

infix fun Double.shouldNotBeInRange(range: ClosedFloatingPointRange<Double>) = this.assertIsNotInFloatingRange(range)

infix fun <T : Comparable<T>> T.shouldNotBeInRange(range: ClosedRange<T>) = this.assertIsNotInFloatingRange(range)

infix fun Long.shouldNotBeInRange(range: LongRange) = this.apply { this.shouldNotBeInRange(range.first, range.last) }

private fun <T : Comparable<T>> T.assertIsInFloatingRange(range: ClosedRange<T>): T = this.apply { assertTrue("Expected $this to be between (and including) ${range.start} and ${range.endInclusive}", range.contains(this)) }

private fun <T : Comparable<T>> T.assertIsNotInFloatingRange(range: ClosedRange<T>): T = this.apply { assertTrue("Expected $this to not be between (and including) ${range.start} and ${range.endInclusive}", !range.contains(this)) }
