package org.amshove.kluent

import org.assertj.core.api.Assertions.assertThat

infix fun CharSequence.shouldStartWith(theOther: CharSequence) = assertThat(this.startsWith(theOther)).`as`("Expected the CharSequence $this to start with $theOther").isTrue()

infix fun CharSequence.shouldEndWith(theOther: CharSequence) = assertThat(this.endsWith(theOther)).`as`("Expected the CharSequence $this to end with $theOther").isTrue()

infix fun CharSequence.shouldContainSome(things: Iterable<CharSequence>) = assertThat(things.any { this.contains(it) }).`as`("Expected '$this' to contain at least one of $things").isTrue()

infix fun CharSequence.shouldContainNone(things: Iterable<CharSequence>) = assertThat(things.none { this.contains(it) }).`as`("Expected '$this' to not contain any of $things").isTrue()

infix fun CharSequence.shouldContain(theOther: CharSequence) = assertThat(this.contains(theOther)).`as`("Expected the CharSequence $this to contain $theOther").isTrue()

infix fun CharSequence.shouldNotContainAny(things: Iterable<CharSequence>) = this shouldContainNone things

infix fun CharSequence.shouldMatch(regex: String) = assertThat(this.matches(Regex(regex))).`as`("Expected $this to match $regex").isTrue()

infix fun CharSequence.shouldMatch(regex: Regex) = assertThat(this.matches(regex)).`as`("Expected $this to match ${regex.pattern}").isTrue()

fun CharSequence.shouldBeEmpty() = assertThat(this.isEmpty()).`as`("Expected the CharSequence to be empty, but was $this").isTrue()

fun CharSequence?.shouldBeNullOrEmpty() = assertThat(this == null || this.isEmpty()).`as`("Expected $this to be null or empty").isTrue()

fun CharSequence.shouldBeBlank() = assertThat(this.isBlank()).`as`("Expected the CharSequence to be blank, but was $this").isTrue()

fun CharSequence?.shouldBeNullOrBlank() = assertThat(this == null || this.isBlank()).`as`("Expected $this to be null or blank").isTrue()

infix fun String.shouldEqualTo(theOther: String) = assertThat(this).isEqualTo(theOther)

infix fun String.shouldNotEqualTo(theOther: String) = assertThat(this).isNotEqualTo(theOther)

infix fun CharSequence.shouldNotStartWith(theOther: CharSequence) = assertThat(this.startsWith(theOther)).`as`("Expected the CharSequence $this to not start with $theOther").isFalse()

infix fun CharSequence.shouldNotEndWith(theOther: CharSequence) = assertThat(this.endsWith(theOther)).`as`("Expected the CharSequence $this to not end with $theOther").isFalse()

infix fun CharSequence.shouldNotContain(theOther: CharSequence) = assertThat(this.contains(theOther)).`as`("Expected the CharSequence $this to not contain $theOther").isFalse()

infix fun CharSequence.shouldNotMatch(regex: String) = assertThat(this.matches(Regex(regex))).`as`("Expected $this to not match $regex").isFalse()

infix fun CharSequence.shouldNotMatch(regex: Regex) = assertThat(this.matches(regex)).`as`("Expected $this to not match ${regex.pattern}").isFalse()

fun CharSequence.shouldNotBeEmpty() = assertThat(this.isNotEmpty()).`as`("Expected the CharSequence to not be empty").isTrue()

fun CharSequence?.shouldNotBeNullOrEmpty() {
    this.shouldNotBeNull()
    this!!.shouldNotBeEmpty()
}

fun CharSequence.shouldNotBeBlank() = assertThat(this.isNotBlank()).`as`("Expected the CharSequence to not be blank").isTrue()

fun CharSequence?.shouldNotBeNullOrBlank() {
    this.shouldNotBeNull()
    this!!.shouldNotBeBlank()
}

