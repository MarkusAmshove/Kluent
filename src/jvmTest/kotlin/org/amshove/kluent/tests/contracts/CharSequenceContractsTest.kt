/**
 * This file validate compile time behavior. There is no need to run it.
 */
@file:Suppress("unused")

package org.amshove.kluent.tests.contracts

import org.amshove.kluent.shouldNotBeNullOrBlank
import org.amshove.kluent.shouldNotBeNullOrEmpty

fun shouldNotBeNullOrEmptyContractTest() {
    val nullable: String? = null

    nullable.shouldNotBeNullOrEmpty()

    nullable.length // <-- Smart cast
}

fun shouldNotBeNullOrBlankContractTest() {
    val nullable: String? = null

    nullable.shouldNotBeNullOrBlank()

    nullable.length // <-- Smart cast
}
