package org.amshove.kluent.collections

import kotlin.test.Test
import org.amshove.kluent.Person
import org.amshove.kluent.shouldBeIn
import kotlin.test.assertFails

class ShouldBeInShould {
    @Test
    fun passWhenTestingAnObjectWhichIsWithinAnArray() {
        val person = Person("Jon", "Doe")
        val array = arrayOf(Person("Jon", "Doe"), Person("Foo", "Bar"))
        person shouldBeIn array
    }

    @Test
    fun failWhenTestingAnObjectWhichIsNotWithinAnArray() {
        val person = Person("Jon", "Doe")
        val array = arrayOf(Person("Jane", "Doe"), Person("Foo", "Bar"))
        assertFails { person shouldBeIn array }
    }

    @Test
    fun passWhenTestingAnObjectWhichIsInAnIterable() {
        val person = Person("Jon", "Doe")
        val iterable = listOf(Person("Jon", "Doe"), Person("Foo", "Bar"))
        person shouldBeIn iterable
    }

    @Test
    fun failWhenTestingAnObjectWhichIsNotWithinAnIterable() {
        val person = Person("Jon", "Doe")
        val array = listOf(Person("Foo", "Bar"), Person("Foo", "Bar"))
        assertFails { person shouldBeIn array }
    }
}