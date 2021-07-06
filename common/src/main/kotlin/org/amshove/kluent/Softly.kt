package org.amshove.kluent

inline fun <T> assertSoftly(assertions: () -> T): T {
    // Handle the edge case of nested calls to this function by only calling throwCollectedErrors in the
    // outermost verifyAll block
    if (errorCollector.getCollectionMode() == ErrorCollectionMode.Soft) {
        return assertions()
    }
    errorCollector.setCollectionMode(ErrorCollectionMode.Soft)
    return try {
        assertions()
    } catch (e: Throwable) {
        errorCollector.pushError(e)
        assertions()
    } finally {
        errorCollector.throwCollectedErrors()
    }
}

inline fun <T> assertSoftly(t: T, assertions: T.(T) -> Unit): T {
    return assertSoftly {
        t.assertions(t)
        t
    }
}