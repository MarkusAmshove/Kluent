package org.amshove.kluent.collections

import org.amshove.kluent.shouldContain
import org.amshove.kluent.Person
import kotlin.test.assertFails
import kotlin.test.Test

class ShouldContainShould {
    @Test
    fun passWhenTestingAnArrayWhichContainsTheValue() {
        val array = arrayOf("Hello", "World", "Wide", "Web")
        array shouldContain "Wide"
    }

    @Test
    fun failWhenTestingAnArrayWhichDoesNotContainTheValue() {
        val array = arrayOf("Hello", "Wide", "Web")
        assertFails { array shouldContain "World" }
    }

    @Test
    fun passWhenTestingAnIterableWhichContainsTheValue() {
        val alice = Person("Alice", "Bob")
        val jon = Person("Jon", "Doe")
        val list = listOf(alice, jon)
        list shouldContain jon
    }

    @Test
    fun failWhenTestingAnIterableWhichDoesNotContainTheValue() {
        val alice = Person("Alice", "Bob")
        val jon = Person("Jon", "Doe")
        val list = listOf(alice)
        assertFails { list shouldContain jon }
    }

    @Test
    fun passWhenTestingAMapWhichContainsAPair() {
        val map = mapOf(1 to "one", 2 to "two")
        map shouldContain (1 to "one")
    }

    @Test
    fun failWhenTestingAMapWhichDoesNotContainAPair() {
        val map = mapOf(1 to "one", 2 to "two")
        assertFails { map shouldContain (1 to "three") }
    }

    @Test
    fun passWhenTestingAMapWhichContainsAPairOfObjects() {
        val alice = Person("Alice", "Bob")
        val jon = Person("Jon", "Doe")
        val map = mapOf(alice to jon, jon to alice)
        map shouldContain (alice to jon)
    }

    @Test
    fun failWhenTestingAMapWhichDoesNotContainAPairOfObjects() {
        val alice = Person("Alice", "Bob")
        val jon = Person("Jon", "Doe")
        val bob = Person("Bob", "Blue")
        val map = mapOf(alice to jon)
        assertFails { map shouldContain (alice to bob) }
    }
}