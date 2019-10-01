package org.amshove.kluent.collections

import org.amshove.kluent.shouldContainSame
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldContainSameShould {
    @Test
    fun passWhenTestingAnArrayWhichContainsSameValues() {
        val array = arrayOf("World", "Wide", "Web", "Hello")
        array shouldContainSame arrayOf("Hello", "World", "Wide", "Web")
        array shouldContainSame listOf("Hello", "World", "Wide", "Web")
    }

    @Test
    fun failWhenTestingAnArrayWhichDoesNotContainSameValues() {
        val array = arrayOf("Hello", "World", "Wide", "Web")
        assertFails { array shouldContainSame arrayOf("Hello", "World", "Wide", "Web", "Hello") }
        assertFails { array shouldContainSame listOf("Hello", "World", "Wide", "Web", "Hello") }
    }

    @Test
    fun passWhenTestingAnIntArrayWithSameValues() {
        val array = intArrayOf(4, 3, 2, 1)
        array shouldContainSame intArrayOf(1, 2, 3, 4)
        array shouldContainSame listOf(1, 2, 3, 4)
    }

    @Test
    fun failWhenTestingAnIntArrayWithDoesNotContainSameValues() {
        val array = intArrayOf(2, 3, 4)
        assertFails { array shouldContainSame intArrayOf(2, 3, 4, 4) }
        assertFails { array shouldContainSame listOf(2, 3, 4, 4) }
    }

    @Test
    fun passWhenTestingABooleanArrayWhichContainsSameValues() {
        val array = booleanArrayOf(true, false)
        array shouldContainSame booleanArrayOf(false, true)
        array shouldContainSame listOf(false, true)
    }

    @Test
    fun failWhenTestingABooleanArrayWhichDoesNotContainSameValues() {
        val array = booleanArrayOf(false, true)
        assertFails { array shouldContainSame booleanArrayOf(true, false, true) }
        assertFails { array shouldContainSame listOf(true, false, true) }
    }

    @Test
    fun passWhenTestingAByteArrayWhichContainsSameValues() {
        val array = byteArrayOf(4, 3, 2, 1)
        array shouldContainSame byteArrayOf(1, 2, 3, 4)
        array shouldContainSame listOf<Byte>(1, 2, 3, 4)
    }

    @Test
    fun failWhenTestingAByteArrayWhichDoesNotContainSameValues() {
        val array = byteArrayOf(2, 3, 4)
        assertFails { array shouldContainSame byteArrayOf(2, 3, 4, 4) }
        assertFails { array shouldContainSame listOf<Byte>(2, 3, 4, 4) }
    }

    @Test
    fun passWhenTestingACharArrayWhichContainsSameValues() {
        val array = charArrayOf('a', 'f', 'z')
        array shouldContainSame charArrayOf('z', 'f', 'a')
        array shouldContainSame listOf('z', 'f', 'a')
    }

    @Test
    fun failWhenTestingACharArrayWhichDoesNotContainSameValues() {
        val array = charArrayOf('a', '-')
        assertFails { array shouldContainSame charArrayOf('a', '-', 'a') }
        assertFails { array shouldContainSame listOf('a', '-', 'a') }
    }

    @Test
    fun passWhenTestingADoubleArrayWhichContainsSameValues() {
        val array = doubleArrayOf(0.3, 1.1, 5.7)
        array shouldContainSame doubleArrayOf(5.7, 0.3, 1.1)
        array shouldContainSame listOf(5.7, 0.3, 1.1)
    }

    @Test
    fun failWhenTestingADoubleArrayWhichDoesNotContainSameValues() {
        val array = doubleArrayOf(0.3, 1.1, 5.7)
        assertFails { array shouldContainSame doubleArrayOf(0.3, 1.1, 5.7, 0.3) }
        assertFails { array shouldContainSame listOf(0.3, 1.1, 5.7, 0.3) }
    }

    @Test
    fun passWhenTestingAFloatArrayWhichContainsSameValues() {
        val array = floatArrayOf(5.0f, 7.0f, 3.0f)
        array shouldContainSame floatArrayOf(3.0f, 5.0f, 7.0f)
        array shouldContainSame listOf(3.0f, 5.0f, 7.0f)
    }

    @Test
    fun failWhenTestingAFloatArrayWhichDoesNotContainSameValues() {
        val array = floatArrayOf(2.2f, 1.1f)
        assertFails { array shouldContainSame floatArrayOf(2.2f, 1.1f, 2.2f) }
        assertFails { array shouldContainSame listOf(2.2f, 1.1f, 2.2f) }
    }

    @Test
    fun passWhenTestingALongArrayWhichContainsSameValues() {
        val array = longArrayOf(1L, 4L, 120L)
        array shouldContainSame longArrayOf(120L, 4L, 1L)
        array shouldContainSame listOf(120L, 4L, 1L)
    }

    @Test
    fun failWhenTestingALongArrayWhichDoesNotContainSameValues() {
        val array = longArrayOf(4L, 3L)
        assertFails { array shouldContainSame longArrayOf(4L, 3L, 4L) }
        assertFails { array shouldContainSame listOf(4L, 3L, 4L) }
    }

    @Test
    fun passWhenTestingAShortArrayWhichContainsSameValues() {
        val array = shortArrayOf(5, 6, 7)
        array shouldContainSame shortArrayOf(7, 5, 6)
        array shouldContainSame listOf<Short>(7, 5, 6)
    }

    @Test
    fun failWhenTestingAShortArrayWhichDoesNotContainSameValues() {
        val array = shortArrayOf(6, 8, 8)
        assertFails { array shouldContainSame shortArrayOf(6, 8) }
        assertFails { array shouldContainSame listOf<Short>(6, 8) }
    }

    @Test
    fun passWhenTestingAnIterableWhichContainsSameValues() {
        val list = listOf(5, 8, 12)
        list shouldContainSame listOf(12, 8, 5)
    }

    @Test
    fun failWhenTestingAnIterableWhichDoesNotContainSameValues() {
        val set = setOf(4, 9)
        assertFails { set shouldContainSame setOf(4, 6) }
    }

    @Test
    fun passWhenTestingASequenceWhichContainsSameValues() {
        val sequence = sequenceOf(5, 8, 12)
        sequence shouldContainSame sequenceOf(12, 8, 5)
    }

    @Test
    fun failWhenTestingASequenceWhichDoesNotContainSameValues() {
        val sequence = sequenceOf(4, 9)
        assertFails { sequence shouldContainSame sequenceOf(4, 6) }
    }

    @Test
    fun passWhenTestingAMapWhichContainsSameValues() {
        val map = mapOf('a' to 1, 'b' to 2, 'c' to 3)
        map shouldContainSame mapOf('b' to 2, 'a' to 1, 'c' to 3)
    }

    @Test
    fun failWhenTestingAMapWhichDoesNotContainSameValues() {
        val map = mapOf('a' to 1, 'b' to 2)
        assertFails { map shouldContainSame mapOf('a' to 1, 'b' to 3) }
    }

    @Test
    fun passWhenTestingAnIterableWhichContainsSameValuesOfAnArray() {
        val anIterable = listOf("Berlin", "Washington")
        val anArray = arrayOf("Washington", "Berlin")

        anIterable.shouldContainSame(anArray)
    }

    @Test
    fun passWhenTestingAnArrayWhichContainsSameValuesOfAnIterable() {
        val anArray = arrayOf("Washington", "Berlin")
        val anIterable = listOf("Berlin", "Washington")

        anArray.shouldContainSame(anIterable)
    }
}
