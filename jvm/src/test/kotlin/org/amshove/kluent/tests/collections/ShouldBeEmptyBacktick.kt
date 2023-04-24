package org.amshove.kluent.tests.collections

import org.amshove.kluent.Empty
import org.amshove.kluent.`should be`
import org.amshove.kluent.`should not be`
import kotlin.test.Test

class ShouldBeEmptyBacktick {
    @Test
    fun `Array should be empty in an infix style`() {
        val array = arrayOf<Int>()

        array `should be` Empty
    }

    @Test
    fun `Array should not be empty in an infix style`() {
        val array = arrayOf("any")

        array `should not be` Empty
    }

    @Test
    fun `IntArray should be empty in an infix style`() {
        val array = intArrayOf()

        array `should be` Empty
    }

    @Test
    fun `IntArray should not be empty in an infix style`() {
        val array = intArrayOf(1)

        array `should not be` Empty
    }

    @Test
    fun `BooleanArray should be empty in an infix style`() {
        val array = booleanArrayOf()

        array `should be` Empty
    }

    @Test
    fun `BooleanArray should not be empty in an infix style`() {
        val array = booleanArrayOf(true)

        array `should not be` Empty
    }

    @Test
    fun `ByteArray should be empty in an infix style`() {
        val array = byteArrayOf()

        array `should be` Empty
    }

    @Test
    fun `ByteArray should not be empty in an infix style`() {
        val array = byteArrayOf(1)

        array `should not be` Empty
    }

    @Test
    fun `CharArray should be empty in an infix style`() {
        val array = charArrayOf()

        array `should be` Empty
    }

    @Test
    fun `CharArray should not be empty in an infix style`() {
        val array = charArrayOf('a')

        array `should not be` Empty
    }

    @Test
    fun `DoubleArray should be empty in an infix style`() {
        val array = doubleArrayOf()

        array `should be` Empty
    }

    @Test
    fun `DoubleArray should not be empty in an infix style`() {
        val array = doubleArrayOf(0.0)

        array `should not be` Empty
    }

    @Test
    fun `FloatArray should be empty in an infix style`() {
        val array = floatArrayOf()

        array `should be` Empty
    }

    @Test
    fun `FloatArray should not be empty in an infix style`() {
        val array = floatArrayOf(0.0f)

        array `should not be` Empty
    }

    @Test
    fun `LongArray should be empty in an infix style`() {
        val array = longArrayOf()

        array `should be` Empty
    }

    @Test
    fun `LongArray should not be empty in an infix style`() {
        val array = longArrayOf(0L)

        array `should not be` Empty
    }

    @Test
    fun `ShortArray should be empty in an infix style`() {
        val array = shortArrayOf()

        array `should be` Empty
    }

    @Test
    fun `ShortArray should not be empty in an infix style`() {
        val array = shortArrayOf(0)

        array `should not be` Empty
    }

    @Test
    fun `Iterable should be empty in an infix style`() {
        val list = listOf<String>()
        val set = setOf<String>()
        val range = 0..-1

        list `should be` Empty
        set `should be` Empty
        range `should be` Empty
    }

    @Test
    fun `Iterable should not be empty in an infix style`() {
        val list = listOf("")
        val set = setOf("")
        val range = 0..1

        list `should not be` Empty
        set `should not be` Empty
        range `should not be` Empty
    }

    @Test
    fun `Map should be empty in an infix style`() {
        val map = mapOf<Int, String>()

        map `should be` Empty
    }

    @Test
    fun `Map should not be empty in an infix style`() {
        val map = mapOf(1 to "")

        map `should not be` Empty
    }
}
