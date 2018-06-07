package org.amshove.kluent

import org.amshove.kluent.internal.failExpectedActual

infix fun <T : Any> T.shouldHaveTheSameClassAs(other: Any) = apply {
    if (!haveSameClasses(this, other)) {
        failExpectedActual("Expected objects to have the same class", this::class.qualifiedName!!, other::class.qualifiedName!!)
    }
}

infix fun <T : Any> T.shouldNotHaveTheSameClassAs(other: Any) = apply {
    if(haveSameClasses(this, other)) {
        failExpectedActual("Expected objects to not have the same class", this::class.qualifiedName!!, other::class.qualifiedName!!)
    }
}

private fun haveSameClasses(first: Any, second: Any) = first::class == second::class
