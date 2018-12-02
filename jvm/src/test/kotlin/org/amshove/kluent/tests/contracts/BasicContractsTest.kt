/**
 * This file validate compile time behavior. There is no need to run it.
 */
@file:Suppress("unused")

package org.amshove.kluent.tests.contracts

import org.amshove.kluent.*

fun shouldNotBeNullContractTest() {
    val nullable: String? = null

    nullable.shouldNotBeNull()

    nullable.length // <-- Smart cast
}

fun shouldBeTrueContractTest() {
    val nullable: String? = null

    (nullable != null).shouldBeTrue()

    nullable.length // <-- Smart cast
}

fun shouldBeFalseContractTest() {
    val nullable: String? = null

    (nullable == null).shouldBeFalse()

    nullable.length // <-- Smart cast
}

fun shouldNotBeTrueContractTest() {
    val nullable: String? = null

    (nullable == null).shouldNotBeTrue()

    nullable.length // <-- Smart cast
}

fun shouldNotBeFalseContractTest() {
    val nullable: String? = null

    (nullable != null).shouldNotBeFalse()

    nullable.length // <-- Smart cast
}
