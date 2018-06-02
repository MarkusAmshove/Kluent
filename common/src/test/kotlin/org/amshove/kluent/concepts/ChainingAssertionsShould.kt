package org.amshove.kluent.concepts

import org.amshove.kluent.*
import kotlin.test.Test

class ChainingAssertionsShould {
    @Test
    fun allowChainingOfCollectionAssertions() {
       val list = listOf(1, 2, 3, 4, 5, 6, 7, 8)

        list
                .shouldNotBeEmpty()
                .shouldContain(2)
                .shouldContain(4)
                .shouldContainSome(arrayOf(5, 7))
                .should {
                    size > 5
                }
    }

    @Test
    fun allowChainingOfNumericalAssertions() {
        val number = 42

        number
                .shouldBePositive()
                .shouldBeGreaterThan(10)
                .shouldBeLessThan(43)
                .shouldBeInRange(40..45)
                .shouldNotBeInRange(45..50)
    }

    @Test
    fun allowChainingOfCharSequenceAssertions() {
        val sequence = "Hello World!"

        sequence
                .shouldNotBeEmpty()
                .shouldNotBeBlank()
                .shouldStartWith("Hello")
                .shouldEndWith("!")
                .shouldContainSome(listOf("e", "l"))
    }
}