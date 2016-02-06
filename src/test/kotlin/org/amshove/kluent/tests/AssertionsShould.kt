package org.amshove.kluent.tests

import org.amshove.kluent.`should be`
import org.amshove.kluent.`should contain`
import org.amshove.kluent.`should equal`
import org.amshove.kluent.tests.helpclasses.Person
import org.jetbrains.spek.api.Spek
import org.junit.ComparisonFailure
import kotlin.test.assertEquals
import kotlin.test.assertFails

class AssertionsShould : Spek() {
    fun getFailure(func: () -> Unit): ComparisonFailure {
        try {
            func.invoke()
            throw Exception("Test didn't fail")
        } catch (f: ComparisonFailure) {
            return f
        } catch (e: Exception) {
            throw Exception("Test didn't fail")
        }
    }

    init {
        given("the should equal method") {
            on("checking equality of two equal strings") {
                it("should pass") {
                    "hello world" `should equal` "hello world"
                }
            }
            on("checking equality of two strings with unequal values") {
                it("should fail") {
                    assertFails({ "hello word!" `should equal` "hello" })
                }
            }
            on("checking different types") {
                it("should fail") {
                    assertFails({ "hello world" `should equal`  5 })
                }
            }
            on("checking two data objects with same values") {
                val firstObject = Person("Jon", "Doe")
                val secondObject = Person("Jon", "Doe")
                it("should pass") {
                    firstObject `should equal` secondObject
                }
            }
        }

        given("the should be method") {
            on("checking objects with the same reference") {
                val firstObject = Person("Jon", "Doe")
                val secondObject = firstObject
                it("should pass") {
                    firstObject `should be` secondObject
                }
            }
            on("checking different objects") {
                val firstObject = Person("Foo", "Bar")
                val secondObject = Person("Foo", "Bar")
                it("should fail") {
                    assertFails({ firstObject `should be` secondObject })
                }
            }
        }

        given("the should contain method") {
            on("checking an array with the value") {
                val array = arrayOf("Hello", "World", "Wide", "Web")
                it("should pass") {
                    array `should contain` "Wide"
                }
            }
            on("checking an array without the value") {
                val array = arrayOf("Hello", "Wide", "Web")
                it("should fail") {
                    assertFails({ array `should contain` "World" })
                }
                it("should format the array") {
                    val theFailure = getFailure { array `should contain` "World" }
                    assertEquals("Hello, Wide, Web", theFailure.actual)
                }
            }
            on("checking any iterable for an object") {
                val alice = Person("Alice", "Bob")
                val jon = Person("Jon", "Doe")
                val list = listOf(alice, jon)
                it("should pass") {
                    list `should contain` jon
                }
            }
            on("checking any iterable for an object which isn't contained") {
                val alice = Person("Alice", "Bob")
                val jon = Person("Jon", "Doe")
                val list = listOf(alice)
                it("should fail") {
                    assertFails({list `should contain` jon})
                }
                it("should format the output") {
                    val failure = getFailure { list `should contain` jon }
                    assertEquals("Person(name=Alice, surname=Bob)", failure.actual)
                }
            }
        }
    }
}



