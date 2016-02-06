package org.amshove.kluent.tests

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

