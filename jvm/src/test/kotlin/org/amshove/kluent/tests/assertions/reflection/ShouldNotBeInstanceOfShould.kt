package org.amshove.kluent.tests.assertions.reflection

import org.amshove.kluent.shouldBeInstanceOf
import org.amshove.kluent.shouldNotBeInstanceOf
import org.amshove.kluent.tests.helpclasses.Base
import org.amshove.kluent.tests.helpclasses.Circle
import org.amshove.kluent.tests.helpclasses.Shape
import org.amshove.kluent.tests.helpclasses.Square
import org.junit.Test
import kotlin.test.assertFails

class ShouldNotBeInstanceOfShould {

    @Test
    fun passWhenCheckingAnObjectWithADifferentType() {
        val firstObject: Shape = Circle(10.0)
        firstObject shouldNotBeInstanceOf Square::class
    }

    @Test
    fun passWhenCheckingAnObjectWithADifferentTypeUsingGenericParameter() {
        val firstObject: Shape = Circle(10.0)
        firstObject.shouldNotBeInstanceOf<Square>()
    }


    @Test
    fun failWhenCheckingAnObjectWithTheCorrectType() {
        val firstObject: Shape = Circle(10.0)
        assertFails { firstObject shouldNotBeInstanceOf Circle::class }
    }

    @Test
    fun failWhenCheckingAnObjectWithTheCorrectTypeUsingGenericParameter() {
        val firstObject: Shape = Circle(10.0)
        assertFails { firstObject.shouldNotBeInstanceOf<Circle>() }
    }

    @Test
    fun passWhenTestingNullInstance() {
        val base: Base? = null
        base.shouldNotBeInstanceOf<Base>()
    }

    @Test
    fun failWhenTestingNullInstanceAgainstNullableType() {
        val base: Base? = null
        assertFails { base.shouldNotBeInstanceOf<Base?>() }
    }

    @Test
    fun failWhenTestingNonNullInstanceAgainstCompatibleNullableType() {
        val base: Base = Base()
        assertFails { base.shouldNotBeInstanceOf<Base?>() }
    }
}
