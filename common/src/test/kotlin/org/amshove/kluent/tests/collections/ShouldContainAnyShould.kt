package org.amshove.kluent.tests.collections


import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldContainAny
import kotlin.test.Test

class ShouldContainAnyShould {
    private val strings = listOf("Paris", "Berlin", "Phoenix", "Cairo")
    private val ints = intArrayOf(1, 5, 7, 13)
    private val longs = longArrayOf(1, 5, 7, 13)
    private val shorts = shortArrayOf(1, 5, 7, 13)
    private val bytes = byteArrayOf(1, 5, 7, 13)
    private val doubles = doubleArrayOf(1.0, 5.0, 7.0, 13.0)
    private val floats = floatArrayOf(1.0f, 5.0f, 7.0f, 13.0f)
    private val chars = charArrayOf('a', 'b', 'c')

    @Test
    fun passWhenTestingAListWhichContainsAtLeastOneElement() {
        strings shouldContainAny { it == "Berlin" }
    }

    @Test
    fun failWhenTestingAListWhichDoesNotContainAtLeastOneElement() {
        assertFails { strings shouldContainAny { it == "Bombay" } }
    }

    @Test
    fun passWhenTestingIfAListContainsASubsetOfAnArrayWhenItDoes() {
        val array = arrayOf("Paris", "Berlin", "Phoenix", "Cairo")
        array shouldContainAny { it == "Berlin" }
    }

    @Test
    fun passWhenTestingAPrimitiveIntegerArrayContainsAtLeastOneElement() {
        ints shouldContainAny { it == 7 }
    }

    @Test
    fun failWhenTestingAPrimitiveIntegerArrayWhichDoesNotContainAtLeastOneElement() {
        assertFails { ints shouldContainAny { it == 3 } }
    }

    @Test
    fun passWhenTestingAPrimitiveLongArrayContainsAtLeastOneElement() {
        longs shouldContainAny { it == 7L }
    }

    @Test
    fun failWhenTestingAPrimitiveLongArrayWhichDoesNotContainAtLeastOneElement() {
        assertFails { longs shouldContainAny { it == 3L } }
    }

    @Test
    fun passWhenTestingAPrimitiveShortArrayContainsAtLeastOneElement() {
        shorts shouldContainAny { it == 7.toShort() }
    }

    @Test
    fun failWhenTestingAPrimitiveShortArrayWhichDoesNotContainAtLeastOneElement() {
        assertFails { shorts shouldContainAny { it == 3.toShort() } }
    }

    @Test
    fun passWhenTestingAPrimitiveByteArrayContainsAtLeastOneElement() {
        bytes shouldContainAny { it == 7.toByte() }
    }

    @Test
    fun failWhenTestingAPrimitiveByteArrayWhichDoesNotContainAtLeastOneElement() {
        assertFails { bytes shouldContainAny { it == 3.toByte() } }
    }

    @Test
    fun passWhenTestingAPrimitiveDoubleArrayContainsAtLeastOneElement() {
        doubles shouldContainAny { it == 7.0 }
    }

    @Test
    fun failWhenTestingAPrimitiveDoubleArrayWhichDoesNotContainAtLeastOneElement() {
        assertFails { doubles shouldContainAny { it == 3.0 } }
    }

    @Test
    fun passWhenTestingAPrimitiveFloatArrayContainsAtLeastOneElement() {
        floats shouldContainAny { it == 7.0f }
    }

    @Test
    fun failWhenTestingAPrimitiveFloatArrayWhichDoesNotContainAtLeastOneElement() {
        assertFails { floats shouldContainAny { it == 3.0f } }
    }

    @Test
    fun passWhenTestingAPrimitiveCharArrayContainsAtLeastOneElement() {
        chars shouldContainAny { it == 'b' }
    }

    @Test
    fun failWhenTestingAPrimitiveCharArrayWhichDoesNotContainAtLeastOneElement() {
        assertFails { chars shouldContainAny { it == 'x' } }
    }
}