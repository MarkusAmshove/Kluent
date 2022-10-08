package org.amshove.kluent.tests.collections

import org.amshove.kluent.shouldNotContainAny
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotContainAnyWithCheckShould {

    @Test
    fun passWhenTestingAListWithNoMatchingValue() {
        val list = listOf("Hello", "World", "Wide", "Web")
        list shouldNotContainAny { it == "Cat" }
    }

    @Test
    fun failWhenTestingAListWithAtLeastOneMatchingValue() {
        val list = listOf("Hello", "World", "Wide", "Web")
        assertFails { list shouldNotContainAny { it == "Hello" } }
    }

    @Test
    fun passWhenTestingAnIntListWithNoMatchingValue() {
        val list = listOf(1, 3, 5)
        list shouldNotContainAny { it == 2 }
        list shouldNotContainAny { it % 2 == 0 }
    }

    @Test
    fun failWhenTestingAnIntListWithAtLeastOneMatchingValue() {
        val list = listOf(1, 3, 5)
        assertFails { list shouldNotContainAny { it == 3 } }
        assertFails { list shouldNotContainAny { it == 5 } }
    }

    @Test
    fun passWhenTestingABooleanListWithNoMatchingValue() {
        val list = listOf(true)
        list shouldNotContainAny { !it }
    }

    @Test
    fun failWhenTestingABooleanListWithAtLeastOneMatchingValue() {
        val list = listOf(false, true)
        assertFails { list shouldNotContainAny { !it } }
        assertFails { list shouldNotContainAny { it } }
    }

    @Test
    fun passWhenTestingAByteListWithNoMatchingValue() {
        val list = listOf<Byte>(3, 4)
        list shouldNotContainAny { it == 9.toByte() }
    }

    @Test
    fun failWhenTestingAByteListWithAtLeastOneMatchingValue() {
        val list = listOf<Byte>(5, 7, 8)
        assertFails { list shouldNotContainAny { it == 5.toByte() } }
        assertFails { list shouldNotContainAny { it == 7.toByte() } }
    }

    @Test
    fun passWhenTestingACharListWithNoMatchingValue() {
        val list = listOf('a', 'o', 'e', 'i', 'u')
        list shouldNotContainAny { it == 'b' }
    }

    @Test
    fun failWhenTestingACharListWithAtLeastOneMatchingValue() {
        val list = listOf('a', 'o', 'e', 'i', 'u')
        assertFails { list shouldNotContainAny { it == 'o' } }
        assertFails { list shouldNotContainAny { it in listOf('o', 'u') } }
    }

    @Test
    fun passWhenTestingADoubleListWithNoMatchingValue() {
        val list = listOf(5.6, 7.8, 8.0)
        list shouldNotContainAny { it == 1.2 }
        list shouldNotContainAny { it in listOf(1.2, 3.9) }
    }

    @Test
    fun failWhenTestingADoubleArrayWithAtLeastOneMatchingValue() {
        val list = listOf(8.9, 9.1, 12.3)
        assertFails { list shouldNotContainAny { it == 12.3 } }
        assertFails { list shouldNotContainAny { it in listOf(12.3, 1.0) } }
    }

    @Test
    fun passWhenTestingAFloatListWithNoMatchingValue() {
        val list = listOf(0f, 1f, 2f)
        list shouldNotContainAny { it == 3f }
        list shouldNotContainAny { it in listOf(3f, 4f) }
    }

    @Test
    fun failWhenTestingAFloatListWithAtLeastOneMatchingValue() {
        val list = listOf(2f, 5f, 7f)
        assertFails { list shouldNotContainAny { it == 5f } }
        assertFails { list shouldNotContainAny { it in listOf(5f, 2f, 7f) } }
    }

    @Test
    fun passWhenTestingALongListWithNoMatchingValue() {
        val list = listOf(2L, 100L, 200L)
        list shouldNotContainAny { it == 3L }
        list shouldNotContainAny { it in listOf(3L, 50L, 75L) }
    }

    @Test
    fun failWhenTestingALongListWithAtLeastOneMatchingValue() {
        val list = listOf(1L, 4L)
        assertFails { list shouldNotContainAny { it == 4L } }
        assertFails { list shouldNotContainAny { it in listOf(4L, 5L, 89L) } }
    }

    @Test
    fun passWhenTestingAShortListWithNoMatchingValue() {
        val list = listOf<Short>(5, 8, 12)
        list shouldNotContainAny { it == 7.toShort() }
        list shouldNotContainAny { it in listOf<Short>(7, 6, -1) }
    }

    @Test
    fun failWhenTestingAShortListWithAtLeastOneMatchingValue() {
        val list = listOf<Short>(2, 14, 3)
        assertFails { list shouldNotContainAny { it == 14.toShort() } }
        assertFails { list shouldNotContainAny { it in listOf<Short>(14, 1, 7) } }
    }
}
