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
