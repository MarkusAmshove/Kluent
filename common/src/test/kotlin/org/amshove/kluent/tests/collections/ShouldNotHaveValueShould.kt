package org.amshove.kluent.tests.collections

import org.amshove.kluent.tests.Person
import org.amshove.kluent.shouldNotHaveValue
import kotlin.test.assertFails
import kotlin.test.Test

class ShouldNotHaveValueShould {
    @Test
    fun passWhenTestingAMapWhichDoesNotContainTheValue() {
        val map = mapOf("ichi" to 1, "ni" to 2)
        map shouldNotHaveValue 3
    }

    @Test
    fun failWhenTestingAMapWhichContainsTheValue() {
        val map = mapOf("ichi" to 1, "ni" to 2)
        assertFails { map shouldNotHaveValue 1 }
    }

    @Test
    fun passWhenTestingAMapWhichDoesNotContainTheObjectAsValue() {
        val alice = Person("Alice", "Green")
        val bob = Person("Bob", "Blue")
        val map = mapOf(alice to bob)
        map shouldNotHaveValue alice
    }

    @Test
    fun failWhenTestingAMapWhichContainsTheObjectAsValue() {
        val alice = Person("Alice", "Green")
        val bob = Person("Bob", "Blue")
        val jon = Person("Jon", "Grey")
        val map = mapOf(alice to bob, bob to jon)
        assertFails { map shouldNotHaveValue jon }
    }
}