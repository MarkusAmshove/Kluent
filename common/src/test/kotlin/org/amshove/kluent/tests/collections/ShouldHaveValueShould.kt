package org.amshove.kluent.tests.collections

import org.amshove.kluent.shouldHaveValue
import org.amshove.kluent.tests.Person
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldHaveValueShould {
    @Test
    fun passWhenTestingAMapWhichContainsTheValue() {
        val map = mapOf("ichi" to 1, "ni" to 2)
        map shouldHaveValue 1
    }

    @Test
    fun failWhenTestingAMapWhichDoesNotContainTheValue() {
        val map = mapOf("ichi" to 1, "ni" to 2)
        assertFails { map shouldHaveValue 3 }
    }

    @Test
    fun passWhenTestingAMapWhichContainsTheObjectAsValue() {
        val alice = Person("Alice", "Green")
        val bob = Person("Bob", "Blue")
        val jon = Person("Jon", "Grey")
        val map = mapOf(alice to bob, bob to jon)
        map shouldHaveValue jon
    }

    @Test
    fun failWhenTestingAMapWhichDoesNotContainTheObjectAsValue() {
        val alice = Person("Alice", "Green")
        val bob = Person("Bob", "Blue")
        val map = mapOf(alice to bob)
        assertFails { map shouldHaveValue alice }
    }
}