package org.amshove.kluent.collections

import org.amshove.kluent.*
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldEqualUnorderedShould {
    @Test
    fun failWhenMapCreationOrderNotTheSame() {
        val firstMap = mapOf(2 to Person("C", "D"), 1 to Person("A", "B"))
        val secondMap = mapOf(1 to Person("A", "B"), 2 to Person("C", "D"))

        assertFails { firstMap shouldBeEqualTo  secondMap }
    }

    @Test
    fun passWhenUnorderedMapsAreTheSame() {
        val firstMap = mapOf(2 to Person("C", "D"), 1 to Person("A", "B"))
        val secondMap = mapOf(1 to Person("A", "B"), 2 to Person("C", "D"))

        firstMap shouldEqualUnordered secondMap
    }

}
