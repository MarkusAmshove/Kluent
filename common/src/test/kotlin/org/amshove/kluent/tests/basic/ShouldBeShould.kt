package org.amshove.kluent.tests.basic

import org.amshove.kluent.internal.assertFails
import kotlin.test.Test
import org.amshove.kluent.shouldBe
import org.amshove.kluent.tests.Person

class ShouldBeShould {
    @Test
    fun passWhenCheckingObjectsWithSameReference() {
        val firstObject = Person("Jon", "Doe")
        val secondObject = firstObject
        firstObject shouldBe secondObject
    }

    @Test
    fun failWhenCheckingObjectsWithDifferentReference() {
        val firstObject = Person("Jon", "Doe")
        val secondObject = Person("Jon", "Doe")
        assertFails { firstObject shouldBe secondObject }
    }
}