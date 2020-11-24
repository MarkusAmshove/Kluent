package org.amshove.kluent.tests.collections

import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.tests.Person
import org.amshove.kluent.shouldNotBeEqualTo
import kotlin.test.Test

class ShouldNotEqualShould {
    @Test
    fun passWhenTestingUnequalArrays() {
        val firstArray = arrayOf(1, 2, 3)
        val secondArray = arrayOf(4, 5, 6)
        firstArray shouldNotBeEqualTo secondArray
    }

    @Test
    fun failWhenTestingEqualArrays() {
        val firstArray = arrayOf(1, 2, 3)
        val secondArray = arrayOf(1, 2, 3)
        assertFails { firstArray shouldNotBeEqualTo secondArray }
    }

    @Test
    fun passWhenTestingUnequalIterable() {
        val firstIterable = listOf(Person("Tom", "Guy"), Person("Jon", "Doe"), Person("Peter", "Meyer"))
        val secondIterable = listOf(Person("Tom", "Guy"), Person("Alice", "Bob"), Person("Jon", "Doe"))
        firstIterable shouldNotBeEqualTo secondIterable
    }

    @Test
    fun failWhenTestingEqualIterable() {
        val firstIterable = listOf(Person("Tom", "Guy"), Person("Alice", "Bob"), Person("Jon", "Doe"))
        val secondIterable = listOf(Person("Tom", "Guy"), Person("Alice", "Bob"), Person("Jon", "Doe"))
        assertFails { firstIterable shouldNotBeEqualTo secondIterable }
    }

    @Test
    fun passWhenTestingDifferentMaps() {
        val firstMap = mapOf(1 to Person("A", "B"), 2 to Person("C", "D"))
        val secondMap = mapOf(1 to Person("A", "C"), 2 to Person("D", "C"))

        firstMap shouldNotBeEqualTo secondMap
    }

    @Test
    fun failWhenTestingEqualMaps() {
        val firstMap = mapOf(1 to Person("A", "B"), 2 to Person("C", "D"))
        val secondMap = mapOf(1 to Person("A", "B"), 2 to Person("C", "D"))

        assertFails { firstMap shouldNotBeEqualTo secondMap }
    }

    @Test
    fun passWhenTestingUnequalIntArrays() {
        val firstArray = intArrayOf(1, 2, 3)
        val secondArray = intArrayOf(4, 5, 6)
        firstArray shouldNotBeEqualTo secondArray
    }

    @Test
    fun failWhenTestingEqualIntArrays() {
        val firstArray = intArrayOf(1, 2, 3)
        val secondArray = intArrayOf(1, 2, 3)
        assertFails { firstArray shouldNotBeEqualTo secondArray }
    }

    @Test
    fun passWhenTestingUnequalBooleanArrays() {
        val firstArray = booleanArrayOf(true, false)
        val secondArray = booleanArrayOf(false, true)

        firstArray shouldNotBeEqualTo secondArray
    }

    @Test
    fun failWhenTestingEqualBooleanArrays() {
        val firstArray = booleanArrayOf(true, false)
        val secondArray = booleanArrayOf(true, false)

        assertFails { firstArray shouldNotBeEqualTo secondArray }
    }

    @Test
    fun passWhenTestingUnequalByteArrays() {
        val firstArray = byteArrayOf(1, 2, 3)
        val secondArray = byteArrayOf(1, 3, 2)

        firstArray shouldNotBeEqualTo secondArray
    }

    @Test
    fun failWhenTestingEqualByteArrays() {
        val firstArray = byteArrayOf(1, 2, 3)
        val secondArray = byteArrayOf(1, 2, 3)

        assertFails { firstArray shouldNotBeEqualTo secondArray }
    }

    @Test
    fun passWhenTestingUnequalCharArrays() {
        val firstArray = charArrayOf('a', 'b')
        val secondArray = charArrayOf('c', 'a')

        firstArray shouldNotBeEqualTo secondArray
    }

    @Test
    fun failWhenTestingEqualCharArrays() {
        val firstArray = charArrayOf('a')
        val secondArray = charArrayOf('a')

        assertFails { firstArray shouldNotBeEqualTo secondArray }
    }

    @Test
    fun passWhenTestingUnequalDoubleArrays() {
        val firstArray = doubleArrayOf(2.0, 3.0)
        val secondArray = doubleArrayOf(2.5, 3.0)

        firstArray shouldNotBeEqualTo secondArray
    }

    @Test
    fun failWhenTestingEqualDoubleArrays() {
        val firstArray = doubleArrayOf(2.0, 3.0)
        val secondArray = doubleArrayOf(2.0, 3.0)

        assertFails { firstArray shouldNotBeEqualTo secondArray }
    }

    @Test
    fun passWhenTestingUnequalFloatArrays() {
        val firstArray = floatArrayOf(1.0f, 1.5f)
        val secondArray = floatArrayOf(1.5f, 1.5f)

        firstArray shouldNotBeEqualTo secondArray
    }

    @Test
    fun failWhenTestingEqualFloatArrays() {
        val firstArray = floatArrayOf(1.0f, 1.5f)
        val secondArray = floatArrayOf(1.0f, 1.5f)

        assertFails { firstArray shouldNotBeEqualTo secondArray }
    }

    @Test
    fun passWhenTestingUnequalLongArrays() {
        val firstArray = longArrayOf(100, 200)
        val secondArray = longArrayOf(300, 200)

        firstArray shouldNotBeEqualTo secondArray
    }

    @Test
    fun failWhenTestingEqualLongArrays() {
        val firstArray = longArrayOf(100, 200)
        val secondArray = longArrayOf(100, 200)

        assertFails { firstArray shouldNotBeEqualTo secondArray }
    }

    @Test
    fun passWhenTestingUnequalShortArrays() {
        val firstArray = shortArrayOf(100, 200)
        val secondArray = shortArrayOf(300, 200)

        firstArray shouldNotBeEqualTo secondArray
    }

    @Test
    fun failWhenTestingEqualShortArrays() {
        val firstArray = shortArrayOf(100, 200)
        val secondArray = shortArrayOf(100, 200)

        assertFails { firstArray shouldNotBeEqualTo secondArray }
    }
}
