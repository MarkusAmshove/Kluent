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
}