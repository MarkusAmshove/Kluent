package org.amshove.kluent.tests

import org.opentest4j.AssertionFailedError

fun getFailure(func: () -> Unit): FailureMessage {
    try {
        func.invoke()
        throw Exception("Test didn't fail")
    } catch (f: AssertionFailedError) {
        return FailureMessage(f.actual.stringRepresentation, f.expected.stringRepresentation)
    } catch (e: Exception) {
        throw Exception("Test didn't fail")
    }
}

class FailureMessage(val actual: String, val expected: String)