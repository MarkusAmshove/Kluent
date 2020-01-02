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

@Deprecated("Use `should not equal to`", ReplaceWith("this.`should not equal to`(expected)"))
infix fun Boolean.`should not equal to`(expected: Boolean) = this.`should not be equal to`(expected)

infix fun Boolean.`should not be equal to`(expected: Boolean) = this.shouldNotEqualTo(expected)

@Deprecated("Use `should not equal to`", ReplaceWith("this.`should not equal to`(expected)"))
infix fun Byte.`should not equal to`(expected: Byte) = this.`should not be equal to`(expected)

infix fun Byte.`should not be equal to`(expected: Byte) = this.shouldNotEqualTo(expected)

@Deprecated("Use `should not equal to`", ReplaceWith("this.`should not equal to`(expected)"))
infix fun Short.`should not equal to`(expected: Short) = this.`should not be equal to`(expected)

infix fun Short.`should not be equal to`(expected: Short) = this.shouldNotEqualTo(expected)

@Deprecated("Use `should not equal to`", ReplaceWith("this.`should not equal to`(expected)"))
infix fun Int.`should not equal to`(expected: Int) = this.`should not be equal to`(expected)

infix fun Int.`should not be equal to`(expected: Int) = this.shouldNotEqualTo(expected)

@Deprecated("Use `should not equal to`", ReplaceWith("this.`should not equal to`(expected)"))
infix fun Long.`should not equal to`(expected: Long) = this.`should not be equal to`(expected)

infix fun Long.`should not be equal to`(expected: Long) = this.shouldNotEqualTo(expected)

@Deprecated("Use `should not equal to`", ReplaceWith("this.`should not equal to`(expected)"))
infix fun Float.`should not equal to`(expected: Float) = this.`should not be equal to`(expected)

infix fun Float.`should not be equal to`(expected: Float) = this.shouldNotEqualTo(expected)

@Deprecated("Use `should not equal to`", ReplaceWith("this.`should not equal to`(expected)"))
infix fun Double.`should not equal to`(expected: Double) = this.`should not be equal to`(expected)

infix fun Double.`should not be equal to`(expected: Double) = this.shouldNotEqualTo(expected)

infix fun Byte.`should be greater than`(expected: Byte) = this.shouldBeGreaterThan(expected)

infix fun Short.`should be greater than`(expected: Short) = this.shouldBeGreaterThan(expected)

infix fun Int.`should be greater than`(expected: Int) = this.shouldBeGreaterThan(expected)

infix fun Long.`should be greater than`(expected: Long) = this.shouldBeGreaterThan(expected)

infix fun Float.`should be greater than`(expected: Float) = this.shouldBeGreaterThan(expected)

infix fun Double.`should be greater than`(expected: Double) = this.shouldBeGreaterThan(expected)

infix fun Byte.`should not be greater than`(expected: Byte) = this.shouldNotBeGreaterThan(expected)

infix fun Short.`should not be greater than`(expected: Short) = this.shouldNotBeGreaterThan(expected)

infix fun Int.`should not be greater than`(expected: Int) = this.shouldNotBeGreaterThan(expected)

infix fun Long.`should not be greater than`(expected: Long) = this.shouldNotBeGreaterThan(expected)

infix fun Float.`should not be greater than`(expected: Float) = this.shouldNotBeGreaterThan(expected)

infix fun Double.`should not be greater than`(expected: Double) = this.shouldNotBeGreaterThan(expected)

infix fun Byte.`should be greater or equal to`(expected: Byte) = this.shouldBeGreaterOrEqualTo(expected)

infix fun Short.`should be greater or equal to`(expected: Short) = this.shouldBeGreaterOrEqualTo(expected)

infix fun Int.`should be greater or equal to`(expected: Int) = this.shouldBeGreaterOrEqualTo(expected)

infix fun Long.`should be greater or equal to`(expected: Long) = this.shouldBeGreaterOrEqualTo(expected)

infix fun Float.`should be greater or equal to`(expected: Float) = this.shouldBeGreaterOrEqualTo(expected)

infix fun Double.`should be greater or equal to`(expected: Double) = this.shouldBeGreaterOrEqualTo(expected)

infix fun Byte.`should not be greater or equal to`(expected: Byte) = this.shouldNotBeGreaterOrEqualTo(expected)

infix fun Short.`should not be greater or equal to`(expected: Short) = this.shouldNotBeGreaterOrEqualTo(expected)

infix fun Int.`should not be greater or equal to`(expected: Int) = this.shouldNotBeGreaterOrEqualTo(expected)

infix fun Long.`should not be greater or equal to`(expected: Long) = this.shouldNotBeGreaterOrEqualTo(expected)

infix fun Float.`should not be greater or equal to`(expected: Float) = this.shouldNotBeGreaterOrEqualTo(expected)

infix fun Double.`should not be greater or equal to`(expected: Double) = this.shouldNotBeGreaterOrEqualTo(expected)

infix fun Byte.`should be less than`(expected: Byte) = this.shouldBeLessThan(expected)

infix fun Short.`should be less than`(expected: Short) = this.shouldBeLessThan(expected)

infix fun Int.`should be less than`(expected: Int) = this.shouldBeLessThan(expected)

infix fun Long.`should be less than`(expected: Long) = this.shouldBeLessThan(expected)

infix fun Float.`should be less than`(expected: Float) = this.shouldBeLessThan(expected)

infix fun Double.`should be less than`(expected: Double) = this.shouldBeLessThan(expected)

infix fun Byte.`should not be less than`(expected: Byte) = this.shouldNotBeLessThan(expected)

infix fun Short.`should not be less than`(expected: Short) = this.shouldNotBeLessThan(expected)

infix fun Int.`should not be less than`(expected: Int) = this.shouldNotBeLessThan(expected)

infix fun Long.`should not be less than`(expected: Long) = this.shouldNotBeLessThan(expected)

infix fun Float.`should not be less than`(expected: Float) = this.shouldNotBeLessThan(expected)

infix fun Double.`should not be less than`(expected: Double) = this.shouldNotBeLessThan(expected)

infix fun Byte.`should be less or equal to`(expected: Byte) = this.shouldBeLessOrEqualTo(expected)

infix fun Short.`should be less or equal to`(expected: Short) = this.shouldBeLessOrEqualTo(expected)

infix fun Int.`should be less or equal to`(expected: Int) = this.shouldBeLessOrEqualTo(expected)

infix fun Long.`should be less or equal to`(expected: Long) = this.shouldBeLessOrEqualTo(expected)

infix fun Float.`should be less or equal to`(expected: Float) = this.shouldBeLessOrEqualTo(expected)

infix fun Double.`should be less or equal to`(expected: Double) = this.shouldBeLessOrEqualTo(expected)

infix fun Byte.`should not be less or equal to`(expected: Byte) = this.shouldNotBeLessOrEqualTo(expected)

infix fun Short.`should not be less or equal to`(expected: Short) = this.shouldNotBeLessOrEqualTo(expected)

infix fun Int.`should not be less or equal to`(expected: Int) = this.shouldNotBeLessOrEqualTo(expected)

infix fun Long.`should not be less or equal to`(expected: Long) = this.shouldNotBeLessOrEqualTo(expected)

infix fun Float.`should not be less or equal to`(expected: Float) = this.shouldNotBeLessOrEqualTo(expected)

infix fun Double.`should not be less or equal to`(expected: Double) = this.shouldNotBeLessOrEqualTo(expected)

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

fun Byte.`should be in range`(lowerBound: Byte, upperBound: Byte) = this.shouldBeInRange(lowerBound, upperBound)

fun Short.`should be in range`(lowerBound: Short, upperBound: Short) = this.shouldBeInRange(lowerBound, upperBound)

fun Int.`should be in range`(lowerBound: Int, upperBound: Int) = this.shouldBeInRange(lowerBound, upperBound)

fun Long.`should be in range`(lowerBound: Long, upperBound: Long) = this.shouldBeInRange(lowerBound, upperBound)

fun Float.`should be in range`(lowerBound: Float, upperBound: Float) = this.shouldBeInRange(lowerBound, upperBound)

fun Double.`should be in range`(lowerBound: Double, upperBound: Double) = this.shouldBeInRange(lowerBound, upperBound)

fun Byte.`should not be in range`(lowerBound: Byte, upperBound: Byte) = this.shouldNotBeInRange(lowerBound, upperBound)

fun Short.`should not be in range`(lowerBound: Short, upperBound: Short) = this.shouldNotBeInRange(lowerBound, upperBound)

fun Int.`should not be in range`(lowerBound: Int, upperBound: Int) = this.shouldNotBeInRange(lowerBound, upperBound)

fun Long.`should not be in range`(lowerBound: Long, upperBound: Long) = this.shouldNotBeInRange(lowerBound, upperBound)

fun Float.`should not be in range`(lowerBound: Float, upperBound: Float) = this.shouldNotBeInRange(lowerBound, upperBound)

fun Double.`should not be in range`(lowerBound: Double, upperBound: Double) = this.shouldNotBeInRange(lowerBound, upperBound)

infix fun Byte.`should be in range`(range: IntRange) = this.shouldBeInRange(range)

infix fun Short.`should be in range`(range: IntRange) = this.shouldBeInRange(range)

infix fun Int.`should be in range`(range: IntRange) = this.shouldBeInRange(range)

infix fun Long.`should be in range`(range: LongRange) = this.shouldBeInRange(range)

infix fun Byte.`should not be in range`(range: IntRange) = this.shouldNotBeInRange(range)

infix fun Short.`should not be in range`(range: IntRange) = this.shouldNotBeInRange(range)

infix fun Int.`should not be in range`(range: IntRange) = this.shouldNotBeInRange(range)

infix fun Long.`should not be in range`(range: LongRange) = this.shouldNotBeInRange(range)
