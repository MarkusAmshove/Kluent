package org.amshove.kluent.collections

import org.amshove.kluent.shouldContainSome
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldContainSomeShould {
    @Test
    fun passWhenTestingAListWhichContainsAtLeastOneElement() {
        val cities = listOf("Israel", "Berlin", "Phoenix", "Egypt")
        val actual = listOf("Berlin", "Stuttgart")

        actual shouldContainSome cities
    }

    @Test
    fun failWhenTestingAListWhichDoesNotContainAtLeastOneElement() {

        val cities = listOf("Israel", "Phoenix", "Egypt")
        val actual = listOf("Berlin", "Stuttgart")

        assertFails { actual shouldContainSome cities }
    }

    @Test
    fun passWhenTestingASequenceWhichContainsAtLeastOneElement() {
        val cities = sequenceOf("Israel", "Berlin", "Phoenix", "Egypt")
        val actual = sequenceOf("Berlin", "Stuttgart")

        actual shouldContainSome cities
    }

    @Test
    fun failWhenTestingASequenceWhichDoesNotContainAtLeastOneElement() {

        val cities = sequenceOf("Israel", "Phoenix", "Egypt")
        val actual = sequenceOf("Berlin", "Stuttgart")

        assertFails { actual shouldContainSome cities }
    }


    @Test
    fun passWhenTestingIfAListContainsASubsetOfAnArrayWhenItDoes() {

        val cities = arrayOf("Israel", "Phoenix", "Berlin", "Egypt")
        val actual = listOf("Berlin", "Stuttgart")

        actual.shouldContainSome(cities)
    }

    @Test
    fun passWhenTestingIfAnArrayContainsASubsetOfAnIterableWhenItDoes() {
        val cities = listOf("Berlin", "Stuttgart")
        val actual = arrayOf("Israel", "Phoenix", "Berlin", "Egypt")

        actual.shouldContainSome(cities)
    }

    @Test
    fun passWhenTestingAPrimitiveIntegerArrayContainsAtLeastOneElement() {
        val theArray = intArrayOf(1, 5, 7, 13)
        theArray shouldContainSome intArrayOf(7, 4)
        theArray shouldContainSome listOf(7, 4)
    }

    @Test
    fun failWhenTestingAPrimitiveIntegerArrayWhichDoesNotContainAtLeastOneElement() {
        val theArray = intArrayOf(1, 5, 7, 13)
        assertFails { theArray shouldContainSome intArrayOf(3) }
        assertFails { theArray shouldContainSome listOf(3) }
    }

    @Test
    fun passWhenTestingAPrimitiveLongArrayContainsAtLeastOneElement() {
        val theArray = longArrayOf(1, 5, 7, 13)
        theArray shouldContainSome longArrayOf(7L, 4L)
        theArray shouldContainSome listOf(7L, 4L)
    }

    @Test
    fun failWhenTestingAPrimitiveLongArrayWhichDoesNotContainAtLeastOneElement() {
        val theArray = longArrayOf(1, 5, 7, 13)
        assertFails { theArray shouldContainSome longArrayOf(3L) }
        assertFails { theArray shouldContainSome listOf(3L) }
    }

    @Test
    fun passWhenTestingAPrimitiveShortArrayContainsAtLeastOneElement() {
        val theArray = shortArrayOf(1, 5, 7, 13)
        theArray shouldContainSome shortArrayOf(7.toShort(), 4.toShort())
        theArray shouldContainSome listOf(7.toShort(), 4.toShort())
    }

    @Test
    fun failWhenTestingAPrimitiveShortArrayWhichDoesNotContainAtLeastOneElement() {
        val theArray = shortArrayOf(1, 5, 7, 13)
        assertFails { theArray shouldContainSome shortArrayOf(3.toShort()) }
        assertFails { theArray shouldContainSome listOf(3.toShort()) }
    }

    @Test
    fun passWhenTestingAPrimitiveByteArrayContainsAtLeastOneElement() {
        val theArray = byteArrayOf(1, 5, 7, 13)
        theArray shouldContainSome byteArrayOf(7, 4)
        theArray shouldContainSome listOf<Byte>(7, 4)
    }

    @Test
    fun failWhenTestingAPrimitiveByteArrayWhichDoesNotContainAtLeastOneElement() {
        val theArray = byteArrayOf(1, 5, 7, 13)
        assertFails { theArray shouldContainSome byteArrayOf(3) }
        assertFails { theArray shouldContainSome listOf<Byte>(3) }
    }

    @Test
    fun passWhenTestingAPrimitiveDoubleArrayContainsAtLeastOneElement() {
        val theArray = doubleArrayOf(1.0, 5.0, 7.0, 13.0)
        theArray shouldContainSome doubleArrayOf((7.0), 4.0)
        theArray shouldContainSome listOf((7.0), 4.0)
    }

    @Test
    fun failWhenTestingAPrimitiveDoubleArrayWhichDoesNotContainAtLeastOneElement() {
        val theArray = doubleArrayOf(1.0, 5.0, 7.0, 13.0)
        assertFails { theArray shouldContainSome doubleArrayOf(3.0) }
        assertFails { theArray shouldContainSome listOf(3.0) }
    }

    @Test
    fun passWhenTestingAPrimitiveFloatArrayContainsAtLeastOneElement() {
        val theArray = floatArrayOf(1.0f, 5.0f, 7.0f, 13.0f)
        theArray shouldContainSome floatArrayOf((7.0f), 4.0f)
        theArray shouldContainSome listOf((7.0f), 4.0f)
    }

    @Test
    fun failWhenTestingAPrimitiveFloatArrayWhichDoesNotContainAtLeastOneElement() {
        val theArray = floatArrayOf(1.0f, 5.0f, 7.0f, 13.0f)
        assertFails { theArray shouldContainSome floatArrayOf(4.0f) }
        assertFails { theArray shouldContainSome listOf(4.0f) }
    }

    @Test
    fun passWhenTestingAPrimitiveCharArrayContainsAtLeastOneElement() {
        val theArray = charArrayOf('a', 'b', 'c')
        theArray shouldContainSome charArrayOf('b', 'd')
        theArray shouldContainSome listOf('b', 'd')
    }

    @Test
    fun failWhenTestingAPrimitiveCharArrayWhichDoesNotContainAtLeastOneElement() {
        val theArray = charArrayOf('a', 'b', 'c')
        assertFails { theArray shouldContainSome charArrayOf('e') }
        assertFails { theArray shouldContainSome listOf('e') }
    }

    @Test
    fun passWhenTestingAPrimitiveBooleanArrayContainsAtLeastOneElement() {
        val theArray = booleanArrayOf(true, true)
        theArray shouldContainSome booleanArrayOf(true, false)
        theArray shouldContainSome listOf(true, false)
    }

    @Test
    fun failWhenTestingAPrimitiveBooleanArrayWhichDoesNotContainAtLeastOneElement() {
        val theArray = booleanArrayOf(true, true)
        assertFails { theArray shouldContainSome booleanArrayOf(false) }
        assertFails { theArray shouldContainSome listOf(false) }
    }

}
