package org.amshove.kluent

import org.junit.jupiter.api.Assertions.*

infix fun <T> Array<T>.shouldContain(theThing: T) = if (this.contains(theThing)) Unit else fail("$this should contain $theThing", "$theThing", join(this))

infix fun <T> Array<T>.shouldContainSome(things: Array<T>) = assertTrue(this.any { things.contains(it) }, "Expected $this to contain at least one of $things")

infix fun <T> Array<T>.shouldContainNone(things: Array<T>) = assertTrue(this.none { things.contains(it) }, "Expected $this to contain none of $things")

infix fun <T> Array<T>.shouldContainAll(things: Array<T>) = things.forEach { shouldContain(it) }

infix fun <T> Array<T>.shouldNotContain(theThing: T) = if (!this.contains(theThing)) Unit else fail("$this should not contain $theThing", "the Array to not contain $theThing", join(this))

infix fun <T> Array<T>.shouldNotContainAny(things: Array<T>) = things.forEach { shouldNotContain(it) }

infix fun <T> Array<T>?.shouldEqual(theOther: Array<T>?) = assertArrayEquals(theOther, this)

fun <T> Array<T>.shouldBeEmpty() = assertEmpty(this.toList(), "Array")

fun <T> Array<T>.shouldNotBeEmpty() = assertNotEmpty(this.toList(), "Array")

infix fun IntArray.shouldEqual(theOther: IntArray) = assertArrayEquals(this, theOther)

fun IntArray.shouldBeEmpty() = this.toTypedArray().shouldBeEmpty()

fun IntArray.shouldNotBeEmpty() = this.toTypedArray().shouldNotBeEmpty()

infix fun IntArray.shouldContain(theThing: Int) = this.toTypedArray() shouldContain theThing

infix fun IntArray.shouldContainSome(things: IntArray) = this.toTypedArray().shouldContainSome(things.toTypedArray())

infix fun IntArray.shouldContainNone(things: IntArray) = this.toTypedArray().shouldContainNone(things.toTypedArray())

infix fun IntArray.shouldContainAll(things: IntArray) = things.forEach { shouldContain(it) }

infix fun IntArray.shouldNotContain(theThing: Int) = this.toTypedArray() shouldNotContain theThing

infix fun IntArray.shouldNotContainAny(things: IntArray) = things.forEach { shouldNotContain(it) }

infix fun Int.shouldBeIn(theArray: IntArray) = this shouldBeIn theArray.toTypedArray()

infix fun Int.shouldNotBeIn(theArray: IntArray) = this shouldNotBeIn theArray.toTypedArray()

infix fun BooleanArray.shouldEqual(theOther: BooleanArray) = assertArrayEquals(this, theOther)

fun BooleanArray.shouldBeEmpty() = this.toTypedArray().shouldBeEmpty()

fun BooleanArray.shouldNotBeEmpty() = this.toTypedArray().shouldNotBeEmpty()

infix fun BooleanArray.shouldContain(theThing: Boolean) = this.toTypedArray() shouldContain theThing

infix fun BooleanArray.shouldContainSome(things: BooleanArray) = this.toTypedArray().shouldContainSome(things.toTypedArray())

infix fun BooleanArray.shouldContainNone(things: BooleanArray) = this.toTypedArray().shouldContainNone(things.toTypedArray())

infix fun BooleanArray.shouldContainAll(things: BooleanArray) = things.forEach { shouldContain(it) }

infix fun BooleanArray.shouldNotContain(theThing: Boolean) = this.toTypedArray() shouldNotContain theThing

infix fun BooleanArray.shouldNotContainAny(things: BooleanArray) = things.forEach { shouldNotContain(it) }

infix fun Boolean.shouldBeIn(theArray: BooleanArray) = this shouldBeIn theArray.toTypedArray()

infix fun Boolean.shouldNotBeIn(theArray: BooleanArray) = this shouldNotBeIn theArray.toTypedArray()

infix fun ByteArray.shouldEqual(theOther: ByteArray) = assertArrayEquals(this, theOther)

fun ByteArray.shouldBeEmpty() = this.toTypedArray().shouldBeEmpty()

fun ByteArray.shouldNotBeEmpty() = this.toTypedArray().shouldNotBeEmpty()

infix fun ByteArray.shouldContain(theThing: Byte) = this.toTypedArray() shouldContain theThing

infix fun ByteArray.shouldContainSome(things: ByteArray) = this.toTypedArray().shouldContainSome(things.toTypedArray())

infix fun ByteArray.shouldContainNone(things: ByteArray) = this.toTypedArray().shouldContainNone(things.toTypedArray())

infix fun ByteArray.shouldContainAll(things: ByteArray) = things.forEach { shouldContain(it) }

infix fun ByteArray.shouldNotContain(theThing: Byte) = this.toTypedArray() shouldNotContain theThing

infix fun ByteArray.shouldNotContainAny(things: ByteArray) = things.forEach { shouldNotContain(it) }

infix fun Byte.shouldBeIn(theArray: ByteArray) = this shouldBeIn theArray.toTypedArray()

infix fun Byte.shouldNotBeIn(theArray: ByteArray) = this shouldNotBeIn theArray.toTypedArray()

infix fun CharArray.shouldEqual(theOther: CharArray) = assertArrayEquals(this, theOther)

infix fun CharArray.shouldNotEqual(theOther: CharArray) = this.toTypedArray() shouldNotEqual theOther.toTypedArray()

fun CharArray.shouldBeEmpty() = this.toTypedArray().shouldBeEmpty()

fun CharArray.shouldNotBeEmpty() = this.toTypedArray().shouldNotBeEmpty()

infix fun CharArray.shouldContain(theThing: Char) = this.toTypedArray() shouldContain theThing

infix fun CharArray.shouldContainSome(things: CharArray) = this.toTypedArray().shouldContainSome(things.toTypedArray())

infix fun CharArray.shouldContainNone(things: CharArray) = this.toTypedArray().shouldContainNone(things.toTypedArray())

infix fun CharArray.shouldContainAll(things: CharArray) = things.forEach { shouldContain(it) }

infix fun CharArray.shouldNotContain(theThing: Char) = this.toTypedArray() shouldNotContain theThing

infix fun CharArray.shouldNotContainAny(things: CharArray) = things.forEach { shouldNotContain(it) }

infix fun Char.shouldBeIn(theArray: CharArray) = this shouldBeIn theArray.toTypedArray()

infix fun Char.shouldNotBeIn(theArray: CharArray) = this shouldNotBeIn theArray.toTypedArray()

infix fun DoubleArray.shouldEqual(theOther: DoubleArray) = assertArrayEquals(this.toTypedArray(), theOther.toTypedArray())

fun DoubleArray.shouldBeEmpty() = this.toTypedArray().shouldBeEmpty()

fun DoubleArray.shouldNotBeEmpty() = this.toTypedArray().shouldNotBeEmpty()

infix fun DoubleArray.shouldContain(theThing: Double) = this.toTypedArray() shouldContain theThing

infix fun DoubleArray.shouldContainSome(things: DoubleArray) = this.toTypedArray().shouldContainSome(things.toTypedArray())

infix fun DoubleArray.shouldContainNone(things: DoubleArray) = this.toTypedArray().shouldContainNone(things.toTypedArray())

infix fun DoubleArray.shouldContainAll(things: DoubleArray) = things.forEach { shouldContain(it) }

infix fun DoubleArray.shouldNotContain(theThing: Double) = this.toTypedArray() shouldNotContain theThing

infix fun DoubleArray.shouldNotContainAny(things: DoubleArray) = things.forEach { shouldNotContain(it) }

infix fun Double.shouldBeIn(theArray: DoubleArray) = this shouldBeIn theArray.toTypedArray()

infix fun Double.shouldNotBeIn(theArray: DoubleArray) = this shouldNotBeIn theArray.toTypedArray()

infix fun FloatArray.shouldEqual(theOther: FloatArray) = assertArrayEquals(this.toTypedArray(), theOther.toTypedArray())

fun FloatArray.shouldBeEmpty() = this.toTypedArray().shouldBeEmpty()

fun FloatArray.shouldNotBeEmpty() = this.toTypedArray().shouldNotBeEmpty()

infix fun FloatArray.shouldContain(theThing: Float) = this.toTypedArray() shouldContain theThing

infix fun FloatArray.shouldContainSome(things: FloatArray) = this.toTypedArray().shouldContainSome(things.toTypedArray())

infix fun FloatArray.shouldContainNone(things: FloatArray) = this.toTypedArray().shouldContainNone(things.toTypedArray())

infix fun FloatArray.shouldContainAll(things: FloatArray) = things.forEach { shouldContain(it) }

infix fun FloatArray.shouldNotContain(theThing: Float) = this.toTypedArray() shouldNotContain theThing

infix fun FloatArray.shouldNotContainAny(things: FloatArray) = things.forEach { shouldNotContain(it) }

infix fun Float.shouldBeIn(theArray: FloatArray) = this shouldBeIn theArray.toTypedArray()

infix fun Float.shouldNotBeIn(theArray: FloatArray) = this shouldNotBeIn theArray.toTypedArray()

infix fun LongArray.shouldEqual(theOther: LongArray) = assertArrayEquals(this, theOther)

fun LongArray.shouldBeEmpty() = this.toTypedArray().shouldBeEmpty()

fun LongArray.shouldNotBeEmpty() = this.toTypedArray().shouldNotBeEmpty()

infix fun LongArray.shouldContain(theThing: Long) = this.toTypedArray() shouldContain theThing

infix fun LongArray.shouldContainSome(things: LongArray) = this.toTypedArray().shouldContainSome(things.toTypedArray())

infix fun LongArray.shouldContainNone(things: LongArray) = this.toTypedArray().shouldContainNone(things.toTypedArray())

infix fun LongArray.shouldContainAll(things: LongArray) = things.forEach { shouldContain(it) }

infix fun LongArray.shouldNotContain(theThing: Long) = this.toTypedArray() shouldNotContain theThing

infix fun LongArray.shouldNotContainAny(things: LongArray) = things.forEach { shouldNotContain(it) }

infix fun Long.shouldBeIn(theArray: LongArray) = this shouldBeIn theArray.toTypedArray()

infix fun Long.shouldNotBeIn(theArray: LongArray) = this shouldNotBeIn theArray.toTypedArray()

infix fun ShortArray.shouldEqual(theOther: ShortArray) = assertArrayEquals(this, theOther)

fun ShortArray.shouldBeEmpty() = this.toTypedArray().shouldBeEmpty()

fun ShortArray.shouldNotBeEmpty() = this.toTypedArray().shouldNotBeEmpty()

infix fun ShortArray.shouldContain(theThing: Short) = this.toTypedArray() shouldContain theThing

infix fun ShortArray.shouldContainSome(things: ShortArray) = this.toTypedArray().shouldContainSome(things.toTypedArray())

infix fun ShortArray.shouldContainNone(things: ShortArray) = this.toTypedArray().shouldContainNone(things.toTypedArray())

infix fun ShortArray.shouldContainAll(things: ShortArray) = things.forEach { shouldContain(it) }

infix fun ShortArray.shouldNotContain(theThing: Short) = this.toTypedArray() shouldNotContain theThing

infix fun ShortArray.shouldNotContainAny(things: ShortArray) = things.forEach { shouldNotContain(it) }

infix fun Short.shouldBeIn(theArray: ShortArray) = this shouldBeIn theArray.toTypedArray()

infix fun Short.shouldNotBeIn(theArray: ShortArray) = this shouldNotBeIn theArray.toTypedArray()

infix fun <T> Iterable<T>.shouldContain(theThing: T) = if (this.contains(theThing)) Unit else fail("$this should contain $theThing", "$theThing", join(this))

infix fun <T> Iterable<T>.shouldContainSome(things: Iterable<T>) = assertTrue(this.any { things.contains(it) }, "Expected $this to contain at least one of $things")

infix fun <T> Iterable<T>.shouldContainNone(things: Iterable<T>) = assertTrue(this.none { things.contains(it) }, "Expected $this to contain none of $things")

infix fun <T> Iterable<T>.shouldContainAll(things: Iterable<T>) = things.forEach { shouldContain(it) }

infix fun <T> Iterable<T>.shouldNotContain(theThing: T) = if (!this.contains(theThing)) Unit else fail("$this should not contain $theThing", "the Iterable to not contain $theThing", join(this))

infix fun <T> Iterable<T>.shouldNotContainAny(things: Iterable<T>) = things.forEach { shouldNotContain(it) }

infix fun <T> Iterable<T>?.shouldEqual(theOther: Iterable<T>?) = assertEquals(theOther, this)

fun <T> Iterable<T>.shouldBeEmpty() = assertEmpty(this, "Iterable")

fun <T> Iterable<T>.shouldNotBeEmpty() = assertNotEmpty(this, "Iterable")

infix fun <R, T> Map<R, T>.shouldHaveKey(theKey: R) = if (this.containsKey(theKey)) Unit else fail("$this should contain key $theKey", "$theKey", join(this.keys))

infix fun <R, T> Map<R, T>.shouldNotHaveKey(theKey: R) = if (!this.containsKey(theKey)) Unit else fail("$this should not contain key $theKey", "the map to not have the key $theKey", join(this.keys))

infix fun <R, T> Map<R, T>.shouldHaveValue(theValue: T) = if (this.values.contains(theValue)) Unit else fail("$this should contain the value $theValue", "$theValue", join(this.values))

infix fun <R, T> Map<R, T>.shouldNotHaveValue(theValue: T) = if (!this.values.contains(theValue)) Unit else fail("$this should not contain the value $theValue", "the map to not have the value $theValue", join(this.values))

infix fun <R, T> Map<R, T>.shouldContain(theThing: Pair<R, T>) = if (this[theThing.first] == theThing.second) Unit else fail("$this should contain $theThing", "$theThing", join(this))

infix fun <R, T> Map<R, T>.shouldContainAll(things: Map<R, T>) = things.forEach { shouldContain(it.toPair()) }

infix fun <R, T> Map<R, T>.shouldNotContain(theThing: Pair<R, T>) = if (this[theThing.first] != theThing.second) Unit else fail("$this should not contain $theThing", "the map to not contain the pair $theThing", join(this))

infix fun <R, T> Map<R, T>.shouldNotContainAny(things: Map<R, T>) = things.forEach { shouldNotContain(it.toPair()) }

fun <R, T> Map<R, T>.shouldBeEmpty() = assertEmpty(this.toList(), "Map")

fun <R, T> Map<R, T>.shouldNotBeEmpty() = assertNotEmpty(this.toList(), "Map")

infix fun <T> Any?.shouldNotBeIn(array: Array<T>) = if (!array.contains(this)) Unit else fail("$this should not be in $array", "the value $this to not be in the Array", join(array))

infix fun <T> Any?.shouldBeIn(iterable: Iterable<T>) = if (iterable.contains(this)) Unit else fail("$this should be in $iterable", "$this", join(iterable))

infix fun <T> Any?.shouldNotBeIn(iterable: Iterable<T>) = if (!iterable.contains(this)) Unit else fail("$this should not be in $iterable", "the value $this to not be in the Iterable", join(iterable))

infix fun <T> Any?.shouldBeIn(array: Array<T>) = if (array.contains(this)) Unit else fail("$this should be in $array", "$this", join(array))

internal fun <T> assertEmpty(iterable: Iterable<T>, collectionType: String) = assertTrue(iterable.count() == 0, "Expected the $collectionType to be empty, but has ${iterable.count()} elements")
internal fun <T> assertNotEmpty(iterable: Iterable<T>, collectionType: String) = assertTrue(iterable.count() > 0, "Expected the $collectionType to contain elements, but is empty")
