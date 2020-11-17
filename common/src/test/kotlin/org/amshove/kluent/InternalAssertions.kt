package org.amshove.kluent

fun assertMessage(message: String, func: () -> Unit) {
    try {
        func()
    } catch (e: Throwable) {
        e.message?.replace("\\s+|\\t|\\n".toRegex(), " ")?.trim().shouldBeEqualTo(message.replace("\\s+|\\t|\\n".toRegex(), " ").trim())
    }
}

fun assertMessageContain(message: String, func: () -> Unit) {
    try {
        func()
    } catch (e: Throwable) {
        e.message?.contains(message, true)
    }
}