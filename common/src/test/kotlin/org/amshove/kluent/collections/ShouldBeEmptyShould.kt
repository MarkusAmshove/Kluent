package org.amshove.kluent.collections

import org.amshove.kluent.shouldBeEmpty
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldBeEmptyShould {
    @Test
    fun passWhenTestingAnEmptyArray() {
        val arr = arrayOf<String>()
        arr.shouldBeEmpty()
    }

    @Test
    fun passWhenTestingAnEmptyIterable() {
        val iterable: Iterable<String> = listOf()
        iterable.shouldBeEmpty()
    }

    @Test
    fun passWhenTestingAnEmptyMap() {
        val map = mapOf<Int, String>()
        map.shouldBeEmpty()
    }

    @Test
    fun failWhenTestingANonEmptyArray() {
        assertFails { arrayOf("Hi").shouldBeEmpty() }
    }

    @Test
    fun failWhenTestingANonEmptyIterable() {
        assertFails { listOf("Hi").shouldBeEmpty() }
    }

    @Test
    fun failWhenTestingANonEmptyMap() {
        assertFails { mapOf(1 to "Hi").shouldBeEmpty() }
    }

    @Test
    fun passWhenTestingAPrimitiveIntegerArrayWhichIsEmpty() {
        val theArray = intArrayOf()
        theArray.shouldBeEmpty()
    }

    @Test
    fun failWhenTestingAPrimitiveIntegerArrayWhichIsNotEmpty() {
        val theArray = intArrayOf(5, 7, 13)
        assertFails { theArray.shouldBeEmpty() }
    }

    @Test
    fun passWhenTestingAPrimitiveLongArrayWhichIsEmpty() {
        val theArray = longArrayOf()
        theArray.shouldBeEmpty()
    }

    @Test
    fun failWhenTestingAPrimitiveLongArrayWhichIsNotEmpty() {
        val theArray = longArrayOf(5, 7, 13)
        assertFails { theArray.shouldBeEmpty() }
    }

    @Test
    fun passWhenTestingAPrimitiveShortArrayWhichIsEmpty() {
        val theArray = shortArrayOf()
        theArray.shouldBeEmpty()
    }

    @Test
    fun failWhenTestingAPrimitiveShortArrayWhichIsNotEmpty() {
        val theArray = shortArrayOf(5, 7, 13)
        assertFails { theArray.shouldBeEmpty() }
    }

    @Test
    fun passWhenTestingAPrimitiveDoubleArrayWhichIsEmpty() {
        val theArray = doubleArrayOf()
        theArray.shouldBeEmpty()
    }

    @Test
    fun failWhenTestingAPrimitiveDoubleArrayWhichIsNotEmpty() {
        val theArray = doubleArrayOf(5.0, 7.0, 13.0)
        assertFails { theArray.shouldBeEmpty() }
    }

    @Test
    fun passWhenTestingAPrimitiveFloatArrayWhichIsEmpty() {
        val theArray = floatArrayOf()
        theArray.shouldBeEmpty()
    }

    @Test
    fun failWhenTestingAPrimitiveFloatArrayWhichIsNotEmpty() {
        val theArray = floatArrayOf(5.0f, 7.0f, 13.0f)
        assertFails { theArray.shouldBeEmpty() }
    }

    @Test
    fun passWhenTestingAPrimitiveByteArrayWhichIsEmpty() {
        val theArray = byteArrayOf()
        theArray.shouldBeEmpty()
    }

    @Test
    fun failWhenTestingAPrimitiveByteArrayWhichIsNotEmpty() {
        val theArray = byteArrayOf(5, 7, 13)
        assertFails { theArray.shouldBeEmpty() }
    }

    @Test
    fun passWhenTestingAPrimitiveCharArrayWhichIsEmpty() {
        val theArray = charArrayOf()
        theArray.shouldBeEmpty()
    }

    @Test
    fun failWhenTestingAPrimitiveCharArrayWhichIsNotEmpty() {
        val theArray = charArrayOf('a', 'b', 'c')
        assertFails { theArray.shouldBeEmpty() }
    }

    @Test
    fun passWhenTestingAPrimitiveBooleanArrayWhichIsEmpty() {
        val theArray = booleanArrayOf()
        theArray.shouldBeEmpty()
    }

    @Test
    fun failWhenTestingAPrimitiveBooleanArrayWhichIsNotEmpty() {
        val theArray = booleanArrayOf(true, false, true)
        assertFails { theArray.shouldBeEmpty() }
    }

}