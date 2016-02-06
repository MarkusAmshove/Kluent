package org.amshove.kluent

import org.junit.ComparisonFailure
import kotlin.reflect.KClass


infix fun Any.`should equal`(theOther: Any) = if (this == theOther) Unit else fail("$this should equal $theOther", "$theOther", "$this")

infix fun Any.`should be`(theOther: Any) = if (this === theOther) Unit else fail("$this should be the same object as $theOther", "$theOther", "$this")

infix fun <T> Array<T>.`should contain`(theThing: T) = if (this.contains(theThing)) Unit else fail("$this should contain $theThing", "$theThing", "${join(this)}")
infix fun <T> Iterable<T>.`should contain`(theThing: T) = if (this.contains(theThing)) Unit else fail("$this should contain $theThing", "$theThing", "${join(this)}")


infix fun <T: Exception> (() -> Nothing).`should throw`(expectedException: KClass<T>) {
    try {
        this.invoke()
        fail("There was an Exception expected to be thrown, but nothing was thrown", "$expectedException", "None")
    } catch (e: Exception) {
        if (e.javaClass == expectedException.javaObjectType) {
            Unit
        } else throw ComparisonFailure("Expected ${expectedException.javaObjectType} to be thrown", "${expectedException.javaObjectType}", "${e.javaClass}")
    }
}


private fun fail(message: String, expected: String, actual: String): Nothing = throw ComparisonFailure(message, expected, actual)
private fun <T> join(theArray: Array<T>) : String = theArray.joinToString(", ")
private fun <T> join(theIterable: Iterable<T>) : String = theIterable.joinToString(", ")