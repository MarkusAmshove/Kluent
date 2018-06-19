package org.amshove.kluent.tests.assertions.reflection

import org.amshove.kluent.shouldHaveTheSameClassAs
import org.junit.Test
import kotlin.test.assertFails

class ShouldHaveTheSameClassAsShould {
    @Test
    fun passWhenTestingLiteralsWithSameClass() {
        1.shouldHaveTheSameClassAs(5)
    }

    @Test
    fun passWhenTestingGenericsWithSameClass() {
        val intList = listOf(1, 2, 3)
        val stringList = listOf("abc", "def")

        intList.shouldHaveTheSameClassAs(stringList)
    }

    @Test
    fun failWhenTestingLiteralsWithDifferentTypes() {
        assertFails { 1.shouldHaveTheSameClassAs("abc") }
    }

    @Test
    fun failWhenTestingObjectsWithTheSameBaseClass() {
        open class BaseClass
        class ChildOne : BaseClass()
        class ChildTwo : BaseClass()

        val firstChild = ChildOne()
        val secondChild = ChildTwo()

        assertFails { firstChild.shouldHaveTheSameClassAs(secondChild) }
    }

    @Test
    fun failWhenTestingObjectsImplementingTheSameInterface() {
        class ChildOne : IInterface
        class ChildTwo : IInterface

        val firstChild = ChildOne()
        val secondChild = ChildTwo()

        assertFails { firstChild.shouldHaveTheSameClassAs(secondChild) }
    }
}

interface IInterface