package org.amshove.kluent.tests.collections

import org.amshove.kluent.shouldContainNone
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldContainNoneWithCheckShould {

    @Test
    fun passWhenTestingAListWithNoMatchingValue() {
        val list = listOf("Hello", "World", "Wide", "Web")
        list shouldContainNone { it == "Cat" }
    }

    @Test
    fun failWhenTestingAListWithAtLeastOneMatchingValue() {
        val list = listOf("Hello", "World", "Wide", "Web")
        assertFails { list shouldContainNone { it == "Hello" } }
    }

    @Test
    fun passWhenTestingAnIntListWithNoMatchingValue() {
        val list = listOf(1, 3, 5)
        list shouldContainNone { it == 2 }
        list shouldContainNone { it % 2 == 0 }
    }

    @Test
    fun failWhenTestingAnIntListWithAtLeastOneMatchingValue() {
        val list = listOf(1, 3, 5)
        assertFails { list shouldContainNone { it == 3 } }
        assertFails { list shouldContainNone { it == 5 } }
    }

    @Test
    fun passWhenTestingABooleanListWithNoMatchingValue() {
        val list = listOf(true)
        list shouldContainNone { !it }
    }

    @Test
    fun failWhenTestingABooleanListWithAtLeastOneMatchingValue() {
        val list = listOf(false, true)
        assertFails { list shouldContainNone { !it } }
        assertFails { list shouldContainNone { it } }
    }

    @Test
    fun passWhenTestingAByteListWithNoMatchingValue() {
        val list = listOf<Byte>(3, 4)
        list shouldContainNone { it == 9.toByte() }
    }

    @Test
    fun failWhenTestingAByteListWithAtLeastOneMatchingValue() {
        val list = listOf<Byte>(5, 7, 8)
        assertFails { list shouldContainNone { it == 5.toByte() } }
        assertFails { list shouldContainNone { it == 7.toByte() } }
    }

    @Test
    fun passWhenTestingACharListWithNoMatchingValue() {
        val list = listOf('a', 'o', 'e', 'i', 'u')
        list shouldContainNone { it == 'b' }
    }

    @Test
    fun failWhenTestingACharListWithAtLeastOneMatchingValue() {
        val list = listOf('a', 'o', 'e', 'i', 'u')
        assertFails { list shouldContainNone { it == 'o' } }
        assertFails { list shouldContainNone { it in listOf('o', 'u') } }
    }

    @Test
    fun passWhenTestingADoubleListWithNoMatchingValue() {
        val list = listOf(5.6, 7.8, 8.0)
        list shouldContainNone { it == 1.2 }
        list shouldContainNone { it in listOf(1.2, 3.9) }
    }

    @Test
    fun failWhenTestingADoubleArrayWithAtLeastOneMatchingValue() {
        val list = listOf(8.9, 9.1, 12.3)
        assertFails { list shouldContainNone { it == 12.3 } }
        assertFails { list shouldContainNone { it in listOf(12.3, 1.0) } }
    }

    @Test
    fun passWhenTestingAFloatListWithNoMatchingValue() {
        val list = listOf(0f, 1f, 2f)
        list shouldContainNone { it == 3f }
        list shouldContainNone { it in listOf(3f, 4f) }
    }

    @Test
    fun failWhenTestingAFloatListWithAtLeastOneMatchingValue() {
        val list = listOf(2f, 5f, 7f)
        assertFails { list shouldContainNone { it == 5f } }
        assertFails { list shouldContainNone { it in listOf(5f, 2f, 7f) } }
    }

    @Test
    fun passWhenTestingALongListWithNoMatchingValue() {
        val list = listOf(2L, 100L, 200L)
        list shouldContainNone { it == 3L }
        list shouldContainNone { it in listOf(3L, 50L, 75L) }
    }

    @Test
    fun failWhenTestingALongListWithAtLeastOneMatchingValue() {
        val list = listOf(1L, 4L)
        assertFails { list shouldContainNone { it == 4L } }
        assertFails { list shouldContainNone { it in listOf(4L, 5L, 89L) } }
    }

    @Test
    fun passWhenTestingAShortListWithNoMatchingValue() {
        val list = listOf<Short>(5, 8, 12)
        list shouldContainNone { it == 7.toShort() }
        list shouldContainNone { it in listOf<Short>(7, 6, -1) }
    }

    @Test
    fun failWhenTestingAShortListWithAtLeastOneMatchingValue() {
        val list = listOf<Short>(2, 14, 3)
        assertFails { list shouldContainNone { it == 14.toShort() } }
        assertFails { list shouldContainNone { it in listOf<Short>(14, 1, 7) } }
    }
}
