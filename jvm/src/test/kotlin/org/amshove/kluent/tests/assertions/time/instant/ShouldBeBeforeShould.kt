package org.amshove.kluent.tests.assertions.time.instant

import org.amshove.kluent.shouldBeBefore
import java.time.Instant
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeBeforeShould {
    @Test
    fun passWhenTestingAnEarlierInstant() {
        val instantToTest = Instant.ofEpochSecond(5000)
        val instantAfter = instantToTest.plusSeconds(10)

        instantToTest shouldBeBefore instantAfter
    }

    @Test
    fun failWhenTestingALaterInstant() {
        val instantToTest = Instant.ofEpochSecond(5000)
        val dateBefore = instantToTest.minusSeconds(10)

        assertFails { instantToTest shouldBeBefore dateBefore }
    }

    @Test
    fun failWhenTestingTheSameInstant() {
        val instantToTest = Instant.ofEpochSecond(5000)

        assertFails { instantToTest shouldBeBefore instantToTest }
    }
}
