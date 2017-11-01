package org.amshove.kluent

infix fun Boolean.shouldEqualTo(theOther: Boolean) = assert(this == theOther)

infix fun Byte.shouldEqualTo(theOther: Byte) = assert(this == theOther)

infix fun Short.shouldEqualTo(theOther: Short) = assert(this == theOther)

infix fun Int.shouldEqualTo(theOther: Int) = assert(this == theOther)

infix fun Long.shouldEqualTo(theOther: Long) = assert(this == theOther)

infix fun Float.shouldEqualTo(theOther: Float) = assert(this == theOther)

infix fun Double.shouldEqualTo(theOther: Double) = assert(this == theOther)

infix fun Boolean.shouldNotEqualTo(theOther: Boolean) = assert(this != theOther)

infix fun Byte.shouldNotEqualTo(theOther: Byte) = assert(this != theOther)

infix fun Short.shouldNotEqualTo(theOther: Short) = assert(this != theOther)

infix fun Int.shouldNotEqualTo(theOther: Int) = assert(this != theOther)

infix fun Long.shouldNotEqualTo(theOther: Long) = assert(this != theOther)

infix fun Float.shouldNotEqualTo(theOther: Float) = assert(this != theOther)

infix fun Double.shouldNotEqualTo(theOther: Double) = assert(this != theOther)

infix fun Byte.shouldBeGreaterThan(theOther: Byte) = assert(this > theOther) {
    "Expected $this to be greater than $theOther"
}

infix fun Short.shouldBeGreaterThan(theOther: Short) = assert(this > theOther) {
    "Expected $this to be greater than $theOther"
}

infix fun Int.shouldBeGreaterThan(theOther: Int) = assert(this > theOther) {
    "Expected $this to be greater than $theOther"
}

infix fun Long.shouldBeGreaterThan(theOther: Long) = assert(this > theOther) {
    "Expected $this to be greater than $theOther"
}

infix fun Float.shouldBeGreaterThan(theOther: Float) = assert(this > theOther) {
    "Expected $this to be greater than $theOther"
}

infix fun Double.shouldBeGreaterThan(theOther: Double) = assert(this > theOther) {
    "Expected $this to be greater than $theOther"
}

infix fun Byte.shouldNotBeGreaterThan(theOther: Byte) = assert(this <= theOther) {
    "Expected $this to not be greater than $theOther"
}

infix fun Short.shouldNotBeGreaterThan(theOther: Short) = assert(this <= theOther) {
    "Expected $this to not be greater than $theOther"
}

infix fun Int.shouldNotBeGreaterThan(theOther: Int) = assert(this <= theOther) {
    "Expected $this to not be greater than $theOther"
}

infix fun Long.shouldNotBeGreaterThan(theOther: Long) = assert(this <= theOther) {
    "Expected $this to not be greater than $theOther"
}

infix fun Float.shouldNotBeGreaterThan(theOther: Float) = assert(this <= theOther) {
    "Expected $this to not be greater than $theOther"
}

infix fun Double.shouldNotBeGreaterThan(theOther: Double) = assert(this <= theOther) {
    "Expected $this to not be greater than $theOther"
}

infix fun Byte.shouldBeGreaterOrEqualTo(theOther: Byte) = assert(this >= theOther) {
    "Expected $this to be greater or equal to $theOther"
}

infix fun Short.shouldBeGreaterOrEqualTo(theOther: Short) = assert(this >= theOther) {
    "Expected $this to be greater or equal to $theOther"
}

infix fun Int.shouldBeGreaterOrEqualTo(theOther: Int) = assert(this >= theOther) {
    "Expected $this to be greater or equal to $theOther"
}

infix fun Long.shouldBeGreaterOrEqualTo(theOther: Long) = assert(this >= theOther) {
    "Expected $this to be greater or equal to $theOther"
}

infix fun Float.shouldBeGreaterOrEqualTo(theOther: Float) = assert(this >= theOther) {
    "Expected $this to be greater or equal to $theOther"
}

infix fun Double.shouldBeGreaterOrEqualTo(theOther: Double) = assert(this >= theOther) {
    "Expected $this to be greater or equal to $theOther"
}

infix fun Byte.shouldNotBeGreaterOrEqualTo(theOther: Byte) = assert(this < theOther) {
    "Expected $this to be not be greater or equal to $theOther"
}

infix fun Short.shouldNotBeGreaterOrEqualTo(theOther: Short) = assert(this < theOther) {
    "Expected $this to not be greater or equal to $theOther"
}

infix fun Int.shouldNotBeGreaterOrEqualTo(theOther: Int) = assert(this < theOther) {
    "Expected $this to not be greater or equal to $theOther"
}

infix fun Long.shouldNotBeGreaterOrEqualTo(theOther: Long) = assert(this < theOther) {
    "Expected $this to not be greater or equal to $theOther"
}

infix fun Float.shouldNotBeGreaterOrEqualTo(theOther: Float) = assert(this < theOther) {
    "Expected $this to not be greater or equal to $theOther"
}

infix fun Double.shouldNotBeGreaterOrEqualTo(theOther: Double) = assert(this < theOther) {
    "Expected $this to not be greater or equal to $theOther"
}

infix fun Byte.shouldBeLessThan(theOther: Byte) = assert(this < theOther) {
    "Expected $this to be less than $theOther"
}

infix fun Short.shouldBeLessThan(theOther: Short) = assert(this < theOther) {
    "Expected $this to be less than $theOther"
}

infix fun Int.shouldBeLessThan(theOther: Int) = assert(this < theOther) {
    "Expected $this to be less than $theOther"
}

infix fun Long.shouldBeLessThan(theOther: Long) = assert(this < theOther) {
    "Expected $this to be less than $theOther"
}

infix fun Float.shouldBeLessThan(theOther: Float) = assert(this < theOther) {
    "Expected $this to be less than $theOther"
}

infix fun Double.shouldBeLessThan(theOther: Double) = assert(this < theOther) {
    "Expected $this to be less than $theOther"
}

infix fun Byte.shouldNotBeLessThan(theOther: Byte) = assert(this >= theOther) {
    "Expected $this to not be less than $theOther"
}

infix fun Short.shouldNotBeLessThan(theOther: Short) = assert(this >= theOther) {
    "Expected $this to not be less than $theOther"
}

infix fun Int.shouldNotBeLessThan(theOther: Int) = assert(this >= theOther) {
    "Expected $this to not be less than $theOther"
}

infix fun Long.shouldNotBeLessThan(theOther: Long) = assert(this >= theOther) {
    "Expected $this to not be less than $theOther"
}

infix fun Float.shouldNotBeLessThan(theOther: Float) = assert(this >= theOther) {
    "Expected $this to not be less than $theOther"
}

infix fun Double.shouldNotBeLessThan(theOther: Double) = assert(this >= theOther) {
    "Expected $this to not be less than $theOther"
}

infix fun Byte.shouldBeLessOrEqualTo(theOther: Byte) = assert(this <= theOther) {
    "Expected $this to be less or equal to $theOther"
}

infix fun Short.shouldBeLessOrEqualTo(theOther: Short) = assert(this <= theOther) {
    "Expected $this to be less or equal to $theOther"
}

infix fun Int.shouldBeLessOrEqualTo(theOther: Int) = assert(this <= theOther) {
    "Expected $this to be less or equal to $theOther"
}

infix fun Long.shouldBeLessOrEqualTo(theOther: Long) = assert(this <= theOther) {
    "Expected $this to be less or equal to $theOther"
}

infix fun Float.shouldBeLessOrEqualTo(theOther: Float) = assert(this <= theOther) {
    "Expected $this to be less or equal to $theOther"
}

infix fun Double.shouldBeLessOrEqualTo(theOther: Double) = assert(this <= theOther) {
    "Expected $this to be less or equal to $theOther"
}

infix fun Byte.shouldNotBeLessOrEqualTo(theOther: Byte) = assert(this > theOther) {
    "Expected $this to not be less or equal to $theOther"
}

infix fun Short.shouldNotBeLessOrEqualTo(theOther: Short) = assert(this > theOther) {
    "Expected $this to not be less or equal to $theOther"
}

infix fun Int.shouldNotBeLessOrEqualTo(theOther: Int) = assert(this > theOther) {
    "Expected $this to not be less or equal to $theOther"
}

infix fun Long.shouldNotBeLessOrEqualTo(theOther: Long) = assert(this > theOther) {
    "Expected $this to not be less or equal to $theOther"
}

infix fun Float.shouldNotBeLessOrEqualTo(theOther: Float) = assert(this > theOther) {
    "Expected $this to not be less or equal to $theOther"
}

infix fun Double.shouldNotBeLessOrEqualTo(theOther: Double) = assert(this > theOther) {
    "Expected $this to not be less or equal to $theOther"
}

fun Byte.shouldBePositive() = assert(this > 0) {
    "Expected $this to be positive"
}

fun Short.shouldBePositive() = assert(this > 0) {
    "Expected $this to be positive"
}

fun Int.shouldBePositive() = assert(this > 0) {
    "Expected $this to be positive"
}

fun Long.shouldBePositive() = assert(this > 0) {
    "Expected $this to be positive"
}

fun Float.shouldBePositive() = assert(this > 0) {
    "Expected $this to be positive"
}

fun Double.shouldBePositive() = assert(this > 0) {
    "Expected $this to be positive"
}

fun Byte.shouldBeNegative() = assert(this < 0) {
    "Expected $this to be negative"
}

fun Short.shouldBeNegative() = assert(this < 0) {
    "Expected $this to be negative"
}

fun Int.shouldBeNegative() = assert(this < 0) {
    "Expected $this to be negative"
}

fun Long.shouldBeNegative() = assert(this < 0) {
    "Expected $this to be negative"
}

fun Float.shouldBeNegative() = assert(this < 0) {
    "Expected $this to be negative"
}

fun Double.shouldBeNegative() = assert(this < 0) {
    "Expected $this to be negative"
}

fun Byte.shouldBeInRange(lowerBound: Byte, upperBound: Byte) = assert(this >= lowerBound && this <= upperBound) {
    "Expected $this to be between (and including) $lowerBound and $upperBound"
}

fun Short.shouldBeInRange(lowerBound: Short, upperBound: Short) = assert(this >= lowerBound && this <= upperBound) {
    "Expected $this to be between (and including) $lowerBound and $upperBound"
}

fun Int.shouldBeInRange(lowerBound: Int, upperBound: Int) = assert(this >= lowerBound && this <= upperBound) {
    "Expected $this to be between (and including) $lowerBound and $upperBound"
}

fun Long.shouldBeInRange(lowerBound: Long, upperBound: Long) = assert(this >= lowerBound && this <= upperBound) {
    "Expected $this to be between (and including) $lowerBound and $upperBound"
}

fun Float.shouldBeInRange(lowerBound: Float, upperBound: Float) = assert(this >= lowerBound && this <= upperBound) {
    "Expected $this to be between (and including) $lowerBound and $upperBound"
}

fun Double.shouldBeInRange(lowerBound: Double, upperBound: Double) = assert(this >= lowerBound && this <= upperBound) {
    "Expected $this to be between (and including) $lowerBound and $upperBound"
}

fun Byte.shouldNotBeInRange(lowerBound: Byte, upperBound: Byte) = assert(this < lowerBound || this > upperBound) {
    "Expected $this to not be between (and including) $lowerBound and $upperBound"
}

fun Short.shouldNotBeInRange(lowerBound: Short, upperBound: Short) = assert(this < lowerBound || this > upperBound) {
    "Expected $this to not be between (and including) $lowerBound and $upperBound"
}

fun Int.shouldNotBeInRange(lowerBound: Int, upperBound: Int) = assert(this < lowerBound || this > upperBound) {
    "Expected $this to not be between (and including) $lowerBound and $upperBound"
}

fun Long.shouldNotBeInRange(lowerBound: Long, upperBound: Long) = assert(this < lowerBound || this > upperBound) {
    "Expected $this to not be between (and including) $lowerBound and $upperBound"
}

fun Float.shouldNotBeInRange(lowerBound: Float, upperBound: Float) = assert(this < lowerBound || this > upperBound) {
    "Expected $this to not be between (and including) $lowerBound and $upperBound"
}

fun Double.shouldNotBeInRange(lowerBound: Double, upperBound: Double) = assert(this < lowerBound || this > upperBound) {
    "Expected $this to not be between (and including) $lowerBound and $upperBound"
}

infix fun Byte.shouldBeInRange(range: IntRange) = (this.toInt()).shouldBeInRange(range)

infix fun Short.shouldBeInRange(range: IntRange) = (this.toInt()).shouldBeInRange(range)

infix fun Int.shouldBeInRange(range: IntRange) = this.shouldBeInRange(range.first, range.last)

infix fun Long.shouldBeInRange(range: LongRange) = this.shouldBeInRange(range.first, range.last)

infix fun Byte.shouldNotBeInRange(range: IntRange) = (this.toInt()).shouldNotBeInRange(range)

infix fun Short.shouldNotBeInRange(range: IntRange) = (this.toInt()).shouldNotBeInRange(range)

infix fun Int.shouldNotBeInRange(range: IntRange) = this.shouldNotBeInRange(range.first, range.last)

infix fun Long.shouldNotBeInRange(range: LongRange) = this.shouldNotBeInRange(range.first, range.last)

