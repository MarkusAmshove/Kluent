package org.amshove.kluent.tests.backtickassertions

import org.amshove.kluent.`should not be instance of`
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
                assertFails({ firstObject `should not be instance of` Circle::class.java })
            }
        }
        on("checking objects of the wrong class") {
            val firstObject: Shape = Square(10.0)
            it("should pass") {
                firstObject `should not be instance of` Circle::class.java
            }
        }
    }
})
