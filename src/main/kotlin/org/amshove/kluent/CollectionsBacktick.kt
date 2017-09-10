package org.amshove.kluent

infix fun <T> Array<T>.`should contain`(theThing: T) = this.shouldContain(theThing)

infix fun <T> Array<T>.`should contain some`(things: Array<T>) = this.shouldContainSome(things)

infix fun <T> Array<T>.`should contain none`(things: Array<T>) = this.shouldContainNone(things)

infix fun <T> Array<T>.`should contain all`(things: Array<T>) = this.shouldContainAll(things)

infix fun <T> Array<T>.`should not contain`(theThing: T) = this.shouldNotContain(theThing)

infix fun <T> Array<T>.`should not contain any`(things: Array<T>) = this.shouldNotContainAny(things)

infix fun <T> Array<T>?.`should equal`(theOther: Array<T>?) = this.shouldEqual(theOther)

fun <T> Array<T>.`should be empty`() = this.shouldBeEmpty()

fun <T> Array<T>.`should not be empty`() = this.shouldNotBeEmpty()

infix fun IntArray.`should equal`(theOther: IntArray) = this.shouldEqual(theOther)

fun IntArray.`should be empty`() = this.shouldBeEmpty()

fun IntArray.`should not be empty`() = this.shouldNotBeEmpty()

infix fun IntArray.`should contain`(theThing: Int) = this.shouldContain(theThing)

infix fun IntArray.`should contain some`(things: IntArray) = this.shouldContainSome(things)

infix fun IntArray.`should contain none`(things: IntArray) = this.shouldContainNone(things)

infix fun IntArray.`should contain all`(things: IntArray) = this.shouldContainAll(things)

infix fun IntArray.`should not contain`(theThing: Int) = this.shouldNotContain(theThing)

infix fun IntArray.`should not contain any`(things: IntArray) = this.shouldNotContainAny(things)

infix fun Int.`should be in`(theArray: IntArray) = this.shouldBeIn(theArray)

infix fun Int.`should not be in`(theArray: IntArray) = this.shouldNotBeIn(theArray)

infix fun BooleanArray.`should equal`(theOther: BooleanArray) = this.shouldEqual(theOther)

fun BooleanArray.`should be empty`() = this.shouldBeEmpty()

fun BooleanArray.`should not be empty`() = this.shouldNotBeEmpty()

infix fun BooleanArray.`should contain`(theThing: Boolean) = this.shouldContain(theThing)

infix fun BooleanArray.`should contain some`(things: BooleanArray) = this.shouldContainSome(things)

infix fun BooleanArray.`should contain none`(things: BooleanArray) = this.shouldContainNone(things)

infix fun BooleanArray.`should contain all`(things: BooleanArray) = this.shouldContainAll(things)

infix fun BooleanArray.`should not contain`(theThing: Boolean) = this.shouldNotContain(theThing)

infix fun BooleanArray.`should not contain any`(things: BooleanArray) = this.shouldNotContainAny(things)

infix fun Boolean.`should be in`(theArray: BooleanArray) = this.shouldBeIn(theArray)

infix fun Boolean.`should not be in`(theArray: BooleanArray) = this.shouldNotBeIn(theArray)

infix fun ByteArray.`should equal`(theOther: ByteArray) = this.shouldEqual(theOther)

fun ByteArray.`should be empty`() = this.shouldBeEmpty()

fun ByteArray.`should not be empty`() = this.shouldNotBeEmpty()

infix fun ByteArray.`should contain`(theThing: Byte) = this.shouldContain(theThing)

infix fun ByteArray.`should contain some`(things: ByteArray) = this.shouldContainSome(things)

infix fun ByteArray.`should contain none`(things: ByteArray) = this.shouldContainNone(things)

infix fun ByteArray.`should contain all`(things: ByteArray) = this.shouldContainAll(things)

infix fun ByteArray.`should not contain`(theThing: Byte) = this.shouldNotContain(theThing)

infix fun ByteArray.`should not contain any`(things: ByteArray) = this.shouldNotContainAny(things)

infix fun Byte.`should be in`(theArray: ByteArray) = this.shouldBeIn(theArray)

infix fun Byte.`should not be in`(theArray: ByteArray) = this.shouldNotBeIn(theArray)

infix fun CharArray.`should equal`(theOther: CharArray) = this.shouldEqual(theOther)

fun CharArray.`should be empty`() = this.shouldBeEmpty()

fun CharArray.`should not be empty`() = this.shouldNotBeEmpty()

infix fun CharArray.`should contain`(theThing: Char) = this.shouldContain(theThing)

infix fun CharArray.`should contain some`(things: CharArray) = this.shouldContainSome(things)

infix fun CharArray.`should contain none`(things: CharArray) = this.shouldContainNone(things)

infix fun CharArray.`should contain all`(things: CharArray) = this.shouldContainAll(things)

infix fun CharArray.`should not contain`(theThing: Char) = this.shouldNotContain(theThing)

infix fun CharArray.`should not contain any`(things: CharArray) = this.shouldNotContainAny(things)

infix fun Char.`should be in`(theArray: CharArray) = this.shouldBeIn(theArray)

infix fun Char.`should not be in`(theArray: CharArray) = this.shouldNotBeIn(theArray)

infix fun DoubleArray.`should equal`(theOther: DoubleArray) = this.shouldEqual(theOther)

fun DoubleArray.`should be empty`() = this.shouldBeEmpty()

fun DoubleArray.`should not be empty`() = this.shouldNotBeEmpty()

infix fun DoubleArray.`should contain`(theThing: Double) = this.shouldContain(theThing)

infix fun DoubleArray.`should contain some`(things: DoubleArray) = this.shouldContainSome(things)

infix fun DoubleArray.`should contain none`(things: DoubleArray) = this.shouldContainNone(things)

infix fun DoubleArray.`should contain all`(things: DoubleArray) = this.shouldContainAll(things)

infix fun DoubleArray.`should not contain`(theThing: Double) = this.shouldNotContain(theThing)

infix fun DoubleArray.`should not contain any`(things: DoubleArray) = this.shouldNotContainAny(things)

infix fun Double.`should be in`(theArray: DoubleArray) = this.shouldBeIn(theArray)

infix fun Double.`should not be in`(theArray: DoubleArray) = this.shouldNotBeIn(theArray)

infix fun FloatArray.`should equal`(theOther: FloatArray) = this.shouldEqual(theOther)

fun FloatArray.`should be empty`() = this.shouldBeEmpty()

fun FloatArray.`should not be empty`() = this.shouldNotBeEmpty()

infix fun FloatArray.`should contain`(theThing: Float) = this.shouldContain(theThing)

infix fun FloatArray.`should contain some`(things: FloatArray) = this.shouldContainSome(things)

infix fun FloatArray.`should contain none`(things: FloatArray) = this.shouldContainNone(things)

infix fun FloatArray.`should contain all`(things: FloatArray) = this.shouldContainAll(things)

infix fun FloatArray.`should not contain`(theThing: Float) = this.shouldNotContain(theThing)

infix fun FloatArray.`should not contain any`(things: FloatArray) = this.shouldNotContainAny(things)

infix fun Float.`should be in`(theArray: FloatArray) = this.shouldBeIn(theArray)

infix fun Float.`should not be in`(theArray: FloatArray) = this.shouldNotBeIn(theArray)

infix fun LongArray.`should equal`(theOther: LongArray) = this.shouldEqual(theOther)

fun LongArray.`should be empty`() = this.shouldBeEmpty()

fun LongArray.`should not be empty`() = this.shouldNotBeEmpty()

infix fun LongArray.`should contain`(theThing: Long) = this.shouldContain(theThing)

infix fun LongArray.`should contain some`(things: LongArray) = this.shouldContainSome(things)

infix fun LongArray.`should contain none`(things: LongArray) = this.shouldContainNone(things)

infix fun LongArray.`should contain all`(things: LongArray) = this.shouldContainAll(things)

infix fun LongArray.`should not contain`(theThing: Long) = this.shouldNotContain(theThing)

infix fun LongArray.`should not contain any`(things: LongArray) = this.shouldNotContainAny(things)

infix fun Long.`should be in`(theArray: LongArray) = this.shouldBeIn(theArray)

infix fun Long.`should not be in`(theArray: LongArray) = this.shouldNotBeIn(theArray)

infix fun ShortArray.`should equal`(theOther: ShortArray) = this.shouldEqual(theOther)

fun ShortArray.`should be empty`() = this.shouldBeEmpty()

fun ShortArray.`should not be empty`() = this.shouldNotBeEmpty()

infix fun ShortArray.`should contain`(theThing: Short) = this.shouldContain(theThing)

infix fun ShortArray.`should contain some`(things: ShortArray) = this.shouldContainSome(things)

infix fun ShortArray.`should contain none`(things: ShortArray) = this.shouldContainNone(things)

infix fun ShortArray.`should contain all`(things: ShortArray) = this.shouldContainAll(things)

infix fun ShortArray.`should not contain`(theThing: Short) = this.shouldNotContain(theThing)

infix fun ShortArray.`should not contain any`(things: ShortArray) = this.shouldNotContainAny(things)

infix fun Short.`should be in`(theArray: ShortArray) = this.shouldBeIn(theArray)

infix fun Short.`should not be in`(theArray: ShortArray) = this.shouldNotBeIn(theArray)

infix fun <T> Iterable<T>.`should contain`(theThing: T) = this.shouldContain(theThing)

infix fun <T> Iterable<T>.`should contain some`(things: Iterable<T>) = this.shouldContainSome(things)

infix fun <T> Iterable<T>.`should contain none`(things: Iterable<T>) = this.shouldContainNone(things)

infix fun <T> Iterable<T>.`should contain all`(things: Iterable<T>) = this.shouldContainAll(things)

infix fun <T> Iterable<T>.`should not contain`(theThing: T) = this.shouldNotContain(theThing)

infix fun <T> Iterable<T>.`should not contain any`(things: Iterable<T>) = this.shouldNotContainAny(things)

infix fun <T> Iterable<T>?.`should equal`(theOther: Iterable<T>?) = this.shouldEqual(theOther)

fun <T> Iterable<T>.`should be empty`() = this.shouldBeEmpty()

fun <T> Iterable<T>.`should not be empty`() = this.shouldNotBeEmpty()

infix fun <R, T> Map<R, T>.`should have key`(theKey: R) = this.shouldHaveKey(theKey)

infix fun <R, T> Map<R, T>.`should not have key`(theKey: R) = this.shouldNotHaveKey(theKey)

infix fun <R, T> Map<R, T>.`should have value`(theValue: T) = this.shouldHaveValue(theValue)

infix fun <R, T> Map<R, T>.`should not have value`(theValue: T) = this.shouldNotHaveValue(theValue)

infix fun <R, T> Map<R, T>.`should contain`(theThing: Pair<R, T>) = this.shouldContain(theThing)

infix fun <R, T> Map<R, T>.`should contain all`(things: Map<R, T>) = this.shouldContainAll(things)

infix fun <R, T> Map<R, T>.`should not contain`(theThing: Pair<R, T>) = this.shouldNotContain(theThing)

infix fun <R, T> Map<R, T>.`should not contain any`(things: Map<R, T>) = this.shouldNotContainAny(things)

fun <R, T> Map<R, T>.`should be empty`() = this.shouldBeEmpty()

fun <R, T> Map<R, T>.`should not be empty`() = this.shouldNotBeEmpty()

infix fun <T> Any?.`should not be in`(array: Array<T>) = this.shouldNotBeIn(array)

infix fun <T> Any?.`should be in`(iterable: Iterable<T>) = this.shouldBeIn(iterable)

infix fun <T> Any?.`should not be in`(iterable: Iterable<T>) = this.shouldNotBeIn(iterable)

infix fun <T> Any?.`should be in`(array: Array<T>) = this.shouldBeIn(array)
