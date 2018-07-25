package org.amshove.kluent.internal

import kotlin.test.assertTrue
import kotlin.test.assertFalse
import kotlin.test.fail

internal fun assertTrue(message: String, boolean: Boolean) = assertTrue(boolean, message)

internal fun assertFalse(message: String, boolean: Boolean) = assertFalse(boolean, message)

internal fun <T> assertArrayEquals(a1: Array<T>?, a2: Array<T>?) {
    if (!arraysEqual(a1, a2)) {
        failFirstSecond("Expected Arrays to be equal, but were different", join(a1), join(a2))
    }
}

internal fun <T> assertArrayNotEquals(a1: Array<T>?, a2: Array<T>?) {
    if (arraysEqual(a1, a2)) {
        failFirstSecond("Expected Arrays to be different, but were equal", join(a1), join(a2))
    }
}

internal fun <T> arraysEqual(a1: Array<T>?, a2: Array<T>?): Boolean {
    if (a1 == null || a2 == null) return false
    return a1 contentEquals a2
}

internal fun <K, V, M : Map<K, V>> assertMapEquals(m1: M, m2: M) {
    if (!mapsEqual(m1, m2)) {
        failFirstSecond("Expected Maps to be equal, but were different", joinPairs(m1), joinPairs(m2))
    }
}

internal fun <K, V, M : Map<K, V>> assertMapNotEquals(m1: M, m2: M) {
    if (mapsEqual(m1, m2)) {
        failFirstSecond("Expected Maps to be different, but were equal", joinPairs(m1), joinPairs(m2))
    }
}

internal fun <K, V, M : Map<K, V>> mapsEqual(m1: M?, m2: M?): Boolean {
    if (m1 == null || m2 == null) return false
    if (m1.size != m2.size) return false

    val m1Iter = m1.toList()
    val m2Iter = m2.toList()
    for (index in m1Iter.indices) {
        if (m1Iter[index] != m2Iter[index]) {
            return false
        }
    }
    return true
}

internal fun failExpectedActual(message: String, expected: String?, actual: String?): Nothing = fail("""
    |$message
    |   Expected:   $expected
    |   Actual:     $actual
""".trimMargin())

internal fun failCollectionWithDifferentItems(message: String, expected: String?, actual: String?): Nothing = fail("""
    |$message
    |${ if(actual.isNullOrEmpty()) "Items included on the expected collection but not in the actual: $expected" else "" }
    |${ if(expected.isNullOrEmpty()) "Items included on the actual collection but not in the expected: $actual" else "" }
""".trimMargin())

internal fun failFirstSecond(message: String, first: String?, second: String?): Nothing = fail("""
    |$message
    |   First:      $first
    |   Second:     $second
""".trimMargin())

// TODO: assertSame and notSame currently not implemented in native 0.6
fun assertSame(expected: Any?, actual: Any?) {
    assertTrue("Expected <$expected>, actual <$actual> are not the same instance.", actual === expected)
}

fun assertNotSame(expected: Any?, actual: Any?) {
    assertTrue("Expected <$expected>, actual <$actual> are the same instance.", actual !== expected)
}

