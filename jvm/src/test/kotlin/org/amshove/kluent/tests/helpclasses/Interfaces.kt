package org.amshove.kluent.tests.helpclasses

import java.io.IOException


interface Database {
    fun getPerson(): Person

    @Throws(IOException::class)
    fun getPersonChecked(): Person
    fun getPerson(id: Int): Person
}

interface Shape {
    fun getArea(): Double
}

interface Sizes {
    fun getValue(firstArg: Int, secondArg: Int, thirdArg: Int, fourthArg: Int, fifthArg: Int, sixthArg: Int): Int
}

