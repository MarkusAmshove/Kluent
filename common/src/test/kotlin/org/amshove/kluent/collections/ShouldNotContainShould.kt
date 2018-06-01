package org.amshove.kluent.collections

import org.amshove.kluent.shouldNotContain
import org.amshove.kluent.Person
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotContainShould {
    @Test
    fun passWhenTestingAnArrayWhichDoesNotContainTheValue() {
        val array = arrayOf("Hello", "Wide", "Web")
        array shouldNotContain "World"
    }

    @Test
    fun failWhenTestingAnArrayWhichContainsTheValue() {
        val array = arrayOf("Hello", "World", "Wide", "Web")
        assertFails { array shouldNotContain "Wide" }
    }

    @Test
    fun passWhenTestingAnIterableWhichDoesNotContainTheValue() {
        val alice = Person("Alice", "Bob")
        val jon = Person("Jon", "Doe")
        val list = listOf(alice)
        list shouldNotContain jon
    }

    @Test
    fun failWhenTestingAnIterableWhichContainsTheValue() {
        val alice = Person("Alice", "Bob")
        val jon = Person("Jon", "Doe")
        val list = listOf(alice, jon)
        assertFails { list shouldNotContain jon }
    }

}