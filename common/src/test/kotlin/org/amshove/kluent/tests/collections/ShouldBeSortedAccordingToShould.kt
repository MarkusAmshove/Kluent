package org.amshove.kluent.tests.collections

import org.amshove.kluent.tests.Person
import org.amshove.kluent.shouldBeSortedAccordingTo
import kotlin.random.Random
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeSortedAccordingToShould {
    private val intComparator = Comparator { a: Int, b: Int -> a.compareTo(b) }
    private val booleanComparator = Comparator { a: Boolean, b: Boolean -> a.compareTo(b) }
    private val byteComparator = Comparator { a: Byte, b: Byte -> a.compareTo(b) }
    private val charComparator = Comparator { a: Char, b: Char -> a.compareTo(b) }
    private val doubleComparator = Comparator { a: Double, b: Double -> a.compareTo(b) }
    private val floatComparator = Comparator { a: Float, b: Float -> a.compareTo(b) }
    private val longComparator = Comparator { a: Long, b: Long -> a.compareTo(b) }
    private val shortComparator = Comparator { a: Short, b: Short -> a.compareTo(b) }
    private val personComparator = Comparator { a: Person, b: Person -> a.name.compareTo(b.name) }

    @Test
    fun passWhenTestingEmptyArray() {
        val array = emptyArray<Int>()
        array shouldBeSortedAccordingTo intComparator
    }

    @Test
    fun passWhenTestingSingleItemArray() {
        val array = arrayOf(Random.nextInt())
        array shouldBeSortedAccordingTo intComparator
    }

    @Test
    fun passWhenTestingSortedArray() {
        val array = arrayOf(1, 2, 3)
        array shouldBeSortedAccordingTo intComparator
    }

    @Test
    fun failWhenTestingUnsortedArray() {
        val array = arrayOf(1, 5, 3)
        assertFails { array shouldBeSortedAccordingTo intComparator }
    }

    @Test
    fun passWhenTestingEmptyIntArray() {
        val array = intArrayOf()
        array shouldBeSortedAccordingTo intComparator
    }

    @Test
    fun passWhenTestingSingleItemIntArray() {
        val array = intArrayOf(Random.nextInt())
        array shouldBeSortedAccordingTo intComparator
    }

    @Test
    fun passWhenTestingSortedIntArray() {
        val array = intArrayOf(1, 2, 3)
        array shouldBeSortedAccordingTo intComparator
    }

    @Test
    fun failWhenTestingUnsortedIntArray() {
        val array = intArrayOf(1, 5, 3)
        assertFails { array shouldBeSortedAccordingTo intComparator }
    }

    @Test
    fun passWhenTestingEmptyBooleanArray() {
        val array = booleanArrayOf()
        array shouldBeSortedAccordingTo booleanComparator
    }

    @Test
    fun passWhenTestingSingleItemBooleanArray() {
        val array = booleanArrayOf(Random.nextBoolean())
        array shouldBeSortedAccordingTo booleanComparator
    }

    @Test
    fun passWhenTestingSortedBooleanArray() {
        val array = booleanArrayOf(false, false, true, true)
        array shouldBeSortedAccordingTo booleanComparator
    }

    @Test
    fun failWhenTestingUnsortedBooleanArray() {
        val array = booleanArrayOf(true, false, false)
        assertFails { array shouldBeSortedAccordingTo booleanComparator }
    }

    @Test
    fun passWhenTestingEmptyByteArray() {
        val array = byteArrayOf()
        array shouldBeSortedAccordingTo byteComparator
    }

    @Test
    fun passWhenTestingSingleItemByteArray() {
        val array = Random.nextBytes(1)
        array shouldBeSortedAccordingTo byteComparator
    }

    @Test
    fun passWhenTestingSortedByteArray() {
        val array = byteArrayOf(1, 2, 3)
        array shouldBeSortedAccordingTo byteComparator
    }

    @Test
    fun failWhenTestingUnsortedByteArray() {
        val array = byteArrayOf(1, 5, 3)
        assertFails { array shouldBeSortedAccordingTo byteComparator }
    }

    @Test
    fun passWhenTestingEmptyCharArray() {
        val array = charArrayOf()
        array shouldBeSortedAccordingTo charComparator
    }

    @Test
    fun passWhenTestingSingleItemCharArray() {
        val array = charArrayOf(Random.nextInt().toChar())
        array shouldBeSortedAccordingTo charComparator
    }

    @Test
    fun passWhenTestingSortedCharArray() {
        val array = charArrayOf('a', 'b', 'c')
        array shouldBeSortedAccordingTo charComparator
    }

    @Test
    fun failWhenTestingUnsortedCharArray() {
        val array = charArrayOf('a', 'o', 'b', 'c')
        assertFails { array shouldBeSortedAccordingTo charComparator }
    }

    @Test
    fun passWhenTestingEmptyDoubleArray() {
        val array = doubleArrayOf()
        array shouldBeSortedAccordingTo doubleComparator
    }

    @Test
    fun passWhenTestingSingleItemDoubleArray() {
        val array = doubleArrayOf(Random.nextDouble())
        array shouldBeSortedAccordingTo doubleComparator
    }

    @Test
    fun passWhenTestingSortedDoubleArray() {
        val array = doubleArrayOf(1.0, 2.0, 3.0)
        array shouldBeSortedAccordingTo doubleComparator
    }

    @Test
    fun failWhenTestingUnsortedDoubleArray() {
        val array = doubleArrayOf(1.0, 5.0, 3.0)
        assertFails { array shouldBeSortedAccordingTo doubleComparator }
    }

    @Test
    fun passWhenTestingEmptyFloatArray() {
        val array = floatArrayOf()
        array shouldBeSortedAccordingTo floatComparator
    }

    @Test
    fun passWhenTestingSingleItemFloatArray() {
        val array = floatArrayOf(Random.nextFloat())
        array shouldBeSortedAccordingTo floatComparator
    }

    @Test
    fun passWhenTestingSortedFloatArray() {
        val array = floatArrayOf(1f, 2f, 3f)
        array shouldBeSortedAccordingTo floatComparator
    }

    @Test
    fun failWhenTestingUnsortedFloatArray() {
        val array = floatArrayOf(1f, 5f, 3f)
        assertFails { array shouldBeSortedAccordingTo floatComparator }
    }

    @Test
    fun passWhenTestingEmptyLongArray() {
        val array = longArrayOf()
        array shouldBeSortedAccordingTo longComparator
    }

    @Test
    fun passWhenTestingSingleItemLongArray() {
        val array = longArrayOf(Random.nextLong())
        array shouldBeSortedAccordingTo longComparator
    }

    @Test
    fun passWhenTestingSortedLongArray() {
        val array = longArrayOf(1, 2, 3)
        array shouldBeSortedAccordingTo longComparator
    }

    @Test
    fun failWhenTestingUnsortedLongArray() {
        val array = longArrayOf(1, 5, 3)
        assertFails { array shouldBeSortedAccordingTo longComparator }
    }

    @Test
    fun passWhenTestingEmptyShortArray() {
        val array = shortArrayOf()
        array shouldBeSortedAccordingTo shortComparator
    }

    @Test
    fun passWhenTestingSingleItemShortArray() {
        val array = shortArrayOf(Random.nextInt().toShort())
        array shouldBeSortedAccordingTo shortComparator
    }

    @Test
    fun passWhenTestingSortedShortArray() {
        val array = shortArrayOf(1, 2, 3)
        array shouldBeSortedAccordingTo shortComparator
    }

    @Test
    fun failWhenTestingUnsortedShortArray() {
        val array = shortArrayOf(1, 5, 3)
        assertFails { array shouldBeSortedAccordingTo shortComparator }
    }

    @Test
    fun passWhenTestingEmptyIterable() {
        val iterable = emptyList<Person>()
        iterable shouldBeSortedAccordingTo personComparator
    }

    @Test
    fun passWhenTestingSingleItemIterable() {
        val iterable = listOf(Person("Alice", "Bob"))
        iterable shouldBeSortedAccordingTo personComparator
    }

    @Test
    fun passWhenTestingSortedIterable() {
        val iterable = listOf(Person("Alice", "Bob"), Person("Jon", "Doe"), Person("Tom", "Guy"))
        iterable shouldBeSortedAccordingTo personComparator
    }

    @Test
    fun failWhenTestingUnsrotedIterable() {
        val iterable = listOf(Person("Jon", "Doe"), Person("Tom", "Guy"), Person("Peter", "Meyer"))
        assertFails { iterable shouldBeSortedAccordingTo personComparator }
    }
}
