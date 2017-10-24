package org.amshove.kluent

import org.assertj.core.api.Assertions.assertThat
import kotlin.reflect.KClass

infix fun Any?.shouldEqual(theOther: Any?) = assertThat(this).isEqualTo(theOther)

infix fun Any?.shouldNotEqual(theOther: Any?) = assertThat(this).isNotEqualTo(theOther)

infix fun Any?.shouldBe(theOther: Any?) = assertThat(this).isSameAs(theOther)

infix fun Any?.shouldNotBe(theOther: Any?) = assertThat(this).isNotSameAs(theOther)

infix fun Any?.shouldBeInstanceOf(className: Class<*>) = assertThat(className.isInstance(this)).`as`("Expected $this to be an instance of $className").isTrue()

infix fun Any?.shouldBeInstanceOf(className: KClass<*>) = assertThat(className.isInstance(this)).`as`("Expected $this to be an instance of $className").isTrue()

infix fun Any?.shouldNotBeInstanceOf(className: Class<*>) = assertThat(className.isInstance(this)).`as`("Expected $this to not be an instance of $className").isFalse()

infix fun Any?.shouldNotBeInstanceOf(className: KClass<*>) = assertThat(className.isInstance(this)).`as`("Expected $this to not be an instance of $className").isFalse()

fun Any?.shouldBeNull() = assertThat(this).isNull()

fun Any?.shouldNotBeNull() = assertThat(this).isNotNull()

fun Boolean.shouldBeTrue() = assertThat(this).isTrue()

fun Boolean.shouldBeFalse() = assertThat(this).isFalse()

fun Boolean.shouldNotBeTrue() = this.shouldBeFalse()

fun Boolean.shouldNotBeFalse() = this.shouldBeTrue()
