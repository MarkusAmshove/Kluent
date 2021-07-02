package org.amshove.kluent

import org.amshove.kluent.internal.assertFalse
import org.amshove.kluent.internal.assertTrue
import org.amshove.kluent.internal.failExpectedActual
import kotlin.reflect.KClass

infix fun Any?.shouldBeInstanceOf(className: Class<*>) = assertTrue("Expected $this to be an instance of $className", className.isInstance(this))

infix fun Any?.shouldBeInstanceOf(className: KClass<*>) = assertTrue("Expected $this to be an instance of $className", className.isInstance(this))

inline fun <reified T> Any?.shouldBeInstanceOf(): T = if (this is T) this else hardFail("Expected $this to be an instance or subclass of ${T::class.qualifiedName}")

infix fun Any?.shouldNotBeInstanceOf(className: Class<*>) = assertFalse("Expected $this to not be an instance of $className", className.isInstance(this))

infix fun Any?.shouldNotBeInstanceOf(className: KClass<*>) = assertFalse("Expected $this to not be an instance of $className", className.isInstance(this))

inline fun <reified T> Any?.shouldNotBeInstanceOf() = also {
    if (this is T) {
        fail("Expected $this to not be an instance or subclass of ${T::class.qualifiedName}")
    }
}

infix fun <T : Any> T?.shouldHaveTheSameClassAs(other: Any) = apply {
    if (!haveSameClasses(this, other)) {
        failExpectedActual("Expected objects to have the same class", this?.javaClass?.kotlin?.qualifiedName, other::class.qualifiedName!!)
    }
}

infix fun <T : Any> T?.shouldNotHaveTheSameClassAs(other: Any) = apply {
    if(haveSameClasses(this, other)) {
        failExpectedActual("Expected objects to not have the same class", this?.javaClass?.kotlin?.qualifiedName, other::class.qualifiedName!!)
    }
}

private fun haveSameClasses(first: Any?, second: Any) = first?.javaClass?.kotlin == second::class
