package org.amshove.kluent.internal

internal fun <T> join(theArray: Array<T>?): String = if (theArray == null) "null" else "[${theArray.joinToString(", ")}]"
internal fun <T> join(theIterable: Iterable<T>): String = "[${theIterable.joinToString(", ")}]"
internal fun <R, T> join(theMap: Map<R, T>): String = "Entries: [${theMap.entries.joinToString(", ")}]"

internal fun joinKeys(map: Map<*, *>) = "Keys: [${join(map.keys)}]"
internal fun joinValues(map: Map<*, *>) = "Values: [${join(map.values)}]"
internal fun joinPairs(map: Map<*, *>) = "Pairs: [${map.map { it.toPair() }.joinToString(", ")}]"
