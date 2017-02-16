package org.amshove.kluent

import org.junit.Assert.*
import org.junit.ComparisonFailure
import kotlin.reflect.KClass

/*
    Array
 */
infix fun <T> Array<T>.`should contain`(theThing: T) = if (this.contains(theThing)) Unit else fail("$this should contain $theThing", "$theThing", join(this))
infix fun <T> Array<T>.shouldContain(theThing: T) = this `should contain` theThing

infix fun <T> Array<T>.shouldNotContain(theThing: T) = this `should not contain` theThing
infix fun <T> Array<T>.`should not contain`(theThing: T) = if (!this.contains(theThing)) Unit else fail("$this should not contain $theThing", "$theThing", join(this))

infix fun <T> Array<T>?.shouldEqual(theOther: Array<T>?) = this `should equal` theOther
infix fun <T> Array<T>?.`should equal`(theOther: Array<T>?) = assertArrayEquals(theOther, this)



infix fun <T> Iterable<T>.`should contain`(theThing: T) = if (this.contains(theThing)) Unit else fail("$this should contain $theThing", "$theThing", join(this))
infix fun <T> Iterable<T>.`should not contain`(theThing: T) = if (!this.contains(theThing)) Unit else fail("$this should not contain $theThing", "$theThing", join(this))

/*
    Iterable
 */
infix fun <T> Iterable<T>.shouldContain(theThing: T) = this `should contain` theThing
infix fun <T> Iterable<T>.shouldNotContain(theThing: T) = this `should not contain` theThing
infix fun <T> Iterable<T>?.shouldEqual(theOther: Iterable<T>?) = this `should equal` theOther
infix fun <T> Iterable<T>?.`should equal`(theOther: Iterable<T>?) = assertEquals(theOther, this)

/*
    Maps
 */
infix fun <R, T> Map<R, T>.shouldHaveKey(theKey: R) = this `should have key` theKey
infix fun <R, T> Map<R, T>.shouldNotHaveKey(theKey: R) = this `should not have key` theKey

infix fun <R, T> Map<R, T>.shouldHaveValue(theValue: T) = this `should have value` theValue
infix fun <R, T> Map<R, T>.shouldNotHaveValue(theValue: T) = this `should not have value` theValue

infix fun <R, T> Map<R, T>.shouldContain(thePair: Pair<R, T>) = this `should contain` thePair
infix fun <R, T> Map<R, T>.shouldNotContain(thePair: Pair<R, T>) = this `should not contain` thePair

/*
    General
 */

infix fun <T> Any?.shouldBeIn(array: Array<T>) = this `should be in` array
infix fun <T> Any?.shouldNotBeIn(array: Array<T>) = this `should not be in` array

infix fun <T> Any?.shouldBeIn(iterable: Iterable<T>) = this `should be in` iterable
infix fun <T> Any?.shouldNotBeIn(iterable: Iterable<T>) = this `should not be in` iterable
