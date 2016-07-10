package org.amshove.kluent.tests.backtickassertions

import org.amshove.kluent.`should be in`
import org.amshove.kluent.`should not be in`
import org.amshove.kluent.tests.helpclasses.Person
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldNotBeInTests : Spek() {
  init {
    given("the shouldNotBeIn method") {
      on("checking object not in Array") {
        val person = Person("Jon", "Doe")
        val array = arrayOf(Person("Foo", "Bar"), Person("Foo", "Bar"))
        it("should pass") {
          person `should not be in` array
        }
      }
      on("checking object in Array") {
        val person = Person("Jon", "Doe")
        val array = arrayOf(Person("Jon", "Doe"), Person("Foo", "Bar"))
        it("should fail") {
          assertFails { person `should not be in` array }
        }
      }
      on("checking object not in Iterable") {
        val person = Person("Jon", "Doe")
        val iterable = listOf(Person("Foo", "Bar"), Person("Foo", "Bar"))
        it("should pass") {
          person `should not be in` iterable
        }
      }
      on("checking object in Iterable") {
        val person = Person("Jon", "Doe")
        val array = listOf(Person("Jon", "Doe"), Person("Foo", "Bar"))
        it("should fail") {
          assertFails { person `should not be in` array }
        }
      }
    }
  }
}