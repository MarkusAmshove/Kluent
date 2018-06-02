package org.amshove.kluent.internal

actual fun <T : Any> T.platformClassName(): String? = this::class.qualifiedName

actual fun <T : Throwable> T.platformJoinStackTrace(): String = this.stackTrace.joinToString("\n\tat ")

internal actual fun Char.platformIsDigit(): Boolean = this.isDigit()
