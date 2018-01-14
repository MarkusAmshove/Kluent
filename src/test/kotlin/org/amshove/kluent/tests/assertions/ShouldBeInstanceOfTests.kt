package org.amshove.kluent.tests.assertions

import org.amshove.kluent.shouldBeInstanceOf
import org.amshove.kluent.tests.helpclasses.*
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldBeInstanceOfTests : Spek({
    given("the should be instance of method") {
        on("checking objects of the correct class") {
            val firstObject: Shape = Circle(10.0)
            it("should pass") {
                firstObject shouldBeInstanceOf Circle::class.java
            }

            it("should return a casted instance of the class") {
                val base : Base = Child()
                val child = base.shouldBeInstanceOf<Child>()
                child.shouldBeInstanceOf(Child::class)
            }
        }
        on("checking objects of the wrong class") {
            val firstObject: Shape = Square(10.0)
            it("should fail") {
                assertFails({ firstObject shouldBeInstanceOf Circle::class.java })
            }
            it("should fail with generic shouldBeInstanceOf") {
                val base : Base = Base()
                assertFails {
                    val child = base.shouldBeInstanceOf<Child>()
                }
            }
        }
    }
})
