package org.amshove.kluent

import org.junit.jupiter.api.Assertions.*

infix fun Boolean.shouldEqualTo(theOther: Boolean) = assertEquals(theOther, this)

infix fun Byte.shouldEqualTo(theOther: Byte) = assertEquals(theOther, this)

infix fun Short.shouldEqualTo(theOther: Short) = assertEquals(theOther, this)

infix fun Int.shouldEqualTo(theOther: Int) = assertEquals(theOther, this)

infix fun Long.shouldEqualTo(theOther: Long) = assertEquals(theOther, this)

infix fun Float.shouldEqualTo(theOther: Float) = assertEquals(theOther, this)

infix fun Double.shouldEqualTo(theOther: Double) = assertEquals(theOther, this)

infix fun Boolean.shouldNotEqualTo(theOther: Boolean) = assertNotEquals(theOther, this)

infix fun Byte.shouldNotEqualTo(theOther: Byte) = assertNotEquals(theOther, this)

infix fun Short.shouldNotEqualTo(theOther: Short) = assertNotEquals(theOther, this)

infix fun Int.shouldNotEqualTo(theOther: Int) = assertNotEquals(theOther, this)

infix fun Long.shouldNotEqualTo(theOther: Long) = assertNotEquals(theOther, this)

infix fun Float.shouldNotEqualTo(theOther: Float) = assertNotEquals(theOther, this)

infix fun Double.shouldNotEqualTo(theOther: Double) = assertNotEquals(theOther, this)

infix fun Byte.shouldBeGreaterThan(theOther: Byte) = assertTrue(this > theOther, "Expected $this to be greater than $theOther")

infix fun Short.shouldBeGreaterThan(theOther: Short) = assertTrue(this > theOther, "Expected $this to be greater than $theOther")

infix fun Int.shouldBeGreaterThan(theOther: Int) = assertTrue(this > theOther, "Expected $this to be greater than $theOther")

infix fun Long.shouldBeGreaterThan(theOther: Long) = assertTrue(this > theOther, "Expected $this to be greater than $theOther")

infix fun Float.shouldBeGreaterThan(theOther: Float) = assertTrue(this > theOther, "Expected $this to be greater than $theOther")

infix fun Double.shouldBeGreaterThan(theOther: Double) = assertTrue(this > theOther, "Expected $this to be greater than $theOther")

infix fun Byte.shouldNotBeGreaterThan(theOther: Byte) = assertTrue(this <= theOther, "Expected $this to not be greater than $theOther")

infix fun Short.shouldNotBeGreaterThan(theOther: Short) = assertTrue(this <= theOther, "Expected $this to not be greater than $theOther")

infix fun Int.shouldNotBeGreaterThan(theOther: Int) = assertTrue(this <= theOther, "Expected $this to not be greater than $theOther")

infix fun Long.shouldNotBeGreaterThan(theOther: Long) = assertTrue(this <= theOther, "Expected $this to not be greater than $theOther")

infix fun Float.shouldNotBeGreaterThan(theOther: Float) = assertTrue(this <= theOther, "Expected $this to not be greater than $theOther")

infix fun Double.shouldNotBeGreaterThan(theOther: Double) = assertTrue(this <= theOther, "Expected $this to not be greater than $theOther")

infix fun Byte.shouldBeGreaterOrEqualTo(theOther: Byte) = assertTrue(this >= theOther, "Expected $this to be greater or equal to $theOther")

infix fun Short.shouldBeGreaterOrEqualTo(theOther: Short) = assertTrue(this >= theOther, "Expected $this to be greater or equal to $theOther")

infix fun Int.shouldBeGreaterOrEqualTo(theOther: Int) = assertTrue(this >= theOther, "Expected $this to be greater or equal to $theOther")

infix fun Long.shouldBeGreaterOrEqualTo(theOther: Long) = assertTrue(this >= theOther, "Expected $this to be greater or equal to $theOther")

infix fun Float.shouldBeGreaterOrEqualTo(theOther: Float) = assertTrue(this >= theOther, "Expected $this to be greater or equal to $theOther")

infix fun Double.shouldBeGreaterOrEqualTo(theOther: Double) = assertTrue(this >= theOther, "Expected $this to be greater or equal to $theOther")

infix fun Byte.shouldNotBeGreaterOrEqualTo(theOther: Byte) = assertTrue(this < theOther, "Expected $this to be not be greater or equal to $theOther")

infix fun Short.shouldNotBeGreaterOrEqualTo(theOther: Short) = assertTrue(this < theOther, "Expected $this to not be greater or equal to $theOther")

infix fun Int.shouldNotBeGreaterOrEqualTo(theOther: Int) = assertTrue(this < theOther, "Expected $this to not be greater or equal to $theOther")

infix fun Long.shouldNotBeGreaterOrEqualTo(theOther: Long) = assertTrue(this < theOther, "Expected $this to not be greater or equal to $theOther")

infix fun Float.shouldNotBeGreaterOrEqualTo(theOther: Float) = assertTrue(this < theOther, "Expected $this to not be greater or equal to $theOther")

infix fun Double.shouldNotBeGreaterOrEqualTo(theOther: Double) = assertTrue(this < theOther, "Expected $this to not be greater or equal to $theOther")

infix fun Byte.shouldBeLessThan(theOther: Byte) = assertTrue(this < theOther, "Expected $this to be less than $theOther")

infix fun Short.shouldBeLessThan(theOther: Short) = assertTrue(this < theOther, "Expected $this to be less than $theOther")

infix fun Int.shouldBeLessThan(theOther: Int) = assertTrue(this < theOther, "Expected $this to be less than $theOther")

infix fun Long.shouldBeLessThan(theOther: Long) = assertTrue(this < theOther, "Expected $this to be less than $theOther")

infix fun Float.shouldBeLessThan(theOther: Float) = assertTrue(this < theOther, "Expected $this to be less than $theOther")

infix fun Double.shouldBeLessThan(theOther: Double) = assertTrue(this < theOther, "Expected $this to be less than $theOther")

infix fun Byte.shouldNotBeLessThan(theOther: Byte) = assertTrue(this >= theOther, "Expected $this to not be less than $theOther")

infix fun Short.shouldNotBeLessThan(theOther: Short) = assertTrue(this >= theOther, "Expected $this to not be less than $theOther")

infix fun Int.shouldNotBeLessThan(theOther: Int) = assertTrue(this >= theOther, "Expected $this to not be less than $theOther")

infix fun Long.shouldNotBeLessThan(theOther: Long) = assertTrue(this >= theOther, "Expected $this to not be less than $theOther")

infix fun Float.shouldNotBeLessThan(theOther: Float) = assertTrue(this >= theOther, "Expected $this to not be less than $theOther")

infix fun Double.shouldNotBeLessThan(theOther: Double) = assertTrue(this >= theOther, "Expected $this to not be less than $theOther")

infix fun Byte.shouldBeLessOrEqualTo(theOther: Byte) = assertTrue(this <= theOther, "Expected $this to be less or equal to $theOther")

infix fun Short.shouldBeLessOrEqualTo(theOther: Short) = assertTrue(this <= theOther, "Expected $this to be less or equal to $theOther")

infix fun Int.shouldBeLessOrEqualTo(theOther: Int) = assertTrue(this <= theOther, "Expected $this to be less or equal to $theOther")

infix fun Long.shouldBeLessOrEqualTo(theOther: Long) = assertTrue(this <= theOther, "Expected $this to be less or equal to $theOther")

infix fun Float.shouldBeLessOrEqualTo(theOther: Float) = assertTrue(this <= theOther, "Expected $this to be less or equal to $theOther")

infix fun Double.shouldBeLessOrEqualTo(theOther: Double) = assertTrue(this <= theOther, "Expected $this to be less or equal to $theOther")

infix fun Byte.shouldNotBeLessOrEqualTo(theOther: Byte) = assertTrue(this > theOther, "Expected $this to not be less or equal to $theOther")

infix fun Short.shouldNotBeLessOrEqualTo(theOther: Short) = assertTrue(this > theOther, "Expected $this to not be less or equal to $theOther")

infix fun Int.shouldNotBeLessOrEqualTo(theOther: Int) = assertTrue(this > theOther, "Expected $this to not be less or equal to $theOther")

infix fun Long.shouldNotBeLessOrEqualTo(theOther: Long) = assertTrue(this > theOther, "Expected $this to not be less or equal to $theOther")

infix fun Float.shouldNotBeLessOrEqualTo(theOther: Float) = assertTrue(this > theOther, "Expected $this to not be less or equal to $theOther")

infix fun Double.shouldNotBeLessOrEqualTo(theOther: Double) = assertTrue(this > theOther, "Expected $this to not be less or equal to $theOther")

fun Byte.shouldBePositive() = assertTrue(this > 0, "Expected $this to be positive")

fun Short.shouldBePositive() = assertTrue(this > 0, "Expected $this to be positive")

fun Int.shouldBePositive() = assertTrue(this > 0, "Expected $this to be positive")

fun Long.shouldBePositive() = assertTrue(this > 0, "Expected $this to be positive")

fun Float.shouldBePositive() = assertTrue(this > 0, "Expected $this to be positive")

fun Double.shouldBePositive() = assertTrue(this > 0, "Expected $this to be positive")

fun Byte.shouldBeNegative() = assertTrue(this < 0, "Expected $this to be negative")

fun Short.shouldBeNegative() = assertTrue(this < 0, "Expected $this to be negative")

fun Int.shouldBeNegative() = assertTrue(this < 0, "Expected $this to be negative")

fun Long.shouldBeNegative() = assertTrue(this < 0, "Expected $this to be negative")

fun Float.shouldBeNegative() = assertTrue(this < 0, "Expected $this to be negative")

fun Double.shouldBeNegative() = assertTrue(this < 0, "Expected $this to be negative")

fun Byte.shouldBeInRange(lowerBound: Byte, upperBound: Byte) = assertTrue(this >= lowerBound && this <= upperBound, "Expected $this to be between (and including) $lowerBound and $upperBound")

fun Short.shouldBeInRange(lowerBound: Short, upperBound: Short) = assertTrue(this >= lowerBound && this <= upperBound, "Expected $this to be between (and including) $lowerBound and $upperBound")

fun Int.shouldBeInRange(lowerBound: Int, upperBound: Int) = assertTrue(this >= lowerBound && this <= upperBound, "Expected $this to be between (and including) $lowerBound and $upperBound")

fun Long.shouldBeInRange(lowerBound: Long, upperBound: Long) = assertTrue(this >= lowerBound && this <= upperBound, "Expected $this to be between (and including) $lowerBound and $upperBound")

fun Float.shouldBeInRange(lowerBound: Float, upperBound: Float) = assertTrue(this >= lowerBound && this <= upperBound, "Expected $this to be between (and including) $lowerBound and $upperBound")

fun Double.shouldBeInRange(lowerBound: Double, upperBound: Double) = assertTrue(this >= lowerBound && this <= upperBound, "Expected $this to be between (and including) $lowerBound and $upperBound")

fun Byte.shouldNotBeInRange(lowerBound: Byte, upperBound: Byte) = assertTrue(this < lowerBound || this > upperBound, "Expected $this to not be between (and including) $lowerBound and $upperBound")

fun Short.shouldNotBeInRange(lowerBound: Short, upperBound: Short) = assertTrue(this < lowerBound || this > upperBound, "Expected $this to not be between (and including) $lowerBound and $upperBound")

fun Int.shouldNotBeInRange(lowerBound: Int, upperBound: Int) = assertTrue(this < lowerBound || this > upperBound, "Expected $this to not be between (and including) $lowerBound and $upperBound")

fun Long.shouldNotBeInRange(lowerBound: Long, upperBound: Long) = assertTrue(this < lowerBound || this > upperBound, "Expected $this to not be between (and including) $lowerBound and $upperBound")

fun Float.shouldNotBeInRange(lowerBound: Float, upperBound: Float) = assertTrue(this < lowerBound || this > upperBound, "Expected $this to not be between (and including) $lowerBound and $upperBound")

fun Double.shouldNotBeInRange(lowerBound: Double, upperBound: Double) = assertTrue(this < lowerBound || this > upperBound, "Expected $this to not be between (and including) $lowerBound and $upperBound")

infix fun Byte.shouldBeInRange(range: IntRange) = (this.toInt()).shouldBeInRange(range)

infix fun Short.shouldBeInRange(range: IntRange) = (this.toInt()).shouldBeInRange(range)

infix fun Int.shouldBeInRange(range: IntRange) = this.shouldBeInRange(range.first, range.last)

infix fun Long.shouldBeInRange(range: LongRange) = this.shouldBeInRange(range.first, range.last)

infix fun Byte.shouldNotBeInRange(range: IntRange) = (this.toInt()).shouldNotBeInRange(range)

infix fun Short.shouldNotBeInRange(range: IntRange) = (this.toInt()).shouldNotBeInRange(range)

infix fun Int.shouldNotBeInRange(range: IntRange) = this.shouldNotBeInRange(range.first, range.last)

infix fun Long.shouldNotBeInRange(range: LongRange) = this.shouldNotBeInRange(range.first, range.last)

