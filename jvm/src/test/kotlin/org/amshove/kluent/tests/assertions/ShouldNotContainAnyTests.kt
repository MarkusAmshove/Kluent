package org.amshove.kluent.tests.assertions

import org.amshove.kluent.shouldNotContainAny
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotContainAnyTests : Spek({
    given("the shouldNotContainAny method") {
        on("checking an Array with no matching values") {
            val array = arrayOf("Hello", "World", "Wide", "Web")
            it("should pass") {
                array shouldNotContainAny arrayOf("cat", "bat", "rat")
            }
        }
        on("checking an Array with matching values") {
            val array = arrayOf("Hello", "World", "Wide", "Web")
            it("should fail") {
                assertFails { array shouldNotContainAny arrayOf("cat", "rat", "Web") }
            }
        }
        on("checking an IntArray with no matching values") {
            val array = intArrayOf(1, 3, 5)
            it("should pass") {
                array shouldNotContainAny intArrayOf(2, 4, 6)
            }
        }
        on("checking an IntArray with matching values") {
            val array = intArrayOf(1, 3, 5)
            it("should fail") {
                assertFails { array shouldNotContainAny intArrayOf(2, 4, 5) }
            }
        }
        on("checking a BooleanArray with no matching values") {
            val array = booleanArrayOf(true)
            it("should pass") {
                array shouldNotContainAny booleanArrayOf(false)
            }
        }
        on("checking a BooleanArray with matching values") {
            val array = booleanArrayOf(false, true)
            it("should fail") {
                assertFails { array shouldNotContainAny booleanArrayOf(false, false) }
            }
        }
        on("checking a ByteArray with no matching values") {
            val array = byteArrayOf(3, 4)
            it("should pass") {
                array shouldNotContainAny byteArrayOf(9)
            }
        }
        on("checking a ByteArray with matching values") {
            val array = byteArrayOf(5, 7, 8)
            it("should fail") {
                assertFails { array shouldNotContainAny byteArrayOf(5, 8, 9, 7) }
            }
        }
        on("checking a CharArray with no matching values") {
            val array = charArrayOf('a', 'o', 'e', 'i', 'u')
            it("should pass") {
                array shouldNotContainAny charArrayOf('b')
            }
        }
        on("checking a ByteArray with matching values") {
            val array = charArrayOf('a', 'o', 'e', 'i', 'u')
            it("should fail") {
                assertFails { array shouldNotContainAny charArrayOf('o') }
            }
        }
        on("checking a DoubleArray with no matching values") {
            val array = doubleArrayOf(5.6, 7.8, 8.0)
            it("should pass") {
                array shouldNotContainAny doubleArrayOf(1.2, 3.9)
            }
        }
        on("checking a DoubleArray with matching values") {
            val array = doubleArrayOf(8.9, 9.1, 12.3)
            it("should fail") {
                assertFails { array shouldNotContainAny doubleArrayOf(12.3, 1.0) }
            }
        }
        on("checking a FloatArray with no matching values") {
            val array = floatArrayOf(0f, 1f, 2f)
            it("should pass") {
                array shouldNotContainAny floatArrayOf(3f, 4f)
            }
        }
        on("checking a FloatArray with matching values") {
            val array = floatArrayOf(2f, 5f, 7f)
            it("should fail") {
                assertFails { array shouldNotContainAny floatArrayOf(5f, 2f, 7f) }
            }
        }
        on("checking a LongArray with no matching values") {
            val array = longArrayOf(2L, 100L, 200L)
            it("should pass") {
                array shouldNotContainAny longArrayOf(3L, 50L, 75L)
            }
        }
        on("checking a LongArray with matching values") {
            val array = longArrayOf(1L, 4L)
            it("should fail") {
                assertFails { array shouldNotContainAny longArrayOf(4L, 5L, 89L) }
            }
        }
        on("checking a ShortArray with no matching values") {
            val array = shortArrayOf(5, 8, 12)
            it("should pass") {
                array shouldNotContainAny shortArrayOf(7, 6, -1)
            }
        }
        on("checking a ShortArray with matching values") {
            val array = shortArrayOf(2, 14, 3)
            it("should fail") {
                assertFails { array shouldNotContainAny shortArrayOf(14, 1, 7) }
            }
        }
        on("checking an Iterable with no matching values") {
            val array = listOf('a', 'c', 'e')
            it("should pass") {
                array shouldNotContainAny listOf('b', 'f')
            }
        }
        on("checking an Iterable with matching values") {
            val array = setOf(5, 5, 6)
            it("should fail") {
                assertFails { array shouldNotContainAny setOf(6, 6, 7) }
            }
        }
        on("checking a Map with no matching values") {
            val array = mapOf('a' to 1, 'b' to 2, 'c' to 3)
            it("should pass") {
                array shouldNotContainAny mapOf('a' to 4)
            }
        }
        on("checking a Map with matching values") {
            val array = mapOf('a' to 1, 'b' to 2, 'c' to 3)
            it("should fail") {
                assertFails { array shouldNotContainAny mapOf('b' to 2, 'a' to 3) }
            }
        }
    }
})
