package org.amshove.kluent

import org.junit.Assert.*

infix fun CharSequence.`should start with`(theOther: CharSequence) = assertTrue("Expected the CharSequence $this to start with $theOther", this.startsWith(theOther))
infix fun CharSequence.shouldStartWith(theOther: CharSequence) = this `should start with` theOther

infix fun CharSequence.`should end with`(theOther: CharSequence) = assertTrue("Expected the CharSequence $this to end with $theOther", this.endsWith(theOther))
infix fun CharSequence.shouldEndWith(theOther: CharSequence) = this `should end with` theOther

infix fun CharSequence.`should contain`(theOther: CharSequence) = assertTrue("Expected the CharSequence $this to contain $theOther", this.contains(theOther))
infix fun CharSequence.shouldContain(theOther: CharSequence) = this `should contain` theOther

infix fun CharSequence.`should match`(regex: String) = assertTrue("Expected $this to match $regex", this.matches(Regex(regex)))
infix fun CharSequence.shouldMatch(regex: String) = this `should match` regex

infix fun CharSequence.`should match`(regex: Regex) = assertTrue("Expected $this to match ${regex.pattern}", this.matches(regex))
infix fun CharSequence.shouldMatch(regex: Regex) = this `should match` regex

fun CharSequence.`should be empty`() = assertTrue("Expected the CharSequence to be empty, but was $this", this.isEmpty())
fun CharSequence.shouldBeEmpty() = this.`should be empty`()

fun CharSequence.`should be blank`() = assertTrue("Expected the CharSequence to be blank, but was $this", this.isBlank())
fun CharSequence.shouldBeBlank() = this.`should be blank`()

infix fun String.`should equal to`(theOther: String) = assertEquals(theOther, this)
infix fun String.shouldEqualTo(theOther: String) = this `should equal to` theOther

infix fun String.`should not equal to`(theOther: String) = assertNotEquals(theOther, this)
infix fun String.shouldNotEqualTo(theOther: String) = this `should not equal to` theOther

infix fun CharSequence.`should not start with`(theOther: CharSequence) = assertFalse("Expected the CharSequence $this to not start with $theOther", this.startsWith(theOther))
infix fun CharSequence.shouldNotStartWith(theOther: CharSequence) = this `should not start with` theOther

infix fun CharSequence.`should not end with`(theOther: CharSequence) = assertFalse("Expected the CharSequence $this to not end with $theOther", this.endsWith(theOther))
infix fun CharSequence.shouldNotEndWith(theOther: CharSequence) = this `should not end with` theOther

infix fun CharSequence.`should not contain`(theOther: CharSequence) = assertFalse("Expected the CharSequence $this to not contain $theOther", this.contains(theOther))
infix fun CharSequence.shouldNotContain(theOther: CharSequence) = this `should not contain` theOther

infix fun CharSequence.`should not match`(regex: String) = assertFalse("Expected $this to not match $regex", this.matches(Regex(regex)))
infix fun CharSequence.shouldNotMatch(regex: String) = this `should not match` regex

infix fun CharSequence.`should not match`(regex: Regex) = assertFalse("Expected $this to not match ${regex.pattern}", this.matches(regex))
infix fun CharSequence.shouldNotMatch(regex: Regex) = this `should not match` regex

fun CharSequence.`should not be empty`() = assertTrue("Expected the CharSequence to not be empty", this.isNotEmpty())
fun CharSequence.shouldNotBeEmpty() = this.`should not be empty`()

fun CharSequence.`should not be blank`() = assertTrue("Expected the CharSequence to not be blank", this.isNotBlank())
fun CharSequence.shouldNotBeBlank() = this.`should not be blank`()
