package org.amshove.kluent.tests.assertions

import org.amshove.kluent.shouldNotBeInstanceOf
import org.amshove.kluent.tests.helpclasses.Circle
import org.amshove.kluent.tests.helpclasses.Shape
import org.amshove.kluent.tests.helpclasses.Square
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotBeInstanceOfTests : Spek({
    given("the should be instance of method") {
        on("checking objects of the correct class") {
            val firstObject: Shape = Circle(10.0)
            it("should fail") {
                assertFails({ firstObject shouldNotBeInstanceOf Circle::class.java })
            }
        }
        on("checking objects of the wrong class") {
            val firstObject: Shape = Square(10.0)
            it("should pass") {
                firstObject shouldNotBeInstanceOf Circle::class.java
            }
        }
    }
})
