package org.amshove.kluent

infix fun CharSequence.shouldStartWith(theOther: CharSequence) = assert(this.startsWith(theOther), {"Expected the CharSequence $this to start with $theOther"})

infix fun CharSequence.shouldEndWith(theOther: CharSequence) = assert(this.endsWith(theOther), {"Expected the CharSequence $this to end with $theOther`"})

infix fun CharSequence.shouldContainSome(things: Iterable<CharSequence>) = assert(things.any { this.contains(it) }, {"Expected '$this' to contain at least one of $things`"})

infix fun CharSequence.shouldContainNone(things: Iterable<CharSequence>) = assert(things.none { this.contains(it) }, {"Expected '$this' to not contain any of $things`"})

infix fun CharSequence.shouldContain(theOther: CharSequence) = assert(this.contains(theOther), {"Expected the CharSequence $this to contain $theOther`"})

infix fun CharSequence.shouldNotContainAny(things: Iterable<CharSequence>) = this shouldContainNone things

infix fun CharSequence.shouldMatch(regex: String) = assert(this.matches(Regex(regex)), {"Expected $this to match $regex`"})

infix fun CharSequence.shouldMatch(regex: Regex) = assert(this.matches(regex), {"Expected $this to match ${regex.pattern}`"})

fun CharSequence.shouldBeEmpty() = assert(this.isEmpty(), {"Expected the CharSequence to be empty, but was $this"})

fun CharSequence?.shouldBeNullOrEmpty() = assert(this == null || this.isEmpty(), {"Expected $this to be null or empty"})

fun CharSequence.shouldBeBlank() = assert(this.isBlank(), {"Expected the CharSequence to be blank, but was $this"})

fun CharSequence?.shouldBeNullOrBlank() = assert(this == null || this.isBlank(), {"Expected $this to be null or blank"})

infix fun String.shouldEqualTo(theOther: String) = assert(this == theOther)

infix fun String.shouldNotEqualTo(theOther: String) = assert(this != theOther)

infix fun CharSequence.shouldNotStartWith(theOther: CharSequence) = assert(!this.startsWith(theOther), {"Expected the CharSequence $this to not start with $theOther"})

infix fun CharSequence.shouldNotEndWith(theOther: CharSequence) = assert(!this.endsWith(theOther), {"Expected the CharSequence $this to not end with $theOther"})

infix fun CharSequence.shouldNotContain(theOther: CharSequence) = assert(!this.contains(theOther), {"Expected the CharSequence $this to not contain $theOther"})

infix fun CharSequence.shouldNotMatch(regex: String) = assert(!this.matches(Regex(regex)), {"Expected $this to not match $regex"})

infix fun CharSequence.shouldNotMatch(regex: Regex) = assert(!this.matches(regex), {"Expected $this to not match ${regex.pattern}"})

fun CharSequence.shouldNotBeEmpty() = assert(this.isNotEmpty(), {"Expected the CharSequence to not be empty"})

fun CharSequence?.shouldNotBeNullOrEmpty() {
    this.shouldNotBeNull()
    this!!.shouldNotBeEmpty()
}

fun CharSequence.shouldNotBeBlank() = assert(this.isNotBlank(), {"Expected the CharSequence to not be blank"})

fun CharSequence?.shouldNotBeNullOrBlank() {
    this.shouldNotBeNull()
    this!!.shouldNotBeBlank()
}

