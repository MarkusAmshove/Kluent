package org.amshove.kluent.collections

import org.amshove.kluent.shouldNotBeEmpty
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotBeEmptyShould {
    @Test
    fun passWhenTestingANonEmptyArray() {
        val arr = arrayOf("Hi")
        arr.shouldNotBeEmpty()
    }

    @Test
    fun passWhenTestingANonEmptyIterable() {
        val iterable = listOf("Hi")
        iterable.shouldNotBeEmpty()
    }

    @Test
    fun passWhenTestingANonEmptyMap() {
        val map = mapOf(1 to "Hi")
        map.shouldNotBeEmpty()
    }

    @Test
    fun failWhenTestingAnEmptyArray() {
        val arr = arrayOf<String>()
        assertFails { arr.shouldNotBeEmpty() }
    }

    @Test
    fun failWhenTestingAnEmptyIterable() {
        val iterable: Iterable<String> = listOf()
        assertFails { iterable.shouldNotBeEmpty() }
    }

    @Test
    fun failWhenTestingAnEmptyMap() {
        val map = mapOf<Int, String>()
        assertFails { map.shouldNotBeEmpty() }
    }
}