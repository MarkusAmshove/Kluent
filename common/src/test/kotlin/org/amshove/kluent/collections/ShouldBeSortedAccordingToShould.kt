package org.amshove.kluent.collections

import org.amshove.kluent.shouldBeSortedAccordingTo
import kotlin.random.Random
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeSortedAccordingToShould {
    private val intComparator = Comparator { a: Int, b: Int -> a.compareTo(b) }

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
}
