package org.amshove.kluent

import org.junit.Assert.*

infix fun Boolean.shouldEqualTo(theOther: Boolean) = assertEquals(theOther, this)

infix fun Byte.shouldEqualTo(theOther: Byte) = assertEquals(theOther, this)

infix fun Short.shouldEqualTo(theOther: Short) = assertEquals(theOther, this)

infix fun Int.shouldEqualTo(theOther: Int) = assertEquals(theOther, this)

infix fun Long.shouldEqualTo(theOther: Long) = assertEquals(theOther, this)

infix fun Float.shouldEqualTo(theOther: Float) = assertEquals(theOther, this, 0f)

infix fun Double.shouldEqualTo(theOther: Double) = assertEquals(theOther, this, 0.0)

infix fun Boolean.shouldNotEqualTo(theOther: Boolean) = assertNotEquals(theOther, this)

infix fun Byte.shouldNotEqualTo(theOther: Byte) = assertNotEquals(theOther, this)

infix fun Short.shouldNotEqualTo(theOther: Short) = assertNotEquals(theOther, this)

infix fun Int.shouldNotEqualTo(theOther: Int) = assertNotEquals(theOther, this)

infix fun Long.shouldNotEqualTo(theOther: Long) = assertNotEquals(theOther, this)

infix fun Float.shouldNotEqualTo(theOther: Float) = assertNotEquals(theOther, this)

infix fun Double.shouldNotEqualTo(theOther: Double) = assertNotEquals(theOther, this)

infix fun Byte.shouldBeGreaterThan(theOther: Byte) = assertTrue("Expected $this to be greater than $theOther", this > theOther)

infix fun Short.shouldBeGreaterThan(theOther: Short) = assertTrue("Expected $this to be greater than $theOther", this > theOther)

infix fun Int.shouldBeGreaterThan(theOther: Int) = assertTrue("Expected $this to be greater than $theOther", this > theOther)

infix fun Long.shouldBeGreaterThan(theOther: Long) = assertTrue("Expected $this to be greater than $theOther", this > theOther)

infix fun Float.shouldBeGreaterThan(theOther: Float) = assertTrue("Expected $this to be greater than $theOther", this > theOther)

infix fun Double.shouldBeGreaterThan(theOther: Double) = assertTrue("Expected $this to be greater than $theOther", this > theOther)

infix fun Byte.shouldNotBeGreaterThan(theOther: Byte) = assertTrue("Expected $this to not be greater than $theOther", this <= theOther)

infix fun Short.shouldNotBeGreaterThan(theOther: Short) = assertTrue("Expected $this to not be greater than $theOther", this <= theOther)

infix fun Int.shouldNotBeGreaterThan(theOther: Int) = assertTrue("Expected $this to not be greater than $theOther", this <= theOther)

infix fun Long.shouldNotBeGreaterThan(theOther: Long) = assertTrue("Expected $this to not be greater than $theOther", this <= theOther)

infix fun Float.shouldNotBeGreaterThan(theOther: Float) = assertTrue("Expected $this to not be greater than $theOther", this <= theOther)

infix fun Double.shouldNotBeGreaterThan(theOther: Double) = assertTrue("Expected $this to not be greater than $theOther", this <= theOther)

infix fun Byte.shouldBeGreaterOrEqualTo(theOther: Byte) = assertTrue("Expected $this to be greater or equal to $theOther", this >= theOther)

infix fun Short.shouldBeGreaterOrEqualTo(theOther: Short) = assertTrue("Expected $this to be greater or equal to $theOther", this >= theOther)

infix fun Int.shouldBeGreaterOrEqualTo(theOther: Int) = assertTrue("Expected $this to be greater or equal to $theOther", this >= theOther)

infix fun Long.shouldBeGreaterOrEqualTo(theOther: Long) = assertTrue("Expected $this to be greater or equal to $theOther", this >= theOther)

infix fun Float.shouldBeGreaterOrEqualTo(theOther: Float) = assertTrue("Expected $this to be greater or equal to $theOther", this >= theOther)

infix fun Double.shouldBeGreaterOrEqualTo(theOther: Double) = assertTrue("Expected $this to be greater or equal to $theOther", this >= theOther)

infix fun Byte.shouldNotBeGreaterOrEqualTo(theOther: Byte) = assertTrue("Expected $this to be not be greater or equal to $theOther", this < theOther)

infix fun Short.shouldNotBeGreaterOrEqualTo(theOther: Short) = assertTrue("Expected $this to not be greater or equal to $theOther", this < theOther)

infix fun Int.shouldNotBeGreaterOrEqualTo(theOther: Int) = assertTrue("Expected $this to not be greater or equal to $theOther", this < theOther)

infix fun Long.shouldNotBeGreaterOrEqualTo(theOther: Long) = assertTrue("Expected $this to not be greater or equal to $theOther", this < theOther)

infix fun Float.shouldNotBeGreaterOrEqualTo(theOther: Float) = assertTrue("Expected $this to not be greater or equal to $theOther", this < theOther)

infix fun Double.shouldNotBeGreaterOrEqualTo(theOther: Double) = assertTrue("Expected $this to not be greater or equal to $theOther", this < theOther)

infix fun Byte.shouldBeLessThan(theOther: Byte) = assertTrue("Expected $this to be less than $theOther", this < theOther)

infix fun Short.shouldBeLessThan(theOther: Short) = assertTrue("Expected $this to be less than $theOther", this < theOther)

infix fun Int.shouldBeLessThan(theOther: Int) = assertTrue("Expected $this to be less than $theOther", this < theOther)

infix fun Long.shouldBeLessThan(theOther: Long) = assertTrue("Expected $this to be less than $theOther", this < theOther)

infix fun Float.shouldBeLessThan(theOther: Float) = assertTrue("Expected $this to be less than $theOther", this < theOther)

infix fun Double.shouldBeLessThan(theOther: Double) = assertTrue("Expected $this to be less than $theOther", this < theOther)

infix fun Byte.shouldNotBeLessThan(theOther: Byte) = assertTrue("Expected $this to not be less than $theOther", this >= theOther)

infix fun Short.shouldNotBeLessThan(theOther: Short) = assertTrue("Expected $this to not be less than $theOther", this >= theOther)

infix fun Int.shouldNotBeLessThan(theOther: Int) = assertTrue("Expected $this to not be less than $theOther", this >= theOther)

infix fun Long.shouldNotBeLessThan(theOther: Long) = assertTrue("Expected $this to not be less than $theOther", this >= theOther)

infix fun Float.shouldNotBeLessThan(theOther: Float) = assertTrue("Expected $this to not be less than $theOther", this >= theOther)

infix fun Double.shouldNotBeLessThan(theOther: Double) = assertTrue("Expected $this to not be less than $theOther", this >= theOther)

infix fun Byte.shouldBeLessOrEqualTo(theOther: Byte) = assertTrue("Expected $this to be less or equal to $theOther", this <= theOther)

infix fun Short.shouldBeLessOrEqualTo(theOther: Short) = assertTrue("Expected $this to be less or equal to $theOther", this <= theOther)

infix fun Int.shouldBeLessOrEqualTo(theOther: Int) = assertTrue("Expected $this to be less or equal to $theOther", this <= theOther)

infix fun Long.shouldBeLessOrEqualTo(theOther: Long) = assertTrue("Expected $this to be less or equal to $theOther", this <= theOther)

infix fun Float.shouldBeLessOrEqualTo(theOther: Float) = assertTrue("Expected $this to be less or equal to $theOther", this <= theOther)

infix fun Double.shouldBeLessOrEqualTo(theOther: Double) = assertTrue("Expected $this to be less or equal to $theOther", this <= theOther)

infix fun Byte.shouldNotBeLessOrEqualTo(theOther: Byte) = assertTrue("Expected $this to not be less or equal to $theOther", this > theOther)

infix fun Short.shouldNotBeLessOrEqualTo(theOther: Short) = assertTrue("Expected $this to not be less or equal to $theOther", this > theOther)

infix fun Int.shouldNotBeLessOrEqualTo(theOther: Int) = assertTrue("Expected $this to not be less or equal to $theOther", this > theOther)

infix fun Long.shouldNotBeLessOrEqualTo(theOther: Long) = assertTrue("Expected $this to not be less or equal to $theOther", this > theOther)

infix fun Float.shouldNotBeLessOrEqualTo(theOther: Float) = assertTrue("Expected $this to not be less or equal to $theOther", this > theOther)

infix fun Double.shouldNotBeLessOrEqualTo(theOther: Double) = assertTrue("Expected $this to not be less or equal to $theOther", this > theOther)

fun Byte.shouldBePositive() = assertTrue("Expected $this to be positive", this > 0)

fun Short.shouldBePositive() = assertTrue("Expected $this to be positive", this > 0)

fun Int.shouldBePositive() = assertTrue("Expected $this to be positive", this > 0)

fun Long.shouldBePositive() = assertTrue("Expected $this to be positive", this > 0)

fun Float.shouldBePositive() = assertTrue("Expected $this to be positive", this > 0)

fun Double.shouldBePositive() = assertTrue("Expected $this to be positive", this > 0)

fun Byte.shouldBeNegative() = assertTrue("Expected $this to be negative", this < 0)

fun Short.shouldBeNegative() = assertTrue("Expected $this to be negative", this < 0)

fun Int.shouldBeNegative() = assertTrue("Expected $this to be negative", this < 0)

fun Long.shouldBeNegative() = assertTrue("Expected $this to be negative", this < 0)

fun Float.shouldBeNegative() = assertTrue("Expected $this to be negative", this < 0)

fun Double.shouldBeNegative() = assertTrue("Expected $this to be negative", this < 0)

fun Byte.shouldBeInRange(lowerBound: Byte, upperBound: Byte) = assertTrue("Expected $this to be between (and including) $lowerBound and $upperBound", this >= lowerBound && this <= upperBound)

fun Short.shouldBeInRange(lowerBound: Short, upperBound: Short) = assertTrue("Expected $this to be between (and including) $lowerBound and $upperBound", this >= lowerBound && this <= upperBound)

fun Int.shouldBeInRange(lowerBound: Int, upperBound: Int) = assertTrue("Expected $this to be between (and including) $lowerBound and $upperBound", this >= lowerBound && this <= upperBound)

fun Long.shouldBeInRange(lowerBound: Long, upperBound: Long) = assertTrue("Expected $this to be between (and including) $lowerBound and $upperBound", this >= lowerBound && this <= upperBound)

fun Float.shouldBeInRange(lowerBound: Float, upperBound: Float) = assertTrue("Expected $this to be between (and including) $lowerBound and $upperBound", this >= lowerBound && this <= upperBound)

fun Double.shouldBeInRange(lowerBound: Double, upperBound: Double) = assertTrue("Expected $this to be between (and including) $lowerBound and $upperBound", this >= lowerBound && this <= upperBound)

fun Byte.shouldNotBeInRange(lowerBound: Byte, upperBound: Byte) = assertTrue("Expected $this to not be between (and including) $lowerBound and $upperBound", this < lowerBound || this > upperBound)

fun Short.shouldNotBeInRange(lowerBound: Short, upperBound: Short) = assertTrue("Expected $this to not be between (and including) $lowerBound and $upperBound", this < lowerBound || this > upperBound)

fun Int.shouldNotBeInRange(lowerBound: Int, upperBound: Int) = assertTrue("Expected $this to not be between (and including) $lowerBound and $upperBound", this < lowerBound || this > upperBound)

fun Long.shouldNotBeInRange(lowerBound: Long, upperBound: Long) = assertTrue("Expected $this to not be between (and including) $lowerBound and $upperBound", this < lowerBound || this > upperBound)

fun Float.shouldNotBeInRange(lowerBound: Float, upperBound: Float) = assertTrue("Expected $this to not be between (and including) $lowerBound and $upperBound", this < lowerBound || this > upperBound)

fun Double.shouldNotBeInRange(lowerBound: Double, upperBound: Double) = assertTrue("Expected $this to not be between (and including) $lowerBound and $upperBound", this < lowerBound || this > upperBound)

infix fun Byte.shouldBeInRange(range: IntRange) = (this.toInt()).shouldBeInRange(range)

infix fun Short.shouldBeInRange(range: IntRange) = (this.toInt()).shouldBeInRange(range)

infix fun Int.shouldBeInRange(range: IntRange) = this.shouldBeInRange(range.first, range.last)

infix fun Long.shouldBeInRange(range: LongRange) = this.shouldBeInRange(range.first, range.last)

infix fun Byte.shouldNotBeInRange(range: IntRange) = (this.toInt()).shouldNotBeInRange(range)

infix fun Short.shouldNotBeInRange(range: IntRange) = (this.toInt()).shouldNotBeInRange(range)

infix fun Int.shouldNotBeInRange(range: IntRange) = this.shouldNotBeInRange(range.first, range.last)

infix fun Long.shouldNotBeInRange(range: LongRange) = this.shouldNotBeInRange(range.first, range.last)

