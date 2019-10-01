package org.amshove.kluent.collections

import org.amshove.kluent.shouldEqual
import org.amshove.kluent.Person
import kotlin.test.assertFails
import kotlin.test.Test

class ShouldEqualShould {

    @Test
    fun passWhenTestingEqualArrays() {
        val firstArray = arrayOf(1, 2, 3)
        val secondArray = arrayOf(1, 2, 3)
        firstArray shouldEqual secondArray
    }

    @Test
    fun failWhenTestingUnequalArrays() {
        val firstArray = arrayOf(1, 2, 3)
        val secondArray = arrayOf(1, 5, 3)
        assertFails { firstArray shouldEqual secondArray }
    }

    @Test
    fun passWhenTestingEqualIterable() {
        val firstIterable = listOf(Person("Tom", "Guy"), Person("Alice", "Bob"), Person("Jon", "Doe"))
        val secondIterable = listOf(Person("Tom", "Guy"), Person("Alice", "Bob"), Person("Jon", "Doe"))
        firstIterable shouldEqual secondIterable
    }

    @Test
    fun failWhenTestingDifferentIterable() {
        val firstIterable = listOf(Person("Tom", "Guy"), Person("Jon", "Doe"), Person("Peter", "Meyer"))
        val secondIterable = listOf(Person("Tom", "Guy"), Person("Alice", "Bob"), Person("Jon", "Doe"))
        assertFails { firstIterable shouldEqual secondIterable }
    }

    @Test
    fun passWhenTestingEqualSequence() {
        val firstSequence = sequenceOf(Person("Tom", "Guy"), Person("Alice", "Bob"), Person("Jon", "Doe"))
        val secondSequence = sequenceOf(Person("Tom", "Guy"), Person("Alice", "Bob"), Person("Jon", "Doe"))
        firstSequence shouldEqual secondSequence
    }

    @Test
    fun failWhenTestingDifferentSequence() {
        val firstSequence = sequenceOf(Person("Tom", "Guy"), Person("Jon", "Doe"), Person("Peter", "Meyer"))
        val secondSequence = sequenceOf(Person("Tom", "Guy"), Person("Alice", "Bob"), Person("Jon", "Doe"))
        assertFails { firstSequence shouldEqual secondSequence }
    }

    @Test
    fun failWhenTestingSequenceOfDifferentSize() {
        val firstSequence = sequenceOf(Person("Tom", "Guy"), Person("Alice", "Bob"), Person("Jon", "Doe"))
        val secondSequence = sequenceOf(Person("Tom", "Guy"), Person("Alice", "Bob"))
        assertFails { firstSequence shouldEqual secondSequence }
        assertFails { secondSequence shouldEqual firstSequence }
    }

    @Test
    fun passWhenTestingEqualMaps() {
        val firstMap = mapOf(1 to Person("A", "B"), 2 to Person("C", "D"))
        val secondMap = mapOf(1 to Person("A", "B"), 2 to Person("C", "D"))

        firstMap shouldEqual secondMap
    }

    @Test
    fun failWhenTestingDifferentMaps() {
        val firstMap = mapOf(1 to Person("A", "B"), 2 to Person("C", "D"))
        val secondMap = mapOf(1 to Person("A", "C"), 2 to Person("D", "C"))

        assertFails { firstMap shouldEqual secondMap }
    }

    @Test
    fun passWhenTestingEqualIntArrays() {
        val firstArray = intArrayOf(1, 2, 3)
        val secondArray = intArrayOf(1, 2, 3)
        firstArray shouldEqual secondArray
    }

    @Test
    fun failWhenTestingUnequalIntArrays() {
        val firstArray = intArrayOf(1, 2, 3)
        val secondArray = intArrayOf(4, 5, 6)
        assertFails { firstArray shouldEqual secondArray }
    }

    @Test
    fun passWhenTestingEqualBooleanArrays() {
        val firstArray = booleanArrayOf(true, false)
        val secondArray = booleanArrayOf(true, false)

        firstArray shouldEqual secondArray
    }

    @Test
    fun failWhenTestingUnequalBooleanArrays() {
        val firstArray = booleanArrayOf(true, false)
        val secondArray = booleanArrayOf(false, true)

        assertFails { firstArray shouldEqual secondArray }
    }

    @Test
    fun passWhenTestingEqualByteArrays() {
        val firstArray = byteArrayOf(1, 2, 3)
        val secondArray = byteArrayOf(1, 2, 3)

        firstArray shouldEqual secondArray
    }

    @Test
    fun failWhenTestingUnequalByteArrays() {
        val firstArray = byteArrayOf(1, 2, 3)
        val secondArray = byteArrayOf(1, 3, 2)

        assertFails { firstArray shouldEqual secondArray }
    }

    @Test
    fun passWhenTestingEqualCharArrays() {
        val firstArray = charArrayOf('a')
        val secondArray = charArrayOf('a')

        firstArray shouldEqual secondArray
    }

    @Test
    fun failWhenTestingUnequalCharArrays() {
        val firstArray = charArrayOf('a', 'b')
        val secondArray = charArrayOf('c', 'a')

        assertFails { firstArray shouldEqual secondArray }
    }

    @Test
    fun passWhenTestingEqualDoubleArrays() {
        val firstArray = doubleArrayOf(2.0, 3.0)
        val secondArray = doubleArrayOf(2.0, 3.0)

        firstArray shouldEqual secondArray
    }

    @Test
    fun failWhenTestingUnequalDoubleArrays() {
        val firstArray = doubleArrayOf(2.0, 3.0)
        val secondArray = doubleArrayOf(2.5, 3.0)

        assertFails { firstArray shouldEqual secondArray }
    }

    @Test
    fun passWhenTestingEqualFloatArrays() {
        val firstArray = floatArrayOf(1.0f, 1.5f)
        val secondArray = floatArrayOf(1.0f, 1.5f)

        firstArray shouldEqual secondArray
    }

    @Test
    fun failWhenTestingUnequalFloatArrays() {
        val firstArray = floatArrayOf(1.0f, 1.5f)
        val secondArray = floatArrayOf(1.5f, 1.5f)

        assertFails { firstArray shouldEqual secondArray }
    }

    @Test
    fun passWhenTestingEqualLongArrays() {
        val firstArray = longArrayOf(100, 200)
        val secondArray = longArrayOf(100, 200)

        firstArray shouldEqual secondArray
    }

    @Test
    fun failWhenTestingUnequalLongArrays() {
        val firstArray = longArrayOf(100, 200)
        val secondArray = longArrayOf(300, 200)

        assertFails { firstArray shouldEqual secondArray }
    }

    @Test
    fun passWhenTestingEqualShortArrays() {
        val firstArray = shortArrayOf(100, 200)
        val secondArray = shortArrayOf(100, 200)

        firstArray shouldEqual secondArray
    }

    @Test
    fun failWhenTestingUnequalShortArrays() {
        val firstArray = shortArrayOf(100, 200)
        val secondArray = shortArrayOf(300, 200)

        assertFails { firstArray shouldEqual secondArray }
    }
}
