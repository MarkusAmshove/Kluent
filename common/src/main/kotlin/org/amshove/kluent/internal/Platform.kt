package org.amshove.kluent.internal

expect fun <T : Any> T.platformClassName(): String?

expect fun <T : Throwable> T.platformJoinStackTrace(): String

internal expect fun Char.platformIsDigit(): Boolean
