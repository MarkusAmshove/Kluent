package org.amshove.kluent.tests.collections

import org.amshove.kluent.shouldHaveSingleItem
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldHaveSingleItemShould {
    @Test
    fun passWhenABooleanArrayHasASingleItem() {
        booleanArrayOf(false).shouldHaveSingleItem()
        booleanArrayOf(true).shouldHaveSingleItem()
    }

    @Test
    fun failWhenABooleanArrayDoesNotHaveASingleItem() {
        assertFails {
            booleanArrayOf().shouldHaveSingleItem()
            booleanArrayOf(false, false).shouldHaveSingleItem()
        }
    }

    @Test
    fun passWhenAByteArrayHasASingleItem() {
        byteArrayOf(0).shouldHaveSingleItem()
        byteArrayOf(1).shouldHaveSingleItem()
    }

    @Test
    fun failWhenAByteArrayDoesNotHaveASingleItem() {
        assertFails {
            byteArrayOf().shouldHaveSingleItem()
            byteArrayOf(0, 1).shouldHaveSingleItem()
        }
    }

    @Test
    fun passWhenACharArrayHasASingleItem() {
        charArrayOf('A').shouldHaveSingleItem()
        charArrayOf('Z').shouldHaveSingleItem()
    }

    @Test
    fun failWhenACharArrayDoesNotHaveASingleItem() {
        assertFails {
            charArrayOf().shouldHaveSingleItem()
            charArrayOf('A', 'Z').shouldHaveSingleItem()
        }
    }

    @Test
    fun passWhenAnIntArrayHasASingleItem() {
        intArrayOf(0).shouldHaveSingleItem()
        intArrayOf(1).shouldHaveSingleItem()
    }

    @Test
    fun failWhenAnIntArrayDoesNotHaveASingleItem() {
        assertFails {
            intArrayOf().shouldHaveSingleItem()
            intArrayOf(0, 1).shouldHaveSingleItem()
        }
    }

    @Test
    fun passWhenADoubleArrayHasASingleItem() {
        doubleArrayOf(0.0).shouldHaveSingleItem()
        doubleArrayOf(1.0).shouldHaveSingleItem()
    }

    @Test
    fun failWhenADoubleArrayDoesNotHaveASingleItem() {
        assertFails {
            doubleArrayOf().shouldHaveSingleItem()
            doubleArrayOf(0.0, 1.0).shouldHaveSingleItem()
        }
    }

    @Test
    fun passWhenAFloatArrayHasASingleItem() {
        floatArrayOf(0.0f).shouldHaveSingleItem()
        floatArrayOf(1.0f).shouldHaveSingleItem()
    }

    @Test
    fun failWhenAFloatArrayDoesNotHaveASingleItem() {
        assertFails {
            floatArrayOf().shouldHaveSingleItem()
            floatArrayOf(0.0f, 1.0f).shouldHaveSingleItem()
        }
    }

    @Test
    fun passWhenALongArrayHasASingleItem() {
        longArrayOf(0).shouldHaveSingleItem()
        longArrayOf(1).shouldHaveSingleItem()
    }

    @Test
    fun failWhenALongArrayDoesNotHaveASingleItem() {
        assertFails {
            longArrayOf().shouldHaveSingleItem()
            longArrayOf(0, 1).shouldHaveSingleItem()
        }
    }

    @Test
    fun passWhenAShortArrayHasASingleItem() {
        shortArrayOf(0).shouldHaveSingleItem()
        shortArrayOf(1).shouldHaveSingleItem()
    }

    @Test
    fun failWhenAShortArrayDoesNotHaveASingleItem() {
        assertFails {
            shortArrayOf().shouldHaveSingleItem()
            shortArrayOf(0, 1).shouldHaveSingleItem()
        }
    }
}