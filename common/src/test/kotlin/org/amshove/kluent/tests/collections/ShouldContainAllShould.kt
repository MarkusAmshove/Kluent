package org.amshove.kluent.tests.collections

import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldContainAll
import kotlin.test.Test

class ShouldContainAllShould {
    @Test
    fun passWhenTestingAnArrayWhichContainsAllValues() {
        val array = arrayOf("Hello", "World", "Wide", "Web")
        array shouldContainAll arrayOf("World", "Wide", "Web")
        array shouldContainAll listOf("World", "Wide", "Web")
    }

    @Test
    fun failWhenTestingAnArrayWhichDoesNotContainAllValues() {
        val array = arrayOf("Hello", "World", "Wide", "Web")
        assertFails { array shouldContainAll arrayOf("Hello", "World", "White") }
        assertFails { array shouldContainAll listOf("Hello", "World", "White") }
    }

    @Test
    fun passWhenTestingAnIntArrayWithAllValues() {
        val array = intArrayOf(1, 2, 3, 4)
        array shouldContainAll intArrayOf(2, 4)
        array shouldContainAll listOf(2, 4)
    }

    @Test
    fun failWhenTestingAnIntArrayWithDoesNotContainAllValues() {
        val array = intArrayOf(1, 2)
        assertFails { array shouldContainAll intArrayOf(1, 2, 4) }
        assertFails { array shouldContainAll listOf(1, 2, 4) }
    }

    @Test
    fun passWhenTestingABooleanArrayWhichContainsAllValues() {
        val array = booleanArrayOf(true, false)
        array shouldContainAll booleanArrayOf(false, true, false)
        array shouldContainAll listOf(false, true, false)
    }

    @Test
    fun failWhenTestingABooleanArrayWhichDoesNotContainAllValues() {
        val array = booleanArrayOf(false)
        assertFails { array shouldContainAll booleanArrayOf(true, false) }
        assertFails { array shouldContainAll listOf(true, false) }
    }

    @Test
    fun passWhenTestingAByteArrayWhichContainsAllValues() {
        val array = byteArrayOf(0, 1, 2, 5)
        array shouldContainAll byteArrayOf(5, 2)
        array shouldContainAll listOf<Byte>(5, 2)
    }

    @Test
    fun failWhenTestingAByteArrayWhichDoesNotContainAllValues() {
        val array = byteArrayOf(1, 2, 3)
        assertFails { array shouldContainAll byteArrayOf(4, 6) }
        assertFails { array shouldContainAll listOf<Byte>(4, 6) }
    }

    @Test
    fun passWhenTestingACharArrayWhichContainsAllValues() {
        val array = charArrayOf('a', 'f', 'z')
        array shouldContainAll charArrayOf('z')
        array shouldContainAll listOf('z')
    }

    @Test
    fun failWhenTestingACharArrayWhichDoesNotContainAllValues() {
        val array = charArrayOf('a', '-')
        assertFails { array shouldContainAll charArrayOf('-', '-', 'b') }
        assertFails { array shouldContainAll listOf('-', '-', 'b') }
    }

    @Test
    fun passWhenTestingADoubleArrayWhichContainsAllValues() {
        val array = doubleArrayOf(0.3, 1.1, 5.7)
        array shouldContainAll doubleArrayOf(5.7, 0.3, 1.1)
        array shouldContainAll listOf(5.7, 0.3, 1.1)
    }

    @Test
    fun failWhenTestingADoubleArrayWhichDoesNotContainAllValues() {
        val array = doubleArrayOf(0.3, 1.1, 5.7)
        assertFails { array shouldContainAll doubleArrayOf(5.7, 1.1, 0.3, 81.9) }
        assertFails { array shouldContainAll listOf(5.7, 1.1, 0.3, 81.9) }
    }

    @Test
    fun passWhenTestingAFloatArrayWhichContainsAllValues() {
        val array = floatArrayOf(5.6f, 7.0f, 0.33f)
        array shouldContainAll floatArrayOf(7.0f)
        array shouldContainAll listOf(7.0f)
    }

    @Test
    fun failWhenTestingAFloatArrayWhichDoesNotContainAllValues() {
        val array = floatArrayOf(2.2f)
        assertFails { array shouldContainAll floatArrayOf(2.2f, 1.1f) }
        assertFails { array shouldContainAll listOf(2.2f, 1.1f) }
    }

    @Test
    fun passWhenTestingALongArrayWhichContainsAllValues() {
        val array = longArrayOf(1L, 4L, 120L)
        array shouldContainAll longArrayOf(120L, 4L)
        array shouldContainAll listOf(120L, 4L)
    }

    @Test
    fun failWhenTestingALongArrayWhichDoesNotContainAllValues() {
        val array = longArrayOf(4L, 3L)
        assertFails { array shouldContainAll longArrayOf(120L) }
        assertFails { array shouldContainAll listOf(120L) }
    }

    @Test
    fun passWhenTestingAShortArrayWhichContainsAllValues() {
        val array = shortArrayOf(5, 6, 7)
        array shouldContainAll shortArrayOf(5, 6, 7)
        array shouldContainAll listOf<Short>(5, 6, 7)
    }

    @Test
    fun failWhenTestingAShortArrayWhichDoesNotContainAllValues() {
        val array = shortArrayOf(6, 8)
        assertFails { array shouldContainAll shortArrayOf(6, 9) }
        assertFails { array shouldContainAll listOf<Short>(6, 9) }
    }

    @Test
    fun passWhenTestingAnIterableWhichContainsAllValues() {
        val list = listOf(5, 8, 12)
        list shouldContainAll listOf(12, 8)
    }

    @Test
    fun failWhenTestingAnIterableWhichDoesNotContainAllValues() {
        val set = setOf(4, 9)
        assertFails { set shouldContainAll setOf(5, 9) }
    }

    @Test
    fun passWhenTestingASequenceWhichContainsAllValues() {
        val sequence = sequenceOf(5, 8, 12)
        sequence shouldContainAll sequenceOf(12, 8)
    }

    @Test
    fun failWhenTestingASequenceWhichDoesNotContainAllValues() {
        val sequence = sequenceOf(4, 9)
        assertFails { sequence shouldContainAll sequenceOf(5, 9) }
    }

    @Test
    fun passWhenTestingAMapWhichContainsAllValues() {
        val map = mapOf('a' to 1, 'b' to 2, 'c' to 3)
        map shouldContainAll mapOf('b' to 2, 'a' to 1)
    }

    @Test
    fun failWhenTestingAMapWhichDoesNotContainAllValues() {
        val map = mapOf('a' to 1, 'b' to 2)
        assertFails { map shouldContainAll mapOf('a' to 2, 'b' to 1) }
    }

    @Test
    fun passWhenTestingAnIterableWhichContainsAllValuesOfAnArray() {
        val anIterable = listOf("Berlin", "Washington")
        val anArray = arrayOf("Berlin", "Washington")

        anIterable.shouldContainAll(anArray)
    }

    @Test
    fun passWhenTestingAnArrayWhichContainsAllValuesOfAnIterable() {
        val anArray = arrayOf("Berlin", "Washington")
        val anIterable = listOf("Berlin", "Washington")

        anArray.shouldContainAll(anIterable)
    }
}