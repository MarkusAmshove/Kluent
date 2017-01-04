package org.amshove.kluent.tests.helpclasses

data class Person(val name: String, val surname: String)

class Circle(val radius: Double) : Shape {
    override fun getArea() = radius * Math.PI * Math.PI
}

class Square(val side: Double) : Shape {
    override fun getArea() = side * side
}
