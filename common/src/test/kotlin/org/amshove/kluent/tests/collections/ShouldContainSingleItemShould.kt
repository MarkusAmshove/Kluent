package org.amshove.kluent.tests.collections

import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldHaveSingleItem
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFails

class ShouldContainSingleItemShould {
    @Test
    fun notThrowWhenACollectionHasOneItem() {
        val collection = listOf(1)
        collection.shouldHaveSingleItem()
    }

    @Test
    fun failWhenACollectionIsEmpty() {
        val collection = listOf<Int>()
        assertFails {
            collection.shouldHaveSingleItem()
        }
    }

    @Test
    fun failWhenACollectionHasMoreThanOneItem() {
        val collection = listOf(1, 2, 3, 4, 5)
        assertFails {
            collection.shouldHaveSingleItem()
        }
    }

    @Test
    fun returnTheItemInsideTheCollection() {
        val collection = listOf("Hello")
        val item = collection.shouldHaveSingleItem()
        assertEquals("Hello", item)
    }

    @Test
    fun notThrowWhenASequenceHasOneItem() {
        val sequence = sequenceOf(1)
        sequence.shouldHaveSingleItem()
    }

    @Test
    fun failWhenASequenceIsEmpty() {
        val sequence = emptySequence<Int>()
        assertFails {
            sequence.shouldHaveSingleItem()
        }
    }

    @Test
    fun failWhenASequenceHasMoreThanOneItem() {
        val sequence = sequenceOf(1, 2, 3, 4, 5)
        assertFails {
            sequence.shouldHaveSingleItem()
        }
    }

    @Test
    fun returnTheItemInsideTheSequence() {
        val sequence = sequenceOf("Hello")
        val item = sequence.shouldHaveSingleItem()
        assertEquals("Hello", item)
    }

    @Test
    fun workWithArrays() {
        val arr = arrayOf("World")
        arr.shouldHaveSingleItem().shouldBeEqualTo("World")
    }

    @Test
    fun workWithPrimitiveArrays() {
        val arr = shortArrayOf(5)
        arr.shouldHaveSingleItem().shouldBeEqualTo(5)
    }
}
