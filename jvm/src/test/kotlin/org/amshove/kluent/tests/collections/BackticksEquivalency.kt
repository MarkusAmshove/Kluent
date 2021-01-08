package org.amshove.kluent.tests.collections

import org.amshove.kluent.`should be equivalent to`
import org.amshove.kluent.tests.equivalency.ShouldBeEquivalentTo
import org.junit.Test
import java.time.LocalDate

@ExperimentalStdlibApi
class BackticksEquivalency {
    @Test
    fun `pass should be equivalent to withStrictOrdering as properties are equal for iterables`() {
        // arrange
        val teams1 = listOf(
                ShouldBeEquivalentTo.Team("team1").apply {
                    persons = listOf(
                            ShouldBeEquivalentTo.Person("John", "Johnson").apply {
                                address = ShouldBeEquivalentTo.Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                            },
                            ShouldBeEquivalentTo.Person("Marc", "Marcson").apply { birthDate = LocalDate.of(2020, 2, 1) }
                    )
                },
                ShouldBeEquivalentTo.Team("team2").apply {
                    persons = listOf(
                            ShouldBeEquivalentTo.Person("John", "Johnson"),
                            ShouldBeEquivalentTo.Person("Marc", "")
                    )
                },
                ShouldBeEquivalentTo.Team("team3").apply {
                    persons = listOf(
                            ShouldBeEquivalentTo.Person("John", "Johnson"),
                            ShouldBeEquivalentTo.Person("Marc", "Marcson")
                    )
                }
        )
        val teams2 = listOf(
                ShouldBeEquivalentTo.Team("team1").apply {
                    persons = listOf(
                            ShouldBeEquivalentTo.Person("John", "Johnson").apply {
                                address = ShouldBeEquivalentTo.Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                            },
                            ShouldBeEquivalentTo.Person("Marc", "Marcson").apply { birthDate = LocalDate.of(2020, 2, 1) }
                    )
                },
                ShouldBeEquivalentTo.Team("team2").apply {
                    persons = listOf(
                            ShouldBeEquivalentTo.Person("John", "Johnson"),
                            ShouldBeEquivalentTo.Person("Marc", "")
                    )
                },
                ShouldBeEquivalentTo.Team("team3").apply {
                    persons = listOf(
                            ShouldBeEquivalentTo.Person("John", "Johnson"),
                            ShouldBeEquivalentTo.Person("Marc", "Marcson")
                    )
                }
        )

        // assert
        teams1.`should be equivalent to` (teams2) {
            it.withStrictOrdering()
        }
    }

}