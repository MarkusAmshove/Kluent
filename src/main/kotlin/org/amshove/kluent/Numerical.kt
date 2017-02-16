@file:Suppress("FINAL_UPPER_BOUND")

package org.amshove.kluent

import org.junit.Assert.*

infix fun <T : Boolean> T?.`should equal to`(theOther: T?) = assertEquals(theOther, this)
infix fun <T : Boolean> T?.shouldEqualTo(theOther: T?) = this `should equal to` theOther

infix fun <T : Byte> T?.`should equal to`(theOther: T?) = assertEquals(theOther, this)
infix fun <T : Byte> T?.shouldEqualTo(theOther: T?) = this `should equal to` theOther

infix fun <T : Short> T?.`should equal to`(theOther: T?) = assertEquals(theOther, this)
infix fun <T : Short> T?.shouldEqualTo(theOther: T?) = this `should equal to` theOther

infix fun <T : Int> T?.`should equal to`(theOther: T?) = assertEquals(theOther, this)
infix fun <T : Int> T?.shouldEqualTo(theOther: T?) = this `should equal to` theOther

infix fun <T : Long> T?.`should equal to`(theOther: T?) = assertEquals(theOther, this)
infix fun <T : Long> T?.shouldEqualTo(theOther: T?) = this `should equal to` theOther

infix fun <T : Float> T?.`should equal to`(theOther: T?) = assertEquals(theOther, this)
infix fun <T : Float> T?.shouldEqualTo(theOther: T?) = this `should equal to` theOther

infix fun <T : Double> T?.`should equal to`(theOther: T?) = assertEquals(theOther, this)
infix fun <T : Double> T?.shouldEqualTo(theOther: T?) = this `should equal to` theOther

infix fun <T : Boolean> T?.`should not equal to`(theOther: T?) = assertNotEquals(theOther, this)
infix fun <T : Boolean> T?.shouldNotEqualTo(theOther: T?) = this `should not equal to` theOther

infix fun <T : Byte> T?.`should not equal to`(theOther: T?) = assertNotEquals(theOther, this)
infix fun <T : Byte> T?.shouldNotEqualTo(theOther: T?) = this `should not equal to` theOther

infix fun <T : Short> T?.`should not equal to`(theOther: T?) = assertNotEquals(theOther, this)
infix fun <T : Short> T?.shouldNotEqualTo(theOther: T?) = this `should not equal to` theOther

infix fun <T : Int> T?.`should not equal to`(theOther: T?) = assertNotEquals(theOther, this)
infix fun <T : Int> T?.shouldNotEqualTo(theOther: T?) = this `should not equal to` theOther

infix fun <T : Long> T?.`should not equal to`(theOther: T?) = assertNotEquals(theOther, this)
infix fun <T : Long> T?.shouldNotEqualTo(theOther: T?) = this `should not equal to` theOther

infix fun <T : Float> T?.`should not equal to`(theOther: T?) = assertNotEquals(theOther, this)
infix fun <T : Float> T?.shouldNotEqualTo(theOther: T?) = this `should not equal to` theOther

infix fun <T : Double> T?.`should not equal to`(theOther: T?) = assertNotEquals(theOther, this)
infix fun <T : Double> T?.shouldNotEqualTo(theOther: T?) = this `should not equal to` theOther

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

