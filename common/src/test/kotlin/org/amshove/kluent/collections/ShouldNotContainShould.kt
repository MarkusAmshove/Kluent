package org.amshove.kluent.collections

import org.amshove.kluent.shouldNotContain
import org.amshove.kluent.Person
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotContainShould {
    @Test
    fun passWhenTestingAnArrayWhichDoesNotContainTheValue() {
        val array = arrayOf("Hello", "Wide", "Web")
        array shouldNotContain "World"
    }

    @Test
    fun failWhenTestingAnArrayWhichContainsTheValue() {
        val array = arrayOf("Hello", "World", "Wide", "Web")
        assertFails { array shouldNotContain "Wide" }
    }

    @Test
    fun passWhenTestingAnIterableWhichDoesNotContainTheValue() {
        val alice = Person("Alice", "Bob")
        val jon = Person("Jon", "Doe")
        val list = listOf(alice)
        list shouldNotContain jon
    }

    @Test
    fun failWhenTestingAnIterableWhichContainsTheValue() {
        val alice = Person("Alice", "Bob")
        val jon = Person("Jon", "Doe")
        val list = listOf(alice, jon)
        assertFails { list shouldNotContain jon }
    }

    @Test
    fun passWhenTestingAMapWhichDoesNotContainAPair() {
        val map = mapOf(1 to "one", 2 to "two")
        map shouldNotContain (1 to "three")
    }

    @Test
    fun failWhenTestingAMapWhichContainsAPair() {
        val map = mapOf(1 to "one", 2 to "two")
        assertFails { map shouldNotContain (1 to "one") }
    }

    @Test
    fun passWhenTestingAMapWhichDoesNotContainAPairOfObjects() {
        val alice = Person("Alice", "Bob")
        val jon = Person("Jon", "Doe")
        val bob = Person("Bob", "Blue")
        val map = mapOf(alice to jon)
        map shouldNotContain (alice to bob)
    }

    @Test
    fun failWhenTestingAMapWhichContainsAPairOfObjects() {
        val alice = Person("Alice", "Bob")
        val jon = Person("Jon", "Doe")
        val map = mapOf(alice to jon, jon to alice)
        assertFails { map shouldNotContain (alice to jon) }
    }

    @Test
    fun passWhenTestingAPrimitiveIntegerArrayWhichDoesNotContainTheValue() {
        val theArray = intArrayOf(1, 5, 10)
        theArray.shouldNotContain(7)
    }

    @Test
    fun failWhenTestingAPrimitiveIntegerArrayContainingTheValue() {
        val theArray = intArrayOf(1, 5, 10)
        assertFails { theArray.shouldNotContain(5) }
    }

    @Test
    fun passWhenTestingAPrimitiveLongArrayWhichDoesNotContainTheValue() {
        val theArray = longArrayOf(1, 5, 10)
        theArray.shouldNotContain(7)
    }

    @Test
    fun failWhenTestingAPrimitiveLongArrayContainingTheValue() {
        val theArray = longArrayOf(1, 5, 10)
        assertFails { theArray.shouldNotContain(5) }
    }

    @Test
    fun passWhenTestingAPrimitiveShortArrayWhichDoesNotContainTheValue() {
        val theArray = shortArrayOf(1, 5, 10)
        theArray.shouldNotContain(7)
    }

    @Test
    fun failWhenTestingAPrimitiveShortArrayContainingTheValue() {
        val theArray = shortArrayOf(1, 5, 10)
        assertFails { theArray.shouldNotContain(5) }
    }

    @Test
    fun passWhenTestingAPrimitiveDoubleArrayWhichDoesNotContainTheValue() {
        val theArray = doubleArrayOf(1.0, 5.0, 10.0)
        theArray.shouldNotContain(7.0)
    }

    @Test
    fun failWhenTestingAPrimitiveDoubleArrayContainingTheValue() {
        val theArray = doubleArrayOf(1.0, 5.0, 10.0)
        assertFails { theArray.shouldNotContain(5.0) }
    }

    @Test
    fun passWhenTestingAPrimitiveFloatArrayWhichDoesNotContainTheValue() {
        val theArray = floatArrayOf(1.0f, 5.0f, 10.0f)
        theArray.shouldNotContain(7.0f)
    }

    @Test
    fun failWhenTestingAPrimitiveFloatArrayContainingTheValue() {
        val theArray = floatArrayOf(1.0f, 5.0f, 10.0f)
        assertFails { theArray.shouldNotContain(5.0f) }
    }

    @Test
    fun passWhenTestingAPrimitiveByteArrayWhichDoesNotContainTheValue() {
        val theArray = byteArrayOf(1, 5, 10)
        theArray.shouldNotContain(7)
    }

    @Test
    fun failWhenTestingAPrimitiveByteArrayContainingTheValue() {
        val theArray = byteArrayOf(1, 5, 10)
        assertFails { theArray.shouldNotContain(5) }
    }

    @Test
    fun passWhenTestingAPrimitiveCharArrayWhichDoesNotContainTheValue() {
        val theArray = charArrayOf('a', 'b', 'c')
        theArray.shouldNotContain('d')
    }

    @Test
    fun failWhenTestingAPrimitiveCharArrayContainingTheValue() {
        val theArray = charArrayOf('a', 'b', 'c')
        assertFails { theArray.shouldNotContain('b') }
    }

    @Test
    fun passWhenTestingAPrimitiveBooleanArrayWhichDoesNotContainTheValue() {
        val theArray = booleanArrayOf(true, true)
        theArray.shouldNotContain(false)
    }

    @Test
    fun failWhenTestingAPrimitiveBooleanArrayContainingTheValue() {
        val theArray = booleanArrayOf(true, true)
        assertFails { theArray.shouldNotContain(true) }
    }

}