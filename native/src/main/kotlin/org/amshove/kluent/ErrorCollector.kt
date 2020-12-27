package org.amshove.kluent

actual val errorCollector: ErrorCollector = NativeErrorCollector

object NativeErrorCollector : BasicErrorCollector()