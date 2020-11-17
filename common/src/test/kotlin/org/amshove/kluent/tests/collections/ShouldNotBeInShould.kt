package org.amshove.kluent.tests.collections

import kotlin.test.assertFails
import org.amshove.kluent.tests.Person
import org.amshove.kluent.shouldNotBeIn
import kotlin.test.Test

class ShouldNotBeInShould {
    @Test
    fun passWhenTestingAnObjectWhichIsNotInAnArray() {
        val person = Person("Jon", "Doe")
        val array = arrayOf(Person("Foo", "Bar"), Person("Foo", "Bar"))
        person shouldNotBeIn array
    }

    @Test
    fun failWhenTestingAnObjectWhichIsInAnArray() {
        val person = Person("Jon", "Doe")
        val array = arrayOf(Person("Jon", "Doe"), Person("Foo", "Bar"))
        assertFails { person shouldNotBeIn array }
    }

    @Test
    fun passWhenTestingAnObjectWhichIsNotInAnIterable() {
        val person = Person("Jon", "Doe")
        val iterable = listOf(Person("Foo", "Bar"), Person("Foo", "Bar"))
        person shouldNotBeIn iterable
    }

    @Test
    fun failWhenTestingAnObjectWhichIsInAnIterable() {
        val person = Person("Jon", "Doe")
        val array = listOf(Person("Jon", "Doe"), Person("Foo", "Bar"))
        assertFails { person shouldNotBeIn array }
    }

    @Test
    fun passWhenTestingAPrimitiveIntegerWhichIsNotWithinAnArray() {
        val theArray = intArrayOf(1, 5, 7, 13)
        4 shouldNotBeIn theArray
    }

    @Test
    fun failWhenTestingAPrimitiveIntegerWhichIsWithinAnArray() {
        val theArray = intArrayOf(1, 5, 7, 13)
        assertFails { 7 shouldNotBeIn theArray }
    }

    @Test
    fun passWhenTestingAPrimitiveLongWhichIsNotWithinAnArray() {
        val theArray = longArrayOf(1, 5, 7, 13)
        4L shouldNotBeIn theArray
    }

    @Test
    fun failWhenTestingAPrimitiveLongWhichIsWithinAnArray() {
        val theArray = longArrayOf(1, 5, 7, 13)
        assertFails { 7L shouldNotBeIn theArray }
    }

    @Test
    fun passWhenTestingAPrimitiveShortWhichIsNotWithinAnArray() {
        val theArray = shortArrayOf(1, 5, 7, 13)
        4.toShort() shouldNotBeIn theArray
    }

    @Test
    fun failWhenTestingAPrimitiveShortWhichIsWithinAnArray() {
        val theArray = shortArrayOf(1, 5, 7, 13)
        assertFails { 7.toShort() shouldNotBeIn theArray }
    }

    @Test
    fun passWhenTestingAPrimitiveDoubleWhichIsNotWithinAnArray() {
        val theArray = doubleArrayOf(1.0, 5.0, 7.0, 13.0)
        (4.0) shouldNotBeIn theArray
    }

    @Test
    fun failWhenTestingAPrimitiveDoubleWhichIsWithinAnArray() {
        val theArray = doubleArrayOf(1.0, 5.0, 7.0, 13.0)
        assertFails { (7.0) shouldNotBeIn theArray }
    }

    @Test
    fun passWhenTestingAPrimitiveFloatWhichIsNotWithinAnArray() {
        val theArray = floatArrayOf(1.0f, 5.0f, 7.0f, 13.0f)
        (4.0f) shouldNotBeIn theArray
    }

    @Test
    fun failWhenTestingAPrimitiveFloatWhichIsWithinAnArray() {
        val theArray = floatArrayOf(1.0f, 5.0f, 7.0f, 13.0f)
        assertFails { (7.0f) shouldNotBeIn theArray }
    }

    @Test
    fun passWhenTestingAPrimitiveCharWhichIsNotWithinAnArray() {
        val theArray = charArrayOf('a', 'b', 'c')
        'd' shouldNotBeIn theArray
    }

    @Test
    fun failWhenTestingAPrimitiveCharWhichIsWithinAnArray() {
        val theArray = charArrayOf('a', 'b', 'c')
        assertFails { 'b' shouldNotBeIn theArray }
    }

    @Test
    fun passWhenTestingAPrimitiveBooleanWhichIsNotWithinAnArray() {
        val theArray = booleanArrayOf(true, true)
        false shouldNotBeIn theArray
    }

    @Test
    fun failWhenTestingAPrimitiveBooleanWhichIsWithinAnArray() {
        val theArray = booleanArrayOf(true, true)
        assertFails { true shouldNotBeIn theArray }
    }

}