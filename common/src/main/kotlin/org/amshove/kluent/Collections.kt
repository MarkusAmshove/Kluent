package org.amshove.kluent

import org.amshove.kluent.internal.*
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals
import kotlin.test.fail

infix fun <T> Array<T>.shouldContain(expected: T) = apply { if (this.contains(expected)) Unit else failExpectedActual("Array doesn't contain \"$expected\"", "the Array to contain \"$expected\"", join(this)) }

infix fun <T> Array<T>.shouldContainSome(expected: Array<T>) = apply { assertTrue("Expected Array to contain at least one of \"$expected\"", this.any { expected.contains(it) }) }

@Deprecated("Use shouldContainAny", ReplaceWith("this.shouldContainAny(check)"))
infix fun <T> Array<T>.shouldContainSome(expected: Iterable<T>) = apply { assertTrue("Expected Array to contain at least one of \"$expected\"", this.any { expected.contains(it) }) }

infix fun <T> Array<T>.shouldContainAny(check: (T) -> Boolean) = apply { assertTrue("Expected Array to contain at least one element that passes the check", this.any { check.invoke(it) }) }

infix fun <T> Array<T>.shouldContainNone(expected: Array<T>) = apply { assertTrue("Expected Array to contain none of \"$expected\"", this.none { expected.contains(it) }) }

infix fun <T> Array<T>.shouldContainNone(expected: Iterable<T>) = apply { assertTrue("Expected Array to contain none of \"$expected\"", this.none { expected.contains(it) }) }

infix fun <T> Array<T>.shouldContainAll(expected: Array<T>) = apply { expected.forEach { shouldContain(it) } }

infix fun <T> Array<T>.shouldContainAll(expected: Iterable<T>) = apply { expected.forEach { shouldContain(it) } }

infix fun <T> Array<T>.shouldContainSame(expected: Array<T>) = assertBothCollectionsContainsSame(expected.toList(), this.toList())

infix fun <T> Array<T>.shouldContainSame(expected: Iterable<T>) = assertBothCollectionsContainsSame(expected.toList(), this.toList())

infix fun <T> Array<T>.shouldNotContain(expected: T) = apply { if (!this.contains(expected)) Unit else failExpectedActual("Array should not contain \"$expected\"", "the Array to not contain \"$expected\"", join(this)) }

infix fun <T> Array<T>.shouldNotContainAny(expected: Array<T>) = apply { expected.forEach { shouldNotContain(it) } }

infix fun <T> Array<T>.shouldNotContainAny(expected: Iterable<T>) = apply { expected.forEach { shouldNotContain(it) } }

infix fun <T> Array<T>?.shouldEqual(expected: Array<T>?) = apply { assertArrayEquals(expected, this) }

infix fun <T> Array<T>?.shouldNotEqual(expected: Array<T>?) = apply { assertArrayNotEquals(expected, this) }

fun <T> Array<T>.shouldHaveSingleItem() = toList().shouldHaveSingleItem()

fun <T> Array<T>.shouldBeEmpty() = apply { assertEmpty(this.toList(), "Array") }

fun <T> Array<T>.shouldNotBeEmpty() = apply { assertNotEmpty(this.toList(), "Array") }

infix fun <T> Array<T>.shouldHaveSize(expectedSize: Int) = apply { this.toList().shouldHaveSize(expectedSize) }

infix fun <T> Array<T>.shouldMatchAtLeastOneOf(predicate: (T) -> Boolean) = apply { this.toList().shouldMatchAtLeastOneOf(predicate) }

infix fun <T> Array<T>.shouldMatchAllWith(predicate: (T) -> Boolean) = apply { this.toList().shouldMatchAllWith(predicate) }


infix fun IntArray.shouldEqual(expected: IntArray) = apply { assertArrayEquals(this.toTypedArray(), expected.toTypedArray()) }

infix fun IntArray.shouldNotEqual(expected: IntArray) = apply { assertArrayNotEquals(expected.toTypedArray(), this.toTypedArray()) }

fun IntArray.shouldHaveSingleItem() = toList().shouldHaveSingleItem()

fun IntArray.shouldBeEmpty() = apply { this.toTypedArray().shouldBeEmpty() }

fun IntArray.shouldNotBeEmpty() = apply { this.toTypedArray().shouldNotBeEmpty() }

infix fun IntArray.shouldHaveSize(expectedSize: Int) = apply { this.toList().shouldHaveSize(expectedSize) }

infix fun IntArray.shouldContain(expected: Int) = apply { this.toTypedArray() shouldContain expected }

@Deprecated("Use shouldContainAny", ReplaceWith("this.shouldContainAny(check)"))
infix fun IntArray.shouldContainSome(expected: IntArray) = apply { this.toTypedArray().shouldContainSome(expected.toTypedArray()) }

infix fun IntArray.shouldContainAny(check: (Int) -> Boolean) = apply { this.toTypedArray().shouldContainAny(check) }

@Deprecated("Use shouldContainAny", ReplaceWith("this.shouldContainAny(check)"))
infix fun IntArray.shouldContainSome(expected: Iterable<Int>) = apply { this.toList().shouldContainSome(expected) }

infix fun IntArray.shouldContainNone(expected: IntArray) = apply { this.toTypedArray().shouldContainNone(expected.toTypedArray()) }

infix fun IntArray.shouldContainNone(expected: Iterable<Int>) = apply { this.toList().shouldContainNone(expected) }

infix fun IntArray.shouldContainAll(expected: IntArray) = apply { expected.forEach { shouldContain(it) } }

infix fun IntArray.shouldContainAll(expected: Iterable<Int>) = apply { this.toList().shouldContainAll(expected) }

infix fun IntArray.shouldContainSame(expected: IntArray) = assertBothCollectionsContainsSame(expected.toList(), this.toList())

infix fun IntArray.shouldContainSame(expected: Iterable<Int>) = assertBothCollectionsContainsSame(expected.toList(), this.toList())

infix fun IntArray.shouldNotContain(expected: Int) = apply { this.toTypedArray() shouldNotContain expected }

infix fun IntArray.shouldNotContainAny(expected: IntArray) = apply { expected.forEach { shouldNotContain(it) } }

infix fun IntArray.shouldNotContainAny(expected: Iterable<Int>) = apply { this.toList().shouldNotContainAny(expected) }

infix fun Int.shouldBeIn(theArray: IntArray) = apply { this shouldBeIn theArray.toTypedArray() }

infix fun Int.shouldNotBeIn(theArray: IntArray) = apply { this shouldNotBeIn theArray.toTypedArray() }

infix fun IntArray.shouldMatchAtLeastOneOf(predicate: (Int) -> Boolean) = apply { this.toList().shouldMatchAtLeastOneOf(predicate) }

infix fun IntArray.shouldMatchAllWith(predicate: (Int) -> Boolean) = apply { this.toList().shouldMatchAllWith(predicate) }


infix fun BooleanArray.shouldEqual(expected: BooleanArray) = apply { assertArrayEquals(this.toTypedArray(), expected.toTypedArray()) }

infix fun BooleanArray.shouldNotEqual(expected: BooleanArray) = apply { assertArrayNotEquals(this.toTypedArray(), expected.toTypedArray()) }

fun BooleanArray.shouldHaveSingleItem() = toList().shouldHaveSingleItem()

fun BooleanArray.shouldBeEmpty() = apply { this.toTypedArray().shouldBeEmpty() }

fun BooleanArray.shouldNotBeEmpty() = apply { this.toTypedArray().shouldNotBeEmpty() }

infix fun BooleanArray.shouldHaveSize(expectedSize: Int) = apply { this.toList().shouldHaveSize(expectedSize) }

infix fun BooleanArray.shouldContain(expected: Boolean) = apply { this.toTypedArray() shouldContain expected }

@Deprecated("Use shouldContainTrue or shouldContainFalse", ReplaceWith("this.shouldContainTrue(check)"))
infix fun BooleanArray.shouldContainSome(expected: BooleanArray) = apply { this.toTypedArray().shouldContainSome(expected.toTypedArray()) }

fun BooleanArray.shouldContainTrue() = apply { this.toTypedArray().shouldContainAny { it } }

fun BooleanArray.shouldContainFalse() = apply { this.toTypedArray().shouldContainAny { !it } }

@Deprecated("Use shouldContainAny", ReplaceWith("this.shouldContainAny(check)"))
infix fun BooleanArray.shouldContainSome(expected: Iterable<Boolean>) = apply { this.toList().shouldContainSome(expected) }

infix fun BooleanArray.shouldContainNone(expected: BooleanArray) = apply { this.toTypedArray().shouldContainNone(expected.toTypedArray()) }

infix fun BooleanArray.shouldContainNone(expected: Iterable<Boolean>) = apply { this.toList().shouldContainNone(expected) }

infix fun BooleanArray.shouldContainAll(expected: BooleanArray) = apply { expected.forEach { shouldContain(it) } }

infix fun BooleanArray.shouldContainAll(expected: Iterable<Boolean>) = apply { this.toList().shouldContainAll(expected) }

infix fun BooleanArray.shouldNotContain(expected: Boolean) = apply { this.toTypedArray() shouldNotContain expected }

infix fun BooleanArray.shouldContainSame(expected: BooleanArray) = assertBothCollectionsContainsSame(expected.toList(), this.toList())

infix fun BooleanArray.shouldContainSame(expected: Iterable<Boolean>) = assertBothCollectionsContainsSame(expected.toList(), this.toList())

infix fun BooleanArray.shouldNotContainAny(expected: BooleanArray) = apply { expected.forEach { shouldNotContain(it) } }

infix fun BooleanArray.shouldNotContainAny(expected: Iterable<Boolean>) = apply { this.toList().shouldNotContainAny(expected) }

infix fun Boolean.shouldBeIn(theArray: BooleanArray) = apply { this shouldBeIn theArray.toTypedArray() }

infix fun Boolean.shouldNotBeIn(theArray: BooleanArray) = apply { this shouldNotBeIn theArray.toTypedArray() }

infix fun BooleanArray.shouldMatchAtLeastOneOf(predicate: (Boolean) -> Boolean) = apply { this.toList().shouldMatchAtLeastOneOf(predicate) }

infix fun BooleanArray.shouldMatchAllWith(predicate: (Boolean) -> Boolean) = apply { this.toList().shouldMatchAllWith(predicate) }

infix fun ByteArray.shouldEqual(expected: ByteArray) = apply { assertArrayEquals(this.toTypedArray(), expected.toTypedArray()) }

infix fun ByteArray.shouldNotEqual(expected: ByteArray) = apply { assertArrayNotEquals(this.toTypedArray(), expected.toTypedArray()) }

fun ByteArray.shouldHaveSingleItem() = toList().shouldHaveSingleItem()

fun ByteArray.shouldBeEmpty() = apply { this.toTypedArray().shouldBeEmpty() }

fun ByteArray.shouldNotBeEmpty() = apply { this.toTypedArray().shouldNotBeEmpty() }

infix fun ByteArray.shouldHaveSize(expectedSize: Int) = apply { this.toList().shouldHaveSize(expectedSize) }

infix fun ByteArray.shouldContain(expected: Byte) = apply { this.toTypedArray() shouldContain expected }

@Deprecated("Use shouldContainAny", ReplaceWith("this.shouldContainAny(check)"))
infix fun ByteArray.shouldContainSome(expected: ByteArray) = apply { this.toTypedArray().shouldContainSome(expected.toTypedArray()) }

infix fun ByteArray.shouldContainAny(check: (Byte) -> Boolean) = apply { this.toTypedArray().shouldContainAny(check) }

@Deprecated("Use shouldContainAny", ReplaceWith("this.shouldContainAny(check)"))
infix fun ByteArray.shouldContainSome(expected: Iterable<Byte>) = apply { this.toList().shouldContainSome(expected) }

infix fun ByteArray.shouldContainNone(expected: ByteArray) = apply { this.toTypedArray().shouldContainNone(expected.toTypedArray()) }

infix fun ByteArray.shouldContainNone(expected: Iterable<Byte>) = apply { this.toList().shouldContainNone(expected) }

infix fun ByteArray.shouldContainAll(expected: ByteArray) = apply { expected.forEach { shouldContain(it) } }

infix fun ByteArray.shouldContainAll(expected: Iterable<Byte>) = apply { this.toList().shouldContainAll(expected) }

infix fun ByteArray.shouldContainSame(expected: ByteArray) = assertBothCollectionsContainsSame(expected.toList(), this.toList())

infix fun ByteArray.shouldContainSame(expected: Iterable<Byte>) = assertBothCollectionsContainsSame(expected.toList(), this.toList())

infix fun ByteArray.shouldNotContain(expected: Byte) = apply { this.toTypedArray() shouldNotContain expected }

infix fun ByteArray.shouldNotContainAny(expected: ByteArray) = apply { expected.forEach { shouldNotContain(it) } }

infix fun ByteArray.shouldNotContainAny(expected: Iterable<Byte>) = apply { this.toList().shouldNotContainAny(expected) }

infix fun Byte.shouldBeIn(theArray: ByteArray) = apply { this shouldBeIn theArray.toTypedArray() }

infix fun Byte.shouldNotBeIn(theArray: ByteArray) = apply { this shouldNotBeIn theArray.toTypedArray() }

infix fun ByteArray.shouldMatchAtLeastOneOf(predicate: (Byte) -> Boolean) = apply { this.toList().shouldMatchAtLeastOneOf(predicate) }

infix fun ByteArray.shouldMatchAllWith(predicate: (Byte) -> Boolean) = apply { this.toList().shouldMatchAllWith(predicate) }

infix fun CharArray.shouldEqual(expected: CharArray) = apply { assertArrayEquals(this.toTypedArray(), expected.toTypedArray()) }

infix fun CharArray.shouldNotEqual(expected: CharArray) = apply { assertArrayNotEquals(expected.toTypedArray(), this.toTypedArray()) }

fun CharArray.shouldHaveSingleItem() = toList().shouldHaveSingleItem()

fun CharArray.shouldBeEmpty() = apply { this.toTypedArray().shouldBeEmpty() }

fun CharArray.shouldNotBeEmpty() = apply { this.toTypedArray().shouldNotBeEmpty() }

infix fun CharArray.shouldHaveSize(expectedSize: Int) = apply { this.toList().shouldHaveSize(expectedSize) }

infix fun CharArray.shouldContain(expected: Char) = apply { this.toTypedArray() shouldContain expected }

@Deprecated("Use shouldContainAny", ReplaceWith("this.shouldContainAny(check)"))
infix fun CharArray.shouldContainSome(expected: CharArray) = apply { this.toTypedArray().shouldContainSome(expected.toTypedArray()) }

infix fun CharArray.shouldContainAny(check: (Char) -> Boolean) = apply { this.toTypedArray().shouldContainAny(check) }

@Deprecated("Use shouldContainAny", ReplaceWith("this.shouldContainAny(check)"))
infix fun CharArray.shouldContainSome(expected: Iterable<Char>) = apply { this.toList().shouldContainSome(expected) }

infix fun CharArray.shouldContainNone(expected: CharArray) = apply { this.toTypedArray().shouldContainNone(expected.toTypedArray()) }

infix fun CharArray.shouldContainNone(expected: Iterable<Char>) = apply { this.toList().shouldContainNone(expected) }

infix fun CharArray.shouldContainAll(expected: CharArray) = apply { expected.forEach { shouldContain(it) } }

infix fun CharArray.shouldContainAll(expected: Iterable<Char>) = apply { this.toList().shouldContainAll(expected) }

infix fun CharArray.shouldContainSame(expected: CharArray) = assertBothCollectionsContainsSame(expected.toList(), this.toList())

infix fun CharArray.shouldContainSame(expected: Iterable<Char>) = assertBothCollectionsContainsSame(expected.toList(), this.toList())

infix fun CharArray.shouldNotContain(expected: Char) = apply { this.toTypedArray() shouldNotContain expected }

infix fun CharArray.shouldNotContainAny(expected: CharArray) = apply { expected.forEach { shouldNotContain(it) } }

infix fun CharArray.shouldNotContainAny(expected: Iterable<Char>) = apply { this.toList().shouldNotContainAny(expected) }

infix fun Char.shouldBeIn(theArray: CharArray) = apply { this shouldBeIn theArray.toTypedArray() }

infix fun Char.shouldNotBeIn(theArray: CharArray) = apply { this shouldNotBeIn theArray.toTypedArray() }

infix fun CharArray.shouldMatchAtLeastOneOf(predicate: (Char) -> Boolean) = apply { this.toList().shouldMatchAtLeastOneOf(predicate) }

infix fun CharArray.shouldMatchAllWith(predicate: (Char) -> Boolean) = apply { this.toList().shouldMatchAllWith(predicate) }

infix fun DoubleArray.shouldEqual(expected: DoubleArray) = apply { assertArrayEquals(this.toTypedArray(), expected.toTypedArray()) }

infix fun DoubleArray.shouldNotEqual(expected: DoubleArray) = apply { assertArrayNotEquals(this.toTypedArray(), expected.toTypedArray()) }

fun DoubleArray.shouldHaveSingleItem() = toList().shouldHaveSingleItem()

fun DoubleArray.shouldBeEmpty() = apply { this.toTypedArray().shouldBeEmpty() }

fun DoubleArray.shouldNotBeEmpty() = apply { this.toTypedArray().shouldNotBeEmpty() }

infix fun DoubleArray.shouldHaveSize(expectedSize: Int) = apply { this.toList().shouldHaveSize(expectedSize) }

infix fun DoubleArray.shouldContain(expected: Double) = apply { this.toTypedArray() shouldContain expected }

@Deprecated("Use shouldContainAny", ReplaceWith("this.shouldContainAny(check)"))
infix fun DoubleArray.shouldContainSome(expected: DoubleArray) = apply { this.toTypedArray().shouldContainSome(expected.toTypedArray()) }

infix fun DoubleArray.shouldContainAny(check: (Double) -> Boolean) = apply { this.toTypedArray().shouldContainAny(check) }

@Deprecated("Use shouldContainAny", ReplaceWith("this.shouldContainAny(check)"))
infix fun DoubleArray.shouldContainSome(expected: Iterable<Double>) = apply { this.toList().shouldContainSome(expected) }

infix fun DoubleArray.shouldContainNone(expected: DoubleArray) = apply { this.toTypedArray().shouldContainNone(expected.toTypedArray()) }

infix fun DoubleArray.shouldContainNone(expected: Iterable<Double>) = apply { this.toList().shouldContainNone(expected) }

infix fun DoubleArray.shouldContainAll(expected: DoubleArray) = apply { expected.forEach { shouldContain(it) } }

infix fun DoubleArray.shouldContainAll(expected: Iterable<Double>) = apply { this.toList().shouldContainAll(expected) }

infix fun DoubleArray.shouldContainSame(expected: DoubleArray) = assertBothCollectionsContainsSame(expected.toList(), this.toList())

infix fun DoubleArray.shouldContainSame(expected: Iterable<Double>) = assertBothCollectionsContainsSame(expected.toList(), this.toList())

infix fun DoubleArray.shouldNotContain(expected: Double) = apply { this.toTypedArray() shouldNotContain expected }

infix fun DoubleArray.shouldNotContainAny(expected: DoubleArray) = apply { expected.forEach { shouldNotContain(it) } }

infix fun DoubleArray.shouldNotContainAny(expected: Iterable<Double>) = apply { this.toList().shouldNotContainAny(expected) }

infix fun DoubleArray.shouldMatchAtLeastOneOf(predicate: (Double) -> Boolean) = apply { this.toList().shouldMatchAtLeastOneOf(predicate) }

infix fun DoubleArray.shouldMatchAllWith(predicate: (Double) -> Boolean) = apply { this.toList().shouldMatchAllWith(predicate) }

infix fun Double.shouldBeIn(theArray: DoubleArray) = apply { this shouldBeIn theArray.toTypedArray() }

infix fun Double.shouldNotBeIn(theArray: DoubleArray) = apply { this shouldNotBeIn theArray.toTypedArray() }

infix fun FloatArray.shouldEqual(expected: FloatArray) = apply { assertArrayEquals(this.toTypedArray(), expected.toTypedArray()) }

infix fun FloatArray.shouldNotEqual(expected: FloatArray) = apply { assertArrayNotEquals(this.toTypedArray(), expected.toTypedArray()) }

fun FloatArray.shouldHaveSingleItem() = toList().shouldHaveSingleItem()

fun FloatArray.shouldBeEmpty() = apply { this.toTypedArray().shouldBeEmpty() }

fun FloatArray.shouldNotBeEmpty() = apply { this.toTypedArray().shouldNotBeEmpty() }

infix fun FloatArray.shouldHaveSize(expectedSize: Int) = apply { this.toList().shouldHaveSize(expectedSize) }

infix fun FloatArray.shouldContain(expected: Float) = apply { this.toTypedArray() shouldContain expected }

@Deprecated("Use shouldContainAny", ReplaceWith("this.shouldContainAny(check)"))
infix fun FloatArray.shouldContainSome(expected: FloatArray) = apply { this.toTypedArray().shouldContainSome(expected.toTypedArray()) }

infix fun FloatArray.shouldContainAny(check: (Float) -> Boolean) = apply { this.toTypedArray().shouldContainAny(check) }

@Deprecated("Use shouldContainAny", ReplaceWith("this.shouldContainAny(check)"))
infix fun FloatArray.shouldContainSome(expected: Iterable<Float>) = apply { this.toList().shouldContainSome(expected) }

infix fun FloatArray.shouldContainNone(expected: FloatArray) = apply { this.toTypedArray().shouldContainNone(expected.toTypedArray()) }

infix fun FloatArray.shouldContainNone(expected: Iterable<Float>) = apply { this.toList().shouldContainNone(expected) }

infix fun FloatArray.shouldContainAll(expected: FloatArray) = apply { expected.forEach { shouldContain(it) } }

infix fun FloatArray.shouldContainAll(expected: Iterable<Float>) = apply { this.toList().shouldContainAll(expected) }

infix fun FloatArray.shouldContainSame(expected: FloatArray) = assertBothCollectionsContainsSame(expected.toList(), this.toList())

infix fun FloatArray.shouldContainSame(expected: Iterable<Float>) = assertBothCollectionsContainsSame(expected.toList(), this.toList())

infix fun FloatArray.shouldNotContain(expected: Float) = apply { this.toTypedArray() shouldNotContain expected }

infix fun FloatArray.shouldNotContainAny(expected: FloatArray) = apply { expected.forEach { shouldNotContain(it) } }

infix fun FloatArray.shouldNotContainAny(expected: Iterable<Float>) = apply { this.toList().shouldNotContainAny(expected) }

infix fun Float.shouldBeIn(theArray: FloatArray) = apply { this shouldBeIn theArray.toTypedArray() }

infix fun Float.shouldNotBeIn(theArray: FloatArray) = apply { this shouldNotBeIn theArray.toTypedArray() }

infix fun FloatArray.shouldMatchAtLeastOneOf(predicate: (Float) -> Boolean) = apply { this.toList().shouldMatchAtLeastOneOf(predicate) }

infix fun FloatArray.shouldMatchAllWith(predicate: (Float) -> Boolean) = apply { this.toList().shouldMatchAllWith(predicate) }

infix fun LongArray.shouldEqual(expected: LongArray) = apply { assertArrayEquals(this.toTypedArray(), expected.toTypedArray()) }

infix fun LongArray.shouldNotEqual(expected: LongArray) = apply { assertArrayNotEquals(this.toTypedArray(), expected.toTypedArray()) }

fun LongArray.shouldHaveSingleItem() = toList().shouldHaveSingleItem()

fun LongArray.shouldBeEmpty() = apply { this.toTypedArray().shouldBeEmpty() }

fun LongArray.shouldNotBeEmpty() = apply { this.toTypedArray().shouldNotBeEmpty() }

infix fun LongArray.shouldHaveSize(expectedSize: Int) = apply { this.toList().shouldHaveSize(expectedSize) }

infix fun LongArray.shouldContain(expected: Long) = apply { this.toTypedArray() shouldContain expected }

@Deprecated("Use shouldContainAny", ReplaceWith("this.shouldContainAny(check)"))
infix fun LongArray.shouldContainSome(expected: LongArray) = apply { this.toTypedArray().shouldContainSome(expected.toTypedArray()) }

infix fun LongArray.shouldContainAny(check: (Long) -> Boolean) = apply { this.toTypedArray().shouldContainAny(check) }

@Deprecated("Use shouldContainAny", ReplaceWith("this.shouldContainAny(check)"))
infix fun LongArray.shouldContainSome(expected: Iterable<Long>) = apply { this.toList().shouldContainSome(expected) }

infix fun LongArray.shouldContainNone(expected: LongArray) = apply { this.toTypedArray().shouldContainNone(expected.toTypedArray()) }

infix fun LongArray.shouldContainNone(expected: Iterable<Long>) = apply { this.toList().shouldContainNone(expected) }

infix fun LongArray.shouldContainAll(expected: LongArray) = apply { expected.forEach { shouldContain(it) } }

infix fun LongArray.shouldContainAll(expected: Iterable<Long>) = apply { this.toList().shouldContainAll(expected) }

infix fun LongArray.shouldContainSame(expected: LongArray) = assertBothCollectionsContainsSame(expected.toList(), this.toList())

infix fun LongArray.shouldContainSame(expected: Iterable<Long>) = assertBothCollectionsContainsSame(expected.toList(), this.toList())

infix fun LongArray.shouldNotContain(expected: Long) = apply { this.toTypedArray() shouldNotContain expected }

infix fun LongArray.shouldNotContainAny(expected: LongArray) = apply { expected.forEach { shouldNotContain(it) } }

infix fun LongArray.shouldNotContainAny(expected: Iterable<Long>) = apply { this.toList().shouldNotContainAny(expected) }

infix fun Long.shouldBeIn(theArray: LongArray) = apply { this shouldBeIn theArray.toTypedArray() }

infix fun Long.shouldNotBeIn(theArray: LongArray) = apply { this shouldNotBeIn theArray.toTypedArray() }

infix fun LongArray.shouldMatchAtLeastOneOf(predicate: (Long) -> Boolean) = apply { this.toList().shouldMatchAtLeastOneOf(predicate) }

infix fun LongArray.shouldMatchAllWith(predicate: (Long) -> Boolean) = apply { this.toList().shouldMatchAllWith(predicate) }


infix fun ShortArray.shouldEqual(expected: ShortArray) = apply { assertArrayEquals(this.toTypedArray(), expected.toTypedArray()) }

infix fun ShortArray.shouldNotEqual(expected: ShortArray) = apply { assertArrayNotEquals(this.toTypedArray(), expected.toTypedArray()) }

fun ShortArray.shouldHaveSingleItem() = toList().shouldHaveSingleItem()

fun ShortArray.shouldBeEmpty() = apply { this.toTypedArray().shouldBeEmpty() }

fun ShortArray.shouldNotBeEmpty() = apply { this.toTypedArray().shouldNotBeEmpty() }

infix fun ShortArray.shouldHaveSize(expectedSize: Int) = apply { this.toList().shouldHaveSize(expectedSize) }

infix fun ShortArray.shouldContain(expected: Short) = apply { this.toTypedArray() shouldContain expected }

@Deprecated("Use shouldContainAny", ReplaceWith("this.shouldContainAny(check)"))
infix fun ShortArray.shouldContainSome(expected: ShortArray) = apply { this.toTypedArray().shouldContainSome(expected.toTypedArray()) }

infix fun ShortArray.shouldContainAny(check: (Short) -> Boolean) = apply { this.toTypedArray().shouldContainAny(check) }

@Deprecated("Use shouldContainAny", ReplaceWith("this.shouldContainAny(check)"))
infix fun ShortArray.shouldContainSome(expected: Iterable<Short>) = apply { this.toList().shouldContainSome(expected) }

infix fun ShortArray.shouldContainNone(expected: ShortArray) = apply { this.toTypedArray().shouldContainNone(expected.toTypedArray()) }

infix fun ShortArray.shouldContainNone(expected: Iterable<Short>) = apply { this.toList().shouldContainNone(expected) }

infix fun ShortArray.shouldContainAll(expected: ShortArray) = apply { expected.forEach { shouldContain(it) } }

infix fun ShortArray.shouldContainAll(expected: Iterable<Short>) = apply { this.toList().shouldContainAll(expected) }

infix fun ShortArray.shouldContainSame(expected: ShortArray) = assertBothCollectionsContainsSame(expected.toList(), this.toList())

infix fun ShortArray.shouldContainSame(expected: Iterable<Short>) = assertBothCollectionsContainsSame(expected.toList(), this.toList())

infix fun ShortArray.shouldNotContain(expected: Short) = apply { this.toTypedArray() shouldNotContain expected }

infix fun ShortArray.shouldNotContainAny(expected: ShortArray) = apply { expected.forEach { shouldNotContain(it) } }

infix fun ShortArray.shouldNotContainAny(expected: Iterable<Short>) = apply { this.toList().shouldNotContainAny(expected) }

infix fun ShortArray.shouldMatchAtLeastOneOf(predicate: (Short) -> Boolean) = apply { this.toList().shouldMatchAtLeastOneOf(predicate) }

infix fun ShortArray.shouldMatchAllWith(predicate: (Short) -> Boolean) = apply { this.toList().shouldMatchAllWith(predicate) }

infix fun Short.shouldBeIn(theArray: ShortArray) = apply { this shouldBeIn theArray.toTypedArray() }

infix fun Short.shouldNotBeIn(theArray: ShortArray) = apply { this shouldNotBeIn theArray.toTypedArray() }

infix fun <T, I : Iterable<T>> I.shouldContain(expected: T): I = apply { if (this.contains(expected)) Unit else failExpectedActual("Iterable doesn't contain \"$expected\"", "the Iterable to contain \"$expected\"", join(this)) }

infix fun <T, I : Iterable<T>> I.shouldContainAny(check: (T) -> Boolean): I = apply {
    val result = this.map { it to check.invoke(it) }

    if (result.any { it.second }) {
        Unit
    } else {
        val failedItems = result
                .filterNot { it.second }
                .map { it.first }
                .joinToString(", ")
        failExpectedActual(
                "Iterable doesn't contain \"$failedItems\"",
                "the Iterable to contain \"$failedItems\"",
                join(this)
        )
    }
}

@Deprecated("Use shouldContainAny", ReplaceWith("this.shouldContainAny(check)"))
infix fun <T, I : Iterable<T>> I.shouldContainSome(expected: Iterable<T>): I = apply { assertTrue("Expected Iterable to contain at least one of \"$expected\"", this.any { expected.contains(it) }) }

@Deprecated("Use shouldContainAny", ReplaceWith("this.shouldContainAny(check)"))
infix fun <T, I : Iterable<T>> I.shouldContainSome(expected: Array<T>): I = apply { assertTrue("Expected Iterable to contain at least one of \"$expected\"", this.any { expected.contains(it) }) }

infix fun <T, I : Iterable<T>> I.shouldContainNone(expected: Iterable<T>): I = apply { assertTrue("Expected Iterable to contain none of \"$expected\"", this.none { expected.contains(it) }) }

infix fun <T, I : Iterable<T>> I.shouldContainNone(expected: Array<T>): I = apply { assertTrue("Expected Iterable to contain none of \"$expected\"", this.none { expected.contains(it) }) }

infix fun <T, I : Iterable<T>> I.shouldContainAll(expected: Iterable<T>): I = apply { expected.forEach { shouldContain(it) } }

infix fun <T, I : Iterable<T>> I.shouldContainAll(expected: Array<T>): I = apply { expected.forEach { shouldContain(it) } }

infix fun <T, I : Iterable<T>> I.shouldContainSame(expected: Iterable<T>): I = assertBothIterablesContainsSame(expected.toList(), this.toList())

infix fun <T, I : Iterable<T>> I.shouldContainSame(expected: Array<T>): I = assertBothIterablesContainsSame(expected.toList(), this.toList())

infix fun <T, I : Iterable<T>> I.shouldNotContain(expected: T): I = apply { if (!this.contains(expected)) Unit else failExpectedActual("Iterable should not contain \"$expected\"", "the Iterable to not contain \"$expected\"", join(this)) }

infix fun <T, I : Iterable<T>> I.shouldNotContainAny(expected: Iterable<T>): I = apply { expected.forEach { shouldNotContain(it) } }

infix fun <T, I : Iterable<T>> I.shouldNotContainAny(expected: Array<T>): I = apply { expected.forEach { shouldNotContain(it) } }

infix fun <T, I : Iterable<T>> I.shouldEqual(expected: Iterable<T>?): I = apply { assertEquals(expected, this) }

infix fun <T, I : Iterable<T>> I.shouldNotEqual(expected: Iterable<T>?): I = apply { assertNotEquals(expected, this) }

fun <I : Iterable<T>, T> I.shouldHaveSingleItem(): T {
    shouldHaveSize(1)
    return first()
}

fun <I : Iterable<*>> I.shouldBeEmpty(): I = apply { assertEmpty(this, "Iterable") }

fun <I : Iterable<*>> I.shouldNotBeEmpty(): I = apply { assertNotEmpty(this, "Iterable") }

infix fun <I : Iterable<*>> I.shouldHaveSize(expectedSize: Int) = apply {
    val actualSize = this.count()
    should("Expected collection size to be $expectedSize but was $actualSize") {
        actualSize == expectedSize
    }
}

infix fun <K, M : Map<K, *>> M.shouldEqual(expected: M): M = apply { assertMapEquals(this, expected) }

infix fun <K, M : Map<K, *>> M.shouldNotEqual(expected: M): M = apply { assertMapNotEquals(this, expected) }

infix fun <K, M : Map<K, *>> M.shouldEqualUnordered(expected: M): M = apply { assertMapEqualsUnordered(this, expected) }

infix fun <K, M : Map<K, *>> M.shouldNotEqualUnordered(expected: M): M = apply { assertMapNotEqualsUnordered(this, expected) }

infix fun <K, M : Map<K, *>> M.shouldHaveKey(theKey: K): M = apply { if (this.containsKey(theKey)) Unit else failExpectedActual("Map should contain key \"$theKey\"", "the Map to contain key \"$theKey\"", joinKeys(this)) }

infix fun <K, M : Map<K, *>> M.shouldNotHaveKey(theKey: K): M = apply { if (!this.containsKey(theKey)) Unit else failExpectedActual("Map should not contain key \"$theKey\"", "the Map to not contain the key \"$theKey\"", joinKeys(this)) }

infix fun <V, M : Map<*, V>> M.shouldHaveValue(theValue: V): M = apply { if (this.values.contains(theValue)) Unit else failExpectedActual("Map should contain the value \"$theValue\"", "the Map to contain value \"$theValue\"", joinValues(this)) }

infix fun <V, M : Map<*, V>> M.shouldNotHaveValue(theValue: V): M = apply { if (!this.values.contains(theValue)) Unit else failExpectedActual("Map should not contain the value \"$theValue\"", "the Map to not contain the value \"$theValue\"", joinValues(this)) }

infix fun <K, V, M : Map<K, V>> M.shouldContain(expected: Pair<K, V>): M = apply { if (this[expected.first] == expected.second) Unit else failExpectedActual("Map should contain Pair $expected", "the Map to contain Pair $expected", joinPairs(this)) }

infix fun <K, V, M : Map<K, V>> M.shouldContainAll(expected: M): M = apply { expected.forEach { shouldContain(it.toPair()) } }

infix fun <K, V, M : Map<K, V>> M.shouldContainSame(expected: M): M = apply { expected.forEach { shouldContain(it.toPair()); this.forEach { shouldContain(it.toPair()) } } }

infix fun <K, V, M : Map<K, V>> M.shouldNotContain(expected: Pair<K, V>): M = apply { if (this[expected.first] != expected.second) Unit else failExpectedActual("Map should not contain Pair $expected", "the Map to not contain the Pair $expected", joinPairs(this)) }

infix fun <K, V, M : Map<K, V>> M.shouldNotContainAny(expected: M): M = apply { expected.forEach { shouldNotContain(it.toPair()) } }

fun <M : Map<*, *>> M.shouldBeEmpty(): M = apply { assertEmpty(this.toList(), "Map") }

fun <M : Map<*, *>> M.shouldNotBeEmpty(): M = apply { assertNotEmpty(this.toList(), "Map") }

fun <M : Map<*, *>> M.shouldHaveSize(expectedSize: Int) = apply { this.keys.shouldHaveSize(expectedSize) }

infix fun <T> Any?.shouldNotBeIn(array: Array<T>) = apply { if (!array.contains(this)) Unit else failExpectedActual("\"$this\" should not be in Array", "the value \"$this\" to not be in the Array", join(array)) }

infix fun <T> Any?.shouldBeIn(iterable: Iterable<T>) = apply { if (iterable.contains(this)) Unit else failExpectedActual("\"$this\" should be in Iterable", "the value \"$this\" inside the Iterable", join(iterable)) }

infix fun <T> Any?.shouldNotBeIn(iterable: Iterable<T>) = apply { if (!iterable.contains(this)) Unit else failExpectedActual("\"$this\" should not be in Iterable", "the value \"$this\" to not be in the Iterable", join(iterable)) }

infix fun <T> Any?.shouldBeIn(array: Array<T>) = apply { if (array.contains(this)) Unit else failExpectedActual("\"$this\" should be in Array", "the value \"$this\" inside the Array", join(array)) }

fun <E> Iterable<E>.shouldMatchAtLeastOneOf(predicate: (E) -> Boolean): Iterable<E> {
    this.forEach {
        if (predicate(it))
            return this
    }
    fail("Iterable had no matching items")
}

fun <E> Iterable<E>.shouldMatchAllWith(predicate: (E) -> Boolean): Iterable<E> {
    this.forEach {
        if (!predicate(it))
            failExpectedActual("the Iterable contains \"$it\", which doesn't match the Predicate", "Iterable should match all with the Predicate", join(this))
    }
    return this
}

internal fun <T> assertEmpty(iterable: Iterable<T>, collectionType: String) = assertTrue("Expected the $collectionType to be empty, but has ${iterable.count()} elements", iterable.count() == 0)
internal fun <T> assertNotEmpty(iterable: Iterable<T>, collectionType: String) = assertTrue("Expected the $collectionType to contain elements, but is empty", iterable.count() > 0)

internal fun <T, I : Iterable<T>> I.assertBothIterablesContainsSame(expected: Iterable<T>, actual: Iterable<T>): I {
    assertBothCollectionsContainsSame(expected.toList(), actual.toList())
    return this
}

internal fun <T> assertBothCollectionsContainsSame(expected: List<T>, actual: List<T>) {
    val remainingItemsOnExpectedList = expected.toMutableList()
    val notPresentOnList = mutableListOf<T>()

    actual.forEach {
        if (!remainingItemsOnExpectedList.remove(it))
            notPresentOnList.add(it)
    }

    if (remainingItemsOnExpectedList.isNotEmpty() || notPresentOnList.isNotEmpty())
        failCollectionWithDifferentItems("The collection doesn't have the same items", join(remainingItemsOnExpectedList), join(notPresentOnList))
}
