package org.amshove.kluent.tests.assertions.reflection

import org.amshove.kluent.shouldBeInstanceOf
import org.amshove.kluent.tests.helpclasses.*
import org.junit.Test
import kotlin.test.assertFails


class ShouldBeInstanceOfShould {
    @Test
    fun passWhenTestingAnObjectWithThePassedClass() {
        val firstObject: Shape = Circle(10.0)
        firstObject shouldBeInstanceOf Circle::class
    }

    @Test
    fun passWhenTestingAnObjectWithThePassedClassUsingGenericParameter() {
        val firstObject: Shape = Circle(10.0)
        firstObject.shouldBeInstanceOf<Circle>()
    }

    @Test
    fun returnACastedInstanceOfThePassedClass() {
        val base: Base = Child()
        val child = base.shouldBeInstanceOf<Child>()
        child.shouldBeInstanceOf(Child::class)
    }

    @Test
    fun failWhenTestingAnObjectWithAnotherClass() {
        val firstObject: Shape = Square(10.0)
        assertFails { firstObject shouldBeInstanceOf Circle::class }
    }

    @Test
    fun failWhenTestingAnObjectWithAnotherClassUsingGenericParameter() {
        val base: Base = Base()
        assertFails {
            @Suppress("UNUSED_VARIABLE")
            val child = base.shouldBeInstanceOf<Child>()
        }
    }
}