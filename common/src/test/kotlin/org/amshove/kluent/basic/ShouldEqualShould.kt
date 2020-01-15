package org.amshove.kluent.basic

import org.amshove.kluent.Person
import org.amshove.kluent.shouldBeEqualTo
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldEqualShould {
    @Test
    fun passWhenComparingEqualStrings() {
        "hello world" shouldBeEqualTo "hello world"
    }

    @Test
    fun returnTheTestedInstance() {
        val hello = "hello world"
        val returnedInstance = hello shouldBeEqualTo "hello world"
        hello shouldBeEqualTo returnedInstance
    }

    @Test
    fun failWhenComparingUnequalStrings() {
        assertFails { "hello world!" shouldBeEqualTo "hello" }
    }

    @Test
    fun failWhenComparingDifferentTypes() {
        assertFails { "hello world" shouldBeEqualTo 5 }
    }

    @Test
    fun passWhenCheckingTwoDataObjectsWithSameValues() {
        val firstObject = Person("Jon", "Doe")
        val secondObject = Person("Jon", "Doe")
        firstObject shouldBeEqualTo secondObject
    }

    @Test
    fun failWhenCheckingTwoDataObjectsWithDifferentValues() {
        val jane = Person("Jane", "Doe")
        val jon = Person("Jon", "Doe")
        assertFails { jane shouldBeEqualTo jon }
    }

}