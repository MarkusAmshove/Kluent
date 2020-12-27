package org.amshove.kluent.tests.basic

import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldNotBeEqualTo
import org.amshove.kluent.tests.Person
import kotlin.test.Test

class ShouldNotEqualShould {
    @Test
    fun passWhenCheckingEqualityOfDifferentStrings() {
        "hello world!" shouldNotBeEqualTo "hello"
    }

    @Test
    fun failWhenCheckingEqualityOfEqualStrings() {
        assertFails { "hello world!" shouldNotBeEqualTo "hello world!" }
    }

    @Test
    fun passWhenCheckingDifferentTypes() {
        "hello world" shouldNotBeEqualTo 5
    }

    @Test
    fun passWhenCheckingUnequalDataObjects() {
        val jane = Person("Jane", "Doe")
        val jon = Person("Jon", "Doe")
        jane shouldNotBeEqualTo jon
    }

    @Test
    fun failWhenCheckingEqualDataObjects() {
        val jane1 = Person("Jane", "Doe")
        val jane2 = Person("Jane", "Doe")
        assertFails { jane1 shouldNotBeEqualTo jane2 }
    }

    @Test
    fun returnTheTestedInstance() {
        val jane = Person("Jane", "Doe")
        val jon = Person("Jon", "Doe")
        val instance = jane shouldNotBeEqualTo jon
        instance shouldBeEqualTo jane
    }

}