package org.amshove.kluent.collections

import org.amshove.kluent.Person
import org.amshove.kluent.shouldNotEqualUnordered
import kotlin.test.Test
import kotlin.test.assertFails

class ShouldNotEqualUnorderedShould {

    @Test
    fun failWhenUnorderedMapsAreTheSame() {
        val firstMap = mapOf(2 to Person("C", "D"), 1 to Person("A", "B"))
        val secondMap = mapOf(1 to Person("A", "B"), 2 to Person("C", "D"))

        assertFails { firstMap shouldNotEqualUnordered secondMap }
    }

    @Test
    fun passWhenMapsAreNotTheSame() {
        val firstMap = mapOf(1 to Person("A", "A"), 2 to Person("C", "D"))
        val secondMap = mapOf(1 to Person("A", "B"), 2 to Person("C", "D"))

        firstMap shouldNotEqualUnordered secondMap
    }

}
