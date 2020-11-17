package org.amshove.kluent.tests.assertions.softly

import org.amshove.kluent.*
import kotlin.test.Test

class AssertSoftly {
    @Test
    fun failShouldAssertSoftly() {
        // arrange
        val a = "ab1"

        // act
        try {
            assertSoftly(a) {
                shouldNotBeNull()
                shouldContain("2")
                length.shouldBeGreaterOrEqualTo(4)
            }
        } catch (e: Throwable) {
            e.message!!.replace("\\s+|\\t|\\n".toRegex(), " ").trim().shouldBeEqualTo("""
                The following 2 assertions failed:
                1) Expected the CharSequence ab1 to contain 2
                at org.amshove.kluent.tests.assertions.softly.AssertSoftly.failShouldAssertSoftly(AssertSoftly.kt:16)
                2) Expected 3 to be greater or equal to 4
                at org.amshove.kluent.tests.assertions.softly.AssertSoftly.failShouldAssertSoftly(AssertSoftly.kt:17)""".replace("\\s+|\\t|\\n".toRegex(), " ").trim())
        }
    }

    @Test
    fun passShouldAssertSoftly() {
        // arrange
        val a = "ab1"

        // act
        assertSoftly(a) {
            shouldNotBeNull()
            shouldContain("1")
            length.shouldBeGreaterOrEqualTo(3)
        }
    }

    @Test
    fun verifyAssertErrorForNonSoftlyAssertions() {
        // arrange
        val a = "ab1"

        // act
        try {
            with(a) {
                shouldNotBeNull()
                shouldContain("2")
                length.shouldBeGreaterOrEqualTo(4)
            }
        } catch (e: Throwable) {
            e.message!!.replace("\\s+|\\t|\\n".toRegex(), " ").trim().shouldBeEqualTo("""
                The following assertion failed:
                Expected the CharSequence ab1 to contain 2
                at org.amshove.kluent.tests.assertions.softly.AssertSoftly.verifyAssertErrorForNonSoftlyAssertions(AssertSoftly.kt:51)"""
                    .replace("\\s+|\\t|\\n".toRegex(), " ").trim())
        }
    }

    @Test
    fun failShouldAssertSoftlyForSeveralObjects() {
        // arrange
        val a = "ab1"
        val b = "ab2"

        // act
        try {
            assertSoftly {
                a.shouldNotBeNull()
                b.shouldContain("2")
                a.length.shouldBeGreaterOrEqualTo(4)
            }
        } catch (e: Throwable) {
            e.message!!.replace("\\s+|\\t|\\n".toRegex(), " ").trim().shouldBeEqualTo("""
                The following assertion failed:
                Expected 3 to be greater or equal to 4
                at org.amshove.kluent.tests.assertions.softly.AssertSoftly.failShouldAssertSoftlyForSeveralObjects(AssertSoftly.kt:74)"""
                    .replace("\\s+|\\t|\\n".toRegex(), " ").trim())
        }
    }

}