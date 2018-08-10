package org.amshove.kluent

import org.amshove.kluent.internal.assertTrue
import java.math.BigDecimal

infix fun BigDecimal.shouldEqualTo(expected: BigDecimal) =
    this.apply { assertTrue("Expected $this to be equal to $expected", this == expected) }

infix fun BigDecimal.shouldNotEqualTo(expected: BigDecimal) =
    this.apply { assertTrue("Expected $this to not be equal to $expected", this != expected) }

infix fun BigDecimal.shouldBeGreaterThan(expected: BigDecimal) =
    this.apply { assertTrue("Expected $this to be greater than $expected", this > expected) }

infix fun BigDecimal.shouldNotBeGreaterThan(expected: BigDecimal) =
    this.apply { assertTrue("Expected $this to not be greater than $expected", this <= expected) }

infix fun BigDecimal.shouldBeGreaterOrEqualTo(expected: BigDecimal) =
    this.apply { assertTrue("Expected $this to be greater or equal to $expected", this >= expected) }

infix fun BigDecimal.shouldNotBeGreaterOrEqualTo(expected: BigDecimal) =
    this.apply { assertTrue("Expected $this to not be greater or equal to $expected", this < expected) }
