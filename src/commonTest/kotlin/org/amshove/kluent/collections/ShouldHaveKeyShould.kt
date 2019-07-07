package org.amshove.kluent.collections

import org.amshove.kluent.shouldHaveKey
import org.amshove.kluent.Person
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldHaveKeyShould {
    @Test
    fun passWhenTestingAMapWhichContainsTheKey() {
        val map = mapOf("First" to "valueIchi", "Second" to "valueNi")
        map shouldHaveKey "First"
    }

    @Test
    fun failWhenTestingAMapWhichDoesNotContainTheKey() {
        val map = mapOf(1 to "first", 2 to "second")
        assertFails { map shouldHaveKey 3 }
    }

    @Test
    fun passWhenTestingAMapWhichContainsTheObjectAsKey() {
        val alice = Person("Alice", "Green")
        val bob = Person("Bob", "Blue")
        val jon = Person("Jon", "Grey")
        val map = mapOf(alice to bob, bob to jon)
        map shouldHaveKey alice
    }

    @Test
    fun failWhenTestingAMapWhichDoesNotContainTheObjectAsKey() {
        val alice = Person("Alice", "Green")
        val bob = Person("Bob", "Blue")
        val jon = Person("Jon", "Grey")
        val map = mapOf(alice to bob)
        assertFails { map shouldHaveKey jon }
    }
}