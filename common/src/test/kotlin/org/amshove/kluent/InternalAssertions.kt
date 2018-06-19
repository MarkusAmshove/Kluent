package org.amshove.kluent

fun assertMessage(message: String, func: () -> Unit) {
    try {
        func()
    } catch (e: Throwable) {
        e.message.shouldEqual(message)
    }
}