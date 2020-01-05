package org.amshove.kluent.collections

import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.Person
import kotlin.test.assertFails
import kotlin.test.Test

class ShouldEqualShould {

    @Test
    fun passWhenTestingEqualArrays() {
        val firstArray = arrayOf(1, 2, 3)
        val secondArray = arrayOf(1, 2, 3)
        firstArray shouldBeEqualTo secondArray
    }

    @Test
    fun failWhenTestingUnequalArrays() {
        val firstArray = arrayOf(1, 2, 3)
        val secondArray = arrayOf(1, 5, 3)
        assertFails { firstArray shouldBeEqualTo secondArray }
    }

    @Test
    fun passWhenTestingEqualIterable() {
        val firstIterable = listOf(Person("Tom", "Guy"), Person("Alice", "Bob"), Person("Jon", "Doe"))
        val secondIterable = listOf(Person("Tom", "Guy"), Person("Alice", "Bob"), Person("Jon", "Doe"))
        firstIterable shouldBeEqualTo secondIterable
    }

    @Test
    fun failWhenTestingDifferentIterable() {
        val firstIterable = listOf(Person("Tom", "Guy"), Person("Jon", "Doe"), Person("Peter", "Meyer"))
        val secondIterable = listOf(Person("Tom", "Guy"), Person("Alice", "Bob"), Person("Jon", "Doe"))
        assertFails { firstIterable shouldBeEqualTo secondIterable }
    }

    @Test
    fun passWhenTestingEqualMaps() {
        val firstMap = mapOf(1 to Person("A", "B"), 2 to Person("C", "D"))
        val secondMap = mapOf(1 to Person("A", "B"), 2 to Person("C", "D"))

        firstMap shouldBeEqualTo secondMap
    }

    @Test
    fun failWhenTestingDifferentMaps() {
        val firstMap = mapOf(1 to Person("A", "B"), 2 to Person("C", "D"))
        val secondMap = mapOf(1 to Person("A", "C"), 2 to Person("D", "C"))

        assertFails { firstMap shouldBeEqualTo secondMap }
    }

    @Test
    fun passWhenTestingEqualIntArrays() {
        val firstArray = intArrayOf(1, 2, 3)
        val secondArray = intArrayOf(1, 2, 3)
        firstArray shouldBeEqualTo secondArray
    }

    @Test
    fun failWhenTestingUnequalIntArrays() {
        val firstArray = intArrayOf(1, 2, 3)
        val secondArray = intArrayOf(4, 5, 6)
        assertFails { firstArray shouldBeEqualTo secondArray }
    }

    @Test
    fun passWhenTestingEqualBooleanArrays() {
        val firstArray = booleanArrayOf(true, false)
        val secondArray = booleanArrayOf(true, false)

        firstArray shouldBeEqualTo secondArray
    }

    @Test
    fun failWhenTestingUnequalBooleanArrays() {
        val firstArray = booleanArrayOf(true, false)
        val secondArray = booleanArrayOf(false, true)

        assertFails { firstArray shouldBeEqualTo secondArray }
    }

    @Test
    fun passWhenTestingEqualByteArrays() {
        val firstArray = byteArrayOf(1, 2, 3)
        val secondArray = byteArrayOf(1, 2, 3)

        firstArray shouldBeEqualTo secondArray
    }

    @Test
    fun failWhenTestingUnequalByteArrays() {
        val firstArray = byteArrayOf(1, 2, 3)
        val secondArray = byteArrayOf(1, 3, 2)

        assertFails { firstArray shouldBeEqualTo secondArray }
    }

    @Test
    fun passWhenTestingEqualCharArrays() {
        val firstArray = charArrayOf('a')
        val secondArray = charArrayOf('a')

        firstArray shouldBeEqualTo secondArray
    }

    @Test
    fun failWhenTestingUnequalCharArrays() {
        val firstArray = charArrayOf('a', 'b')
        val secondArray = charArrayOf('c', 'a')

        assertFails { firstArray shouldBeEqualTo secondArray }
    }

    @Test
    fun passWhenTestingEqualDoubleArrays() {
        val firstArray = doubleArrayOf(2.0, 3.0)
        val secondArray = doubleArrayOf(2.0, 3.0)

        firstArray shouldBeEqualTo secondArray
    }

    @Test
    fun failWhenTestingUnequalDoubleArrays() {
        val firstArray = doubleArrayOf(2.0, 3.0)
        val secondArray = doubleArrayOf(2.5, 3.0)

        assertFails { firstArray shouldBeEqualTo secondArray }
    }

    @Test
    fun passWhenTestingEqualFloatArrays() {
        val firstArray = floatArrayOf(1.0f, 1.5f)
        val secondArray = floatArrayOf(1.0f, 1.5f)

        firstArray shouldBeEqualTo secondArray
    }

    @Test
    fun failWhenTestingUnequalFloatArrays() {
        val firstArray = floatArrayOf(1.0f, 1.5f)
        val secondArray = floatArrayOf(1.5f, 1.5f)

        assertFails { firstArray shouldBeEqualTo secondArray }
    }

    @Test
    fun passWhenTestingEqualLongArrays() {
        val firstArray = longArrayOf(100, 200)
        val secondArray = longArrayOf(100, 200)

        firstArray shouldBeEqualTo secondArray
    }

    @Test
    fun failWhenTestingUnequalLongArrays() {
        val firstArray = longArrayOf(100, 200)
        val secondArray = longArrayOf(300, 200)

        assertFails { firstArray shouldBeEqualTo secondArray }
    }

    @Test
    fun passWhenTestingEqualShortArrays() {
        val firstArray = shortArrayOf(100, 200)
        val secondArray = shortArrayOf(100, 200)

        firstArray shouldBeEqualTo secondArray
    }

    @Test
    fun failWhenTestingUnequalShortArrays() {
        val firstArray = shortArrayOf(100, 200)
        val secondArray = shortArrayOf(300, 200)

        assertFails { firstArray shouldBeEqualTo secondArray }
    }
}
