package org.amshove.kluent

import org.assertj.core.api.Assertions.assertThat

infix fun Boolean.shouldEqualTo(theOther: Boolean) = assertThat(this).isEqualTo(theOther)

infix fun Byte.shouldEqualTo(theOther: Byte) = assertThat(this).isEqualTo(theOther)

infix fun Short.shouldEqualTo(theOther: Short) = assertThat(this).isEqualTo(theOther)

infix fun Int.shouldEqualTo(theOther: Int) = assertThat(this).isEqualTo(theOther)

infix fun Long.shouldEqualTo(theOther: Long) = assertThat(this).isEqualTo(theOther)

infix fun Float.shouldEqualTo(theOther: Float) = assertThat(this).isEqualTo(theOther)

infix fun Double.shouldEqualTo(theOther: Double) = assertThat(this).isEqualTo(theOther)

infix fun Boolean.shouldNotEqualTo(theOther: Boolean) = assertThat(this).isNotEqualTo(theOther)

infix fun Byte.shouldNotEqualTo(theOther: Byte) = assertThat(this).isNotEqualTo(theOther)

infix fun Short.shouldNotEqualTo(theOther: Short) = assertThat(this).isNotEqualTo(theOther)

infix fun Int.shouldNotEqualTo(theOther: Int) = assertThat(this).isNotEqualTo(theOther)

infix fun Long.shouldNotEqualTo(theOther: Long) = assertThat(this).isNotEqualTo(theOther)

infix fun Float.shouldNotEqualTo(theOther: Float) = assertThat(this).isNotEqualTo(theOther)

infix fun Double.shouldNotEqualTo(theOther: Double) = assertThat(this).isNotEqualTo(theOther)

infix fun Byte.shouldBeGreaterThan(theOther: Byte) = assertThat(this > theOther).`as`("Expected $this to be greater than $theOther").isTrue()

infix fun Short.shouldBeGreaterThan(theOther: Short) = assertThat(this > theOther).`as`("Expected $this to be greater than $theOther").isTrue()

infix fun Int.shouldBeGreaterThan(theOther: Int) = assertThat(this > theOther).`as`("Expected $this to be greater than $theOther").isTrue()

infix fun Long.shouldBeGreaterThan(theOther: Long) = assertThat(this > theOther).`as`("Expected $this to be greater than $theOther").isTrue()

infix fun Float.shouldBeGreaterThan(theOther: Float) = assertThat(this > theOther).`as`("Expected $this to be greater than $theOther").isTrue()

infix fun Double.shouldBeGreaterThan(theOther: Double) = assertThat(this > theOther).`as`("Expected $this to be greater than $theOther").isTrue()

infix fun Byte.shouldNotBeGreaterThan(theOther: Byte) = assertThat(this <= theOther).`as`("Expected $this to not be greater than $theOther").isTrue()

infix fun Short.shouldNotBeGreaterThan(theOther: Short) = assertThat(this <= theOther).`as`("Expected $this to not be greater than $theOther").isTrue()

infix fun Int.shouldNotBeGreaterThan(theOther: Int) = assertThat(this <= theOther).`as`("Expected $this to not be greater than $theOther").isTrue()

infix fun Long.shouldNotBeGreaterThan(theOther: Long) = assertThat(this <= theOther).`as`("Expected $this to not be greater than $theOther").isTrue()

infix fun Float.shouldNotBeGreaterThan(theOther: Float) = assertThat(this <= theOther).`as`("Expected $this to not be greater than $theOther").isTrue()

infix fun Double.shouldNotBeGreaterThan(theOther: Double) = assertThat(this <= theOther).`as`("Expected $this to not be greater than $theOther").isTrue()

infix fun Byte.shouldBeGreaterOrEqualTo(theOther: Byte) = assertThat(this >= theOther).`as`("Expected $this to be greater or equal to $theOther").isTrue()

infix fun Short.shouldBeGreaterOrEqualTo(theOther: Short) = assertThat(this >= theOther).`as`("Expected $this to be greater or equal to $theOther").isTrue()

infix fun Int.shouldBeGreaterOrEqualTo(theOther: Int) = assertThat(this >= theOther).`as`("Expected $this to be greater or equal to $theOther").isTrue()

infix fun Long.shouldBeGreaterOrEqualTo(theOther: Long) = assertThat(this >= theOther).`as`("Expected $this to be greater or equal to $theOther").isTrue()

infix fun Float.shouldBeGreaterOrEqualTo(theOther: Float) = assertThat(this >= theOther).`as`("Expected $this to be greater or equal to $theOther").isTrue()

infix fun Double.shouldBeGreaterOrEqualTo(theOther: Double) = assertThat(this >= theOther).`as`("Expected $this to be greater or equal to $theOther").isTrue()

infix fun Byte.shouldNotBeGreaterOrEqualTo(theOther: Byte) = assertThat(this < theOther).`as`("Expected $this to be not be greater or equal to $theOther").isTrue()

infix fun Short.shouldNotBeGreaterOrEqualTo(theOther: Short) = assertThat(this < theOther).`as`("Expected $this to not be greater or equal to $theOther").isTrue()

infix fun Int.shouldNotBeGreaterOrEqualTo(theOther: Int) = assertThat(this < theOther).`as`("Expected $this to not be greater or equal to $theOther").isTrue()

infix fun Long.shouldNotBeGreaterOrEqualTo(theOther: Long) = assertThat(this < theOther).`as`("Expected $this to not be greater or equal to $theOther").isTrue()

infix fun Float.shouldNotBeGreaterOrEqualTo(theOther: Float) = assertThat(this < theOther).`as`("Expected $this to not be greater or equal to $theOther").isTrue()

infix fun Double.shouldNotBeGreaterOrEqualTo(theOther: Double) = assertThat(this < theOther).`as`("Expected $this to not be greater or equal to $theOther").isTrue()

infix fun Byte.shouldBeLessThan(theOther: Byte) = assertThat(this < theOther).`as`("Expected $this to be less than $theOther").isTrue()

infix fun Short.shouldBeLessThan(theOther: Short) = assertThat(this < theOther).`as`("Expected $this to be less than $theOther").isTrue()

infix fun Int.shouldBeLessThan(theOther: Int) = assertThat(this < theOther).`as`("Expected $this to be less than $theOther").isTrue()

infix fun Long.shouldBeLessThan(theOther: Long) = assertThat(this < theOther).`as`("Expected $this to be less than $theOther").isTrue()

infix fun Float.shouldBeLessThan(theOther: Float) = assertThat(this < theOther).`as`("Expected $this to be less than $theOther").isTrue()

infix fun Double.shouldBeLessThan(theOther: Double) = assertThat(this < theOther).`as`("Expected $this to be less than $theOther").isTrue()

infix fun Byte.shouldNotBeLessThan(theOther: Byte) = assertThat(this >= theOther).`as`("Expected $this to not be less than $theOther").isTrue()

infix fun Short.shouldNotBeLessThan(theOther: Short) = assertThat(this >= theOther).`as`("Expected $this to not be less than $theOther").isTrue()

infix fun Int.shouldNotBeLessThan(theOther: Int) = assertThat(this >= theOther).`as`("Expected $this to not be less than $theOther").isTrue()

infix fun Long.shouldNotBeLessThan(theOther: Long) = assertThat(this >= theOther).`as`("Expected $this to not be less than $theOther").isTrue()

infix fun Float.shouldNotBeLessThan(theOther: Float) = assertThat(this >= theOther).`as`("Expected $this to not be less than $theOther").isTrue()

infix fun Double.shouldNotBeLessThan(theOther: Double) = assertThat(this >= theOther).`as`("Expected $this to not be less than $theOther").isTrue()

infix fun Byte.shouldBeLessOrEqualTo(theOther: Byte) = assertThat(this <= theOther).`as`("Expected $this to be less or equal to $theOther").isTrue()

infix fun Short.shouldBeLessOrEqualTo(theOther: Short) = assertThat(this <= theOther).`as`("Expected $this to be less or equal to $theOther").isTrue()

infix fun Int.shouldBeLessOrEqualTo(theOther: Int) = assertThat(this <= theOther).`as`("Expected $this to be less or equal to $theOther").isTrue()

infix fun Long.shouldBeLessOrEqualTo(theOther: Long) = assertThat(this <= theOther).`as`("Expected $this to be less or equal to $theOther").isTrue()

infix fun Float.shouldBeLessOrEqualTo(theOther: Float) = assertThat(this <= theOther).`as`("Expected $this to be less or equal to $theOther").isTrue()

infix fun Double.shouldBeLessOrEqualTo(theOther: Double) = assertThat(this <= theOther).`as`("Expected $this to be less or equal to $theOther").isTrue()

infix fun Byte.shouldNotBeLessOrEqualTo(theOther: Byte) = assertThat(this > theOther).`as`("Expected $this to not be less or equal to $theOther").isTrue()

infix fun Short.shouldNotBeLessOrEqualTo(theOther: Short) = assertThat(this > theOther).`as`("Expected $this to not be less or equal to $theOther").isTrue()

infix fun Int.shouldNotBeLessOrEqualTo(theOther: Int) = assertThat(this > theOther).`as`("Expected $this to not be less or equal to $theOther").isTrue()

infix fun Long.shouldNotBeLessOrEqualTo(theOther: Long) = assertThat(this > theOther).`as`("Expected $this to not be less or equal to $theOther").isTrue()

infix fun Float.shouldNotBeLessOrEqualTo(theOther: Float) = assertThat(this > theOther).`as`("Expected $this to not be less or equal to $theOther").isTrue()

infix fun Double.shouldNotBeLessOrEqualTo(theOther: Double) = assertThat(this > theOther).`as`("Expected $this to not be less or equal to $theOther").isTrue()

fun Byte.shouldBePositive() = assertThat(this > 0).`as`("Expected $this to be positive").isTrue()

fun Short.shouldBePositive() = assertThat(this > 0).`as`("Expected $this to be positive").isTrue()

fun Int.shouldBePositive() = assertThat(this > 0).`as`("Expected $this to be positive").isTrue()

fun Long.shouldBePositive() = assertThat(this > 0).`as`("Expected $this to be positive").isTrue()

fun Float.shouldBePositive() = assertThat(this > 0).`as`("Expected $this to be positive").isTrue()

fun Double.shouldBePositive() = assertThat(this > 0).`as`("Expected $this to be positive").isTrue()

fun Byte.shouldBeNegative() = assertThat(this < 0).`as`("Expected $this to be negative").isTrue()

fun Short.shouldBeNegative() = assertThat(this < 0).`as`("Expected $this to be negative").isTrue()

fun Int.shouldBeNegative() = assertThat(this < 0).`as`("Expected $this to be negative").isTrue()

fun Long.shouldBeNegative() = assertThat(this < 0).`as`("Expected $this to be negative").isTrue()

fun Float.shouldBeNegative() = assertThat(this < 0).`as`("Expected $this to be negative").isTrue()

fun Double.shouldBeNegative() = assertThat(this < 0).`as`("Expected $this to be negative").isTrue()

fun Byte.shouldBeInRange(lowerBound: Byte, upperBound: Byte) = assertThat(this >= lowerBound && this <= upperBound).`as`("Expected $this to be between (and including) $lowerBound and $upperBound").isTrue()

fun Short.shouldBeInRange(lowerBound: Short, upperBound: Short) = assertThat(this >= lowerBound && this <= upperBound).`as`("Expected $this to be between (and including) $lowerBound and $upperBound").isTrue()

fun Int.shouldBeInRange(lowerBound: Int, upperBound: Int) = assertThat(this >= lowerBound && this <= upperBound).`as`("Expected $this to be between (and including) $lowerBound and $upperBound").isTrue()

fun Long.shouldBeInRange(lowerBound: Long, upperBound: Long) = assertThat(this >= lowerBound && this <= upperBound).`as`("Expected $this to be between (and including) $lowerBound and $upperBound").isTrue()

fun Float.shouldBeInRange(lowerBound: Float, upperBound: Float) = assertThat(this >= lowerBound && this <= upperBound).`as`("Expected $this to be between (and including) $lowerBound and $upperBound").isTrue()

fun Double.shouldBeInRange(lowerBound: Double, upperBound: Double) = assertThat(this >= lowerBound && this <= upperBound).`as`("Expected $this to be between (and including) $lowerBound and $upperBound").isTrue()

fun Byte.shouldNotBeInRange(lowerBound: Byte, upperBound: Byte) = assertThat(this < lowerBound || this > upperBound).`as`("Expected $this to not be between (and including) $lowerBound and $upperBound").isTrue()

fun Short.shouldNotBeInRange(lowerBound: Short, upperBound: Short) = assertThat(this < lowerBound || this > upperBound).`as`("Expected $this to not be between (and including) $lowerBound and $upperBound").isTrue()

fun Int.shouldNotBeInRange(lowerBound: Int, upperBound: Int) = assertThat(this < lowerBound || this > upperBound).`as`("Expected $this to not be between (and including) $lowerBound and $upperBound").isTrue()

fun Long.shouldNotBeInRange(lowerBound: Long, upperBound: Long) = assertThat(this < lowerBound || this > upperBound).`as`("Expected $this to not be between (and including) $lowerBound and $upperBound").isTrue()

fun Float.shouldNotBeInRange(lowerBound: Float, upperBound: Float) = assertThat(this < lowerBound || this > upperBound).`as`("Expected $this to not be between (and including) $lowerBound and $upperBound").isTrue()

fun Double.shouldNotBeInRange(lowerBound: Double, upperBound: Double) = assertThat(this < lowerBound || this > upperBound).`as`("Expected $this to not be between (and including) $lowerBound and $upperBound").isTrue()

infix fun Byte.shouldBeInRange(range: IntRange) = (this.toInt()).shouldBeInRange(range)

infix fun Short.shouldBeInRange(range: IntRange) = (this.toInt()).shouldBeInRange(range)

infix fun Int.shouldBeInRange(range: IntRange) = this.shouldBeInRange(range.first, range.last)

infix fun Long.shouldBeInRange(range: LongRange) = this.shouldBeInRange(range.first, range.last)

infix fun Byte.shouldNotBeInRange(range: IntRange) = (this.toInt()).shouldNotBeInRange(range)

infix fun Short.shouldNotBeInRange(range: IntRange) = (this.toInt()).shouldNotBeInRange(range)

infix fun Int.shouldNotBeInRange(range: IntRange) = this.shouldNotBeInRange(range.first, range.last)

infix fun Long.shouldNotBeInRange(range: LongRange) = this.shouldNotBeInRange(range.first, range.last)

