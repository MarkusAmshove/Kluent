package org.amshove.kluent.collections

import org.amshove.kluent.shouldHaveSize
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldHaveSizeShould {
    @Test
    fun passWhenTestingACollectionWithTheCorrectSize() {
        val list = listOf("First", "valueIchi", "Second", "valueNi")
        list.shouldHaveSize(4)
    }

    @Test
    fun failWhenTestingACollectionWithAnIncorrectSize() {
        val list = listOf("First", "valueIchi", "Second", "valueNi")
        assertFails {
            list.shouldHaveSize(2)
        }
    }

    @Test
    fun workWithArrays() {
        val arr = arrayOf(1, 2, 3, 4, 5)
        arr.shouldHaveSize(5)
    }

    @Test
    fun workWithMaps() {
        val map = mapOf(1 to 2, 3 to 4)
        map.shouldHaveSize(2)
    }

    @Test
    fun workWithPrimitiveArrays() {
        val intArray = intArrayOf(1, 2)
        intArray.shouldHaveSize(2)
    }
}