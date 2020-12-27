package org.amshove.kluent

actual val errorCollector: ErrorCollector = JsErrorCollector

object JsErrorCollector : BasicErrorCollector()