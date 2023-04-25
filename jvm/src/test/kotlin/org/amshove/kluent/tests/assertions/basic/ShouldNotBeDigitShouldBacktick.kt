package org.amshove.kluent.tests.basic

import org.amshove.kluent.Digit
import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.`should not be`
import kotlin.test.Test

class ShouldNotBeDigitShouldBacktick {
    @Test
    fun passWhenTestingAnyNonDigit() {
        val digits = listOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'A', 'Z')

        digits.forEach {
            it `should not be` Digit
        }
    }

    @Test
    fun passWhenTestingAnyNonDigitUnicode() {
        val digits = listOf('\u0025', '\u0029', '\u0040', '\u0041')

        digits.forEach {
            it `should not be` Digit
        }
    }

    @Test
    fun failWhenTestingAnyDigit() {
        val digits = listOf('0', '1', '2', '3', '4', '5', '6', '7', '8', '9')

        digits.forEach {
            assertFails { it `should not be` Digit }
        }
    }

    @Test
    fun failWhenTestingAnyUnicodeDigit() {
        val digits =
            listOf('\u0030', '\u0031', '\u0032', '\u0033', '\u0034', '\u0035', '\u0036', '\u0037', '\u0038', '\u0039')

        digits.forEach {
            assertFails { it `should not be` Digit }
        }
    }

}
