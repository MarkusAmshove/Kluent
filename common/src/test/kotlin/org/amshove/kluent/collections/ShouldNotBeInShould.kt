package org.amshove.kluent.collections

import kotlin.test.assertFails
import org.amshove.kluent.Person
import org.amshove.kluent.shouldNotBeIn
import kotlin.test.Test

class ShouldNotBeInShould {
    @Test
    fun passWhenTestingAnObjectWhichIsNotInAnArray() {
        val person = Person("Jon", "Doe")
        val array = arrayOf(Person("Foo", "Bar"), Person("Foo", "Bar"))
        person shouldNotBeIn array
    }

    @Test
    fun failWhenTestingAnObjectWhichIsInAnArray() {
        val person = Person("Jon", "Doe")
        val array = arrayOf(Person("Jon", "Doe"), Person("Foo", "Bar"))
        assertFails { person shouldNotBeIn array }
    }

    @Test
    fun passWhenTestingAnObjectWhichIsNotInAnIterable() {
        val person = Person("Jon", "Doe")
        val iterable = listOf(Person("Foo", "Bar"), Person("Foo", "Bar"))
        person shouldNotBeIn iterable
    }

    @Test
    fun failWhenTestingAnObjectWhichIsInAnIterable() {
        val person = Person("Jon", "Doe")
        val array = listOf(Person("Jon", "Doe"), Person("Foo", "Bar"))
        assertFails { person shouldNotBeIn array }
    }
}