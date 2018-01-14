package org.amshove.kluent

import org.junit.Assert.*

infix fun <T> Array<T>.shouldContain(theThing: T) = this.apply { if (this.contains(theThing)) Unit else fail("$this should contain $theThing", "$theThing", join(this)) }

infix fun <T> Array<T>.shouldContainSome(things: Array<T>) = this.apply { assertTrue("Expected $this to contain at least one of $things", this.any { things.contains(it) }) }

infix fun <T> Array<T>.shouldContainSome(things: Iterable<T>) = this.apply { assertTrue("Expected $this to contain at least one of $things", this.any { things.contains(it) }) }

infix fun <T> Array<T>.shouldContainNone(things: Array<T>) = this.apply { assertTrue("Expected $this to contain none of $things", this.none { things.contains(it) }) }

infix fun <T> Array<T>.shouldContainNone(things: Iterable<T>) = this.apply { assertTrue("Expected $this to contain none of $things", this.none { things.contains(it) }) }

infix fun <T> Array<T>.shouldContainAll(things: Array<T>) = this.apply { things.forEach { shouldContain(it) } }

infix fun <T> Array<T>.shouldContainAll(things: Iterable<T>) = this.apply { things.forEach { shouldContain(it) } }

infix fun <T> Array<T>.shouldNotContain(theThing: T) = this.apply { if (!this.contains(theThing)) Unit else fail("$this should not contain $theThing", "the Array to not contain $theThing", join(this)) }

infix fun <T> Array<T>.shouldNotContainAny(things: Array<T>) = this.apply { things.forEach { shouldNotContain(it) } }

infix fun <T> Array<T>.shouldNotContainAny(things: Iterable<T>) = this.apply { things.forEach { shouldNotContain(it) } }

infix fun <T> Array<T>?.shouldEqual(theOther: Array<T>?) = this.apply { assertArrayEquals(theOther, this) }

fun <T> Array<T>.shouldBeEmpty() = this.apply { assertEmpty(this.toList(), "Array") }

fun <T> Array<T>.shouldNotBeEmpty() = this.apply { assertNotEmpty(this.toList(), "Array") }

infix fun IntArray.shouldEqual(theOther: IntArray) = this.apply { assertArrayEquals(this, theOther) }

fun IntArray.shouldBeEmpty() = this.apply { this.toTypedArray().shouldBeEmpty() }

fun IntArray.shouldNotBeEmpty() = this.apply { this.toTypedArray().shouldNotBeEmpty() }

infix fun IntArray.shouldContain(theThing: Int) = this.apply { this.toTypedArray() shouldContain theThing }

infix fun IntArray.shouldContainSome(things: IntArray) = this.apply { this.toTypedArray().shouldContainSome(things.toTypedArray()) }

infix fun IntArray.shouldContainNone(things: IntArray) = this.apply { this.toTypedArray().shouldContainNone(things.toTypedArray()) }

infix fun IntArray.shouldContainAll(things: IntArray) = this.apply { things.forEach { shouldContain(it) } }

infix fun IntArray.shouldNotContain(theThing: Int) = this.apply { this.toTypedArray() shouldNotContain theThing }

infix fun IntArray.shouldNotContainAny(things: IntArray) = this.apply { things.forEach { shouldNotContain(it) } }

infix fun Int.shouldBeIn(theArray: IntArray) = this.apply { this shouldBeIn theArray.toTypedArray() }

infix fun Int.shouldNotBeIn(theArray: IntArray) = this.apply { this shouldNotBeIn theArray.toTypedArray() }

infix fun BooleanArray.shouldEqual(theOther: BooleanArray) = this.apply { assertArrayEquals(this, theOther) }

fun BooleanArray.shouldBeEmpty() = this.apply { this.toTypedArray().shouldBeEmpty() }

fun BooleanArray.shouldNotBeEmpty() = this.apply { this.toTypedArray().shouldNotBeEmpty() }

infix fun BooleanArray.shouldContain(theThing: Boolean) = this.apply { this.toTypedArray() shouldContain theThing }

infix fun BooleanArray.shouldContainSome(things: BooleanArray) = this.apply { this.toTypedArray().shouldContainSome(things.toTypedArray()) }

infix fun BooleanArray.shouldContainNone(things: BooleanArray) = this.apply { this.toTypedArray().shouldContainNone(things.toTypedArray()) }

infix fun BooleanArray.shouldContainAll(things: BooleanArray) = this.apply { things.forEach { shouldContain(it) } }

infix fun BooleanArray.shouldNotContain(theThing: Boolean) = this.apply { this.toTypedArray() shouldNotContain theThing }

infix fun BooleanArray.shouldNotContainAny(things: BooleanArray) = this.apply { things.forEach { shouldNotContain(it) } }

infix fun Boolean.shouldBeIn(theArray: BooleanArray) = this.apply { this shouldBeIn theArray.toTypedArray() }

infix fun Boolean.shouldNotBeIn(theArray: BooleanArray) = this.apply { this shouldNotBeIn theArray.toTypedArray() }

infix fun ByteArray.shouldEqual(theOther: ByteArray) = this.apply { assertArrayEquals(this, theOther) }

fun ByteArray.shouldBeEmpty() = this.apply { this.toTypedArray().shouldBeEmpty() }

fun ByteArray.shouldNotBeEmpty() = this.apply { this.toTypedArray().shouldNotBeEmpty() }

infix fun ByteArray.shouldContain(theThing: Byte) = this.apply { this.toTypedArray() shouldContain theThing }

infix fun ByteArray.shouldContainSome(things: ByteArray) = this.apply { this.toTypedArray().shouldContainSome(things.toTypedArray()) }

infix fun ByteArray.shouldContainNone(things: ByteArray) = this.apply { this.toTypedArray().shouldContainNone(things.toTypedArray()) }

infix fun ByteArray.shouldContainAll(things: ByteArray) = this.apply { things.forEach { shouldContain(it) } }

infix fun ByteArray.shouldNotContain(theThing: Byte) = this.apply { this.toTypedArray() shouldNotContain theThing }

infix fun ByteArray.shouldNotContainAny(things: ByteArray) = this.apply { things.forEach { shouldNotContain(it) } }

infix fun Byte.shouldBeIn(theArray: ByteArray) = this.apply { this shouldBeIn theArray.toTypedArray() }

infix fun Byte.shouldNotBeIn(theArray: ByteArray) = this.apply { this shouldNotBeIn theArray.toTypedArray() }

infix fun CharArray.shouldEqual(theOther: CharArray) = this.apply { assertArrayEquals(this, theOther) }

infix fun CharArray.shouldNotEqual(theOther: CharArray) = this.apply { this.toTypedArray() shouldNotEqual theOther.toTypedArray() }

fun CharArray.shouldBeEmpty() = this.apply { this.toTypedArray().shouldBeEmpty() }

fun CharArray.shouldNotBeEmpty() = this.apply { this.toTypedArray().shouldNotBeEmpty() }

infix fun CharArray.shouldContain(theThing: Char) = this.apply { this.toTypedArray() shouldContain theThing }

infix fun CharArray.shouldContainSome(things: CharArray) = this.apply { this.toTypedArray().shouldContainSome(things.toTypedArray()) }

infix fun CharArray.shouldContainNone(things: CharArray) = this.apply { this.toTypedArray().shouldContainNone(things.toTypedArray()) }

infix fun CharArray.shouldContainAll(things: CharArray) = this.apply { things.forEach { shouldContain(it) } }

infix fun CharArray.shouldNotContain(theThing: Char) = this.apply { this.toTypedArray() shouldNotContain theThing }

infix fun CharArray.shouldNotContainAny(things: CharArray) = this.apply { things.forEach { shouldNotContain(it) } }

infix fun Char.shouldBeIn(theArray: CharArray) = this.apply { this shouldBeIn theArray.toTypedArray() }

infix fun Char.shouldNotBeIn(theArray: CharArray) = this.apply { this shouldNotBeIn theArray.toTypedArray() }

infix fun DoubleArray.shouldEqual(theOther: DoubleArray) = this.apply { assertArrayEquals(this.toTypedArray(), theOther.toTypedArray()) }

fun DoubleArray.shouldBeEmpty() = this.apply { this.toTypedArray().shouldBeEmpty() }

fun DoubleArray.shouldNotBeEmpty() = this.apply { this.toTypedArray().shouldNotBeEmpty() }

infix fun DoubleArray.shouldContain(theThing: Double) = this.apply { this.toTypedArray() shouldContain theThing }

infix fun DoubleArray.shouldContainSome(things: DoubleArray) = this.apply { this.toTypedArray().shouldContainSome(things.toTypedArray()) }

infix fun DoubleArray.shouldContainNone(things: DoubleArray) = this.apply { this.toTypedArray().shouldContainNone(things.toTypedArray()) }

infix fun DoubleArray.shouldContainAll(things: DoubleArray) = this.apply { things.forEach { shouldContain(it) } }

infix fun DoubleArray.shouldNotContain(theThing: Double) = this.apply { this.toTypedArray() shouldNotContain theThing }

infix fun DoubleArray.shouldNotContainAny(things: DoubleArray) = this.apply { things.forEach { shouldNotContain(it) } }

infix fun Double.shouldBeIn(theArray: DoubleArray) = this.apply { this shouldBeIn theArray.toTypedArray() }

infix fun Double.shouldNotBeIn(theArray: DoubleArray) = this.apply { this shouldNotBeIn theArray.toTypedArray() }

infix fun FloatArray.shouldEqual(theOther: FloatArray) = this.apply { assertArrayEquals(this.toTypedArray(), theOther.toTypedArray()) }

fun FloatArray.shouldBeEmpty() = this.apply { this.toTypedArray().shouldBeEmpty() }

fun FloatArray.shouldNotBeEmpty() = this.apply { this.toTypedArray().shouldNotBeEmpty() }

infix fun FloatArray.shouldContain(theThing: Float) = this.apply { this.toTypedArray() shouldContain theThing }

infix fun FloatArray.shouldContainSome(things: FloatArray) = this.apply { this.toTypedArray().shouldContainSome(things.toTypedArray()) }

infix fun FloatArray.shouldContainNone(things: FloatArray) = this.apply { this.toTypedArray().shouldContainNone(things.toTypedArray()) }

infix fun FloatArray.shouldContainAll(things: FloatArray) = this.apply { things.forEach { shouldContain(it) } }

infix fun FloatArray.shouldNotContain(theThing: Float) = this.apply { this.toTypedArray() shouldNotContain theThing }

infix fun FloatArray.shouldNotContainAny(things: FloatArray) = this.apply { things.forEach { shouldNotContain(it) } }

infix fun Float.shouldBeIn(theArray: FloatArray) = this.apply { this shouldBeIn theArray.toTypedArray() }

infix fun Float.shouldNotBeIn(theArray: FloatArray) = this.apply { this shouldNotBeIn theArray.toTypedArray() }

infix fun LongArray.shouldEqual(theOther: LongArray) = this.apply { assertArrayEquals(this, theOther) }

fun LongArray.shouldBeEmpty() = this.apply { this.toTypedArray().shouldBeEmpty() }

fun LongArray.shouldNotBeEmpty() = this.apply { this.toTypedArray().shouldNotBeEmpty() }

infix fun LongArray.shouldContain(theThing: Long) = this.apply { this.toTypedArray() shouldContain theThing }

infix fun LongArray.shouldContainSome(things: LongArray) = this.apply { this.toTypedArray().shouldContainSome(things.toTypedArray()) }

infix fun LongArray.shouldContainNone(things: LongArray) = this.apply { this.toTypedArray().shouldContainNone(things.toTypedArray()) }

infix fun LongArray.shouldContainAll(things: LongArray) = this.apply { things.forEach { shouldContain(it) } }

infix fun LongArray.shouldNotContain(theThing: Long) = this.apply { this.toTypedArray() shouldNotContain theThing }

infix fun LongArray.shouldNotContainAny(things: LongArray) = this.apply { things.forEach { shouldNotContain(it) } }

infix fun Long.shouldBeIn(theArray: LongArray) = this.apply { this shouldBeIn theArray.toTypedArray() }

infix fun Long.shouldNotBeIn(theArray: LongArray) = this.apply { this shouldNotBeIn theArray.toTypedArray() }

infix fun ShortArray.shouldEqual(theOther: ShortArray) = this.apply { assertArrayEquals(this, theOther) }

fun ShortArray.shouldBeEmpty() = this.apply { this.toTypedArray().shouldBeEmpty() }

fun ShortArray.shouldNotBeEmpty() = this.apply { this.toTypedArray().shouldNotBeEmpty() }

infix fun ShortArray.shouldContain(theThing: Short) = this.apply { this.toTypedArray() shouldContain theThing }

infix fun ShortArray.shouldContainSome(things: ShortArray) = this.apply { this.toTypedArray().shouldContainSome(things.toTypedArray()) }

infix fun ShortArray.shouldContainNone(things: ShortArray) = this.apply { this.toTypedArray().shouldContainNone(things.toTypedArray()) }

infix fun ShortArray.shouldContainAll(things: ShortArray) = this.apply { things.forEach { shouldContain(it) } }

infix fun ShortArray.shouldNotContain(theThing: Short) = this.apply { this.toTypedArray() shouldNotContain theThing }

infix fun ShortArray.shouldNotContainAny(things: ShortArray) = this.apply { things.forEach { shouldNotContain(it) } }

infix fun Short.shouldBeIn(theArray: ShortArray) = this.apply { this shouldBeIn theArray.toTypedArray() }

infix fun Short.shouldNotBeIn(theArray: ShortArray) = this.apply { this shouldNotBeIn theArray.toTypedArray() }

infix fun <T> Iterable<T>.shouldContain(theThing: T) = this.apply { if (this.contains(theThing)) Unit else fail("$this should contain $theThing", "$theThing", join(this)) }

infix fun <T> Iterable<T>.shouldContainSome(things: Iterable<T>) = this.apply { assertTrue("Expected $this to contain at least one of $things", this.any { things.contains(it) }) }

infix fun <T> Iterable<T>.shouldContainSome(things: Array<T>) = this.apply { assertTrue("Expected $this to contain at least one of $things", this.any { things.contains(it) }) }

infix fun <T> Iterable<T>.shouldContainNone(things: Iterable<T>) = this.apply { assertTrue("Expected $this to contain none of $things", this.none { things.contains(it) }) }

infix fun <T> Iterable<T>.shouldContainNone(things: Array<T>) = this.apply { assertTrue("Expected $this to contain none of $things", this.none { things.contains(it) }) }

infix fun <T> Iterable<T>.shouldContainAll(things: Iterable<T>) = this.apply { things.forEach { shouldContain(it) } }

infix fun <T> Iterable<T>.shouldContainAll(things: Array<T>) = this.apply { things.forEach { shouldContain(it) } }

infix fun <T> Iterable<T>.shouldNotContain(theThing: T) = this.apply { if (!this.contains(theThing)) Unit else fail("$this should not contain $theThing", "the Iterable to not contain $theThing", join(this)) }

infix fun <T> Iterable<T>.shouldNotContainAny(things: Iterable<T>) = this.apply { things.forEach { shouldNotContain(it) } }

infix fun <T> Iterable<T>.shouldNotContainAny(things: Array<T>) = this.apply { things.forEach { shouldNotContain(it) } }

infix fun <T> Iterable<T>?.shouldEqual(theOther: Iterable<T>?) = this.apply { assertEquals(theOther, this) }

fun <T> Iterable<T>.shouldBeEmpty() = this.apply { assertEmpty(this, "Iterable") }

fun <T> Iterable<T>.shouldNotBeEmpty() = this.apply { assertNotEmpty(this, "Iterable") }

infix fun <R, T> Map<R, T>.shouldHaveKey(theKey: R) = this.apply { if (this.containsKey(theKey)) Unit else fail("$this should contain key $theKey", "$theKey", join(this.keys)) }

infix fun <R, T> Map<R, T>.shouldNotHaveKey(theKey: R) = this.apply { if (!this.containsKey(theKey)) Unit else fail("$this should not contain key $theKey", "the map to not have the key $theKey", join(this.keys)) }

infix fun <R, T> Map<R, T>.shouldHaveValue(theValue: T) = this.apply { if (this.values.contains(theValue)) Unit else fail("$this should contain the value $theValue", "$theValue", join(this.values)) }

infix fun <R, T> Map<R, T>.shouldNotHaveValue(theValue: T) = this.apply { if (!this.values.contains(theValue)) Unit else fail("$this should not contain the value $theValue", "the map to not have the value $theValue", join(this.values)) }

infix fun <R, T> Map<R, T>.shouldContain(theThing: Pair<R, T>) = this.apply { if (this[theThing.first] == theThing.second) Unit else fail("$this should contain $theThing", "$theThing", join(this)) }

infix fun <R, T> Map<R, T>.shouldContainAll(things: Map<R, T>) = this.apply { things.forEach { shouldContain(it.toPair()) } }

infix fun <R, T> Map<R, T>.shouldNotContain(theThing: Pair<R, T>) = this.apply { if (this[theThing.first] != theThing.second) Unit else fail("$this should not contain $theThing", "the map to not contain the pair $theThing", join(this)) }

infix fun <R, T> Map<R, T>.shouldNotContainAny(things: Map<R, T>) = this.apply { things.forEach { shouldNotContain(it.toPair()) } }

fun <R, T> Map<R, T>.shouldBeEmpty() = this.apply { assertEmpty(this.toList(), "Map") }

fun <R, T> Map<R, T>.shouldNotBeEmpty() = this.apply { assertNotEmpty(this.toList(), "Map") }

infix fun <T> Any?.shouldNotBeIn(array: Array<T>) = this.apply { if (!array.contains(this)) Unit else fail("$this should not be in $array", "the value $this to not be in the Array", join(array)) }

infix fun <T> Any?.shouldBeIn(iterable: Iterable<T>) = this.apply { if (iterable.contains(this)) Unit else fail("$this should be in $iterable", "$this", join(iterable)) }

infix fun <T> Any?.shouldNotBeIn(iterable: Iterable<T>) = this.apply { if (!iterable.contains(this)) Unit else fail("$this should not be in $iterable", "the value $this to not be in the Iterable", join(iterable)) }

infix fun <T> Any?.shouldBeIn(array: Array<T>) = this.apply { if (array.contains(this)) Unit else fail("$this should be in $array", "$this", join(array)) }

internal fun <T> assertEmpty(iterable: Iterable<T>, collectionType: String) = assertTrue("Expected the $collectionType to be empty, but has ${iterable.count()} elements", iterable.count() == 0)
internal fun <T> assertNotEmpty(iterable: Iterable<T>, collectionType: String) = assertTrue("Expected the $collectionType to contain elements, but is empty", iterable.count() > 0)
