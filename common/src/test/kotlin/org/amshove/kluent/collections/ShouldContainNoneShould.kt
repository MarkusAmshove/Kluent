package org.amshove.kluent.collections

import org.amshove.kluent.Person
import org.amshove.kluent.shouldContainNone
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldContainNoneShould {
    @Test
    fun passWhenTestingAnArrayWhichDoesNotContainAtLeastOneElement() {
        val anArray = arrayOf("Israel", "Phoenix", "Egypt")

        anArray shouldContainNone listOf("Berlin", "Stuttart")
    }

    @Test
    fun failWhenTestingAnArrayWhichContainsAtLeastOneElement() {
        val anArray = arrayOf("Israel", "Phoenix", "Egypt")

        assertFails { anArray shouldContainNone listOf("Berlin", "Egypt") }
    }

    @Test
    fun passWhenTestingAListWhichDoesNotContainAtLeastOneElement() {
        val cities = listOf("Israel", "Phoenix", "Egypt")
        val actual = listOf("Berlin", "Stuttgart")

        actual shouldContainNone cities
    }

    @Test
    fun failWhenTestingAListWhichContainsAtLeastOneElement() {
        val cities = listOf("Israel", "Phoenix", "Stuttgart", "Egypt")
        val actual = listOf("Berlin", "Stuttgart")

        assertFails { actual shouldContainNone cities }
    }

    @Test
    fun passWhenTestingAPrimitiveIntegerArrayWhichDoesNotContainAtLeastOneElement() {
        val theArray = intArrayOf(1, 5, 7, 13)
        theArray shouldContainNone intArrayOf(4, 3)
    }

    @Test
    fun failWhenTestingAPrimitiveIntegerArrayWhichContainsAtLeastOneElement() {
        val theArray = intArrayOf(1, 5, 7, 13)
        assertFails { theArray shouldContainNone intArrayOf(7) }
    }

    @Test
    fun passWhenTestingAPrimitiveLongArrayWhichDoesNotContainAtLeastOneElement() {
        val theArray = longArrayOf(1, 5, 7, 13)
        theArray shouldContainNone longArrayOf(4L, 3L)
    }

    @Test
    fun failWhenTestingAPrimitiveLongArrayWhichContainsAtLeastOneElement() {
        val theArray = longArrayOf(1, 5, 7, 13)
        assertFails { theArray shouldContainNone longArrayOf(7L) }
    }

    @Test
    fun passWhenTestingAPrimitiveShortArrayWhichDoesNotContainAtLeastOneElement() {
        val theArray = shortArrayOf(1, 5, 7, 13)
        theArray shouldContainNone shortArrayOf(4.toShort(), 3.toShort())
    }

    @Test
    fun failWhenTestingAPrimitiveShortArrayWhichContainsAtLeastOneElement() {
        val theArray = shortArrayOf(1, 5, 7, 13)
        assertFails { theArray shouldContainNone shortArrayOf(7.toShort()) }
    }

    @Test
    fun passWhenTestingAPrimitiveDoubleArrayWhichDoesNotContainAtLeastOneElement() {
        val theArray = doubleArrayOf(1.0, 5.0, 7.0, 13.0)
        theArray shouldContainNone doubleArrayOf(4.0, 3.0)
    }

    @Test
    fun failWhenTestingAPrimitiveDoubleArrayWhichContainsAtLeastOneElement() {
        val theArray = doubleArrayOf(1.0, 5.0, 7.0, 13.0)
        assertFails { theArray shouldContainNone doubleArrayOf((7.0)) }
    }

    @Test
    fun passWhenTestingAPrimitiveFloatArrayWhichDoesNotContainAtLeastOneElement() {
        val theArray = floatArrayOf(1.0f, 5.0f, 7.0f, 13.0f)
        theArray shouldContainNone floatArrayOf(4.0f, 4.0f)
    }

    @Test
    fun failWhenTestingAPrimitiveFloatArrayWhichContainsAtLeastOneElement() {
        val theArray = floatArrayOf(1.0f, 5.0f, 7.0f, 13.0f)
        assertFails { theArray shouldContainNone floatArrayOf((7.0f)) }
    }

    @Test
    fun passWhenTestingAPrimitiveCharArrayWhichDoesNotContainAtLeastOneElement() {
        val theArray = charArrayOf('a', 'b', 'c')
        theArray shouldContainNone charArrayOf('d', 'e')
    }

    @Test
    fun failWhenTestingAPrimitiveCharArrayWhichContainsAtLeastOneElement() {
        val theArray = charArrayOf('a', 'b', 'c')
        assertFails { theArray shouldContainNone charArrayOf('b') }
    }

    @Test
    fun passWhenTestingAPrimitiveBooleanArrayWhichDoesNotContainAtLeastOneElement() {
        val theArray = booleanArrayOf(true, true)
        theArray shouldContainNone booleanArrayOf(false)
    }

    @Test
    fun failWhenTestingAPrimitiveBooleanArrayWhichContainsAtLeastOneElement() {
        val theArray = booleanArrayOf(true, true)
        assertFails { theArray shouldContainNone booleanArrayOf(true) }
    }

}
