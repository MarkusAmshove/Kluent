package org.amshove.kluent.tests.assertions.reflection

import org.amshove.kluent.shouldNotHaveTheSameClassAs
import org.amshove.kluent.tests.helpclasses.Base
import org.junit.Test
import kotlin.test.assertFails

class ShouldNotHaveTheSameClassAsShould {
    @Test
    fun passWhenTestingLiteralsWithDifferentTypes() {
        1.shouldNotHaveTheSameClassAs("abc")
    }

    @Test
    fun passWhenTestingObjectsWithTheSameBaseClass() {
        open class BaseClass
        class ChildOne : BaseClass()
        class ChildTwo : BaseClass()

        val firstChild = ChildOne()
        val secondChild = ChildTwo()

        firstChild.shouldNotHaveTheSameClassAs(secondChild)
    }

    @Test
    fun passWhenTestingObjectsImplementingTheSameInterface() {
        class ChildOne : IInterface
        class ChildTwo : IInterface

        val firstChild = ChildOne()
        val secondChild = ChildTwo()

        firstChild.shouldNotHaveTheSameClassAs(secondChild)
    }

    @Test
    fun failWhenTestingLiteralsWithSameClass() {
        assertFails { 1.shouldNotHaveTheSameClassAs(5) }
    }

    @Test
    fun failWhenTestingGenericsWithSameClass() {
        val intList = listOf(1, 2, 3)
        val stringList = listOf("abc", "def")

        assertFails { intList.shouldNotHaveTheSameClassAs(stringList) }
    }

    @Test
    fun passWhenTestingNullInstance() {
        val base: Base? = null
        val other = Base()

        base.shouldNotHaveTheSameClassAs(other)
    }
}
