package org.amshove.kluent.tests.assertions

import org.amshove.kluent.shouldContainAll
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldContainAllTests : Spek({
    given("the shouldContainAll method") {
        on("checking an Array with all values") {
            val array = arrayOf("Hello", "World", "Wide", "Web")
            it("should pass") {
                array shouldContainAll arrayOf("World", "Wide", "Web")
            }
        }
        on("checking an Array with missing values") {
            val array = arrayOf("Hello", "World", "Wide", "Web")
            it("should fail") {
                assertFails { array shouldContainAll arrayOf("Hello", "World", "White") }
            }
        }
        on("checking an IntArray with all values") {
            val array = intArrayOf(1, 2, 3, 4)
            it("should pass") {
                array shouldContainAll intArrayOf(2, 4)
            }
        }
        on("checking an IntArray with missing values") {
            val array = intArrayOf(1, 2)
            it("should fail") {
                assertFails { array shouldContainAll intArrayOf(1, 2, 4) }
            }
        }
        on("checking a BooleanArray with all values") {
            val array = booleanArrayOf(true, false)
            it("should pass") {
                array shouldContainAll booleanArrayOf(false, true, false)
            }
        }
        on("checking a BooleanArray with missing values") {
            val array = booleanArrayOf(false)
            it("should fail") {
                assertFails { array shouldContainAll booleanArrayOf(true, false) }
            }
        }
        on("checking a ByteArray with all values") {
            val array = byteArrayOf(0, 1, 2, 5)
            it("should pass") {
                array shouldContainAll byteArrayOf(5, 2)
            }
        }
        on("checking a ByteArray with missing values") {
            val array = byteArrayOf(1, 2, 3)
            it("should fail") {
                assertFails { array shouldContainAll byteArrayOf(4, 6) }
            }
        }
        on("checking a CharArray with all values") {
            val array = charArrayOf('a', 'f', 'z')
            it("should pass") {
                array shouldContainAll charArrayOf('z')
            }
        }
        on("checking a CharArray with missing values") {
            val array = charArrayOf('a', '-')
            it("should fail") {
                assertFails { array shouldContainAll charArrayOf('-', '-', 'b') }
            }
        }
        on("checking a DoubleArray with all values") {
            val array = doubleArrayOf(0.3, 1.1, 5.7)
            it("should pass") {
                array shouldContainAll doubleArrayOf(5.7, 0.3, 1.1)
            }
        }
        on("checking a DoubleArray with missing values") {
            val array = doubleArrayOf(0.3, 1.1, 5.7)
            it("should fail") {
                assertFails { array shouldContainAll doubleArrayOf(5.7, 1.1, 0.3, 81.9) }
            }
        }
        on("checking a FloatArray with all values") {
            val array = floatArrayOf(5.6f, 7.1f, 0.33f)
            it("should pass") {
                array shouldContainAll floatArrayOf(7.1f)
            }
        }
        on("checking a FloatArray with missing values") {
            val array = floatArrayOf(2.2f)
            it("should fail") {
                assertFails { array shouldContainAll floatArrayOf(2.2f, 1.1f) }
            }
        }
        on("checking a LongArray with all values") {
            val array = longArrayOf(1L, 4L, 120L)
            it("should pass") {
                array shouldContainAll longArrayOf(120L, 4L)
            }
        }
        on("checking a LongArray with missing values") {
            val array = longArrayOf(4L, 3L)
            it("should fail") {
                assertFails { array shouldContainAll longArrayOf(120L) }
            }
        }
        on("checking a ShortArray with all values") {
            val array = shortArrayOf(5, 6, 7)
            it("should pass") {
                array shouldContainAll shortArrayOf(5, 6, 7)
            }
        }
        on("checking a ShortArray with missing values") {
            val array = shortArrayOf(6, 8)
            it("should fail") {
                assertFails { array shouldContainAll shortArrayOf(6, 9) }
            }
        }
        on("checking an Iterable with all values") {
            val list = listOf(5, 8, 12)
            it("should pass") {
                list shouldContainAll listOf(12, 8)
            }
        }
        on("checking an Iterable with missing values") {
            val set = setOf(4, 9)
            it("should fail") {
                assertFails { set shouldContainAll setOf(5, 9) }
            }
        }
        on("checking a Map with all values") {
            val map = mapOf('a' to 1, 'b' to 2, 'c' to 3)
            it("should pass") {
                map shouldContainAll mapOf('b' to 2, 'a' to 1)
            }
        }
        on("checking a Map with missing values") {
            val map = mapOf('a' to 1, 'b' to 2)
            it("should fail") {
                assertFails { map shouldContainAll mapOf('a' to 2, 'b' to 1) }
            }
        }
    }
})
