package org.amshove.kluent

import org.junit.ComparisonFailure


infix fun Any.`should equal`(theOther: Any) = if (this == theOther) Unit else fail("$this should equal $theOther", "$theOther", "$this")

private fun fail(message: String, expected: String, actual: String): Nothing = throw ComparisonFailure(message, expected, actual)