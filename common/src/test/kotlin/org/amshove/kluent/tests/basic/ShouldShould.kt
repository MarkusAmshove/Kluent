package org.amshove.kluent.tests.basic

import kotlin.test.Test
import org.amshove.kluent.should
import org.amshove.kluent.tests.Person
import kotlin.test.assertFails
import kotlin.test.assertTrue

class ShouldShould {
    @Test
    fun makeItPossibleToChainAssertions() {
        val person = Person("Peter", "Pan")

        person
                .should { name.startsWith("P") }
                .should { surname.startsWith("P") }
    }

    @Test
    fun passWhenPassingALambdaThatReturnsTrue() {
        Person("", "") should { name.length == 0 }
    }

    @Test
    fun failWhenPassingALambdaThatReturnsFalse() {
        assertFails {
            Person("", "") should { name.length > 0 }
        }
    }

    @Test
    fun passWhenDefiningADomainSpecificAssertionEvaluatingToTrue() {
        fun Person.shouldHaveUppercaseName() = this.should("The name of $this should be uppercase") {
            name[0].toUpperCase() == name[0]
        }

        Person("Peter", "Pan").shouldHaveUppercaseName()
    }

    @Test
    fun failWhenDefiningADomainSpecificAssertionEvaluatingToFalse() {
        fun Person.shouldHaveUppercaseName() = this.should("The name of $this should be uppercase") {
            name[0].toUpperCase() == name[0]
        }

        assertFails { Person("peter", "Pan").shouldHaveUppercaseName() }
    }

    @Test
    fun provideTheMessageOfDomainSpecificAssertionWhenFailing() {
        fun Person.shouldHaveUppercaseName() = this.should("The name of $this should be uppercase") {
            name[0].toUpperCase() == name[0]
        }
        val peter = Person("peter", "pan")
        try {
            peter.shouldHaveUppercaseName()
        } catch (e: AssertionError) {
            assertTrue(e.message!!.startsWith("The name of $peter should be uppercase"))
        }
    }

    @Test
    fun failTheDomainSpecificAssertionWhenAnExceptionOccurs() {
        fun Person.shouldHaveUppercaseName() = this.should("The name of $this should be uppercase") {
            name[0].toUpperCase() == name[0]
        }

        assertFails {
            Person("", "").shouldHaveUppercaseName()
        }
    }
}