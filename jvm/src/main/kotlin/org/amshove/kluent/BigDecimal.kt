// The Java API of operators prefers calls to `compareTo`
@file:Suppress("ReplaceCallWithBinaryOperator")

package org.amshove.kluent

import org.amshove.kluent.internal.assertTrue
import java.math.BigDecimal

infix fun BigDecimal.shouldEqualTo(expected: BigDecimal) =
    this.apply { assertTrue("Expected $this to be equal to $expected", this.compareTo(expected) == 0) }

infix fun BigDecimal.shouldNotEqualTo(expected: BigDecimal) =
    this.apply { assertTrue("Expected $this to not be equal to $expected", this.compareTo(expected) != 0) }

infix fun BigDecimal.shouldBeGreaterThan(expected: BigDecimal) =
    this.apply { assertTrue("Expected $this to be greater than $expected", this.compareTo(expected) > 0) }

infix fun BigDecimal.shouldNotBeGreaterThan(expected: BigDecimal) =
    this.apply { assertTrue("Expected $this to not be greater than $expected", this.compareTo(expected) <= 0) }

infix fun BigDecimal.shouldBeGreaterOrEqualTo(expected: BigDecimal) =
    this.apply { assertTrue("Expected $this to be greater or equal to $expected", this.compareTo(expected) >= 0) }

infix fun BigDecimal.shouldNotBeGreaterOrEqualTo(expected: BigDecimal) =
    this.apply { assertTrue("Expected $this to not be greater or equal to $expected", this.compareTo(expected) < 0) }

infix fun BigDecimal.shouldBeLessThan(expected: BigDecimal) =
    this.apply { assertTrue("Expected $this to be less than $expected", this.compareTo(expected) < 0) }

infix fun BigDecimal.shouldNotBeLessThan(expected: BigDecimal) =
    this.apply { assertTrue("Expected $this to not be less than $expected", this.compareTo(expected) >= 0) }

infix fun BigDecimal.shouldBeLessOrEqualTo(expected: BigDecimal) =
    this.apply { assertTrue("Expected $this to be less or equal to $expected", this.compareTo(expected) <= 0) }

infix fun BigDecimal.shouldNotBeLessOrEqualTo(expected: BigDecimal) =
    this.apply { assertTrue("Expected $this to not be less or equal to $expected", this.compareTo(expected) > 0) }

fun BigDecimal.shouldBePositive() =
    this.apply { assertTrue("Expected $this to be positive", this.compareTo(java.math.BigDecimal.ZERO) > 0) }

fun BigDecimal.shouldBeNegative() =
    this.apply { assertTrue("Expected $this to be negative", this.compareTo(java.math.BigDecimal.ZERO) < 0) }

fun BigDecimal.shouldBeInRange(lowerBound: BigDecimal, upperBound: BigDecimal) = this.apply {
    assertTrue(
        "Expected $this to be between $lowerBound and $upperBound",
        this.compareTo(lowerBound) >= 0 && this.compareTo(upperBound) <= 0
    )
}

fun BigDecimal.shouldNotBeInRange(lowerBound: BigDecimal, upperBound: BigDecimal) = this.apply {
    assertTrue(
        "Expected $this to not be between $lowerBound and $upperBound",
        this.compareTo(lowerBound) < 0 || this.compareTo(upperBound) > 0
    )
}

infix fun BigDecimal.shouldBeInRange(range: ClosedRange<BigDecimal>) = this.apply {
    this.shouldBeInRange(range.start, range.endInclusive)
}

infix fun BigDecimal.shouldNotBeInRange(range: ClosedRange<BigDecimal>) = this.apply {
    this.shouldNotBeInRange(range.start, range.endInclusive)
}

fun BigDecimal.shouldBeNear(expected: BigDecimal, delta: BigDecimal) =
    this.shouldBeInRange(expected - delta, expected + delta)

fun BigDecimal.shouldNotBeNear(expected: BigDecimal, delta: BigDecimal) =
    this.shouldNotBeInRange(expected - delta, expected + delta)
