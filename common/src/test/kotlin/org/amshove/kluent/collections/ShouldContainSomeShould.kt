package org.amshove.kluent.collections

import org.amshove.kluent.shouldContainSome
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldContainSomeShould {
    @Test
    fun passWhenTestingAListWhichContainsAtLeastOneElement() {
        val cities = listOf("Israel", "Berlin", "Phoenix", "Egypt")
        val actual = listOf("Berlin", "Stuttgart")

        actual shouldContainSome cities
    }

    @Test
    fun failWhenTestingAListWhichDoesNotContainAtLeastOneElement() {

        val cities = listOf("Israel", "Phoenix", "Egypt")
        val actual = listOf("Berlin", "Stuttgart")

        assertFails { actual shouldContainSome cities }
    }

    @Test
    fun passWhenTestingIfAListContainsASubsetOfAnArrayWhenItDoes() {

        val cities = arrayOf("Israel", "Phoenix", "Berlin", "Egypt")
        val actual = listOf("Berlin", "Stuttgart")

        actual.shouldContainSome(cities)
    }
}