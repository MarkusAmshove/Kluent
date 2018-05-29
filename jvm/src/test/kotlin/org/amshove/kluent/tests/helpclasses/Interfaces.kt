package org.amshove.kluent.tests.helpclasses


interface Database {
    fun getPerson(): Person
    fun getPerson(id: Int): Person
}

interface Shape {
    fun getArea(): Double
}

interface Sizes {
    fun getValue(firstArg: Int, secondArg: Int, thirdArg: Int, fourthArg: Int, fifthArg: Int, sixthArg: Int): Int
}

