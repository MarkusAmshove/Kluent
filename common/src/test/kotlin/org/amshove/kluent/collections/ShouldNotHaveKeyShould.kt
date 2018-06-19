package org.amshove.kluent.collections

import org.amshove.kluent.shouldNotHaveKey
import org.amshove.kluent.Person
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotHaveKeyShould {
    @Test
    fun passWhenTestingAMapWhichDoesNotContainTheKey() {
        val map = mapOf(1 to "first", 2 to "second")
        map shouldNotHaveKey 3
    }

    @Test
    fun failWhenTestingAMapWhichContainsTheKey() {
        val map = mapOf("First" to "valueIchi", "Second" to "valueNi")
        assertFails { map shouldNotHaveKey "First" }
    }

    @Test
    fun passWhenTestingAMapWhichDoesNotContainTheObjectAsKey() {
        val alice = Person("Alice", "Green")
        val bob = Person("Bob", "Blue")
        val jon = Person("Jon", "Grey")
        val map = mapOf(alice to bob)
        map shouldNotHaveKey jon
    }

    @Test
    fun failWhenTestingAMapWhichContainsTheObjectAsKey() {
        val alice = Person("Alice", "Green")
        val bob = Person("Bob", "Blue")
        val jon = Person("Jon", "Grey")
        val map = mapOf(alice to bob, bob to jon)
        assertFails { map shouldNotHaveKey alice }
    }
}