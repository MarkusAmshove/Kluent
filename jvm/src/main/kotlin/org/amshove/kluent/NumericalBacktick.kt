@file:Suppress("unused")

package org.amshove.kluent

@Deprecated("Use `should be equal to`", ReplaceWith("this.`should be equal to`(expected)"))
infix fun Boolean.`should equal to`(expected: Boolean) = this.`should be equal to`(expected)

infix fun Boolean.`should be equal to`(expected: Boolean) = this.shouldBeEqualTo(expected)

@Deprecated("Use `should be equal to`", ReplaceWith("this.`should be equal to`(expected)"))
infix fun Byte.`should equal to`(expected: Byte) = this.`should be equal to`(expected)

infix fun Byte.`should be equal to`(expected: Byte) = this.shouldBeEqualTo(expected)

@Deprecated("Use `should be equal to`", ReplaceWith("this.`should be equal to`(expected)"))
infix fun Short.`should equal to`(expected: Short) = this.`should be equal to`(expected)

infix fun Short.`should be equal to`(expected: Short) = this.shouldBeEqualTo(expected)

@Deprecated("Use `should be equal to`", ReplaceWith("this.`should be equal to`(expected)"))
infix fun Int.`should equal to`(expected: Int) = this.`should be equal to`(expected)

infix fun Int.`should be equal to`(expected: Int) = this.shouldBeEqualTo(expected)

@Deprecated("Use `should be equal to`", ReplaceWith("this.`should be equal to`(expected)"))
infix fun Long.`should equal to`(expected: Long) = this.`should be equal to`(expected)

infix fun Long.`should be equal to`(expected: Long) = this.shouldBeEqualTo(expected)

@Deprecated("Use `should be equal to`", ReplaceWith("this.`should be equal to`(expected)"))
infix fun Float.`should equal to`(expected: Float) = this.`should be equal to`(expected)

infix fun Float.`should be equal to`(expected: Float) = this.shouldBeEqualTo(expected)

@Deprecated("Use `should be equal to`", ReplaceWith("this.`should be equal to`(expected)"))
infix fun Double.`should equal to`(expected: Double) = this.`should be equal to`(expected)

infix fun Double.`should be equal to`(expected: Double) = this.shouldBeEqualTo(expected)

@Deprecated("Use `should not be equal to`", ReplaceWith("this.`should not be equal to`(expected)"))
infix fun Boolean.`should not equal to`(expected: Boolean) = this.`should not be equal to`(expected)

infix fun Boolean.`should not be equal to`(expected: Boolean) = this.shouldNotBeEqualTo(expected)

@Deprecated("Use `should not be equal to`", ReplaceWith("this.`should not be equal to`(expected)"))
infix fun Byte.`should not equal to`(expected: Byte) = this.`should not be equal to`(expected)

infix fun Byte.`should not be equal to`(expected: Byte) = this.shouldNotBeEqualTo(expected)

@Deprecated("Use `should not be equal to`", ReplaceWith("this.`should not be equal to`(expected)"))
infix fun Short.`should not equal to`(expected: Short) = this.`should not be equal to`(expected)

infix fun Short.`should not be equal to`(expected: Short) = this.shouldNotBeEqualTo(expected)

@Deprecated("Use `should not be equal to`", ReplaceWith("this.`should not be equal to`(expected)"))
infix fun Int.`should not equal to`(expected: Int) = this.`should not be equal to`(expected)

infix fun Int.`should not be equal to`(expected: Int) = this.shouldNotBeEqualTo(expected)

@Deprecated("Use `should not be equal to`", ReplaceWith("this.`should not be equal to`(expected)"))
infix fun Long.`should not equal to`(expected: Long) = this.`should not be equal to`(expected)

infix fun Long.`should not be equal to`(expected: Long) = this.shouldNotBeEqualTo(expected)

@Deprecated("Use `should not be equal to`", ReplaceWith("this.`should not be equal to`(expected)"))
infix fun Float.`should not equal to`(expected: Float) = this.`should not be equal to`(expected)

infix fun Float.`should not be equal to`(expected: Float) = this.shouldNotBeEqualTo(expected)

@Deprecated("Use `should not be equal to`", ReplaceWith("this.`should not be equal to`(expected)"))
infix fun Double.`should not equal to`(expected: Double) = this.`should not be equal to`(expected)

infix fun Double.`should not be equal to`(expected: Double) = this.shouldNotBeEqualTo(expected)


infix fun <T : Comparable<T>> T.`should be greater than`(expected: T) = this.shouldBeGreaterThan(expected)

infix fun <T : Comparable<T>> T.`should not be greater than`(expected: T) = this.shouldBeGreaterThan(expected)

infix fun <T : Comparable<T>> T.`should be greater or equal to`(expected: T) = this.shouldBeGreaterOrEqualTo(expected)

infix fun <T : Comparable<T>> T.`should not be greater or equal to`(expected: T) = this.shouldNotBeGreaterOrEqualTo(expected)

infix fun <T : Comparable<T>> T.`should be less than`(expected: T) = this.shouldBeLessThan(expected)

infix fun <T : Comparable<T>> T.`should not be less than`(expected: T) = this.shouldNotBeLessThan(expected)

infix fun <T : Comparable<T>> T.`should be less or equal to`(expected: T) = this.shouldBeLessOrEqualTo(expected)

infix fun <T : Comparable<T>> T.`should not be less or equal to`(expected: T) = this.shouldNotBeLessOrEqualTo(expected)

fun Byte.`should be positive`() = this.shouldBePositive()

fun Short.`should be positive`() = this.shouldBePositive()

fun Int.`should be positive`() = this.shouldBePositive()

fun Long.`should be positive`() = this.shouldBePositive()

fun Float.`should be positive`() = this.shouldBePositive()

fun Double.`should be positive`() = this.shouldBePositive()

fun Byte.`should be negative`() = this.shouldBeNegative()

fun Short.`should be negative`() = this.shouldBeNegative()

fun Int.`should be negative`() = this.shouldBeNegative()

fun Long.`should be negative`() = this.shouldBeNegative()

fun Float.`should be negative`() = this.shouldBeNegative()

fun Double.`should be negative`() = this.shouldBeNegative()

fun Float.`should be near`(expected: Float, delta: Float) = this.shouldBeNear(expected, delta)

fun Double.`should be near`(expected: Double, delta: Double) = this.shouldBeNear(expected, delta)

fun <T : Comparable<T>> T.`should be in range`(lowerBound: T, upperBound: T) = this.shouldBeInRange(lowerBound, upperBound)

fun <T : Comparable<T>> T.`should not be in range`(lowerBound: T, upperBound: T) = this.shouldNotBeInRange(lowerBound, upperBound)

infix fun Byte.`should be in range`(range: IntRange) = this.shouldBeInRange(range)

infix fun Short.`should be in range`(range: IntRange) = this.shouldBeInRange(range)

infix fun Int.`should be in range`(range: IntRange) = this.shouldBeInRange(range)

infix fun Long.`should be in range`(range: LongRange) = this.shouldBeInRange(range)

infix fun Byte.`should not be in range`(range: IntRange) = this.shouldNotBeInRange(range)

infix fun Short.`should not be in range`(range: IntRange) = this.shouldNotBeInRange(range)

infix fun Int.`should not be in range`(range: IntRange) = this.shouldNotBeInRange(range)

infix fun Long.`should not be in range`(range: LongRange) = this.shouldNotBeInRange(range)

infix fun <T : Comparable<T>> T.`should be in range`(range: ClosedRange<T>) = this.shouldBeInRange(range)
infix fun <T : Comparable<T>> T.`should not be in range`(range: ClosedRange<T>) = this.shouldNotBeInRange(range)
infix fun <T : Comparable<T>> T.`should be in range`(range: ClosedFloatingPointRange<T>) = this.shouldBeInRange(range)
infix fun <T : Comparable<T>> T.`should not be in range`(range: ClosedFloatingPointRange<T>) = this.shouldNotBeInRange(range)
