package org.amshove.kluent

import org.junit.Assert.*

infix fun <T> Array<T>.shouldContain(expected: T) = this.apply { if (this.contains(expected)) Unit else fail("$this should contain $expected", "$expected", join(this)) }

infix fun <T> Array<T>.shouldContainSome(expected: Array<T>) = this.apply { assertTrue("Expected $this to contain at least one of $expected", this.any { expected.contains(it) }) }

infix fun <T> Array<T>.shouldContainSome(expected: Iterable<T>) = this.apply { assertTrue("Expected $this to contain at least one of $expected", this.any { expected.contains(it) }) }

infix fun <T> Array<T>.shouldContainNone(expected: Array<T>) = this.apply { assertTrue("Expected $this to contain none of $expected", this.none { expected.contains(it) }) }

infix fun <T> Array<T>.shouldContainNone(expected: Iterable<T>) = this.apply { assertTrue("Expected $this to contain none of $expected", this.none { expected.contains(it) }) }

infix fun <T> Array<T>.shouldContainAll(expected: Array<T>) = this.apply { expected.forEach { shouldContain(it) } }

infix fun <T> Array<T>.shouldContainAll(expected: Iterable<T>) = this.apply { expected.forEach { shouldContain(it) } }

infix fun <T> Array<T>.shouldNotContain(expected: T) = this.apply { if (!this.contains(expected)) Unit else fail("$this should not contain $expected", "the Array to not contain $expected", join(this)) }

infix fun <T> Array<T>.shouldNotContainAny(expected: Array<T>) = this.apply { expected.forEach { shouldNotContain(it) } }

infix fun <T> Array<T>.shouldNotContainAny(expected: Iterable<T>) = this.apply { expected.forEach { shouldNotContain(it) } }

infix fun <T> Array<T>?.shouldEqual(expected: Array<T>?) = this.apply { assertArrayEquals(expected, this) }

fun <T> Array<T>.shouldBeEmpty() = this.apply { assertEmpty(this.toList(), "Array") }

fun <T> Array<T>.shouldNotBeEmpty() = this.apply { assertNotEmpty(this.toList(), "Array") }

infix fun IntArray.shouldEqual(expected: IntArray) = this.apply { assertArrayEquals(this, expected) }

fun IntArray.shouldBeEmpty() = this.apply { this.toTypedArray().shouldBeEmpty() }

fun IntArray.shouldNotBeEmpty() = this.apply { this.toTypedArray().shouldNotBeEmpty() }

infix fun IntArray.shouldContain(expected: Int) = this.apply { this.toTypedArray() shouldContain expected }

infix fun IntArray.shouldContainSome(expected: IntArray) = this.apply { this.toTypedArray().shouldContainSome(expected.toTypedArray()) }

infix fun IntArray.shouldContainNone(expected: IntArray) = this.apply { this.toTypedArray().shouldContainNone(expected.toTypedArray()) }

infix fun IntArray.shouldContainAll(expected: IntArray) = this.apply { expected.forEach { shouldContain(it) } }

infix fun IntArray.shouldNotContain(expected: Int) = this.apply { this.toTypedArray() shouldNotContain expected }

infix fun IntArray.shouldNotContainAny(expected: IntArray) = this.apply { expected.forEach { shouldNotContain(it) } }

infix fun Int.shouldBeIn(theArray: IntArray) = this.apply { this shouldBeIn theArray.toTypedArray() }

infix fun Int.shouldNotBeIn(theArray: IntArray) = this.apply { this shouldNotBeIn theArray.toTypedArray() }

infix fun BooleanArray.shouldEqual(expected: BooleanArray) = this.apply { assertArrayEquals(this, expected) }

fun BooleanArray.shouldBeEmpty() = this.apply { this.toTypedArray().shouldBeEmpty() }

fun BooleanArray.shouldNotBeEmpty() = this.apply { this.toTypedArray().shouldNotBeEmpty() }

infix fun BooleanArray.shouldContain(expected: Boolean) = this.apply { this.toTypedArray() shouldContain expected }

infix fun BooleanArray.shouldContainSome(expected: BooleanArray) = this.apply { this.toTypedArray().shouldContainSome(expected.toTypedArray()) }

infix fun BooleanArray.shouldContainNone(expected: BooleanArray) = this.apply { this.toTypedArray().shouldContainNone(expected.toTypedArray()) }

infix fun BooleanArray.shouldContainAll(expected: BooleanArray) = this.apply { expected.forEach { shouldContain(it) } }

infix fun BooleanArray.shouldNotContain(expected: Boolean) = this.apply { this.toTypedArray() shouldNotContain expected }

infix fun BooleanArray.shouldNotContainAny(expected: BooleanArray) = this.apply { expected.forEach { shouldNotContain(it) } }

infix fun Boolean.shouldBeIn(theArray: BooleanArray) = this.apply { this shouldBeIn theArray.toTypedArray() }

infix fun Boolean.shouldNotBeIn(theArray: BooleanArray) = this.apply { this shouldNotBeIn theArray.toTypedArray() }

infix fun ByteArray.shouldEqual(expected: ByteArray) = this.apply { assertArrayEquals(this, expected) }

fun ByteArray.shouldBeEmpty() = this.apply { this.toTypedArray().shouldBeEmpty() }

fun ByteArray.shouldNotBeEmpty() = this.apply { this.toTypedArray().shouldNotBeEmpty() }

infix fun ByteArray.shouldContain(expected: Byte) = this.apply { this.toTypedArray() shouldContain expected }

infix fun ByteArray.shouldContainSome(expected: ByteArray) = this.apply { this.toTypedArray().shouldContainSome(expected.toTypedArray()) }

infix fun ByteArray.shouldContainNone(expected: ByteArray) = this.apply { this.toTypedArray().shouldContainNone(expected.toTypedArray()) }

infix fun ByteArray.shouldContainAll(expected: ByteArray) = this.apply { expected.forEach { shouldContain(it) } }

infix fun ByteArray.shouldNotContain(expected: Byte) = this.apply { this.toTypedArray() shouldNotContain expected }

infix fun ByteArray.shouldNotContainAny(expected: ByteArray) = this.apply { expected.forEach { shouldNotContain(it) } }

infix fun Byte.shouldBeIn(theArray: ByteArray) = this.apply { this shouldBeIn theArray.toTypedArray() }

infix fun Byte.shouldNotBeIn(theArray: ByteArray) = this.apply { this shouldNotBeIn theArray.toTypedArray() }

infix fun CharArray.shouldEqual(expected: CharArray) = this.apply { assertArrayEquals(this, expected) }

infix fun CharArray.shouldNotEqual(expected: CharArray) = this.apply { this.toTypedArray() shouldNotEqual expected.toTypedArray() }

fun CharArray.shouldBeEmpty() = this.apply { this.toTypedArray().shouldBeEmpty() }

fun CharArray.shouldNotBeEmpty() = this.apply { this.toTypedArray().shouldNotBeEmpty() }

infix fun CharArray.shouldContain(expected: Char) = this.apply { this.toTypedArray() shouldContain expected }

infix fun CharArray.shouldContainSome(expected: CharArray) = this.apply { this.toTypedArray().shouldContainSome(expected.toTypedArray()) }

infix fun CharArray.shouldContainNone(expected: CharArray) = this.apply { this.toTypedArray().shouldContainNone(expected.toTypedArray()) }

infix fun CharArray.shouldContainAll(expected: CharArray) = this.apply { expected.forEach { shouldContain(it) } }

infix fun CharArray.shouldNotContain(expected: Char) = this.apply { this.toTypedArray() shouldNotContain expected }

infix fun CharArray.shouldNotContainAny(expected: CharArray) = this.apply { expected.forEach { shouldNotContain(it) } }

infix fun Char.shouldBeIn(theArray: CharArray) = this.apply { this shouldBeIn theArray.toTypedArray() }

infix fun Char.shouldNotBeIn(theArray: CharArray) = this.apply { this shouldNotBeIn theArray.toTypedArray() }

infix fun DoubleArray.shouldEqual(expected: DoubleArray) = this.apply { assertArrayEquals(this.toTypedArray(), expected.toTypedArray()) }

fun DoubleArray.shouldBeEmpty() = this.apply { this.toTypedArray().shouldBeEmpty() }

fun DoubleArray.shouldNotBeEmpty() = this.apply { this.toTypedArray().shouldNotBeEmpty() }

infix fun DoubleArray.shouldContain(expected: Double) = this.apply { this.toTypedArray() shouldContain expected }

infix fun DoubleArray.shouldContainSome(expected: DoubleArray) = this.apply { this.toTypedArray().shouldContainSome(expected.toTypedArray()) }

infix fun DoubleArray.shouldContainNone(expected: DoubleArray) = this.apply { this.toTypedArray().shouldContainNone(expected.toTypedArray()) }

infix fun DoubleArray.shouldContainAll(expected: DoubleArray) = this.apply { expected.forEach { shouldContain(it) } }

infix fun DoubleArray.shouldNotContain(expected: Double) = this.apply { this.toTypedArray() shouldNotContain expected }

infix fun DoubleArray.shouldNotContainAny(expected: DoubleArray) = this.apply { expected.forEach { shouldNotContain(it) } }

infix fun Double.shouldBeIn(theArray: DoubleArray) = this.apply { this shouldBeIn theArray.toTypedArray() }

infix fun Double.shouldNotBeIn(theArray: DoubleArray) = this.apply { this shouldNotBeIn theArray.toTypedArray() }

infix fun FloatArray.shouldEqual(expected: FloatArray) = this.apply { assertArrayEquals(this.toTypedArray(), expected.toTypedArray()) }

fun FloatArray.shouldBeEmpty() = this.apply { this.toTypedArray().shouldBeEmpty() }

fun FloatArray.shouldNotBeEmpty() = this.apply { this.toTypedArray().shouldNotBeEmpty() }

infix fun FloatArray.shouldContain(expected: Float) = this.apply { this.toTypedArray() shouldContain expected }

infix fun FloatArray.shouldContainSome(expected: FloatArray) = this.apply { this.toTypedArray().shouldContainSome(expected.toTypedArray()) }

infix fun FloatArray.shouldContainNone(expected: FloatArray) = this.apply { this.toTypedArray().shouldContainNone(expected.toTypedArray()) }

infix fun FloatArray.shouldContainAll(expected: FloatArray) = this.apply { expected.forEach { shouldContain(it) } }

infix fun FloatArray.shouldNotContain(expected: Float) = this.apply { this.toTypedArray() shouldNotContain expected }

infix fun FloatArray.shouldNotContainAny(expected: FloatArray) = this.apply { expected.forEach { shouldNotContain(it) } }

infix fun Float.shouldBeIn(theArray: FloatArray) = this.apply { this shouldBeIn theArray.toTypedArray() }

infix fun Float.shouldNotBeIn(theArray: FloatArray) = this.apply { this shouldNotBeIn theArray.toTypedArray() }

infix fun LongArray.shouldEqual(expected: LongArray) = this.apply { assertArrayEquals(this, expected) }

fun LongArray.shouldBeEmpty() = this.apply { this.toTypedArray().shouldBeEmpty() }

fun LongArray.shouldNotBeEmpty() = this.apply { this.toTypedArray().shouldNotBeEmpty() }

infix fun LongArray.shouldContain(expected: Long) = this.apply { this.toTypedArray() shouldContain expected }

infix fun LongArray.shouldContainSome(expected: LongArray) = this.apply { this.toTypedArray().shouldContainSome(expected.toTypedArray()) }

infix fun LongArray.shouldContainNone(expected: LongArray) = this.apply { this.toTypedArray().shouldContainNone(expected.toTypedArray()) }

infix fun LongArray.shouldContainAll(expected: LongArray) = this.apply { expected.forEach { shouldContain(it) } }

infix fun LongArray.shouldNotContain(expected: Long) = this.apply { this.toTypedArray() shouldNotContain expected }

infix fun LongArray.shouldNotContainAny(expected: LongArray) = this.apply { expected.forEach { shouldNotContain(it) } }

infix fun Long.shouldBeIn(theArray: LongArray) = this.apply { this shouldBeIn theArray.toTypedArray() }

infix fun Long.shouldNotBeIn(theArray: LongArray) = this.apply { this shouldNotBeIn theArray.toTypedArray() }

infix fun ShortArray.shouldEqual(expected: ShortArray) = this.apply { assertArrayEquals(this, expected) }

fun ShortArray.shouldBeEmpty() = this.apply { this.toTypedArray().shouldBeEmpty() }

fun ShortArray.shouldNotBeEmpty() = this.apply { this.toTypedArray().shouldNotBeEmpty() }

infix fun ShortArray.shouldContain(expected: Short) = this.apply { this.toTypedArray() shouldContain expected }

infix fun ShortArray.shouldContainSome(expected: ShortArray) = this.apply { this.toTypedArray().shouldContainSome(expected.toTypedArray()) }

infix fun ShortArray.shouldContainNone(expected: ShortArray) = this.apply { this.toTypedArray().shouldContainNone(expected.toTypedArray()) }

infix fun ShortArray.shouldContainAll(expected: ShortArray) = this.apply { expected.forEach { shouldContain(it) } }

infix fun ShortArray.shouldNotContain(expected: Short) = this.apply { this.toTypedArray() shouldNotContain expected }

infix fun ShortArray.shouldNotContainAny(expected: ShortArray) = this.apply { expected.forEach { shouldNotContain(it) } }

infix fun Short.shouldBeIn(theArray: ShortArray) = this.apply { this shouldBeIn theArray.toTypedArray() }

infix fun Short.shouldNotBeIn(theArray: ShortArray) = this.apply { this shouldNotBeIn theArray.toTypedArray() }

infix fun <T, I : Iterable<T>> I.shouldContain(expected: T) = this.apply { if (this.contains(expected)) Unit else fail("$this should contain $expected", "$expected", join(this)) }

infix fun <T, I : Iterable<T>> I.shouldContainSome(expected: Iterable<T>) = this.apply { assertTrue("Expected $this to contain at least one of $expected", this.any { expected.contains(it) }) }

infix fun <T, I : Iterable<T>> I.shouldContainSome(expected: Array<T>) = this.apply { assertTrue("Expected $this to contain at least one of $expected", this.any { expected.contains(it) }) }

infix fun <T, I : Iterable<T>> I.shouldContainNone(expected: Iterable<T>) = this.apply { assertTrue("Expected $this to contain none of $expected", this.none { expected.contains(it) }) }

infix fun <T, I : Iterable<T>> I.shouldContainNone(expected: Array<T>) = this.apply { assertTrue("Expected $this to contain none of $expected", this.none { expected.contains(it) }) }

infix fun <T, I : Iterable<T>> I.shouldContainAll(expected: Iterable<T>) = this.apply { expected.forEach { shouldContain(it) } }

infix fun <T, I : Iterable<T>> I.shouldContainAll(expected: Array<T>) = this.apply { expected.forEach { shouldContain(it) } }

infix fun <T, I : Iterable<T>> I.shouldNotContain(expected: T) = this.apply { if (!this.contains(expected)) Unit else fail("$this should not contain $expected", "the Iterable to not contain $expected", join(this)) }

infix fun <T, I : Iterable<T>> I.shouldNotContainAny(expected: Iterable<T>) = this.apply { expected.forEach { shouldNotContain(it) } }

infix fun <T, I : Iterable<T>> I.shouldNotContainAny(expected: Array<T>) = this.apply { expected.forEach { shouldNotContain(it) } }

infix fun <T, I: Iterable<T>> I.shouldEqual(expected: Iterable<T>?) = this.apply { assertEquals(expected, this) }

fun <I : Iterable<*>> I.shouldBeEmpty() = this.apply { assertEmpty(this, "Iterable") }

fun <I : Iterable<*>> I.shouldNotBeEmpty() = this.apply { assertNotEmpty(this, "Iterable") }

infix fun <K, V, M : Map<K, V>> M.shouldHaveKey(theKey: K) = this.apply { if (this.containsKey(theKey)) Unit else fail("$this should contain key $theKey", "$theKey", join(this.keys)) }

infix fun <K, V, M : Map<K, V>> M.shouldNotHaveKey(theKey: K) = this.apply { if (!this.containsKey(theKey)) Unit else fail("$this should not contain key $theKey", "the map to not have the key $theKey", join(this.keys)) }

infix fun <K, V, M : Map<K, V>> M.shouldHaveValue(theValue: V) = this.apply { if (this.values.contains(theValue)) Unit else fail("$this should contain the value $theValue", "$theValue", join(this.values)) }

infix fun <K, V, M : Map<K, V>> M.shouldNotHaveValue(theValue: V) = this.apply { if (!this.values.contains(theValue)) Unit else fail("$this should not contain the value $theValue", "the map to not have the value $theValue", join(this.values)) }

infix fun <K, V, M : Map<K, V>> M.shouldContain(expected: Pair<K, V>) = this.apply { if (this[expected.first] == expected.second) Unit else fail("$this should contain $expected", "$expected", join(this)) }

infix fun <K, V, M : Map<K, V>> M.shouldContainAll(expected: M) = this.apply { expected.forEach { shouldContain(it.toPair()) } }

infix fun <K, V, M : Map<K, V>> M.shouldNotContain(expected: Pair<K, V>) = this.apply { if (this[expected.first] != expected.second) Unit else fail("$this should not contain $expected", "the map to not contain the pair $expected", join(this)) }

infix fun <K, V, M : Map<K, V>> M.shouldNotContainAny(expected: M) = this.apply { expected.forEach { shouldNotContain(it.toPair()) } }

fun <K, V, M : Map<K, V>> M.shouldBeEmpty() = this.apply { assertEmpty(this.toList(), "Map") }

fun <K, V, M : Map<K, V>> M.shouldNotBeEmpty() = this.apply { assertNotEmpty(this.toList(), "Map") }

infix fun <T> Any?.shouldNotBeIn(array: Array<T>) = this.apply { if (!array.contains(this)) Unit else fail("$this should not be in $array", "the value $this to not be in the Array", join(array)) }

infix fun <T> Any?.shouldBeIn(iterable: Iterable<T>) = this.apply { if (iterable.contains(this)) Unit else fail("$this should be in $iterable", "$this", join(iterable)) }

infix fun <T> Any?.shouldNotBeIn(iterable: Iterable<T>) = this.apply { if (!iterable.contains(this)) Unit else fail("$this should not be in $iterable", "the value $this to not be in the Iterable", join(iterable)) }

infix fun <T> Any?.shouldBeIn(array: Array<T>) = this.apply { if (array.contains(this)) Unit else fail("$this should be in $array", "$this", join(array)) }

internal fun <T> assertEmpty(iterable: Iterable<T>, collectionType: String) = assertTrue("Expected the $collectionType to be empty, but has ${iterable.count()} elements", iterable.count() == 0)
internal fun <T> assertNotEmpty(iterable: Iterable<T>, collectionType: String) = assertTrue("Expected the $collectionType to contain elements, but is empty", iterable.count() > 0)
