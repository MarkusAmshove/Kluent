package org.amshove.kluent.tests.helpclasses

open class Base {
    fun doSomething() = println("Base")
}

class Child : Base() {
    fun different() = println("Child")
}