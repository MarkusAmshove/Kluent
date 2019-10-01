package org.amshove.kluent.collections

import org.amshove.kluent.Person
import org.amshove.kluent.shouldNotEqual
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotEqualShould {
    @Test
    fun passWhenTestingUnequalArrays() {
        val firstArray = arrayOf(1, 2, 3)
        val secondArray = arrayOf(4, 5, 6)
        firstArray shouldNotEqual secondArray
    }

    @Test
    fun failWhenTestingEqualArrays() {
        val firstArray = arrayOf(1, 2, 3)
        val secondArray = arrayOf(1, 2, 3)
        assertFails { firstArray shouldNotEqual secondArray }
    }

    @Test
    fun passWhenTestingUnequalIterable() {
        val firstIterable = listOf(Person("Tom", "Guy"), Person("Jon", "Doe"), Person("Peter", "Meyer"))
        val secondIterable = listOf(Person("Tom", "Guy"), Person("Alice", "Bob"), Person("Jon", "Doe"))
        firstIterable shouldNotEqual secondIterable
    }

    @Test
    fun failWhenTestingEqualIterable() {
        val firstIterable = listOf(Person("Tom", "Guy"), Person("Alice", "Bob"), Person("Jon", "Doe"))
        val secondIterable = listOf(Person("Tom", "Guy"), Person("Alice", "Bob"), Person("Jon", "Doe"))
        assertFails { firstIterable shouldNotEqual secondIterable }
    }

    @Test
    fun passWhenTestingUnequalSequence() {
        val firstSequence = sequenceOf(Person("Tom", "Guy"), Person("Jon", "Doe"), Person("Peter", "Meyer"))
        val secondSequence = sequenceOf(Person("Tom", "Guy"), Person("Alice", "Bob"), Person("Jon", "Doe"))
        firstSequence shouldNotEqual secondSequence
    }

    @Test
    fun failWhenTestingEqualSequence() {
        val firstSequence = sequenceOf(Person("Tom", "Guy"), Person("Alice", "Bob"), Person("Jon", "Doe"))
        val secondSequence = sequenceOf(Person("Tom", "Guy"), Person("Alice", "Bob"), Person("Jon", "Doe"))
        assertFails { firstSequence shouldNotEqual secondSequence }
    }

    @Test
    fun passWhenTestingSequencesOfDifferentSizes() {
        val firstSequence = sequenceOf(Person("Tom", "Guy"), Person("Alice", "Bob"), Person("Jon", "Doe"))
        val secondSequence = sequenceOf(Person("Tom", "Guy"), Person("Alice", "Bob"))
        firstSequence shouldNotEqual secondSequence
        secondSequence shouldNotEqual firstSequence
    }

    @Test
    fun passWhenTestingDifferentMaps() {
        val firstMap = mapOf(1 to Person("A", "B"), 2 to Person("C", "D"))
        val secondMap = mapOf(1 to Person("A", "C"), 2 to Person("D", "C"))

        firstMap shouldNotEqual secondMap
    }

    @Test
    fun failWhenTestingEqualMaps() {
        val firstMap = mapOf(1 to Person("A", "B"), 2 to Person("C", "D"))
        val secondMap = mapOf(1 to Person("A", "B"), 2 to Person("C", "D"))

        assertFails { firstMap shouldNotEqual secondMap }
    }

    @Test
    fun passWhenTestingUnequalIntArrays() {
        val firstArray = intArrayOf(1, 2, 3)
        val secondArray = intArrayOf(4, 5, 6)
        firstArray shouldNotEqual secondArray
    }

    @Test
    fun failWhenTestingEqualIntArrays() {
        val firstArray = intArrayOf(1, 2, 3)
        val secondArray = intArrayOf(1, 2, 3)
        assertFails { firstArray shouldNotEqual secondArray }
    }

    @Test
    fun passWhenTestingUnequalBooleanArrays() {
        val firstArray = booleanArrayOf(true, false)
        val secondArray = booleanArrayOf(false, true)

        firstArray shouldNotEqual secondArray
    }

    @Test
    fun failWhenTestingEqualBooleanArrays() {
        val firstArray = booleanArrayOf(true, false)
        val secondArray = booleanArrayOf(true, false)

        assertFails { firstArray shouldNotEqual secondArray }
    }

    @Test
    fun passWhenTestingUnequalByteArrays() {
        val firstArray = byteArrayOf(1, 2, 3)
        val secondArray = byteArrayOf(1, 3, 2)

        firstArray shouldNotEqual secondArray
    }

    @Test
    fun failWhenTestingEqualByteArrays() {
        val firstArray = byteArrayOf(1, 2, 3)
        val secondArray = byteArrayOf(1, 2, 3)

        assertFails { firstArray shouldNotEqual secondArray }
    }

    @Test
    fun passWhenTestingUnequalCharArrays() {
        val firstArray = charArrayOf('a', 'b')
        val secondArray = charArrayOf('c', 'a')

        firstArray shouldNotEqual secondArray
    }

    @Test
    fun failWhenTestingEqualCharArrays() {
        val firstArray = charArrayOf('a')
        val secondArray = charArrayOf('a')

        assertFails { firstArray shouldNotEqual secondArray }
    }

    @Test
    fun passWhenTestingUnequalDoubleArrays() {
        val firstArray = doubleArrayOf(2.0, 3.0)
        val secondArray = doubleArrayOf(2.5, 3.0)

        firstArray shouldNotEqual secondArray
    }

    @Test
    fun failWhenTestingEqualDoubleArrays() {
        val firstArray = doubleArrayOf(2.0, 3.0)
        val secondArray = doubleArrayOf(2.0, 3.0)

        assertFails { firstArray shouldNotEqual secondArray }
    }

    @Test
    fun passWhenTestingUnequalFloatArrays() {
        val firstArray = floatArrayOf(1.0f, 1.5f)
        val secondArray = floatArrayOf(1.5f, 1.5f)

        firstArray shouldNotEqual secondArray
    }

    @Test
    fun failWhenTestingEqualFloatArrays() {
        val firstArray = floatArrayOf(1.0f, 1.5f)
        val secondArray = floatArrayOf(1.0f, 1.5f)

        assertFails { firstArray shouldNotEqual secondArray }
    }

    @Test
    fun passWhenTestingUnequalLongArrays() {
        val firstArray = longArrayOf(100, 200)
        val secondArray = longArrayOf(300, 200)

        firstArray shouldNotEqual secondArray
    }

    @Test
    fun failWhenTestingEqualLongArrays() {
        val firstArray = longArrayOf(100, 200)
        val secondArray = longArrayOf(100, 200)

        assertFails { firstArray shouldNotEqual secondArray }
    }

    @Test
    fun passWhenTestingUnequalShortArrays() {
        val firstArray = shortArrayOf(100, 200)
        val secondArray = shortArrayOf(300, 200)

        firstArray shouldNotEqual secondArray
    }

    @Test
    fun failWhenTestingEqualShortArrays() {
        val firstArray = shortArrayOf(100, 200)
        val secondArray = shortArrayOf(100, 200)

        assertFails { firstArray shouldNotEqual secondArray }
    }
}
