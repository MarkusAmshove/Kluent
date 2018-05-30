package org.amshove.kluent.basic

import org.amshove.kluent.Person
import org.amshove.kluent.shouldEqual
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldEqualShould {
    @Test
    fun passWhenComparingEqualStrings() {
        "hello world" shouldEqual "hello world"
    }

    @Test
    fun returnTheTestedInstance() {
        val hello = "hello world"
        val returnedInstance = hello shouldEqual "hello world"
        hello shouldEqual returnedInstance
    }

    @Test
    fun failWhenComparingUnequalStrings() {
        assertFails { "hello world!" shouldEqual "hello" }
    }

    @Test
    fun failWhenComparingDifferentTypes() {
        assertFails { "hello world" shouldEqual 5 }
    }

    @Test
    fun passWhenCheckingTwoDataObjectsWithSameValues() {
        val firstObject = Person("Jon", "Doe")
        val secondObject = Person("Jon", "Doe")
        firstObject shouldEqual secondObject
    }

    @Test
    fun failWhenCheckingTwoDataObjectsWithDifferentValues() {
        val jane = Person("Jane", "Doe")
        val jon = Person("Jon", "Doe")
        assertFails { jane shouldEqual jon }
    }

    /* TODO(BEHAVIOUR): Passes on JVM, fails on JavaScript and Native
    @Test
    fun passWhenCheckingEqualArrays() {
        val firstArray = arrayOf(1, 2, 3)
        val secondArray = arrayOf(1, 2, 3)
        firstArray shouldEqual secondArray
    }
    */

    @Test
    fun failWhenCheckingUnequalArrays() {
        val firstArray = arrayOf(1, 2, 3)
        val secondArray = arrayOf(4, 5, 6)
        assertFails { firstArray shouldEqual secondArray }
    }

    @Test
    fun passWhenCheckingEqualIterables() {
        val firstIterable = listOf(Person("Tom", "Guy"), Person("Alice", "Bob"), Person("Jon", "Doe"))
        val secondIterable = listOf(Person("Tom", "Guy"), Person("Alice", "Bob"), Person("Jon", "Doe"))
        firstIterable shouldEqual secondIterable
    }

    @Test
    fun failWhenCheckingDifferentIterables() {
        val firstIterable = listOf(Person("Tom", "Guy"), Person("Jon", "Doe"), Person("Peter", "Meyer"))
        val secondIterable = listOf(Person("Tom", "Guy"), Person("Alice", "Bob"), Person("Jon", "Doe"))
        assertFails { firstIterable shouldEqual secondIterable }
    }
}