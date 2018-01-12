package org.amshove.kluent.tests

import org.amshove.kluent.shouldEqual
import org.junit.ComparisonFailure

fun getFailure(func: () -> Unit): ComparisonFailure {
    try {
        func.invoke()
        throw Exception("Test didn't fail")
    } catch (f: ComparisonFailure) {
        return f
    } catch (e: Exception) {
        throw Exception("Test didn't fail")
    }
}

fun assertMessage(message: String, func: () -> Unit) {
    try {
        func()
    } catch (e: Throwable) {
        e.message.shouldEqual(message)
    }
}