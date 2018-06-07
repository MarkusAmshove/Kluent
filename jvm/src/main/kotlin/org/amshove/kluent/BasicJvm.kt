package org.amshove.kluent

import org.amshove.kluent.internal.failExpectedActual
import org.amshove.kluent.internal.platformClassName
import org.junit.Assert.*
import kotlin.reflect.KClass
import kotlin.reflect.full.isSubclassOf

infix fun Any?.shouldBeInstanceOf(className: Class<*>) = assertTrue("Expected $this to be an instance of $className", className.isInstance(this))

infix fun Any?.shouldBeInstanceOf(className: KClass<*>) = assertTrue("Expected $this to be an instance of $className", className.isInstance(this))

inline fun <reified T : Any> Any.shouldBeInstanceOf(): T = if (this::class.isInstance(T::class) || this::class.isSubclassOf(T::class)) this as T else throw AssertionError("Expected $this to be an instance or subclass of ${T::class.qualifiedName}")

infix fun Any?.shouldNotBeInstanceOf(className: Class<*>) = assertFalse("Expected $this to not be an instance of $className", className.isInstance(this))

infix fun Any?.shouldNotBeInstanceOf(className: KClass<*>) = assertFalse("Expected $this to not be an instance of $className", className.isInstance(this))

