package org.amshove.kluent.tests.assertions

import org.amshove.kluent.should
import org.amshove.kluent.shouldEqual
import org.amshove.kluent.tests.helpclasses.Person
import org.jetbrains.spek.api.Spek
import kotlin.test.assertFails

class ShouldTests : Spek({
    given("the should method") {
        on("passing a lambda that returns true") {
            it("should pass") {
                Person("", "") should { name.length == 0 }
            }
        }
        on("passing a lambda that returns false") {
            it("should fail") {
                assertFails {
                    Person("", "").should {
                        name.length > 0
                    }
                }
            }
        }

        on("defining a domain specific assertion method") {
            fun Person.shouldHaveUppercaseName() = this.should("The name of $this should be uppercase") {
                name[0].isUpperCase()
            }

            it("should pass when returning true") {
                Person("Pan", "Peter").shouldHaveUppercaseName()
            }
            it("should fail when returning false") {
                assertFails {
                    Person("pan", "peter").shouldHaveUppercaseName()
                }
            }
            it("should fail with the provided message") {
                val peter = Person("pan", "peter")
                try {
                    peter.shouldHaveUppercaseName()
                } catch (e: AssertionError) {
                    e.message.shouldEqual("The name of $peter should be uppercase")
                }
            }
            it("should fail when an exception occurs") {
                assertFails {
                    Person("", "").shouldHaveUppercaseName()
                }
            }
        }
    }
})