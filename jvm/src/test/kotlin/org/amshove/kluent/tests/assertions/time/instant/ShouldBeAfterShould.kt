package org.amshove.kluent.tests.assertions.time.instant

import org.amshove.kluent.shouldBeAfter
import java.time.Instant
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeAfterShould {
    @Test
    fun passWhenTestingALaterDate() {
        val instantToTest = Instant.ofEpochSecond(5000)
        val instantBefore = instantToTest.minusSeconds(10)

        instantToTest shouldBeAfter instantBefore
    }

    @Test
    fun failWhenTestingAnEarlierInstant() {
        val instantToTest = Instant.ofEpochSecond(5000)
        val dateAfter = instantToTest.plusSeconds(10)

        assertFails { instantToTest shouldBeAfter dateAfter }
    }

    @Test
    fun failWhenPassingTheSameInstant() {
        val instantToTest = Instant.ofEpochSecond(5000)
        assertFails { instantToTest shouldBeAfter instantToTest }
    }
}
