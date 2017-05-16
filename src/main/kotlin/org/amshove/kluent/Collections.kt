package org.amshove.kluent

import org.junit.Assert.*

infix fun <T> Array<T>.shouldContain(theThing: T) = this `should contain` theThing
infix fun <T> Array<T>.`should contain`(theThing: T) = if (this.contains(theThing)) Unit else fail("$this should contain $theThing", "$theThing", join(this))

infix fun <T> Array<T>.`should not contain`(theThing: T) = if (!this.contains(theThing)) Unit else fail("$this should not contain $theThing", "the Array to not contain $theThing", join(this))
infix fun <T> Array<T>.shouldNotContain(theThing: T) = this `should not contain` theThing

infix fun <T> Array<T>?.`should equal`(theOther: Array<T>?) = assertArrayEquals(theOther, this)
infix fun <T> Array<T>?.shouldEqual(theOther: Array<T>?) = this `should equal` theOther

fun <T> Array<T>.`should be empty`() = assertEmpty(this.toList(), "Array")
fun <T> Array<T>.shouldBeEmpty() = this.`should be empty`()

fun <T> Array<T>.`should not be empty`() = assertNotEmpty(this.toList(), "Array")
fun <T> Array<T>.shouldNotBeEmpty() = this.`should not be empty`()

infix fun IntArray.`should equal`(theOther: IntArray) = assertArrayEquals(this, theOther)
infix fun IntArray.shouldEqual(theOther: IntArray) = this `should equal` theOther

fun IntArray.`should be empty`() = this.toTypedArray().`should be empty`()
fun IntArray.shouldBeEmpty() = this.`should be empty`()

fun IntArray.`should not be empty`() = this.toTypedArray().`should not be empty`()
fun IntArray.shouldNotBeEmpty() = this.`should not be empty`()

infix fun IntArray.`should contain`(theThing: Int) = this.toTypedArray() `should contain` theThing
infix fun IntArray.shouldContain(theThing: Int) = this `should contain` theThing

infix fun IntArray.`should not contain`(theThing: Int) = this.toTypedArray() `should not contain` theThing
infix fun IntArray.shouldNotContain(theThing: Int) = this `should not contain` theThing

infix fun Int.`should be in`(theArray: IntArray) = this `should be in` theArray.toTypedArray()
infix fun Int.shouldBeIn(theArray: IntArray) = this `should be in` theArray

infix fun Int.`should not be in`(theArray: IntArray) = this `should not be in` theArray.toTypedArray()
infix fun Int.shouldNotBeIn(theArray: IntArray) = this `should not be in` theArray

infix fun BooleanArray.`should equal`(theOther: BooleanArray) = assertArrayEquals(this, theOther)
infix fun BooleanArray.shouldEqual(theOther: BooleanArray) = this `should equal` theOther

fun BooleanArray.`should be empty`() = this.toTypedArray().`should be empty`()
fun BooleanArray.shouldBeEmpty() = this.`should be empty`()

fun BooleanArray.`should not be empty`() = this.toTypedArray().`should not be empty`()
fun BooleanArray.shouldNotBeEmpty() = this.`should not be empty`()

infix fun BooleanArray.`should contain`(theThing: Boolean) = this.toTypedArray() `should contain` theThing
infix fun BooleanArray.shouldContain(theThing: Boolean) = this `should contain` theThing

infix fun BooleanArray.`should not contain`(theThing: Boolean) = this.toTypedArray() `should not contain` theThing
infix fun BooleanArray.shouldNotContain(theThing: Boolean) = this `should not contain` theThing

infix fun Boolean.`should be in`(theArray: BooleanArray) = this `should be in` theArray.toTypedArray()
infix fun Boolean.shouldBeIn(theArray: BooleanArray) = this `should be in` theArray

infix fun Boolean.`should not be in`(theArray: BooleanArray) = this `should not be in` theArray.toTypedArray()
infix fun Boolean.shouldNotBeIn(theArray: BooleanArray) = this `should not be in` theArray

infix fun ByteArray.`should equal`(theOther: ByteArray) = assertArrayEquals(this, theOther)
infix fun ByteArray.shouldEqual(theOther: ByteArray) = this `should equal` theOther

fun ByteArray.`should be empty`() = this.toTypedArray().`should be empty`()
fun ByteArray.shouldBeEmpty() = this.`should be empty`()

fun ByteArray.`should not be empty`() = this.toTypedArray().`should not be empty`()
fun ByteArray.shouldNotBeEmpty() = this.`should not be empty`()

infix fun ByteArray.`should contain`(theThing: Byte) = this.toTypedArray() `should contain` theThing
infix fun ByteArray.shouldContain(theThing: Byte) = this `should contain` theThing

infix fun ByteArray.`should not contain`(theThing: Byte) = this.toTypedArray() `should not contain` theThing
infix fun ByteArray.shouldNotContain(theThing: Byte) = this `should not contain` theThing

infix fun Byte.`should be in`(theArray: ByteArray) = this `should be in` theArray.toTypedArray()
infix fun Byte.shouldBeIn(theArray: ByteArray) = this `should be in` theArray

infix fun Byte.`should not be in`(theArray: ByteArray) = this `should not be in` theArray.toTypedArray()
infix fun Byte.shouldNotBeIn(theArray: ByteArray) = this `should not be in` theArray

infix fun CharArray.`should equal`(theOther: CharArray) = assertArrayEquals(this, theOther)
infix fun CharArray.shouldEqual(theOther: CharArray) = this `should equal` theOther

infix fun CharArray.`should not equal`(theOther: CharArray) = this.toTypedArray() `should not equal` theOther.toTypedArray()
infix fun CharArray.shouldNotEqual(theOther: CharArray) = this `should not equal` theOther

fun CharArray.`should be empty`() = this.toTypedArray().`should be empty`()
fun CharArray.shouldBeEmpty() = this.`should be empty`()

fun CharArray.`should not be empty`() = this.toTypedArray().`should not be empty`()
fun CharArray.shouldNotBeEmpty() = this.`should not be empty`()

infix fun CharArray.`should contain`(theThing: Char) = this.toTypedArray() `should contain` theThing
infix fun CharArray.shouldContain(theThing: Char) = this `should contain` theThing

infix fun CharArray.`should not contain`(theThing: Char) = this.toTypedArray() `should not contain` theThing
infix fun CharArray.shouldNotContain(theThing: Char) = this `should not contain` theThing

infix fun Char.`should be in`(theArray: CharArray) = this `should be in` theArray.toTypedArray()
infix fun Char.shouldBeIn(theArray: CharArray) = this `should be in` theArray

infix fun Char.`should not be in`(theArray: CharArray) = this `should not be in` theArray.toTypedArray()
infix fun Char.shouldNotBeIn(theArray: CharArray) = this `should not be in` theArray

infix fun DoubleArray.`should equal`(theOther: DoubleArray) = assertArrayEquals(this.toTypedArray(), theOther.toTypedArray())
infix fun DoubleArray.shouldEqual(theOther: DoubleArray) = this `should equal` theOther

fun DoubleArray.`should be empty`() = this.toTypedArray().`should be empty`()
fun DoubleArray.shouldBeEmpty() = this.`should be empty`()

fun DoubleArray.`should not be empty`() = this.toTypedArray().`should not be empty`()
fun DoubleArray.shouldNotBeEmpty() = this.`should not be empty`()

infix fun DoubleArray.`should contain`(theThing: Double) = this.toTypedArray() `should contain` theThing
infix fun DoubleArray.shouldContain(theThing: Double) = this `should contain` theThing

infix fun DoubleArray.`should not contain`(theThing: Double) = this.toTypedArray() `should not contain` theThing
infix fun DoubleArray.shouldNotContain(theThing: Double) = this `should not contain` theThing

infix fun Double.`should be in`(theArray: DoubleArray) = this `should be in` theArray.toTypedArray()
infix fun Double.shouldBeIn(theArray: DoubleArray) = this `should be in` theArray

infix fun Double.`should not be in`(theArray: DoubleArray) = this `should not be in` theArray.toTypedArray()
infix fun Double.shouldNotBeIn(theArray: DoubleArray) = this `should not be in` theArray

infix fun FloatArray.`should equal`(theOther: FloatArray) = assertArrayEquals(this.toTypedArray(), theOther.toTypedArray())
infix fun FloatArray.shouldEqual(theOther: FloatArray) = this `should equal` theOther

fun FloatArray.`should be empty`() = this.toTypedArray().`should be empty`()
fun FloatArray.shouldBeEmpty() = this.`should be empty`()

fun FloatArray.`should not be empty`() = this.toTypedArray().`should not be empty`()
fun FloatArray.shouldNotBeEmpty() = this.`should not be empty`()

infix fun FloatArray.`should contain`(theThing: Float) = this.toTypedArray() `should contain` theThing
infix fun FloatArray.shouldContain(theThing: Float) = this `should contain` theThing

infix fun FloatArray.`should not contain`(theThing: Float) = this.toTypedArray() `should not contain` theThing
infix fun FloatArray.shouldNotContain(theThing: Float) = this `should not contain` theThing

infix fun Float.`should be in`(theArray: FloatArray) = this `should be in` theArray.toTypedArray()
infix fun Float.shouldBeIn(theArray: FloatArray) = this `should be in` theArray

infix fun Float.`should not be in`(theArray: FloatArray) = this `should not be in` theArray.toTypedArray()
infix fun Float.shouldNotBeIn(theArray: FloatArray) = this `should not be in` theArray

infix fun LongArray.`should equal`(theOther: LongArray) = assertArrayEquals(this, theOther)
infix fun LongArray.shouldEqual(theOther: LongArray) = this `should equal` theOther

fun LongArray.`should be empty`() = this.toTypedArray().`should be empty`()
fun LongArray.shouldBeEmpty() = this.`should be empty`()

fun LongArray.`should not be empty`() = this.toTypedArray().`should not be empty`()
fun LongArray.shouldNotBeEmpty() = this.`should not be empty`()

infix fun LongArray.`should contain`(theThing: Long) = this.toTypedArray() `should contain` theThing
infix fun LongArray.shouldContain(theThing: Long) = this `should contain` theThing

infix fun LongArray.`should not contain`(theThing: Long) = this.toTypedArray() `should not contain` theThing
infix fun LongArray.shouldNotContain(theThing: Long) = this `should not contain` theThing

infix fun Long.`should be in`(theArray: LongArray) = this `should be in` theArray.toTypedArray()
infix fun Long.shouldBeIn(theArray: LongArray) = this `should be in` theArray

infix fun Long.`should not be in`(theArray: LongArray) = this `should not be in` theArray.toTypedArray()
infix fun Long.shouldNotBeIn(theArray: LongArray) = this `should not be in` theArray

infix fun ShortArray.`should equal`(theOther: ShortArray) = assertArrayEquals(this, theOther)
infix fun ShortArray.shouldEqual(theOther: ShortArray) = this `should equal` theOther

fun ShortArray.`should be empty`() = this.toTypedArray().`should be empty`()
fun ShortArray.shouldBeEmpty() = this.`should be empty`()

fun ShortArray.`should not be empty`() = this.toTypedArray().`should not be empty`()
fun ShortArray.shouldNotBeEmpty() = this.`should not be empty`()

infix fun ShortArray.`should contain`(theThing: Short) = this.toTypedArray() `should contain` theThing
infix fun ShortArray.shouldContain(theThing: Short) = this `should contain` theThing

infix fun ShortArray.`should not contain`(theThing: Short) = this.toTypedArray() `should not contain` theThing
infix fun ShortArray.shouldNotContain(theThing: Short) = this `should not contain` theThing

infix fun Short.`should be in`(theArray: ShortArray) = this `should be in` theArray.toTypedArray()
infix fun Short.shouldBeIn(theArray: ShortArray) = this `should be in` theArray

infix fun Short.`should not be in`(theArray: ShortArray) = this `should not be in` theArray.toTypedArray()
infix fun Short.shouldNotBeIn(theArray: ShortArray) = this `should not be in` theArray


infix fun <T> Iterable<T>.`should contain`(theThing: T) = if (this.contains(theThing)) Unit else fail("$this should contain $theThing", "$theThing", join(this))
infix fun <T> Iterable<T>.shouldContain(theThing: T) = this `should contain` theThing

infix fun <T> Iterable<T>.`should not contain`(theThing: T) = if (!this.contains(theThing)) Unit else fail("$this should not contain $theThing", "the Iterable to not contain $theThing", join(this))
infix fun <T> Iterable<T>.shouldNotContain(theThing: T) = this `should not contain` theThing

infix fun <T> Iterable<T>?.`should equal`(theOther: Iterable<T>?) = assertEquals(theOther, this)
infix fun <T> Iterable<T>?.shouldEqual(theOther: Iterable<T>?) = this `should equal` theOther

fun <T> Iterable<T>.`should be empty`() = assertEmpty(this, "Iterable")
fun <T> Iterable<T>.shouldBeEmpty() = this.`should be empty`()

fun <T> Iterable<T>.`should not be empty`() = assertNotEmpty(this, "Iterable")
fun <T> Iterable<T>.shouldNotBeEmpty() = this.`should not be empty`()

infix fun <R, T> Map<R, T>.`should have key`(theKey: R) = if (this.containsKey(theKey)) Unit else fail("$this should contain key $theKey", "$theKey", join(this.keys))
infix fun <R, T> Map<R, T>.shouldHaveKey(theKey: R) = this `should have key` theKey

infix fun <R, T> Map<R, T>.`should not have key`(theKey: R) = if (!this.containsKey(theKey)) Unit else fail("$this should not contain key $theKey", "the map to not have the key $theKey", join(this.keys))
infix fun <R, T> Map<R, T>.shouldNotHaveKey(theKey: R) = this `should not have key` theKey

infix fun <R, T> Map<R, T>.`should have value`(theValue: T) = if (this.values.contains(theValue)) Unit else fail("$this should contain the value $theValue", "$theValue", join(this.values))
infix fun <R, T> Map<R, T>.shouldHaveValue(theValue: T) = this `should have value` theValue

infix fun <R, T> Map<R, T>.`should not have value`(theValue: T) = if (!this.values.contains(theValue)) Unit else fail("$this should not contain the value $theValue", "the map to not have the value $theValue", join(this.values))
infix fun <R, T> Map<R, T>.shouldNotHaveValue(theValue: T) = this `should not have value` theValue

infix fun <R, T> Map<R, T>.`should contain`(theThing: Pair<R, T>) = if (this[theThing.first] == theThing.second) Unit else fail("$this should contain $theThing", "$theThing", join(this))
infix fun <R, T> Map<R, T>.shouldContain(thePair: Pair<R, T>) = this `should contain` thePair

infix fun <R, T> Map<R, T>.`should not contain`(theThing: Pair<R, T>) = if (this[theThing.first] != theThing.second) Unit else fail("$this should not contain $theThing", "the map to not contain the pair $theThing", join(this))
infix fun <R, T> Map<R, T>.shouldNotContain(thePair: Pair<R, T>) = this `should not contain` thePair

fun <R, T> Map<R, T>.`should be empty`() = assertEmpty(this.toList(), "Map")
fun <R, T> Map<R, T>.shouldBeEmpty() = this.`should be empty`()

fun <R, T> Map<R, T>.`should not be empty`() = assertNotEmpty(this.toList(), "Map")
fun <R, T> Map<R, T>.shouldNotBeEmpty() = this.`should not be empty`()

infix fun <T> Any?.`should not be in`(array: Array<T>) = if (!array.contains(this)) Unit else fail("$this should not be in $array", "the value $this to not be in the Array", join(array))
infix fun <T> Any?.shouldNotBeIn(array: Array<T>) = this `should not be in` array

infix fun <T> Any?.`should be in`(iterable: Iterable<T>) = if (iterable.contains(this)) Unit else fail("$this should be in $iterable", "$this", join(iterable))
infix fun <T> Any?.shouldBeIn(iterable: Iterable<T>) = this `should be in` iterable

infix fun <T> Any?.`should not be in`(iterable: Iterable<T>) = if (!iterable.contains(this)) Unit else fail("$this should not be in $iterable", "the value $this to not be in the Iterable", join(iterable))
infix fun <T> Any?.shouldNotBeIn(iterable: Iterable<T>) = this `should not be in` iterable

infix fun <T> Any?.`should be in`(array: Array<T>) = if (array.contains(this)) Unit else fail("$this should be in $array", "$this", join(array))
infix fun <T> Any?.shouldBeIn(array: Array<T>) = this `should be in` array

private fun <T> assertEmpty(iterable: Iterable<T>, collectionType: String) = assertTrue("Expected the $collectionType to be empty, but has ${iterable.count()} elements", iterable.count() == 0)
private fun <T> assertNotEmpty(iterable: Iterable<T>, collectionType: String) = assertTrue("Expected the $collectionType to contain elements, but is empty", iterable.count() > 0)
