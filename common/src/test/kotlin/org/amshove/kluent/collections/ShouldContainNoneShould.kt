package org.amshove.kluent.collections

import org.amshove.kluent.Person
import org.amshove.kluent.shouldContainNone
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldContainNoneShould {
    @Test
    fun passWhenTestingAnArrayWhichDoesNotContainAtLeastOneElement() {
        val anArray = arrayOf("Israel", "Phoenix", "Egypt")

        anArray shouldContainNone listOf("Berlin", "Stuttart")
    }

    @Test
    fun failWhenTestingAnArrayWhichContainsAtLeastOneElement() {
        val anArray = arrayOf("Israel", "Phoenix", "Egypt")

        assertFails { anArray shouldContainNone listOf("Berlin", "Egypt") }
    }

    @Test
    fun passWhenTestingAListWhichDoesNotContainAtLeastOneElement() {
        val cities = listOf("Israel", "Phoenix", "Egypt")
        val actual = listOf("Berlin", "Stuttgart")

        actual shouldContainNone cities
    }

    @Test
    fun failWhenTestingAListWhichContainsAtLeastOneElement() {
        val cities = listOf("Israel", "Phoenix", "Stuttgart", "Egypt")
        val actual = listOf("Berlin", "Stuttgart")

        assertFails { actual shouldContainNone cities }
    }
}
