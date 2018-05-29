package org.amshove.kluent.tests.backtickassertions

import org.amshove.kluent.`should contain all`
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldContainAllTests : Spek({
    given("the `should contain all` method") {
        on("checking an Array with all values") {
            val array = arrayOf("Hello", "World", "Wide", "Web")
            it("should pass") {
                array `should contain all` arrayOf("World", "Wide", "Web")
            }
        }
        on("checking an Array with missing values") {
            val array = arrayOf("Hello", "World", "Wide", "Web")
            it("should fail") {
                assertFails { array `should contain all` arrayOf("Hello", "World", "White") }
            }
        }
        on("checking an IntArray with all values") {
            val array = intArrayOf(1, 2, 3, 4)
            it("should pass") {
                array `should contain all` intArrayOf(2, 4)
            }
        }
        on("checking an IntArray with missing values") {
            val array = intArrayOf(1, 2)
            it("should fail") {
                assertFails { array `should contain all` intArrayOf(1, 2, 4) }
            }
        }
        on("checking a BooleanArray with all values") {
            val array = booleanArrayOf(true, false)
            it("should pass") {
                array `should contain all` booleanArrayOf(false, true, false)
            }
        }
        on("checking a BooleanArray with missing values") {
            val array = booleanArrayOf(false)
            it("should fail") {
                assertFails { array `should contain all` booleanArrayOf(true, false) }
            }
        }
        on("checking a ByteArray with all values") {
            val array = byteArrayOf(0, 1, 2, 5)
            it("should pass") {
                array `should contain all` byteArrayOf(5, 2)
            }
        }
        on("checking a ByteArray with missing values") {
            val array = byteArrayOf(1, 2, 3)
            it("should fail") {
                assertFails { array `should contain all` byteArrayOf(4, 6) }
            }
        }
        on("checking a CharArray with all values") {
            val array = charArrayOf('a', 'f', 'z')
            it("should pass") {
                array `should contain all` charArrayOf('z')
            }
        }
        on("checking a CharArray with missing values") {
            val array = charArrayOf('a', '-')
            it("should fail") {
                assertFails { array `should contain all` charArrayOf('-', '-', 'b') }
            }
        }
        on("checking a DoubleArray with all values") {
            val array = doubleArrayOf(0.3, 1.1, 5.7)
            it("should pass") {
                array `should contain all` doubleArrayOf(5.7, 0.3, 1.1)
            }
        }
        on("checking a DoubleArray with missing values") {
            val array = doubleArrayOf(0.3, 1.1, 5.7)
            it("should fail") {
                assertFails { array `should contain all` doubleArrayOf(5.7, 1.1, 0.3, 81.9) }
            }
        }
        on("checking a FloatArray with all values") {
            val array = floatArrayOf(5.6f, 7.1f, 0.33f)
            it("should pass") {
                array `should contain all` floatArrayOf(7.1f)
            }
        }
        on("checking a FloatArray with missing values") {
            val array = floatArrayOf(2.2f)
            it("should fail") {
                assertFails { array `should contain all` floatArrayOf(2.2f, 1.1f) }
            }
        }
        on("checking a LongArray with all values") {
            val array = longArrayOf(1L, 4L, 120L)
            it("should pass") {
                array `should contain all` longArrayOf(120L, 4L)
            }
        }
        on("checking a LongArray with missing values") {
            val array = longArrayOf(4L, 3L)
            it("should fail") {
                assertFails { array `should contain all` longArrayOf(120L) }
            }
        }
        on("checking a ShortArray with all values") {
            val array = shortArrayOf(5, 6, 7)
            it("should pass") {
                array `should contain all` shortArrayOf(5, 6, 7)
            }
        }
        on("checking a ShortArray with missing values") {
            val array = shortArrayOf(6, 8)
            it("should fail") {
                assertFails { array `should contain all` shortArrayOf(6, 9) }
            }
        }
        on("checking an Iterable with all values") {
            val list = listOf(5, 8, 12)
            it("should pass") {
                list `should contain all` listOf(12, 8)
            }
        }
        on("checking an Iterable with missing values") {
            val set = setOf(4, 9)
            it("should fail") {
                assertFails { set `should contain all` setOf(5, 9) }
            }
        }
        on("checking a Map with all values") {
            val map = mapOf('a' to 1, 'b' to 2, 'c' to 3)
            it("should pass") {
                map `should contain all` mapOf('b' to 2, 'a' to 1)
            }
        }
        on("checking a Map with missing values") {
            val map = mapOf('a' to 1, 'b' to 2)
            it("should fail") {
                assertFails { map `should contain all` mapOf('a' to 2, 'b' to 1) }
            }
        }
    }
})
