package org.amshove.kluent.internal

expect fun <T : Any> T.platformClassName(): String?

expect fun <T : Throwable> T.platformJoinStackTrace(): String
