package org.amshove.kluent

import org.junit.Assert.*

infix fun Boolean.`should equal to`(theOther: Boolean) = assertEquals(theOther, this)
infix fun Boolean.shouldEqualTo(theOther: Boolean) = this `should equal to` theOther

infix fun Byte.`should equal to`(theOther: Byte) = assertEquals(theOther, this)
infix fun Byte.shouldEqualTo(theOther: Byte) = this `should equal to` theOther

infix fun Short.`should equal to`(theOther: Short) = assertEquals(theOther, this)
infix fun Short.shouldEqualTo(theOther: Short) = this `should equal to` theOther

infix fun Int.`should equal to`(theOther: Int) = assertEquals(theOther, this)
infix fun Int.shouldEqualTo(theOther: Int) = this `should equal to` theOther

infix fun Long.`should equal to`(theOther: Long) = assertEquals(theOther, this)
infix fun Long.shouldEqualTo(theOther: Long) = this `should equal to` theOther

infix fun Float.`should equal to`(theOther: Float) = assertEquals(theOther, this, 0f)
infix fun Float.shouldEqualTo(theOther: Float) = this `should equal to` theOther

infix fun Double.`should equal to`(theOther: Double) = assertEquals(theOther, this, 0.0)
infix fun Double.shouldEqualTo(theOther: Double) = this `should equal to` theOther

infix fun Boolean.`should not equal to`(theOther: Boolean) = assertNotEquals(theOther, this)
infix fun Boolean.shouldNotEqualTo(theOther: Boolean) = this `should not equal to` theOther

infix fun Byte.`should not equal to`(theOther: Byte) = assertNotEquals(theOther, this)
infix fun Byte.shouldNotEqualTo(theOther: Byte) = this `should not equal to` theOther

infix fun Short.`should not equal to`(theOther: Short) = assertNotEquals(theOther, this)
infix fun Short.shouldNotEqualTo(theOther: Short) = this `should not equal to` theOther

infix fun Int.`should not equal to`(theOther: Int) = assertNotEquals(theOther, this)
infix fun Int.shouldNotEqualTo(theOther: Int) = this `should not equal to` theOther

infix fun Long.`should not equal to`(theOther: Long) = assertNotEquals(theOther, this)
infix fun Long.shouldNotEqualTo(theOther: Long) = this `should not equal to` theOther

infix fun Float.`should not equal to`(theOther: Float) = assertNotEquals(theOther, this)
infix fun Float.shouldNotEqualTo(theOther: Float) = this `should not equal to` theOther

infix fun Double.`should not equal to`(theOther: Double) = assertNotEquals(theOther, this)
infix fun Double.shouldNotEqualTo(theOther: Double) = this `should not equal to` theOther

infix fun Byte.`should be greater than`(theOther: Byte) = assertTrue("Expected $this to be greater than $theOther", this > theOther)
infix fun Byte.shouldBeGreaterThan(theOther: Byte) = this `should be greater than` theOther

infix fun Short.`should be greater than`(theOther: Short) = assertTrue("Expected $this to be greater than $theOther", this > theOther)
infix fun Short.shouldBeGreaterThan(theOther: Short) = this `should be greater than` theOther

infix fun Int.`should be greater than`(theOther: Int) = assertTrue("Expected $this to be greater than $theOther", this > theOther)
infix fun Int.shouldBeGreaterThan(theOther: Int) = this `should be greater than` theOther

infix fun Long.`should be greater than`(theOther: Long) = assertTrue("Expected $this to be greater than $theOther", this > theOther)
infix fun Long.shouldBeGreaterThan(theOther: Long) = this `should be greater than` theOther

infix fun Float.`should be greater than`(theOther: Float) = assertTrue("Expected $this to be greater than $theOther", this > theOther)
infix fun Float.shouldBeGreaterThan(theOther: Float) = this `should be greater than` theOther

infix fun Double.`should be greater than`(theOther: Double) = assertTrue("Expected $this to be greater than $theOther", this > theOther)
infix fun Double.shouldBeGreaterThan(theOther: Double) = this `should be greater than` theOther

infix fun Byte.`should not be greater than`(theOther: Byte) = assertTrue("Expected $this to not be greater than $theOther", this < theOther)
infix fun Byte.shouldNotBeGreaterThan(theOther: Byte) = this `should not be greater than` theOther

infix fun Short.`should not be greater than`(theOther: Short) = assertTrue("Expected $this to not be greater than $theOther", this < theOther)
infix fun Short.shouldNotBeGreaterThan(theOther: Short) = this `should not be greater than` theOther

infix fun Int.`should not be greater than`(theOther: Int) = assertTrue("Expected $this to not be greater than $theOther", this < theOther)
infix fun Int.shouldNotBeGreaterThan(theOther: Int) = this `should not be greater than` theOther

infix fun Long.`should not be greater than`(theOther: Long) = assertTrue("Expected $this to not be greater than $theOther", this < theOther)
infix fun Long.shouldNotBeGreaterThan(theOther: Long) = this `should not be greater than` theOther

infix fun Float.`should not be greater than`(theOther: Float) = assertTrue("Expected $this to not be greater than $theOther", this < theOther)
infix fun Float.shouldNotBeGreaterThan(theOther: Float) = this `should not be greater than` theOther

infix fun Double.`should not be greater than`(theOther: Double) = assertTrue("Expected $this to not be greater than $theOther", this < theOther)
infix fun Double.shouldNotBeGreaterThan(theOther: Double) = this `should not be greater than` theOther

infix fun Byte.`should be greater or equal to`(theOther: Byte) = assertTrue("Expected $this to be greater or equal to $theOther", this >= theOther)
infix fun Byte.shouldBeGreaterOrEqualTo(theOther: Byte) = this `should be greater or equal to` theOther

infix fun Short.`should be greater or equal to`(theOther: Short) = assertTrue("Expected $this to be greater or equal to $theOther", this >= theOther)
infix fun Short.shouldBeGreaterOrEqualTo(theOther: Short) = this `should be greater or equal to` theOther

infix fun Int.`should be greater or equal to`(theOther: Int) = assertTrue("Expected $this to be greater or equal to $theOther", this >= theOther)
infix fun Int.shouldBeGreaterOrEqualTo(theOther: Int) = this `should be greater or equal to` theOther

infix fun Long.`should be greater or equal to`(theOther: Long) = assertTrue("Expected $this to be greater or equal to $theOther", this >= theOther)
infix fun Long.shouldBeGreaterOrEqualTo(theOther: Long) = this `should be greater or equal to` theOther

infix fun Float.`should be greater or equal to`(theOther: Float) = assertTrue("Expected $this to be greater or equal to $theOther", this >= theOther)
infix fun Float.shouldBeGreaterOrEqualTo(theOther: Float) = this `should be greater or equal to` theOther

infix fun Double.`should be greater or equal to`(theOther: Double) = assertTrue("Expected $this to be greater or equal to $theOther", this >= theOther)
infix fun Double.shouldBeGreaterOrEqualTo(theOther: Double) = this `should be greater or equal to` theOther

infix fun Byte.`should not be greater or equal to`(theOther: Byte) = assertTrue("Expected $this to be not be greater or equal to $theOther", this < theOther)
infix fun Byte.shouldNotBeGreaterOrEqualTo(theOther: Byte) = this `should not be greater or equal to` theOther

infix fun Short.`should not be greater or equal to`(theOther: Short) = assertTrue("Expected $this to not be greater or equal to $theOther", this < theOther)
infix fun Short.shouldNotBeGreaterOrEqualTo(theOther: Short) = this `should not be greater or equal to` theOther

infix fun Int.`should not be greater or equal to`(theOther: Int) = assertTrue("Expected $this to not be greater or equal to $theOther", this < theOther)
infix fun Int.shouldNotBeGreaterOrEqualTo(theOther: Int) = this `should not be greater or equal to` theOther

infix fun Long.`should not be greater or equal to`(theOther: Long) = assertTrue("Expected $this to not be greater or equal to $theOther", this < theOther)
infix fun Long.shouldNotBeGreaterOrEqualTo(theOther: Long) = this `should not be greater or equal to` theOther

infix fun Float.`should not be greater or equal to`(theOther: Float) = assertTrue("Expected $this to not be greater or equal to $theOther", this < theOther)
infix fun Float.shouldNotBeGreaterOrEqualTo(theOther: Float) = this `should not be greater or equal to` theOther

infix fun Double.`should not be greater or equal to`(theOther: Double) = assertTrue("Expected $this to not be greater or equal to $theOther", this < theOther)
infix fun Double.shouldNotBeGreaterOrEqualTo(theOther: Double) = this `should not be greater or equal to` theOther

infix fun Byte.`should be less than`(theOther: Byte) = assertTrue("Expected $this to be less than $theOther", this < theOther)
infix fun Byte.shouldBeLessThan(theOther: Byte) = this `should be less than` theOther

infix fun Short.`should be less than`(theOther: Short) = assertTrue("Expected $this to be less than $theOther", this < theOther)
infix fun Short.shouldBeLessThan(theOther: Short) = this `should be less than` theOther

infix fun Int.`should be less than`(theOther: Int) = assertTrue("Expected $this to be less than $theOther", this < theOther)
infix fun Int.shouldBeLessThan(theOther: Int) = this `should be less than` theOther

infix fun Long.`should be less than`(theOther: Long) = assertTrue("Expected $this to be less than $theOther", this < theOther)
infix fun Long.shouldBeLessThan(theOther: Long) = this `should be less than` theOther

infix fun Float.`should be less than`(theOther: Float) = assertTrue("Expected $this to be less than $theOther", this < theOther)
infix fun Float.shouldBeLessThan(theOther: Float) = this `should be less than` theOther

infix fun Double.`should be less than`(theOther: Double) = assertTrue("Expected $this to be less than $theOther", this < theOther)
infix fun Double.shouldBeLessThan(theOther: Double) = this `should be less than` theOther

infix fun Byte.`should not be less than`(theOther: Byte) = assertTrue("Expected $this to not be less than $theOther", this >= theOther)
infix fun Byte.shouldNotBeLessThan(theOther: Byte) = this `should not be less than` theOther

infix fun Short.`should not be less than`(theOther: Short) = assertTrue("Expected $this to not be less than $theOther", this >= theOther)
infix fun Short.shouldNotBeLessThan(theOther: Short) = this `should not be less than` theOther

infix fun Int.`should not be less than`(theOther: Int) = assertTrue("Expected $this to not be less than $theOther", this >= theOther)
infix fun Int.shouldNotBeLessThan(theOther: Int) = this `should not be less than` theOther

infix fun Long.`should not be less than`(theOther: Long) = assertTrue("Expected $this to not be less than $theOther", this >= theOther)
infix fun Long.shouldNotBeLessThan(theOther: Long) = this `should not be less than` theOther

infix fun Float.`should not be less than`(theOther: Float) = assertTrue("Expected $this to not be less than $theOther", this >= theOther)
infix fun Float.shouldNotBeLessThan(theOther: Float) = this `should not be less than` theOther

infix fun Double.`should not be less than`(theOther: Double) = assertTrue("Expected $this to not be less than $theOther", this >= theOther)
infix fun Double.shouldNotBeLessThan(theOther: Double) = this `should not be less than` theOther

infix fun Byte.`should be less or equal to`(theOther: Byte) = assertTrue("Expected $this to be less or equal to $theOther", this <= theOther)
infix fun Byte.shouldBeLessOrEqualTo(theOther: Byte) = this `should be less or equal to` theOther

infix fun Short.`should be less or equal to`(theOther: Short) = assertTrue("Expected $this to be less or equal to $theOther", this <= theOther)
infix fun Short.shouldBeLessOrEqualTo(theOther: Short) = this `should be less or equal to` theOther

infix fun Int.`should be less or equal to`(theOther: Int) = assertTrue("Expected $this to be less or equal to $theOther", this <= theOther)
infix fun Int.shouldBeLessOrEqualTo(theOther: Int) = this `should be less or equal to` theOther

infix fun Long.`should be less or equal to`(theOther: Long) = assertTrue("Expected $this to be less or equal to $theOther", this <= theOther)
infix fun Long.shouldBeLessOrEqualTo(theOther: Long) = this `should be less or equal to` theOther

infix fun Float.`should be less or equal to`(theOther: Float) = assertTrue("Expected $this to be less or equal to $theOther", this <= theOther)
infix fun Float.shouldBeLessOrEqualTo(theOther: Float) = this `should be less or equal to` theOther

infix fun Double.`should be less or equal to`(theOther: Double) = assertTrue("Expected $this to be less or equal to $theOther", this <= theOther)
infix fun Double.shouldBeLessOrEqualTo(theOther: Double) = this `should be less or equal to` theOther

infix fun Byte.`should not be less or equal to`(theOther: Byte) = assertTrue("Expected $this to not be less or equal to $theOther", this > theOther)
infix fun Byte.shouldNotBeLessOrEqualTo(theOther: Byte) = this `should not be less or equal to` theOther

infix fun Short.`should not be less or equal to`(theOther: Short) = assertTrue("Expected $this to not be less or equal to $theOther", this > theOther)
infix fun Short.shouldNotBeLessOrEqualTo(theOther: Short) = this `should not be less or equal to` theOther

infix fun Int.`should not be less or equal to`(theOther: Int) = assertTrue("Expected $this to not be less or equal to $theOther", this > theOther)
infix fun Int.shouldNotBeLessOrEqualTo(theOther: Int) = this `should not be less or equal to` theOther

infix fun Long.`should not be less or equal to`(theOther: Long) = assertTrue("Expected $this to not be less or equal to $theOther", this > theOther)
infix fun Long.shouldNotBeLessOrEqualTo(theOther: Long) = this `should not be less or equal to` theOther

infix fun Float.`should not be less or equal to`(theOther: Float) = assertTrue("Expected $this to not be less or equal to $theOther", this > theOther)
infix fun Float.shouldNotBeLessOrEqualTo(theOther: Float) = this `should not be less or equal to` theOther

infix fun Double.`should not be less or equal to`(theOther: Double) = assertTrue("Expected $this to not be less or equal to $theOther", this > theOther)
infix fun Double.shouldNotBeLessOrEqualTo(theOther: Double) = this `should not be less or equal to` theOther

fun Byte.`should be positive`() = assertTrue("Expected $this to be positive", this > 0)
fun Byte.shouldBePositive() = this.`should be positive`()

fun Short.`should be positive`() = assertTrue("Expected $this to be positive", this > 0)
fun Short.shouldBePositive() = this.`should be positive`()

fun Int.`should be positive`() = assertTrue("Expected $this to be positive", this > 0)
fun Int.shouldBePositive() = this.`should be positive`()

fun Long.`should be positive`() = assertTrue("Expected $this to be positive", this > 0)
fun Long.shouldBePositive() = this.`should be positive`()

fun Float.`should be positive`() = assertTrue("Expected $this to be positive", this > 0)
fun Float.shouldBePositive() = this.`should be positive`()

fun Double.`should be positive`() = assertTrue("Expected $this to be positive", this > 0)
fun Double.shouldBePositive() = this.`should be positive`()

fun Byte.`should be negative`() = assertTrue("Expected $this to be negative", this < 0)
fun Byte.shouldBeNegative() = this.`should be negative`()

fun Short.`should be negative`() = assertTrue("Expected $this to be negative", this < 0)
fun Short.shouldBeNegative() = this.`should be negative`()

fun Int.`should be negative`() = assertTrue("Expected $this to be negative", this < 0)
fun Int.shouldBeNegative() = this.`should be negative`()

fun Long.`should be negative`() = assertTrue("Expected $this to be negative", this < 0)
fun Long.shouldBeNegative() = this.`should be negative`()

fun Float.`should be negative`() = assertTrue("Expected $this to be negative", this < 0)
fun Float.shouldBeNegative() = this.`should be negative`()

fun Double.`should be negative`() = assertTrue("Expected $this to be negative", this < 0)
fun Double.shouldBeNegative() = this.`should be negative`()

fun Byte.`should be in range`(lowerBound: Byte, upperBound: Byte) = assertTrue("Expected $this to be between (and including) $lowerBound and $upperBound", this >= lowerBound && this <= upperBound)
fun Byte.shouldBeInRange(lowerBound: Byte, upperBound: Byte) = this.`should be in range`(lowerBound, upperBound)

fun Short.`should be in range`(lowerBound: Short, upperBound: Short) = assertTrue("Expected $this to be between (and including) $lowerBound and $upperBound", this >= lowerBound && this <= upperBound)
fun Short.shouldBeInRange(lowerBound: Short, upperBound: Short) = this.`should be in range`(lowerBound, upperBound)

fun Int.`should be in range`(lowerBound: Int, upperBound: Int) = assertTrue("Expected $this to be between (and including) $lowerBound and $upperBound", this >= lowerBound && this <= upperBound)
fun Int.shouldBeInRange(lowerBound: Int, upperBound: Int) = this.`should be in range`(lowerBound, upperBound)

fun Long.`should be in range`(lowerBound: Long, upperBound: Long) = assertTrue("Expected $this to be between (and including) $lowerBound and $upperBound", this >= lowerBound && this <= upperBound)
fun Long.shouldBeInRange(lowerBound: Long, upperBound: Long) = this.`should be in range`(lowerBound, upperBound)

fun Float.`should be in range`(lowerBound: Float, upperBound: Float) = assertTrue("Expected $this to be between (and including) $lowerBound and $upperBound", this >= lowerBound && this <= upperBound)
fun Float.shouldBeInRange(lowerBound: Float, upperBound: Float) = this.`should be in range`(lowerBound, upperBound)

fun Double.`should be in range`(lowerBound: Double, upperBound: Double) = assertTrue("Expected $this to be between (and including) $lowerBound and $upperBound", this >= lowerBound && this <= upperBound)
fun Double.shouldBeInRange(lowerBound: Double, upperBound: Double) = this.`should be in range`(lowerBound, upperBound)

fun Byte.`should not be in range`(lowerBound: Byte, upperBound: Byte) = assertTrue("Expected $this to not be between (and including) $lowerBound and $upperBound", this < lowerBound || this > upperBound)
fun Byte.shouldNotBeInRange(lowerBound: Byte, upperBound: Byte) = this.`should not be in range`(lowerBound, upperBound)

fun Short.`should not be in range`(lowerBound: Short, upperBound: Short) = assertTrue("Expected $this to not be between (and including) $lowerBound and $upperBound", this < lowerBound || this > upperBound)
fun Short.shouldNotBeInRange(lowerBound: Short, upperBound: Short) = this.`should not be in range`(lowerBound, upperBound)

fun Int.`should not be in range`(lowerBound: Int, upperBound: Int) = assertTrue("Expected $this to not be between (and including) $lowerBound and $upperBound", this < lowerBound || this > upperBound)
fun Int.shouldNotBeInRange(lowerBound: Int, upperBound: Int) = this.`should not be in range`(lowerBound, upperBound)

fun Long.`should not be in range`(lowerBound: Long, upperBound: Long) = assertTrue("Expected $this to not be between (and including) $lowerBound and $upperBound", this < lowerBound || this > upperBound)
fun Long.shouldNotBeInRange(lowerBound: Long, upperBound: Long) = this.`should not be in range`(lowerBound, upperBound)

fun Float.`should not be in range`(lowerBound: Float, upperBound: Float) = assertTrue("Expected $this to not be between (and including) $lowerBound and $upperBound", this < lowerBound || this > upperBound)
fun Float.shouldNotBeInRange(lowerBound: Float, upperBound: Float) = this.`should not be in range`(lowerBound, upperBound)

fun Double.`should not be in range`(lowerBound: Double, upperBound: Double) = assertTrue("Expected $this to not be between (and including) $lowerBound and $upperBound", this < lowerBound || this > upperBound)
fun Double.shouldNotBeInRange(lowerBound: Double, upperBound: Double) = this.`should not be in range`(lowerBound, upperBound)

infix fun Byte.`should be in range`(range: IntRange) = (this.toInt()).`should be in range`(range)
infix fun Byte.shouldBeInRange(range: IntRange) = this.`should be in range`(range)

infix fun Short.`should be in range`(range: IntRange) = (this.toInt()).`should be in range`(range)
infix fun Short.shouldBeInRange(range: IntRange) = this.`should be in range`(range)

infix fun Int.`should be in range`(range: IntRange) = this.`should be in range`(range.first, range.last)
infix fun Int.shouldBeInRange(range: IntRange) = this.`should be in range`(range)

infix fun Long.`should be in range`(range: LongRange) = this.`should be in range`(range.first, range.last)
infix fun Long.shouldBeInRange(range: LongRange) = this.`should be in range`(range)

infix fun Byte.`should not be in range`(range: IntRange) = (this.toInt()).`should not be in range`(range)
infix fun Byte.shouldNotBeInRange(range: IntRange) = this.`should not be in range`(range)

infix fun Short.`should not be in range`(range: IntRange) = (this.toInt()).`should not be in range`(range)
infix fun Short.shouldNotBeInRange(range: IntRange) = this.`should not be in range`(range)

infix fun Int.`should not be in range`(range: IntRange) = this.`should not be in range`(range.first, range.last)
infix fun Int.shouldNotBeInRange(range: IntRange) = this.`should not be in range`(range)

infix fun Long.`should not be in range`(range: LongRange) = this.`should not be in range`(range.first, range.last)
infix fun Long.shouldNotBeInRange(range: LongRange) = this.`should not be in range`(range)

