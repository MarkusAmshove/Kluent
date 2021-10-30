package org.amshove.kluent.tests.collections

import org.amshove.kluent.shouldMatchAllWith
import org.amshove.kluent.shouldMatchAtLeastOneOf
import org.amshove.kluent.tests.Person
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldMatchPredicateShould {
    @Test
    fun passWhenListContainsSomethingThatMatches() {
        val list = listOf(Person("Anton", "Chekhov"), Person("Alexander", "Pushkin"), Person("Fyodor", "Dostoevsky"))
        list.shouldMatchAtLeastOneOf { it.name.startsWith("A") }
    }

    @Test
    fun failWhenDoesntContainsSomethingThatMatches() {
        val list = listOf(Person("Anton", "Chekhov"), Person("Alexander", "Pushkin"), Person("Fyodor", "Dostoevsky"))
        assertFails { list.shouldMatchAtLeastOneOf { it.name.startsWith("C") } }
    }

    @Test
    fun passWhenListContainsAllThatMatches() {
        val list = listOf(Person("Anton", "Chekhov"), Person("Alexander", "Pushkin"), Person("Fyodor", "Dostoevsky"))
        list.shouldMatchAllWith { it.name.length > 3 }
    }

    @Test
    fun failWhenDoesntContainsAllThatMatches() {
        val list = listOf(Person("Anton", "Chekhov"), Person("Alexander", "Pushkin"), Person("Fyodor", "Dostoevsky"))
        assertFails { list.shouldMatchAllWith { it.name.startsWith("A") } }
    }

    @Test
    fun emptyListShouldntMatchAnything() {
        val list = emptyList<Person>()
        assertFails { list.shouldMatchAtLeastOneOf { true } }
        list.shouldMatchAllWith { true }
        list.shouldMatchAllWith { false }
    }

    @Test
    fun supportChaining() {
        val list = listOf(Person("Anton", "Chekhov"), Person("Alexander", "Pushkin"), Person("Fyodor", "Dostoevsky"))
        list
            .shouldMatchAtLeastOneOf { it.name.startsWith("A") }
            .shouldMatchAtLeastOneOf { it.name.startsWith("F") }
            .shouldMatchAllWith { it.name.length > 3 }
    }

    @Test
    fun supportPrimitivesToo() {
        val array: IntArray = arrayOf(1, 2, 3, 4, 5).toIntArray()
        array.shouldMatchAtLeastOneOf { it == 3 }
        array.shouldMatchAllWith { it >= 0 }
    }
}

