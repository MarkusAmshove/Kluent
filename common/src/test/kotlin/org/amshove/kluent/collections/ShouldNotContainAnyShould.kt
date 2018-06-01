package org.amshove.kluent.collections

import org.amshove.kluent.shouldNotContainAny
import kotlin.test.assertFails
import kotlin.test.Test

class ShouldNotContainAnyShould {
    @Test
    fun passWhenTestingAnArrayWithNoMatchingValue() {
        val array = arrayOf("Hello", "World", "Wide", "Web")
        array shouldNotContainAny arrayOf("cat", "bat", "rat")
    }

    @Test
    fun failWhenTestingAnArrayWithAtLeastOneMatchingValue() {
        val array = arrayOf("Hello", "World", "Wide", "Web")
        assertFails { array shouldNotContainAny arrayOf("cat", "rat", "Web") }
    }

    @Test
    fun passWhenTestingAnIntArrayWithNoMatchingValue() {
        val array = intArrayOf(1, 3, 5)
        array shouldNotContainAny intArrayOf(2, 4, 6)
    }

    @Test
    fun failWhenTestingAnIntArrayWithAtLeastOneMatchingValue() {
        val array = intArrayOf(1, 3, 5)
        assertFails { array shouldNotContainAny intArrayOf(2, 4, 5) }
    }

    @Test
    fun passWhenTestingABooleanArrayWithNoMatchingValue() {
        val array = booleanArrayOf(true)
        array shouldNotContainAny booleanArrayOf(false)
    }

    @Test
    fun failWhenTestingABooleanArrayWithAtLeastOneMatchingValue() {
        val array = booleanArrayOf(false, true)
        assertFails { array shouldNotContainAny booleanArrayOf(false, false) }
    }

    @Test
    fun passWhenTestingAByteArrayWithNoMatchingValue() {
        val array = byteArrayOf(3, 4)
        array shouldNotContainAny byteArrayOf(9)
    }

    @Test
    fun failWhenTestingAByteArrayWithAtLeastOneMatchingValue() {
        val array = byteArrayOf(5, 7, 8)
        assertFails { array shouldNotContainAny byteArrayOf(5, 8, 9, 7) }
    }

    @Test
    fun passWhenTestingACharArrayWithNoMatchingValue() {
        val array = charArrayOf('a', 'o', 'e', 'i', 'u')
        array shouldNotContainAny charArrayOf('b')
    }

    @Test
    fun failWhenTestingACharArrayWithAtLeastOneMatchingValue() {
        val array = charArrayOf('a', 'o', 'e', 'i', 'u')
        assertFails { array shouldNotContainAny charArrayOf('o') }
    }

    @Test
    fun passWhenTestingADoubleArrayWithNoMatchingValue() {
        val array = doubleArrayOf(5.6, 7.8, 8.0)
        array shouldNotContainAny doubleArrayOf(1.2, 3.9)
    }

    @Test
    fun failWhenTestingADoubleArrayWithAtLeastOneMatchingValue() {
        val array = doubleArrayOf(8.9, 9.1, 12.3)
        assertFails { array shouldNotContainAny doubleArrayOf(12.3, 1.0) }
    }

    @Test
    fun passWhenTestingAFloatArrayWithNoMatchingValue() {
        val array = floatArrayOf(0f, 1f, 2f)
        array shouldNotContainAny floatArrayOf(3f, 4f)
    }

    @Test
    fun failWhenTestingAFloatArrayWithAtLeastOneMatchingValue() {
        val array = floatArrayOf(2f, 5f, 7f)
        assertFails { array shouldNotContainAny floatArrayOf(5f, 2f, 7f) }
    }

    @Test
    fun passWhenTestingALongArrayWithNoMatchingValue() {
        val array = longArrayOf(2L, 100L, 200L)
        array shouldNotContainAny longArrayOf(3L, 50L, 75L)
    }

    @Test
    fun failWhenTestingALongArrayWithAtLeastOneMatchingValue() {
        val array = longArrayOf(1L, 4L)
        assertFails { array shouldNotContainAny longArrayOf(4L, 5L, 89L) }
    }

    @Test
    fun passWhenTestingAShortArrayWithNoMatchingValue() {
        val array = shortArrayOf(5, 8, 12)
        array shouldNotContainAny shortArrayOf(7, 6, -1)
    }

    @Test
    fun failWhenTestingAShortArrayWithAtLeastOneMatchingValue() {
        val array = shortArrayOf(2, 14, 3)
        assertFails { array shouldNotContainAny shortArrayOf(14, 1, 7) }
    }

    @Test
    fun passWhenTestingAnIterableWithNoMatchingValue() {
        val array = listOf('a', 'c', 'e')
        array shouldNotContainAny listOf('b', 'f')
    }

    @Test
    fun failWhenTestingAnIterableWithAtLeastOneMatchingValue() {
        val array = setOf(5, 5, 6)
        assertFails { array shouldNotContainAny setOf(6, 6, 7) }
    }

    @Test
    fun passWhenTestingAMapWithNoMatchingPair() {
        val array = mapOf('a' to 1, 'b' to 2, 'c' to 3)
        array shouldNotContainAny mapOf('a' to 4)
    }

    @Test
    fun failWhenTestingAMapWithAtLeastOneMatchingPair() {
        val array = mapOf('a' to 1, 'b' to 2, 'c' to 3)
        assertFails { array shouldNotContainAny mapOf('b' to 2, 'a' to 3) }
    }
}