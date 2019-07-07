package org.amshove.kluent.basic

import kotlin.test.Test
import org.amshove.kluent.Person
import org.amshove.kluent.shouldNotBe
import kotlin.test.assertFails

class ShouldNotBeShould {
    @Test
    fun passWhenCheckingObjectsWithDifferentReference() {
        val firstObject = Person("Jon", "Doe")
        val secondObject = Person("Jon", "Doe")
        firstObject shouldNotBe secondObject
    }

    @Test
    fun failWhenCheckingObjectsWithSameReference() {
        val firstObject = Person("Jon", "Doe")
        val secondObject = firstObject
        assertFails { firstObject shouldNotBe secondObject }
    }
}