package org.amshove.kluent

import org.junit.Assert.assertArrayEquals
import org.junit.Assert.assertEquals

infix fun <T> Array<T>.shouldContain(theThing: T) = this `should contain` theThing
infix fun <T> Array<T>.`should contain`(theThing: T) = if (this.contains(theThing)) Unit else fail("$this should contain $theThing", "$theThing", join(this))

infix fun <T> Array<T>.`should not contain`(theThing: T) = if (!this.contains(theThing)) Unit else fail("$this should not contain $theThing", "$theThing", join(this))
infix fun <T> Array<T>.shouldNotContain(theThing: T) = this `should not contain` theThing

infix fun <T> Array<T>?.`should equal`(theOther: Array<T>?) = assertArrayEquals(theOther, this)
infix fun <T> Array<T>?.shouldEqual(theOther: Array<T>?) = this `should equal` theOther

infix fun <T> Iterable<T>.`should contain`(theThing: T) = if (this.contains(theThing)) Unit else fail("$this should contain $theThing", "$theThing", join(this))
infix fun <T> Iterable<T>.shouldContain(theThing: T) = this `should contain` theThing

infix fun <T> Iterable<T>.`should not contain`(theThing: T) = if (!this.contains(theThing)) Unit else fail("$this should not contain $theThing", "$theThing", join(this))
infix fun <T> Iterable<T>.shouldNotContain(theThing: T) = this `should not contain` theThing

infix fun <T> Iterable<T>?.`should equal`(theOther: Iterable<T>?) = assertEquals(theOther, this)
infix fun <T> Iterable<T>?.shouldEqual(theOther: Iterable<T>?) = this `should equal` theOther

infix fun <R, T> Map<R, T>.`should have key`(theKey: R) = if (this.containsKey(theKey)) Unit else fail("$this should contain key $theKey", "$theKey", join(this.keys))
infix fun <R, T> Map<R, T>.shouldHaveKey(theKey: R) = this `should have key` theKey

infix fun <R, T> Map<R, T>.`should not have key`(theKey: R) = if (!this.containsKey(theKey)) Unit else fail("$this should not contain key $theKey", "$theKey", join(this.keys))
infix fun <R, T> Map<R, T>.shouldNotHaveKey(theKey: R) = this `should not have key` theKey

infix fun <R, T> Map<R, T>.`should have value`(theValue: T) = if (this.values.contains(theValue)) Unit else fail("$this should contain the value $theValue", "$theValue", join(this.values))
infix fun <R, T> Map<R, T>.shouldHaveValue(theValue: T) = this `should have value` theValue

infix fun <R, T> Map<R, T>.`should not have value`(theValue: T) = if (!this.values.contains(theValue)) Unit else fail("$this should not contain the value $theValue", "$theValue", join(this.values))
infix fun <R, T> Map<R, T>.shouldNotHaveValue(theValue: T) = this `should not have value` theValue

infix fun <R, T> Map<R, T>.`should contain`(theThing: Pair<R, T>) = if (this[theThing.first] == theThing.second) Unit else fail("$this should contain $theThing", "$theThing", join(this))
infix fun <R, T> Map<R, T>.shouldContain(thePair: Pair<R, T>) = this `should contain` thePair

infix fun <R, T> Map<R, T>.`should not contain`(theThing: Pair<R, T>) = if (this[theThing.first] != theThing.second) Unit else fail("$this should not contain $theThing", "$theThing", join(this))
infix fun <R, T> Map<R, T>.shouldNotContain(thePair: Pair<R, T>) = this `should not contain` thePair

infix fun <T> Any?.`should not be in`(array: Array<T>) = if (!array.contains(this)) Unit else fail("$this should not be in $array", "$this", join(array))
infix fun <T> Any?.shouldNotBeIn(array: Array<T>) = this `should not be in` array

infix fun <T> Any?.`should be in`(iterable: Iterable<T>) = if (iterable.contains(this)) Unit else fail("$this should be in $iterable", "$this", join(iterable))
infix fun <T> Any?.shouldBeIn(iterable: Iterable<T>) = this `should be in` iterable

infix fun <T> Any?.`should not be in`(iterable: Iterable<T>) = if (!iterable.contains(this)) Unit else fail("$this should not be in $iterable", "$this", join(iterable))
infix fun <T> Any?.shouldNotBeIn(iterable: Iterable<T>) = this `should not be in` iterable

infix fun <T> Any?.`should be in`(array: Array<T>) = if (array.contains(this)) Unit else fail("$this should be in $array", "$this", join(array))
infix fun <T> Any?.shouldBeIn(array: Array<T>) = this `should be in` array


