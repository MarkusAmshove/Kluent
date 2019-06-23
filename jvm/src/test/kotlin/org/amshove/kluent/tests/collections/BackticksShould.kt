package org.amshove.kluent.tests.collections

import org.amshove.kluent.Person
import org.amshove.kluent.`should match at least one of`
import kotlin.test.Test

class BackticksShould {
    @Test
    fun `should have backticks flavor too`() {
        val list = listOf(Person("Anton", "Chekhov"), Person("Alexander", "Pushkin"), Person("Fyodor", "Dostoevsky"))
        list `should match at least one of` { it.name.length > 5 }
    }
}
