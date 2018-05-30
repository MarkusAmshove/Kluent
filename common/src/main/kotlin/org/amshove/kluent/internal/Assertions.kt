package org.amshove.kluent.internal

import kotlin.test.assertTrue
import kotlin.test.assertFalse

fun assertTrue(message: String, boolean: Boolean) = assertTrue(boolean, message)

fun assertFalse(message: String, boolean: Boolean) = assertFalse(boolean, message)

// TODO: assertSame and notSame currently not implemented in native 0.6
fun assertSame(expected: Any?, actual: Any?) {
    assertTrue("Expected <$expected>, actual <$actual> are not the same instance.", actual === expected)
}

fun assertNotSame(expected: Any?, actual: Any?) {
    assertTrue("Expected <$expected>, actual <$actual> are the same instance.", actual !== expected)
}