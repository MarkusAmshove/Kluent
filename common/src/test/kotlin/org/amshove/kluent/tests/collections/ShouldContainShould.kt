package org.amshove.kluent.tests.collections

import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldContain
import org.amshove.kluent.tests.Person
import kotlin.test.Test

class ShouldContainShould {
    @Test
    fun passWhenTestingAnArrayWhichContainsTheValue() {
        val array = arrayOf("Hello", "World", "Wide", "Web")
        array shouldContain "Wide"
    }

    @Test
    fun failWhenTestingAnArrayWhichDoesNotContainTheValue() {
        val array = arrayOf("Hello", "Wide", "Web")
        assertFails { array shouldContain "World" }
    }

    @Test
    fun passWhenTestingAnIterableWhichContainsTheValue() {
        val alice = Person("Alice", "Bob")
        val jon = Person("Jon", "Doe")
        val list = listOf(alice, jon)
        list shouldContain jon
    }

    @Test
    fun passWhenTestingASequenceWhichContainsTheValue() {
        val alice = Person("Alice", "Bob")
        val jon = Person("Jon", "Doe")
        val sequence = sequenceOf(alice, jon)
        sequence shouldContain jon
    }

    @Test
    fun failWhenTestingAnIterableWhichDoesNotContainTheValue() {
        val alice = Person("Alice", "Bob")
        val jon = Person("Jon", "Doe")
        val list = listOf(alice)
        assertFails { list shouldContain jon }
    }

    @Test
    fun failWhenTestingASequenceWhichDoesNotContainTheValue() {
        val alice = Person("Alice", "Bob")
        val jon = Person("Jon", "Doe")
        val sequence = sequenceOf(alice)
        assertFails { sequence shouldContain jon }
    }

    @Test
    fun passWhenTestingAMapWhichContainsAPair() {
        val map = mapOf(1 to "one", 2 to "two")
        map shouldContain (1 to "one")
    }

    @Test
    fun failWhenTestingAMapWhichDoesNotContainAPair() {
        val map = mapOf(1 to "one", 2 to "two")
        assertFails { map shouldContain (1 to "three") }
    }

    @Test
    fun passWhenTestingAMapWhichContainsAPairOfObjects() {
        val alice = Person("Alice", "Bob")
        val jon = Person("Jon", "Doe")
        val map = mapOf(alice to jon, jon to alice)
        map shouldContain (alice to jon)
    }

    @Test
    fun failWhenTestingAMapWhichDoesNotContainAPairOfObjects() {
        val alice = Person("Alice", "Bob")
        val jon = Person("Jon", "Doe")
        val bob = Person("Bob", "Blue")
        val map = mapOf(alice to jon)
        assertFails { map shouldContain (alice to bob) }
    }

    @Test
    fun passWhenTestingAPrimitiveIntegerArrayContainingTheValue() {
        val theArray = intArrayOf(1, 5, 10)
        theArray.shouldContain(5)
    }

    @Test
    fun failWhenTestingAPrimitiveIntegerArrayWhichDoesNotContainTheValue() {
        val theArray = intArrayOf(1, 5, 10)
        assertFails { theArray.shouldContain(7) }
    }

    @Test
    fun passWhenTestingAPrimitiveLongArrayContainingTheValue() {
        val theArray = longArrayOf(1, 5, 10)
        theArray.shouldContain(5)
    }

    @Test
    fun failWhenTestingAPrimitiveLongArrayWhichDoesNotContainTheValue() {
        val theArray = longArrayOf(1, 5, 10)
        assertFails { theArray.shouldContain(7) }
    }

    @Test
    fun passWhenTestingAPrimitiveShortArrayContainingTheValue() {
        val theArray = shortArrayOf(1, 5, 10)
        theArray.shouldContain(5)
    }

    @Test
    fun failWhenTestingAPrimitiveShortArrayWhichDoesNotContainTheValue() {
        val theArray = shortArrayOf(1, 5, 10)
        assertFails { theArray.shouldContain(7) }
    }

    @Test
    fun passWhenTestingAPrimitiveDoubleArrayContainingTheValue() {
        val theArray = doubleArrayOf(1.0, 5.0, 10.0)
        theArray.shouldContain(5.0)
    }

    @Test
    fun failWhenTestingAPrimitiveDoubleArrayWhichDoesNotContainTheValue() {
        val theArray = doubleArrayOf(1.0, 5.0, 10.0)
        assertFails { theArray.shouldContain(7.0) }
    }

    @Test
    fun passWhenTestingAPrimitiveFloatArrayContainingTheValue() {
        val theArray = floatArrayOf(1.0f, 5.0f, 10.0f)
        theArray.shouldContain(5.0f)
    }

    @Test
    fun failWhenTestingAPrimitiveFloatArrayWhichDoesNotContainTheValue() {
        val theArray = floatArrayOf(1.0f, 5.0f, 10.0f)
        assertFails { theArray.shouldContain(7.0f) }
    }

    @Test
    fun passWhenTestingAPrimitiveByteArrayContainingTheValue() {
        val theArray = byteArrayOf(1, 5, 10)
        theArray.shouldContain(5)
    }

    @Test
    fun failWhenTestingAPrimitiveByteArrayWhichDoesNotContainTheValue() {
        val theArray = byteArrayOf(1, 5, 10)
        assertFails { theArray.shouldContain(7) }
    }

    @Test
    fun passWhenTestingAPrimitiveCharArrayContainingTheValue() {
        val theArray = charArrayOf('a', 'b', 'c')
        theArray.shouldContain('b')
    }

    @Test
    fun failWhenTestingAPrimitiveCharArrayWhichDoesNotContainTheValue() {
        val theArray = charArrayOf('a', 'b', 'c')
        assertFails { theArray.shouldContain('d') }
    }

    @Test
    fun passWhenTestingAPrimitiveBooleanArrayContainingTheValue() {
        val theArray = booleanArrayOf(true, true)
        theArray.shouldContain(true)
    }

    @Test
    fun failWhenTestingAPrimitiveBooleanArrayWhichDoesNotContainTheValue() {
        val theArray = booleanArrayOf(true, true)
        assertFails { theArray.shouldContain(false) }
    }

}