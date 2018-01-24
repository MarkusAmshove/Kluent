package org.amshove.kluent

infix fun <T> Array<T>.`should contain`(expected: T) = this.shouldContain(expected)

infix fun <T> Array<T>.`should contain some`(expected: Array<T>) = this.shouldContainSome(expected)

infix fun <T> Array<T>.`should contain none`(expected: Array<T>) = this.shouldContainNone(expected)

infix fun <T> Array<T>.`should contain all`(expected: Array<T>) = this.shouldContainAll(expected)

infix fun <T> Array<T>.`should not contain`(expected: T) = this.shouldNotContain(expected)

infix fun <T> Array<T>.`should not contain any`(expected: Array<T>) = this.shouldNotContainAny(expected)

infix fun <T> Array<T>?.`should equal`(expected: Array<T>?) = this.shouldEqual(expected)

fun <T> Array<T>.`should be empty`() = this.shouldBeEmpty()

fun <T> Array<T>.`should not be empty`() = this.shouldNotBeEmpty()

infix fun IntArray.`should equal`(expected: IntArray) = this.shouldEqual(expected)

fun IntArray.`should be empty`() = this.shouldBeEmpty()

fun IntArray.`should not be empty`() = this.shouldNotBeEmpty()

infix fun IntArray.`should contain`(expected: Int) = this.shouldContain(expected)

infix fun IntArray.`should contain some`(expected: IntArray) = this.shouldContainSome(expected)

infix fun IntArray.`should contain none`(expected: IntArray) = this.shouldContainNone(expected)

infix fun IntArray.`should contain all`(expected: IntArray) = this.shouldContainAll(expected)

infix fun IntArray.`should not contain`(expected: Int) = this.shouldNotContain(expected)

infix fun IntArray.`should not contain any`(expected: IntArray) = this.shouldNotContainAny(expected)

infix fun Int.`should be in`(theArray: IntArray) = this.shouldBeIn(theArray)

infix fun Int.`should not be in`(theArray: IntArray) = this.shouldNotBeIn(theArray)

infix fun BooleanArray.`should equal`(expected: BooleanArray) = this.shouldEqual(expected)

fun BooleanArray.`should be empty`() = this.shouldBeEmpty()

fun BooleanArray.`should not be empty`() = this.shouldNotBeEmpty()

infix fun BooleanArray.`should contain`(expected: Boolean) = this.shouldContain(expected)

infix fun BooleanArray.`should contain some`(expected: BooleanArray) = this.shouldContainSome(expected)

infix fun BooleanArray.`should contain none`(expected: BooleanArray) = this.shouldContainNone(expected)

infix fun BooleanArray.`should contain all`(expected: BooleanArray) = this.shouldContainAll(expected)

infix fun BooleanArray.`should not contain`(expected: Boolean) = this.shouldNotContain(expected)

infix fun BooleanArray.`should not contain any`(expected: BooleanArray) = this.shouldNotContainAny(expected)

infix fun Boolean.`should be in`(theArray: BooleanArray) = this.shouldBeIn(theArray)

infix fun Boolean.`should not be in`(theArray: BooleanArray) = this.shouldNotBeIn(theArray)

infix fun ByteArray.`should equal`(expected: ByteArray) = this.shouldEqual(expected)

fun ByteArray.`should be empty`() = this.shouldBeEmpty()

fun ByteArray.`should not be empty`() = this.shouldNotBeEmpty()

infix fun ByteArray.`should contain`(expected: Byte) = this.shouldContain(expected)

infix fun ByteArray.`should contain some`(expected: ByteArray) = this.shouldContainSome(expected)

infix fun ByteArray.`should contain none`(expected: ByteArray) = this.shouldContainNone(expected)

infix fun ByteArray.`should contain all`(expected: ByteArray) = this.shouldContainAll(expected)

infix fun ByteArray.`should not contain`(expected: Byte) = this.shouldNotContain(expected)

infix fun ByteArray.`should not contain any`(expected: ByteArray) = this.shouldNotContainAny(expected)

infix fun Byte.`should be in`(theArray: ByteArray) = this.shouldBeIn(theArray)

infix fun Byte.`should not be in`(theArray: ByteArray) = this.shouldNotBeIn(theArray)

infix fun CharArray.`should equal`(expected: CharArray) = this.shouldEqual(expected)

fun CharArray.`should be empty`() = this.shouldBeEmpty()

fun CharArray.`should not be empty`() = this.shouldNotBeEmpty()

infix fun CharArray.`should contain`(expected: Char) = this.shouldContain(expected)

infix fun CharArray.`should contain some`(expected: CharArray) = this.shouldContainSome(expected)

infix fun CharArray.`should contain none`(expected: CharArray) = this.shouldContainNone(expected)

infix fun CharArray.`should contain all`(expected: CharArray) = this.shouldContainAll(expected)

infix fun CharArray.`should not contain`(expected: Char) = this.shouldNotContain(expected)

infix fun CharArray.`should not contain any`(expected: CharArray) = this.shouldNotContainAny(expected)

infix fun Char.`should be in`(theArray: CharArray) = this.shouldBeIn(theArray)

infix fun Char.`should not be in`(theArray: CharArray) = this.shouldNotBeIn(theArray)

infix fun DoubleArray.`should equal`(expected: DoubleArray) = this.shouldEqual(expected)

fun DoubleArray.`should be empty`() = this.shouldBeEmpty()

fun DoubleArray.`should not be empty`() = this.shouldNotBeEmpty()

infix fun DoubleArray.`should contain`(expected: Double) = this.shouldContain(expected)

infix fun DoubleArray.`should contain some`(expected: DoubleArray) = this.shouldContainSome(expected)

infix fun DoubleArray.`should contain none`(expected: DoubleArray) = this.shouldContainNone(expected)

infix fun DoubleArray.`should contain all`(expected: DoubleArray) = this.shouldContainAll(expected)

infix fun DoubleArray.`should not contain`(expected: Double) = this.shouldNotContain(expected)

infix fun DoubleArray.`should not contain any`(expected: DoubleArray) = this.shouldNotContainAny(expected)

infix fun Double.`should be in`(theArray: DoubleArray) = this.shouldBeIn(theArray)

infix fun Double.`should not be in`(theArray: DoubleArray) = this.shouldNotBeIn(theArray)

infix fun FloatArray.`should equal`(expected: FloatArray) = this.shouldEqual(expected)

fun FloatArray.`should be empty`() = this.shouldBeEmpty()

fun FloatArray.`should not be empty`() = this.shouldNotBeEmpty()

infix fun FloatArray.`should contain`(expected: Float) = this.shouldContain(expected)

infix fun FloatArray.`should contain some`(expected: FloatArray) = this.shouldContainSome(expected)

infix fun FloatArray.`should contain none`(expected: FloatArray) = this.shouldContainNone(expected)

infix fun FloatArray.`should contain all`(expected: FloatArray) = this.shouldContainAll(expected)

infix fun FloatArray.`should not contain`(expected: Float) = this.shouldNotContain(expected)

infix fun FloatArray.`should not contain any`(expected: FloatArray) = this.shouldNotContainAny(expected)

infix fun Float.`should be in`(theArray: FloatArray) = this.shouldBeIn(theArray)

infix fun Float.`should not be in`(theArray: FloatArray) = this.shouldNotBeIn(theArray)

infix fun LongArray.`should equal`(expected: LongArray) = this.shouldEqual(expected)

fun LongArray.`should be empty`() = this.shouldBeEmpty()

fun LongArray.`should not be empty`() = this.shouldNotBeEmpty()

infix fun LongArray.`should contain`(expected: Long) = this.shouldContain(expected)

infix fun LongArray.`should contain some`(expected: LongArray) = this.shouldContainSome(expected)

infix fun LongArray.`should contain none`(expected: LongArray) = this.shouldContainNone(expected)

infix fun LongArray.`should contain all`(expected: LongArray) = this.shouldContainAll(expected)

infix fun LongArray.`should not contain`(expected: Long) = this.shouldNotContain(expected)

infix fun LongArray.`should not contain any`(expected: LongArray) = this.shouldNotContainAny(expected)

infix fun Long.`should be in`(theArray: LongArray) = this.shouldBeIn(theArray)

infix fun Long.`should not be in`(theArray: LongArray) = this.shouldNotBeIn(theArray)

infix fun ShortArray.`should equal`(expected: ShortArray) = this.shouldEqual(expected)

fun ShortArray.`should be empty`() = this.shouldBeEmpty()

fun ShortArray.`should not be empty`() = this.shouldNotBeEmpty()

infix fun ShortArray.`should contain`(expected: Short) = this.shouldContain(expected)

infix fun ShortArray.`should contain some`(expected: ShortArray) = this.shouldContainSome(expected)

infix fun ShortArray.`should contain none`(expected: ShortArray) = this.shouldContainNone(expected)

infix fun ShortArray.`should contain all`(expected: ShortArray) = this.shouldContainAll(expected)

infix fun ShortArray.`should not contain`(expected: Short) = this.shouldNotContain(expected)

infix fun ShortArray.`should not contain any`(expected: ShortArray) = this.shouldNotContainAny(expected)

infix fun Short.`should be in`(theArray: ShortArray) = this.shouldBeIn(theArray)

infix fun Short.`should not be in`(theArray: ShortArray) = this.shouldNotBeIn(theArray)

infix fun <T, I : Iterable<T>> I.`should contain`(expected: T) = this.shouldContain(expected)

infix fun <T, I : Iterable<T>> I.`should contain some`(expected: Iterable<T>) = this.shouldContainSome(expected)

infix fun <T, I : Iterable<T>> I.`should contain some`(expected: Array<T>) = this.shouldContainSome(expected)

infix fun <T, I : Iterable<T>> I.`should contain none`(expected: Iterable<T>) = this.shouldContainNone(expected)

infix fun <T, I : Iterable<T>> I.`should contain none`(expected: Array<T>) = this.shouldContainNone(expected)

infix fun <T, I : Iterable<T>> I.`should contain all`(expected: Iterable<T>) = this.shouldContainAll(expected)

infix fun <T, I : Iterable<T>> I.`should contain all`(expected: Array<T>) = this.shouldContainAll(expected)

infix fun <T, I : Iterable<T>> I.`should not contain`(expected: T) = this.shouldNotContain(expected)

infix fun <T, I : Iterable<T>> I.`should not contain any`(expected: Iterable<T>) = this.shouldNotContainAny(expected)

infix fun <T, I : Iterable<T>> I.`should not contain any`(expected: Array<T>) = this.shouldNotContainAny(expected)

infix fun <T, I : Iterable<T>> I?.`should equal`(expected: Iterable<T>?) = this.shouldEqual(expected)

fun <I : Iterable<*>> I.`should be empty`() = this.shouldBeEmpty()

fun <I : Iterable<*>> I.`should not be empty`() = this.shouldNotBeEmpty()

infix fun <K, V, M : Map<K, V>> M.`should have key`(theKey: K) = this.shouldHaveKey(theKey)

infix fun <K, V, M : Map<K, V>> M.`should not have key`(theKey: K) = this.shouldNotHaveKey(theKey)

infix fun <K, V, M : Map<K, V>> M.`should have value`(theValue: V) = this.shouldHaveValue(theValue)

infix fun <K, V, M : Map<K, V>> M.`should not have value`(theValue: V) = this.shouldNotHaveValue(theValue)

infix fun <K, V, M : Map<K, V>> M.`should contain`(expected: Pair<K, V>) = this.shouldContain(expected)

infix fun <K, V, M : Map<K , V>> M.`should contain all`(expected: Map<K, V>) = this.shouldContainAll(expected)

infix fun <K, V, M : Map<K, V>> M.`should not contain`(expected: Pair<K, V>) = this.shouldNotContain(expected)

infix fun <K, V, M : Map<K, V>> M.`should not contain any`(expected: Map<K, V>) = this.shouldNotContainAny(expected)

fun <K, V, M : Map<K, V>> M.`should be empty`() = this.shouldBeEmpty()

fun <K, V, M : Map<K, V>> M.`should not be empty`() = this.shouldNotBeEmpty()

infix fun <T> Any?.`should not be in`(array: Array<T>) = this.shouldNotBeIn(array)

infix fun <T> Any?.`should be in`(iterable: Iterable<T>) = this.shouldBeIn(iterable)

infix fun <T> Any?.`should not be in`(iterable: Iterable<T>) = this.shouldNotBeIn(iterable)

infix fun <T> Any?.`should be in`(array: Array<T>) = this.shouldBeIn(array)
