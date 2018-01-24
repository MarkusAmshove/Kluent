package org.amshove.kluent

import org.junit.Assert.*

infix fun <T> Array<T>.shouldContain(expected: T) = apply { if (this.contains(expected)) Unit else fail("$this should contain $expected", "$expected", join(this)) }

infix fun <T> Array<T>.shouldContainSome(expected: Array<T>) = apply { assertTrue("Expected $this to contain at least one of $expected", this.any { expected.contains(it) }) }

infix fun <T> Array<T>.shouldContainSome(expected: Iterable<T>) = apply { assertTrue("Expected $this to contain at least one of $expected", this.any { expected.contains(it) }) }

infix fun <T> Array<T>.shouldContainNone(expected: Array<T>) = apply { assertTrue("Expected $this to contain none of $expected", this.none { expected.contains(it) }) }

infix fun <T> Array<T>.shouldContainNone(expected: Iterable<T>) = apply { assertTrue("Expected $this to contain none of $expected", this.none { expected.contains(it) }) }

infix fun <T> Array<T>.shouldContainAll(expected: Array<T>) = apply { expected.forEach { shouldContain(it) } }

infix fun <T> Array<T>.shouldContainAll(expected: Iterable<T>) = apply { expected.forEach { shouldContain(it) } }

infix fun <T> Array<T>.shouldNotContain(expected: T) = apply { if (!this.contains(expected)) Unit else fail("$this should not contain $expected", "the Array to not contain $expected", join(this)) }

infix fun <T> Array<T>.shouldNotContainAny(expected: Array<T>) = apply { expected.forEach { shouldNotContain(it) } }

infix fun <T> Array<T>.shouldNotContainAny(expected: Iterable<T>) = apply { expected.forEach { shouldNotContain(it) } }

infix fun <T> Array<T>?.shouldEqual(expected: Array<T>?) = apply { assertArrayEquals(expected, this) }

fun <T> Array<T>.shouldBeEmpty() = apply { assertEmpty(this.toList(), "Array") }

fun <T> Array<T>.shouldNotBeEmpty() = apply { assertNotEmpty(this.toList(), "Array") }

infix fun IntArray.shouldEqual(expected: IntArray) = apply { assertArrayEquals(this, expected) }

fun IntArray.shouldBeEmpty() = apply { this.toTypedArray().shouldBeEmpty() }

fun IntArray.shouldNotBeEmpty() = apply { this.toTypedArray().shouldNotBeEmpty() }

infix fun IntArray.shouldContain(expected: Int) = apply { this.toTypedArray() shouldContain expected }

infix fun IntArray.shouldContainSome(expected: IntArray) = apply { this.toTypedArray().shouldContainSome(expected.toTypedArray()) }

infix fun IntArray.shouldContainNone(expected: IntArray) = apply { this.toTypedArray().shouldContainNone(expected.toTypedArray()) }

infix fun IntArray.shouldContainAll(expected: IntArray) = apply { expected.forEach { shouldContain(it) } }

infix fun IntArray.shouldNotContain(expected: Int) = apply { this.toTypedArray() shouldNotContain expected }

infix fun IntArray.shouldNotContainAny(expected: IntArray) = apply { expected.forEach { shouldNotContain(it) } }

infix fun Int.shouldBeIn(theArray: IntArray) = apply { this shouldBeIn theArray.toTypedArray() }

infix fun Int.shouldNotBeIn(theArray: IntArray) = apply { this shouldNotBeIn theArray.toTypedArray() }

infix fun BooleanArray.shouldEqual(expected: BooleanArray) = apply { assertArrayEquals(this, expected) }

fun BooleanArray.shouldBeEmpty() = apply { this.toTypedArray().shouldBeEmpty() }

fun BooleanArray.shouldNotBeEmpty() = apply { this.toTypedArray().shouldNotBeEmpty() }

infix fun BooleanArray.shouldContain(expected: Boolean) = apply { this.toTypedArray() shouldContain expected }

infix fun BooleanArray.shouldContainSome(expected: BooleanArray) = apply { this.toTypedArray().shouldContainSome(expected.toTypedArray()) }

infix fun BooleanArray.shouldContainNone(expected: BooleanArray) = apply { this.toTypedArray().shouldContainNone(expected.toTypedArray()) }

infix fun BooleanArray.shouldContainAll(expected: BooleanArray) = apply { expected.forEach { shouldContain(it) } }

infix fun BooleanArray.shouldNotContain(expected: Boolean) = apply { this.toTypedArray() shouldNotContain expected }

infix fun BooleanArray.shouldNotContainAny(expected: BooleanArray) = apply { expected.forEach { shouldNotContain(it) } }

infix fun Boolean.shouldBeIn(theArray: BooleanArray) = apply { this shouldBeIn theArray.toTypedArray() }

infix fun Boolean.shouldNotBeIn(theArray: BooleanArray) = apply { this shouldNotBeIn theArray.toTypedArray() }

infix fun ByteArray.shouldEqual(expected: ByteArray) = apply { assertArrayEquals(this, expected) }

fun ByteArray.shouldBeEmpty() = apply { this.toTypedArray().shouldBeEmpty() }

fun ByteArray.shouldNotBeEmpty() = apply { this.toTypedArray().shouldNotBeEmpty() }

infix fun ByteArray.shouldContain(expected: Byte) = apply { this.toTypedArray() shouldContain expected }

infix fun ByteArray.shouldContainSome(expected: ByteArray) = apply { this.toTypedArray().shouldContainSome(expected.toTypedArray()) }

infix fun ByteArray.shouldContainNone(expected: ByteArray) = apply { this.toTypedArray().shouldContainNone(expected.toTypedArray()) }

infix fun ByteArray.shouldContainAll(expected: ByteArray) = apply { expected.forEach { shouldContain(it) } }

infix fun ByteArray.shouldNotContain(expected: Byte) = apply { this.toTypedArray() shouldNotContain expected }

infix fun ByteArray.shouldNotContainAny(expected: ByteArray) = apply { expected.forEach { shouldNotContain(it) } }

infix fun Byte.shouldBeIn(theArray: ByteArray) = apply { this shouldBeIn theArray.toTypedArray() }

infix fun Byte.shouldNotBeIn(theArray: ByteArray) = apply { this shouldNotBeIn theArray.toTypedArray() }

infix fun CharArray.shouldEqual(expected: CharArray) = apply { assertArrayEquals(this, expected) }

infix fun CharArray.shouldNotEqual(expected: CharArray) = apply { this.toTypedArray() shouldNotEqual expected.toTypedArray() }

fun CharArray.shouldBeEmpty() = apply { this.toTypedArray().shouldBeEmpty() }

fun CharArray.shouldNotBeEmpty() = apply { this.toTypedArray().shouldNotBeEmpty() }

infix fun CharArray.shouldContain(expected: Char) = apply { this.toTypedArray() shouldContain expected }

infix fun CharArray.shouldContainSome(expected: CharArray) = apply { this.toTypedArray().shouldContainSome(expected.toTypedArray()) }

infix fun CharArray.shouldContainNone(expected: CharArray) = apply { this.toTypedArray().shouldContainNone(expected.toTypedArray()) }

infix fun CharArray.shouldContainAll(expected: CharArray) = apply { expected.forEach { shouldContain(it) } }

infix fun CharArray.shouldNotContain(expected: Char) = apply { this.toTypedArray() shouldNotContain expected }

infix fun CharArray.shouldNotContainAny(expected: CharArray) = apply { expected.forEach { shouldNotContain(it) } }

infix fun Char.shouldBeIn(theArray: CharArray) = apply { this shouldBeIn theArray.toTypedArray() }

infix fun Char.shouldNotBeIn(theArray: CharArray) = apply { this shouldNotBeIn theArray.toTypedArray() }

infix fun DoubleArray.shouldEqual(expected: DoubleArray) = apply { assertArrayEquals(this.toTypedArray(), expected.toTypedArray()) }

fun DoubleArray.shouldBeEmpty() = apply { this.toTypedArray().shouldBeEmpty() }

fun DoubleArray.shouldNotBeEmpty() = apply { this.toTypedArray().shouldNotBeEmpty() }

infix fun DoubleArray.shouldContain(expected: Double) = apply { this.toTypedArray() shouldContain expected }

infix fun DoubleArray.shouldContainSome(expected: DoubleArray) = apply { this.toTypedArray().shouldContainSome(expected.toTypedArray()) }

infix fun DoubleArray.shouldContainNone(expected: DoubleArray) = apply { this.toTypedArray().shouldContainNone(expected.toTypedArray()) }

infix fun DoubleArray.shouldContainAll(expected: DoubleArray) = apply { expected.forEach { shouldContain(it) } }

infix fun DoubleArray.shouldNotContain(expected: Double) = apply { this.toTypedArray() shouldNotContain expected }

infix fun DoubleArray.shouldNotContainAny(expected: DoubleArray) = apply { expected.forEach { shouldNotContain(it) } }

infix fun Double.shouldBeIn(theArray: DoubleArray) = apply { this shouldBeIn theArray.toTypedArray() }

infix fun Double.shouldNotBeIn(theArray: DoubleArray) = apply { this shouldNotBeIn theArray.toTypedArray() }

infix fun FloatArray.shouldEqual(expected: FloatArray) = apply { assertArrayEquals(this.toTypedArray(), expected.toTypedArray()) }

fun FloatArray.shouldBeEmpty() = apply { this.toTypedArray().shouldBeEmpty() }

fun FloatArray.shouldNotBeEmpty() = apply { this.toTypedArray().shouldNotBeEmpty() }

infix fun FloatArray.shouldContain(expected: Float) = apply { this.toTypedArray() shouldContain expected }

infix fun FloatArray.shouldContainSome(expected: FloatArray) = apply { this.toTypedArray().shouldContainSome(expected.toTypedArray()) }

infix fun FloatArray.shouldContainNone(expected: FloatArray) = apply { this.toTypedArray().shouldContainNone(expected.toTypedArray()) }

infix fun FloatArray.shouldContainAll(expected: FloatArray) = apply { expected.forEach { shouldContain(it) } }

infix fun FloatArray.shouldNotContain(expected: Float) = apply { this.toTypedArray() shouldNotContain expected }

infix fun FloatArray.shouldNotContainAny(expected: FloatArray) = apply { expected.forEach { shouldNotContain(it) } }

infix fun Float.shouldBeIn(theArray: FloatArray) = apply { this shouldBeIn theArray.toTypedArray() }

infix fun Float.shouldNotBeIn(theArray: FloatArray) = apply { this shouldNotBeIn theArray.toTypedArray() }

infix fun LongArray.shouldEqual(expected: LongArray) = apply { assertArrayEquals(this, expected) }

fun LongArray.shouldBeEmpty() = apply { this.toTypedArray().shouldBeEmpty() }

fun LongArray.shouldNotBeEmpty() = apply { this.toTypedArray().shouldNotBeEmpty() }

infix fun LongArray.shouldContain(expected: Long) = apply { this.toTypedArray() shouldContain expected }

infix fun LongArray.shouldContainSome(expected: LongArray) = apply { this.toTypedArray().shouldContainSome(expected.toTypedArray()) }

infix fun LongArray.shouldContainNone(expected: LongArray) = apply { this.toTypedArray().shouldContainNone(expected.toTypedArray()) }

infix fun LongArray.shouldContainAll(expected: LongArray) = apply { expected.forEach { shouldContain(it) } }

infix fun LongArray.shouldNotContain(expected: Long) = apply { this.toTypedArray() shouldNotContain expected }

infix fun LongArray.shouldNotContainAny(expected: LongArray) = apply { expected.forEach { shouldNotContain(it) } }

infix fun Long.shouldBeIn(theArray: LongArray) = apply { this shouldBeIn theArray.toTypedArray() }

infix fun Long.shouldNotBeIn(theArray: LongArray) = apply { this shouldNotBeIn theArray.toTypedArray() }

infix fun ShortArray.shouldEqual(expected: ShortArray) = apply { assertArrayEquals(this, expected) }

fun ShortArray.shouldBeEmpty() = apply { this.toTypedArray().shouldBeEmpty() }

fun ShortArray.shouldNotBeEmpty() = apply { this.toTypedArray().shouldNotBeEmpty() }

infix fun ShortArray.shouldContain(expected: Short) = apply { this.toTypedArray() shouldContain expected }

infix fun ShortArray.shouldContainSome(expected: ShortArray) = apply { this.toTypedArray().shouldContainSome(expected.toTypedArray()) }

infix fun ShortArray.shouldContainNone(expected: ShortArray) = apply { this.toTypedArray().shouldContainNone(expected.toTypedArray()) }

infix fun ShortArray.shouldContainAll(expected: ShortArray) = apply { expected.forEach { shouldContain(it) } }

infix fun ShortArray.shouldNotContain(expected: Short) = apply { this.toTypedArray() shouldNotContain expected }

infix fun ShortArray.shouldNotContainAny(expected: ShortArray) = apply { expected.forEach { shouldNotContain(it) } }

infix fun Short.shouldBeIn(theArray: ShortArray) = apply { this shouldBeIn theArray.toTypedArray() }

infix fun Short.shouldNotBeIn(theArray: ShortArray) = apply { this shouldNotBeIn theArray.toTypedArray() }

infix fun <T, I : Iterable<T>> I.shouldContain(expected: T) = apply { if (this.contains(expected)) Unit else fail("$this should contain $expected", "$expected", join(this)) }

infix fun <T, I : Iterable<T>> I.shouldContainSome(expected: Iterable<T>) = apply { assertTrue("Expected $this to contain at least one of $expected", this.any { expected.contains(it) }) }

infix fun <T, I : Iterable<T>> I.shouldContainSome(expected: Array<T>) = apply { assertTrue("Expected $this to contain at least one of $expected", this.any { expected.contains(it) }) }

infix fun <T, I : Iterable<T>> I.shouldContainNone(expected: Iterable<T>) = apply { assertTrue("Expected $this to contain none of $expected", this.none { expected.contains(it) }) }

infix fun <T, I : Iterable<T>> I.shouldContainNone(expected: Array<T>) = apply { assertTrue("Expected $this to contain none of $expected", this.none { expected.contains(it) }) }

infix fun <T, I : Iterable<T>> I.shouldContainAll(expected: Iterable<T>) = apply { expected.forEach { shouldContain(it) } }

infix fun <T, I : Iterable<T>> I.shouldContainAll(expected: Array<T>) = apply { expected.forEach { shouldContain(it) } }

infix fun <T, I : Iterable<T>> I.shouldNotContain(expected: T) = apply { if (!this.contains(expected)) Unit else fail("$this should not contain $expected", "the Iterable to not contain $expected", join(this)) }

infix fun <T, I : Iterable<T>> I.shouldNotContainAny(expected: Iterable<T>) = apply { expected.forEach { shouldNotContain(it) } }

infix fun <T, I : Iterable<T>> I.shouldNotContainAny(expected: Array<T>) = apply { expected.forEach { shouldNotContain(it) } }

infix fun <T, I: Iterable<T>> I.shouldEqual(expected: Iterable<T>?) = apply { assertEquals(expected, this) }

fun <I : Iterable<*>> I.shouldBeEmpty() = apply { assertEmpty(this, "Iterable") }

fun <I : Iterable<*>> I.shouldNotBeEmpty() = apply { assertNotEmpty(this, "Iterable") }

infix fun <K, V, M : Map<K, V>> M.shouldHaveKey(theKey: K) = apply { if (this.containsKey(theKey)) Unit else fail("$this should contain key $theKey", "$theKey", join(this.keys)) }

infix fun <K, V, M : Map<K, V>> M.shouldNotHaveKey(theKey: K) = apply { if (!this.containsKey(theKey)) Unit else fail("$this should not contain key $theKey", "the map to not have the key $theKey", join(this.keys)) }

infix fun <K, V, M : Map<K, V>> M.shouldHaveValue(theValue: V) = apply { if (this.values.contains(theValue)) Unit else fail("$this should contain the value $theValue", "$theValue", join(this.values)) }

infix fun <K, V, M : Map<K, V>> M.shouldNotHaveValue(theValue: V) = apply { if (!this.values.contains(theValue)) Unit else fail("$this should not contain the value $theValue", "the map to not have the value $theValue", join(this.values)) }

infix fun <K, V, M : Map<K, V>> M.shouldContain(expected: Pair<K, V>) = apply { if (this[expected.first] == expected.second) Unit else fail("$this should contain $expected", "$expected", join(this)) }

infix fun <K, V, M : Map<K, V>> M.shouldContainAll(expected: M) = apply { expected.forEach { shouldContain(it.toPair()) } }

infix fun <K, V, M : Map<K, V>> M.shouldNotContain(expected: Pair<K, V>) = apply { if (this[expected.first] != expected.second) Unit else fail("$this should not contain $expected", "the map to not contain the pair $expected", join(this)) }

infix fun <K, V, M : Map<K, V>> M.shouldNotContainAny(expected: M) = apply { expected.forEach { shouldNotContain(it.toPair()) } }

fun <K, V, M : Map<K, V>> M.shouldBeEmpty() = apply { assertEmpty(this.toList(), "Map") }

fun <K, V, M : Map<K, V>> M.shouldNotBeEmpty() = apply { assertNotEmpty(this.toList(), "Map") }

infix fun <T> Any?.shouldNotBeIn(array: Array<T>) = apply { if (!array.contains(this)) Unit else fail("$this should not be in $array", "the value $this to not be in the Array", join(array)) }

infix fun <T> Any?.shouldBeIn(iterable: Iterable<T>) = apply { if (iterable.contains(this)) Unit else fail("$this should be in $iterable", "$this", join(iterable)) }

infix fun <T> Any?.shouldNotBeIn(iterable: Iterable<T>) = apply { if (!iterable.contains(this)) Unit else fail("$this should not be in $iterable", "the value $this to not be in the Iterable", join(iterable)) }

infix fun <T> Any?.shouldBeIn(array: Array<T>) = apply { if (array.contains(this)) Unit else fail("$this should be in $array", "$this", join(array)) }

internal fun <T> assertEmpty(iterable: Iterable<T>, collectionType: String) = assertTrue("Expected the $collectionType to be empty, but has ${iterable.count()} elements", iterable.count() == 0)
internal fun <T> assertNotEmpty(iterable: Iterable<T>, collectionType: String) = assertTrue("Expected the $collectionType to contain elements, but is empty", iterable.count() > 0)
