package org.amshove.kluent.tests.basic

import org.amshove.kluent.internal.assertFails
import org.amshove.kluent.shouldNotBe
import org.amshove.kluent.tests.Person
import kotlin.test.Test

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