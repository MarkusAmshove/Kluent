package org.amshove.kluent.collections

import org.amshove.kluent.shouldBeEmpty
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeEmptyShould {
    @Test
    fun passWhenTestingAnEmptyArray() {
        val arr = arrayOf<String>()
        arr.shouldBeEmpty()
    }

    @Test
    fun passWhenTestingAnEmptyIterable() {
        val iterable: Iterable<String> = listOf()
        iterable.shouldBeEmpty()
    }

    @Test
    fun passWhenTestingAnEmptyMap() {
        val map = mapOf<Int, String>()
        map.shouldBeEmpty()
    }

    @Test
    fun failWhenTestingANonEmptyArray() {
        assertFails { arrayOf("Hi").shouldBeEmpty() }
    }

    @Test
    fun failWhenTestingANonEmptyIterable() {
        assertFails { listOf("Hi").shouldBeEmpty() }
    }

    @Test
    fun failWhenTestingANonEmptyMap() {
        assertFails { mapOf(1 to "Hi").shouldBeEmpty() }
    }
}