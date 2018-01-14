package org.amshove.kluent.tests.assertions

import org.amshove.kluent.shouldContain
import org.amshove.kluent.shouldContainSome
import org.amshove.kluent.shouldNotBeEmpty
import org.jetbrains.spek.api.Spek

class ChainingCollectionsTests : Spek({
    given("a collection") {
        it("should be possible to chain assertions") {
            val list = listOf(1, 2, 3, 4, 5, 6, 7, 8)

            list.shouldContain(2)
                    .shouldContain(4)
                    .shouldNotBeEmpty()
                    .shouldContainSome(arrayOf(5, 7))
        }
    }
})