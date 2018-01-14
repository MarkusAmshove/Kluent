package org.amshove.kluent

import org.junit.Assert.*

infix fun Boolean.shouldEqualTo(theOther: Boolean) = this.apply { assertEquals(theOther, this) }

infix fun Byte.shouldEqualTo(theOther: Byte) = this.apply { assertEquals(theOther, this) }

infix fun Short.shouldEqualTo(theOther: Short) = this.apply { assertEquals(theOther, this) }

infix fun Int.shouldEqualTo(theOther: Int) = this.apply { assertEquals(theOther, this) }

infix fun Long.shouldEqualTo(theOther: Long) = this.apply { assertEquals(theOther, this) }

infix fun Float.shouldEqualTo(theOther: Float) = this.apply { assertEquals(theOther, this, 0f) }

infix fun Double.shouldEqualTo(theOther: Double) = this.apply { assertEquals(theOther, this, 0.0) }

infix fun Boolean.shouldNotEqualTo(theOther: Boolean) = this.apply { assertNotEquals(theOther, this) }

infix fun Byte.shouldNotEqualTo(theOther: Byte) = this.apply { assertNotEquals(theOther, this) }

infix fun Short.shouldNotEqualTo(theOther: Short) = this.apply { assertNotEquals(theOther, this) }

infix fun Int.shouldNotEqualTo(theOther: Int) = this.apply { assertNotEquals(theOther, this) }

infix fun Long.shouldNotEqualTo(theOther: Long) = this.apply { assertNotEquals(theOther, this) }

infix fun Float.shouldNotEqualTo(theOther: Float) = this.apply { assertNotEquals(theOther, this) }

infix fun Double.shouldNotEqualTo(theOther: Double) = this.apply { assertNotEquals(theOther, this) }

infix fun Byte.shouldBeGreaterThan(theOther: Byte) = this.apply { assertTrue("Expected $this to be greater than $theOther", this > theOther) }

infix fun Short.shouldBeGreaterThan(theOther: Short) = this.apply { assertTrue("Expected $this to be greater than $theOther", this > theOther) }

infix fun Int.shouldBeGreaterThan(theOther: Int) = this.apply { assertTrue("Expected $this to be greater than $theOther", this > theOther) }

infix fun Long.shouldBeGreaterThan(theOther: Long) = this.apply { assertTrue("Expected $this to be greater than $theOther", this > theOther) }

infix fun Float.shouldBeGreaterThan(theOther: Float) = this.apply { assertTrue("Expected $this to be greater than $theOther", this > theOther) }

infix fun Double.shouldBeGreaterThan(theOther: Double) = this.apply { assertTrue("Expected $this to be greater than $theOther", this > theOther) }

infix fun Byte.shouldNotBeGreaterThan(theOther: Byte) = this.apply { assertTrue("Expected $this to not be greater than $theOther", this <= theOther) }

infix fun Short.shouldNotBeGreaterThan(theOther: Short) = this.apply { assertTrue("Expected $this to not be greater than $theOther", this <= theOther) }

infix fun Int.shouldNotBeGreaterThan(theOther: Int) = this.apply { assertTrue("Expected $this to not be greater than $theOther", this <= theOther) }

infix fun Long.shouldNotBeGreaterThan(theOther: Long) = this.apply { assertTrue("Expected $this to not be greater than $theOther", this <= theOther) }

infix fun Float.shouldNotBeGreaterThan(theOther: Float) = this.apply { assertTrue("Expected $this to not be greater than $theOther", this <= theOther) }

infix fun Double.shouldNotBeGreaterThan(theOther: Double) = this.apply { assertTrue("Expected $this to not be greater than $theOther", this <= theOther) }

infix fun Byte.shouldBeGreaterOrEqualTo(theOther: Byte) = this.apply { assertTrue("Expected $this to be greater or equal to $theOther", this >= theOther) }

infix fun Short.shouldBeGreaterOrEqualTo(theOther: Short) = this.apply { assertTrue("Expected $this to be greater or equal to $theOther", this >= theOther) }

infix fun Int.shouldBeGreaterOrEqualTo(theOther: Int) = this.apply { assertTrue("Expected $this to be greater or equal to $theOther", this >= theOther) }

infix fun Long.shouldBeGreaterOrEqualTo(theOther: Long) = this.apply { assertTrue("Expected $this to be greater or equal to $theOther", this >= theOther) }

infix fun Float.shouldBeGreaterOrEqualTo(theOther: Float) = this.apply { assertTrue("Expected $this to be greater or equal to $theOther", this >= theOther) }

infix fun Double.shouldBeGreaterOrEqualTo(theOther: Double) = this.apply { assertTrue("Expected $this to be greater or equal to $theOther", this >= theOther) }

infix fun Byte.shouldNotBeGreaterOrEqualTo(theOther: Byte) = this.apply { assertTrue("Expected $this to be not be greater or equal to $theOther", this < theOther) }

infix fun Short.shouldNotBeGreaterOrEqualTo(theOther: Short) = this.apply { assertTrue("Expected $this to not be greater or equal to $theOther", this < theOther) }

infix fun Int.shouldNotBeGreaterOrEqualTo(theOther: Int) = this.apply { assertTrue("Expected $this to not be greater or equal to $theOther", this < theOther) }

infix fun Long.shouldNotBeGreaterOrEqualTo(theOther: Long) = this.apply { assertTrue("Expected $this to not be greater or equal to $theOther", this < theOther) }

infix fun Float.shouldNotBeGreaterOrEqualTo(theOther: Float) = this.apply { assertTrue("Expected $this to not be greater or equal to $theOther", this < theOther) }

infix fun Double.shouldNotBeGreaterOrEqualTo(theOther: Double) = this.apply { assertTrue("Expected $this to not be greater or equal to $theOther", this < theOther) }

infix fun Byte.shouldBeLessThan(theOther: Byte) = this.apply { assertTrue("Expected $this to be less than $theOther", this < theOther) }

infix fun Short.shouldBeLessThan(theOther: Short) = this.apply { assertTrue("Expected $this to be less than $theOther", this < theOther) }

infix fun Int.shouldBeLessThan(theOther: Int) = this.apply { assertTrue("Expected $this to be less than $theOther", this < theOther) }

infix fun Long.shouldBeLessThan(theOther: Long) = this.apply { assertTrue("Expected $this to be less than $theOther", this < theOther) }

infix fun Float.shouldBeLessThan(theOther: Float) = this.apply { assertTrue("Expected $this to be less than $theOther", this < theOther) }

infix fun Double.shouldBeLessThan(theOther: Double) = this.apply { assertTrue("Expected $this to be less than $theOther", this < theOther) }

infix fun Byte.shouldNotBeLessThan(theOther: Byte) = this.apply { assertTrue("Expected $this to not be less than $theOther", this >= theOther) }

infix fun Short.shouldNotBeLessThan(theOther: Short) = this.apply { assertTrue("Expected $this to not be less than $theOther", this >= theOther) }

infix fun Int.shouldNotBeLessThan(theOther: Int) = this.apply { assertTrue("Expected $this to not be less than $theOther", this >= theOther) }

infix fun Long.shouldNotBeLessThan(theOther: Long) = this.apply { assertTrue("Expected $this to not be less than $theOther", this >= theOther) }

infix fun Float.shouldNotBeLessThan(theOther: Float) = this.apply { assertTrue("Expected $this to not be less than $theOther", this >= theOther) }

infix fun Double.shouldNotBeLessThan(theOther: Double) = this.apply { assertTrue("Expected $this to not be less than $theOther", this >= theOther) }

infix fun Byte.shouldBeLessOrEqualTo(theOther: Byte) = this.apply { assertTrue("Expected $this to be less or equal to $theOther", this <= theOther) }

infix fun Short.shouldBeLessOrEqualTo(theOther: Short) = this.apply { assertTrue("Expected $this to be less or equal to $theOther", this <= theOther) }

infix fun Int.shouldBeLessOrEqualTo(theOther: Int) = this.apply { assertTrue("Expected $this to be less or equal to $theOther", this <= theOther) }

infix fun Long.shouldBeLessOrEqualTo(theOther: Long) = this.apply { assertTrue("Expected $this to be less or equal to $theOther", this <= theOther) }

infix fun Float.shouldBeLessOrEqualTo(theOther: Float) = this.apply { assertTrue("Expected $this to be less or equal to $theOther", this <= theOther) }

infix fun Double.shouldBeLessOrEqualTo(theOther: Double) = this.apply { assertTrue("Expected $this to be less or equal to $theOther", this <= theOther) }

infix fun Byte.shouldNotBeLessOrEqualTo(theOther: Byte) = this.apply { assertTrue("Expected $this to not be less or equal to $theOther", this > theOther) }

infix fun Short.shouldNotBeLessOrEqualTo(theOther: Short) = this.apply { assertTrue("Expected $this to not be less or equal to $theOther", this > theOther) }

infix fun Int.shouldNotBeLessOrEqualTo(theOther: Int) = this.apply { assertTrue("Expected $this to not be less or equal to $theOther", this > theOther) }

infix fun Long.shouldNotBeLessOrEqualTo(theOther: Long) = this.apply { assertTrue("Expected $this to not be less or equal to $theOther", this > theOther) }

infix fun Float.shouldNotBeLessOrEqualTo(theOther: Float) = this.apply { assertTrue("Expected $this to not be less or equal to $theOther", this > theOther) }

infix fun Double.shouldNotBeLessOrEqualTo(theOther: Double) = this.apply { assertTrue("Expected $this to not be less or equal to $theOther", this > theOther) }

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

fun Byte.shouldBeInRange(lowerBound: Byte, upperBound: Byte) = this.apply { assertTrue("Expected $this to be between (and including) $lowerBound and $upperBound", this >= lowerBound && this <= upperBound) }

fun Short.shouldBeInRange(lowerBound: Short, upperBound: Short) = this.apply { assertTrue("Expected $this to be between (and including) $lowerBound and $upperBound", this >= lowerBound && this <= upperBound) }

fun Int.shouldBeInRange(lowerBound: Int, upperBound: Int) = this.apply { assertTrue("Expected $this to be between (and including) $lowerBound and $upperBound", this >= lowerBound && this <= upperBound) }

fun Long.shouldBeInRange(lowerBound: Long, upperBound: Long) = this.apply { assertTrue("Expected $this to be between (and including) $lowerBound and $upperBound", this >= lowerBound && this <= upperBound) }

fun Float.shouldBeInRange(lowerBound: Float, upperBound: Float) = this.apply { assertTrue("Expected $this to be between (and including) $lowerBound and $upperBound", this >= lowerBound && this <= upperBound) }

fun Double.shouldBeInRange(lowerBound: Double, upperBound: Double) = this.apply { assertTrue("Expected $this to be between (and including) $lowerBound and $upperBound", this >= lowerBound && this <= upperBound) }

fun Byte.shouldNotBeInRange(lowerBound: Byte, upperBound: Byte) = this.apply { assertTrue("Expected $this to not be between (and including) $lowerBound and $upperBound", this < lowerBound || this > upperBound) }

fun Short.shouldNotBeInRange(lowerBound: Short, upperBound: Short) = this.apply { assertTrue("Expected $this to not be between (and including) $lowerBound and $upperBound", this < lowerBound || this > upperBound) }

fun Int.shouldNotBeInRange(lowerBound: Int, upperBound: Int) = this.apply { assertTrue("Expected $this to not be between (and including) $lowerBound and $upperBound", this < lowerBound || this > upperBound) }

fun Long.shouldNotBeInRange(lowerBound: Long, upperBound: Long) = this.apply { assertTrue("Expected $this to not be between (and including) $lowerBound and $upperBound", this < lowerBound || this > upperBound) }

fun Float.shouldNotBeInRange(lowerBound: Float, upperBound: Float) = this.apply { assertTrue("Expected $this to not be between (and including) $lowerBound and $upperBound", this < lowerBound || this > upperBound) }

fun Double.shouldNotBeInRange(lowerBound: Double, upperBound: Double) = this.apply { assertTrue("Expected $this to not be between (and including) $lowerBound and $upperBound", this < lowerBound || this > upperBound) }

infix fun Byte.shouldBeInRange(range: IntRange) = this.apply { (this.toInt()).shouldBeInRange(range) }

infix fun Short.shouldBeInRange(range: IntRange) = this.apply { (this.toInt()).shouldBeInRange(range) }

infix fun Int.shouldBeInRange(range: IntRange) = this.apply { this.shouldBeInRange(range.first, range.last) }

infix fun Long.shouldBeInRange(range: LongRange) = this.apply { this.shouldBeInRange(range.first, range.last) }

infix fun Byte.shouldNotBeInRange(range: IntRange) = this.apply { (this.toInt()).shouldNotBeInRange(range) }

infix fun Short.shouldNotBeInRange(range: IntRange) = this.apply { (this.toInt()).shouldNotBeInRange(range) }

infix fun Int.shouldNotBeInRange(range: IntRange) = this.apply { this.shouldNotBeInRange(range.first, range.last) }

infix fun Long.shouldNotBeInRange(range: LongRange) = this.apply { this.shouldNotBeInRange(range.first, range.last) }

