package org.amshove.kluent.tests.collections

import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldNotBeEmpty
import kotlin.test.Test

class ShouldNotBeEmptyShould {
    @Test
    fun passWhenTestingANonEmptyArray() {
        val arr = arrayOf("Hi")
        arr.shouldNotBeEmpty()
    }

    @Test
    fun passWhenTestingANonEmptyIterable() {
        val iterable = listOf("Hi")
        iterable.shouldNotBeEmpty()
    }

    @Test
    fun passWhenTestingANonEmptySequence() {
        val sequence = sequenceOf("Hi")
        sequence.shouldNotBeEmpty()
    }

    @Test
    fun passWhenTestingANonEmptyMap() {
        val map = mapOf(1 to "Hi")
        map.shouldNotBeEmpty()
    }

    @Test
    fun failWhenTestingAnEmptyArray() {
        val arr = arrayOf<String>()
        assertFails { arr.shouldNotBeEmpty() }
    }

    @Test
    fun failWhenTestingAnEmptyIterable() {
        val iterable: Iterable<String> = listOf()
        assertFails { iterable.shouldNotBeEmpty() }
    }

    @Test
    fun failWhenTestingAnEmptySequence() {
        val sequence: Sequence<String> = emptySequence()
        assertFails { sequence.shouldNotBeEmpty() }
    }

    @Test
    fun failWhenTestingAnEmptyMap() {
        val map = mapOf<Int, String>()
        assertFails { map.shouldNotBeEmpty() }
    }

    @Test
    fun passWhenTestingAPrimitiveIntegerArrayWhichIsNotEmpty() {
        val theArray = intArrayOf(5, 7, 13)
        theArray.shouldNotBeEmpty()
    }

    @Test
    fun failWhenTestingAPrimitiveIntegerArrayWhichIsEmpty() {
        val theArray = intArrayOf()
        assertFails { theArray.shouldNotBeEmpty() }
    }

    @Test
    fun passWhenTestingAPrimitiveLongArrayWhichIsNotEmpty() {
        val theArray = longArrayOf(5, 7, 13)
        theArray.shouldNotBeEmpty()
    }

    @Test
    fun failWhenTestingAPrimitiveLongArrayWhichIsEmpty() {
        val theArray = longArrayOf()
        assertFails { theArray.shouldNotBeEmpty() }
    }

    @Test
    fun passWhenTestingAPrimitiveShortArrayWhichIsNotEmpty() {
        val theArray = shortArrayOf(5, 7, 13)
        theArray.shouldNotBeEmpty()
    }

    @Test
    fun failWhenTestingAPrimitiveShortArrayWhichIsEmpty() {
        val theArray = shortArrayOf()
        assertFails { theArray.shouldNotBeEmpty() }
    }

    @Test
    fun passWhenTestingAPrimitiveDoubleArrayWhichIsNotEmpty() {
        val theArray = doubleArrayOf(5.0, 7.0, 13.0)
        theArray.shouldNotBeEmpty()
    }

    @Test
    fun failWhenTestingAPrimitiveDoubleArrayWhichIsEmpty() {
        val theArray = doubleArrayOf()
        assertFails { theArray.shouldNotBeEmpty() }
    }

    @Test
    fun passWhenTestingAPrimitiveFloatArrayWhichIsNotEmpty() {
        val theArray = floatArrayOf(5.0f, 7.0f, 13.0f)
        theArray.shouldNotBeEmpty()
    }

    @Test
    fun failWhenTestingAPrimitiveFloatArrayWhichIsEmpty() {
        val theArray = floatArrayOf()
        assertFails { theArray.shouldNotBeEmpty() }
    }

    @Test
    fun passWhenTestingAPrimitiveByteArrayWhichIsNotEmpty() {
        val theArray = byteArrayOf(5, 7, 13)
        theArray.shouldNotBeEmpty()
    }

    @Test
    fun failWhenTestingAPrimitiveByteArrayWhichIsEmpty() {
        val theArray = byteArrayOf()
        assertFails { theArray.shouldNotBeEmpty() }
    }

    @Test
    fun passWhenTestingAPrimitiveCharArrayWhichIsNotEmpty() {
        val theArray = charArrayOf('a', 'b', 'c')
        theArray.shouldNotBeEmpty()
    }

    @Test
    fun failWhenTestingAPrimitiveCharArrayWhichIsEmpty() {
        val theArray = charArrayOf()
        assertFails { theArray.shouldNotBeEmpty() }
    }
    @Test
    fun passWhenTestingAPrimitiveBooleanArrayWhichIsNotEmpty() {
        val theArray = booleanArrayOf(true, false, true)
        theArray.shouldNotBeEmpty()
    }

    @Test
    fun failWhenTestingAPrimitiveBooleanArrayWhichIsEmpty() {
        val theArray = booleanArrayOf()
        assertFails { theArray.shouldNotBeEmpty() }
    }

}