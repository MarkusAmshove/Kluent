package org.amshove.kluent.internal

actual fun <T : Any> T.platformClassName(): String? = this::class.qualifiedName

// TODO: implement some kind of stacktrace
actual fun <T : Throwable> T.platformJoinStackTrace(): String = "<no stacktrace on native yet>"
