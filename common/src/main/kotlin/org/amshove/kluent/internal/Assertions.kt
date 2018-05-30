package org.amshove.kluent.internal

import kotlin.test.assertTrue
import kotlin.test.assertFalse

fun assertTrue(message: String, boolean: Boolean) = assertTrue(boolean, message)

fun assertFalse(message: String, boolean: Boolean) = assertFalse(boolean, message)