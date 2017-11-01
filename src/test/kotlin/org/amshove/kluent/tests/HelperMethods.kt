package org.amshove.kluent.tests

import org.opentest4j.AssertionFailedError

fun getFailure(func: () -> Unit): FailureMessage {
    return try {
        func.invoke()
        throw Exception("Test didn't fail")
    } catch (f: AssertionFailedError) {
        FailureMessage(f.actual.stringRepresentation, f.expected.stringRepresentation)
    } catch (f: AssertionError) {
        FailureMessage(f.message.orEmpty(), f.message.orEmpty())
    } catch (e: Exception) {
        throw Exception("Test didn't fail")
    }
}

class FailureMessage(val actual: String, val expected: String)