package org.amshove.kluent.basic

import org.amshove.kluent.Person
import org.amshove.kluent.shouldEqual
import org.amshove.kluent.shouldNotEqual
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotEqualShould {
    @Test
    fun passWhenCheckingEqualityOfDifferentStrings() {
        "hello world!" shouldNotEqual "hello"
    }

    @Test
    fun failWhenCheckingEqualityOfEqualStrings() {
        assertFails { "hello world!" shouldNotEqual "hello world!" }
    }

    @Test
    fun passWhenCheckingDifferentTypes() {
        "hello world" shouldNotEqual 5
    }

    @Test
    fun passWhenCheckingUnequalDataObjects() {
        val jane = Person("Jane", "Doe")
        val jon = Person("Jon", "Doe")
        jane shouldNotEqual jon
    }

    @Test
    fun failWhenCheckingEqualDataObjects() {
        val jane1 = Person("Jane", "Doe")
        val jane2 = Person("Jane", "Doe")
        assertFails { jane1 shouldNotEqual jane2 }
    }

    @Test
    fun returnTheTestedInstance() {
        val jane = Person("Jane", "Doe")
        val jon = Person("Jon", "Doe")
        val instance = jane shouldNotEqual jon
        instance shouldEqual jane
    }

}