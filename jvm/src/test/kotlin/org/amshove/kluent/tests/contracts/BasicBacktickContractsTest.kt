/**
 * This file validate compile time behavior. There is no need to run it.
 */
@file:Suppress("unused")

package org.amshove.kluent.tests.contracts

import org.amshove.kluent.*

fun `should not be null contractTest`() {
    val nullable: String? = null

    nullable.`should not be null`()

    nullable.length // <-- Smart cast
}

fun `should be true contractTest`() {
    val nullable: String? = null

    (nullable != null).`should be true`()

    nullable.length // <-- Smart cast
}

fun `should be false contractTest`() {
    val nullable: String? = null

    (nullable == null).`should be false`()

    nullable.length // <-- Smart cast
}

fun `should not be true contractTest`() {
    val nullable: String? = null

    (nullable == null).`should not be true`()

    nullable.length // <-- Smart cast
}

fun `should not be false contractTest`() {
    val nullable: String? = null

    (nullable != null).`should not be false`()

    nullable.length // <-- Smart cast
}
