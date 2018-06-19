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

}