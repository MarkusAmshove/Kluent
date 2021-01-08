package org.amshove.kluent.tests.collections

import org.amshove.kluent.internal.assertFails
import kotlin.test.Test
import org.amshove.kluent.tests.Person
import org.amshove.kluent.shouldBeIn
import org.amshove.kluent.shouldBeInIgnoringCase

class ShouldBeInShould {
    @Test
    fun passWhenTestingAnObjectWhichIsWithinAnArray() {
        val person = Person("Jon", "Doe")
        val array = arrayOf(Person("Jon", "Doe"), Person("Foo", "Bar"))
        person shouldBeIn array
    }

    @Test
    fun failWhenTestingAnObjectWhichIsNotWithinAnArray() {
        val person = Person("Jon", "Doe")
        val array = arrayOf(Person("Jane", "Doe"), Person("Foo", "Bar"))
        assertFails { person shouldBeIn array }
    }

    @Test
    fun passWhenTestingAnObjectWhichIsInAnIterable() {
        val person = Person("Jon", "Doe")
        val iterable = listOf(Person("Jon", "Doe"), Person("Foo", "Bar"))
        person shouldBeIn iterable
    }

    @Test
    fun failWhenTestingAnObjectWhichIsNotWithinAnIterable() {
        val person = Person("Jon", "Doe")
        val array = listOf(Person("Foo", "Bar"), Person("Foo", "Bar"))
        assertFails { person shouldBeIn array }
    }

    @Test
    fun passWhenTestingAPrimitiveIntegerWhichIsWithinAnArray() {
        val theArray = intArrayOf(1, 5, 7, 13)
        7 shouldBeIn theArray
    }

    @Test
    fun failWhenTestingAPrimitiveIntegerWhichIsNotWithinAnArray() {
        val theArray = intArrayOf(1, 5, 7, 13)
        assertFails { 4 shouldBeIn theArray }
    }

    @Test
    fun passWhenTestingAPrimitiveLongWhichIsWithinAnArray() {
        val theArray = longArrayOf(1, 5, 7, 13)
        7L shouldBeIn theArray
    }

    @Test
    fun failWhenTestingAPrimitiveLongWhichIsNotWithinAnArray() {
        val theArray = longArrayOf(1, 5, 7, 13)
        assertFails { 4L shouldBeIn theArray }
    }

    @Test
    fun passWhenTestingAPrimitiveShortWhichIsWithinAnArray() {
        val theArray = shortArrayOf(1, 5, 7, 13)
        7.toShort() shouldBeIn theArray
    }

    @Test
    fun failWhenTestingAPrimitiveShortWhichIsNotWithinAnArray() {
        val theArray = shortArrayOf(1, 5, 7, 13)
        assertFails { 4.toShort() shouldBeIn theArray }
    }

    @Test
    fun passWhenTestingAPrimitiveDoubleWhichIsWithinAnArray() {
        val theArray = doubleArrayOf(1.0, 5.0, 7.0, 13.0)
        (7.0) shouldBeIn theArray
    }

    @Test
    fun failWhenTestingAPrimitiveDoubleWhichIsNotWithinAnArray() {
        val theArray = doubleArrayOf(1.0, 5.0, 7.0, 13.0)
        assertFails { (4.0) shouldBeIn theArray }
    }

    @Test
    fun passWhenTestingAPrimitiveFloatWhichIsWithinAnArray() {
        val theArray = floatArrayOf(1.0f, 5.0f, 7.0f, 13.0f)
        (7.0f) shouldBeIn theArray
    }

    @Test
    fun failWhenTestingAPrimitiveFloatWhichIsNotWithinAnArray() {
        val theArray = floatArrayOf(1.0f, 5.0f, 7.0f, 13.0f)
        assertFails { (4.0f) shouldBeIn theArray }
    }

    @Test
    fun passWhenTestingAPrimitiveCharWhichIsWithinAnArray() {
        val theArray = charArrayOf('a', 'b', 'c')
        'b' shouldBeIn theArray
    }

    @Test
    fun passWhenTestingAPrimitiveCharWhichIsWithinAnArrayIgnoringCase() {
        val theArray = charArrayOf('a', 'b', 'c')
        'B' shouldBeInIgnoringCase theArray
    }

    @Test
    fun failWhenTestingAPrimitiveCharWhichIsNotWithinAnArray() {
        val theArray = charArrayOf('a', 'b', 'c')
        assertFails { 'd' shouldBeIn theArray }
    }

    @Test
    fun failWhenTestingAPrimitiveCharWhichIsNotWithinAnArrayIgnoringCase() {
        val theArray = charArrayOf('a', 'b', 'c')
        assertFails { 'd' shouldBeInIgnoringCase theArray }
    }

    @Test
    fun passWhenTestingAPrimitiveBooleanWhichIsWithinAnArray() {
        val theArray = booleanArrayOf(true, true)
        true shouldBeIn theArray
    }

    @Test
    fun failWhenTestingAPrimitiveBooleanWhichIsNotWithinAnArray() {
        val theArray = booleanArrayOf(true, true)
        assertFails { false shouldBeIn theArray }
    }

}