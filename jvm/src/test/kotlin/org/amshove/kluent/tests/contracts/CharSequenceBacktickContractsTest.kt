/**
 * This file validate compile time behavior. There is no need to run it.
 */
@file:Suppress("unused")

package org.amshove.kluent.tests.contracts

import org.amshove.kluent.`should not be null or blank`
import org.amshove.kluent.`should not be null or empty`

fun `should not be null or empty contractTest`() {
    val nullable: String? = null

    nullable.`should not be null or empty`()

    nullable.length // <-- Smart cast
}

fun `should not be null or blank contractTest`() {
    val nullable: String? = null

    nullable.`should not be null or blank`()

    nullable.length // <-- Smart cast
}
