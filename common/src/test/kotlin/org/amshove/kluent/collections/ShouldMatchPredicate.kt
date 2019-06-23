package org.amshove.kluent.collections

import org.amshove.kluent.Person
import org.amshove.kluent.shouldMatchAllWith
import org.amshove.kluent.shouldMatchAtLeastOneOf
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldMatchPredicate {
    @Test
    fun `pass when list contains something that matches`() {
        val list = listOf(Person("Anton", "Chekhov"), Person("Alexander", "Pushkin"), Person("Fyodor", "Dostoevsky"))
        list.shouldMatchAtLeastOneOf { it.name.startsWith("A") }
    }

    @Test
    fun `fail when doesn't contains something that matches`() {
        val list = listOf(Person("Anton", "Chekhov"), Person("Alexander", "Pushkin"), Person("Fyodor", "Dostoevsky"))
        assertFails { list.shouldMatchAtLeastOneOf { it.name.startsWith("C") } }
    }

    @Test
    fun `pass when list contains all that matches`() {
        val list = listOf(Person("Anton", "Chekhov"), Person("Alexander", "Pushkin"), Person("Fyodor", "Dostoevsky"))
        list.shouldMatchAllWith { it.name.length > 3 }
    }

    @Test
    fun `fail when doesn't contains all that matches`() {
        val list = listOf(Person("Anton", "Chekhov"), Person("Alexander", "Pushkin"), Person("Fyodor", "Dostoevsky"))
        assertFails { list.shouldMatchAllWith { it.name.startsWith("A") } }
    }

    @Test
    fun `empty list shouldn't match anything`() {
        val list = emptyList<Person>()
        assertFails { list.shouldMatchAtLeastOneOf { true } }
        list.shouldMatchAllWith { true }
        list.shouldMatchAllWith { false }
    }

    @Test
    fun `support chaining`() {
        val list = listOf(Person("Anton", "Chekhov"), Person("Alexander", "Pushkin"), Person("Fyodor", "Dostoevsky"))
        list
                .shouldMatchAtLeastOneOf { it.name.startsWith("A") }
                .shouldMatchAtLeastOneOf { it.name.startsWith("F") }
                .shouldMatchAllWith { it.name.length > 3 }
    }

    @Test
    fun `support primitives too`() {
        val array: IntArray = arrayOf(1, 2, 3, 4, 5).toIntArray()
        array.shouldMatchAtLeastOneOf { it == 3 }
        array.shouldMatchAllWith { it >= 0 }
    }
}

