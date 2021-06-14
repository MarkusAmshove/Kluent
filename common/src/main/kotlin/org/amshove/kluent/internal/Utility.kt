package org.amshove.kluent.internal

import kotlin.reflect.KClass

internal fun <T> join(theArray: Array<T>?): String = if (theArray == null) "null" else "[${theArray.joinToString(", ")}]"
internal fun <T> join(theIterable: Iterable<T>): String = "[${theIterable.joinToString(", ")}]"
internal fun <R, T> join(theMap: Map<R, T>): String = "Entries: [${theMap.entries.joinToString(", ")}]"

internal fun joinKeys(map: Map<*, *>) = "Keys: [${join(map.keys)}]"
internal fun joinValues(map: Map<*, *>) = "Values: [${join(map.values)}]"
internal fun joinPairs(map: Map<*, *>) = "Pairs: [${map.map { it.toPair() }.joinToString(", ")}]"


internal fun messagePrefix(message: String?) = if (message == null) "" else "$message. "

/** Asserts that a [blockResult] is a failure with the specific exception type being thrown. */
@PublishedApi
internal expect fun <T : Throwable> checkResultIsFailure(exceptionClass: KClass<T>, message: String?, blockResult: Result<Unit>): T
