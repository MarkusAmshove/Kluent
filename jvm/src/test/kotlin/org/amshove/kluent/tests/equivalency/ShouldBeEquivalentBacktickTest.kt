package org.amshove.kluent.tests.equivalency

import org.amshove.kluent.EquivalencyAssertionOptions
import org.amshove.kluent.`should be equivalent to`
import org.amshove.kluent.`should not be equivalent to`
import org.junit.Test
import java.time.LocalDate

@ExperimentalStdlibApi
class ShouldBeEquivalentBacktickTest {
    @Test
    fun `pass should be equivalent to as includedProperties are equal`() {
        // arrange
        val team1 = ShouldBeEquivalentTo.Team("team1").apply {
            persons = listOf(
                ShouldBeEquivalentTo.Person("John", "Johnson"),
                ShouldBeEquivalentTo.Person("Marc", "Marcson").apply {
                    birthDate = LocalDate.of(2020, 2, 1)
                    address = ShouldBeEquivalentTo.Address("Graham Street", "36", "London", "N1 8GJ", "UK").apply {
                        address2 = "Islington"
                    }
                }
            )
        }
        val team2 = ShouldBeEquivalentTo.Team("team2").apply {
            persons = listOf(
                ShouldBeEquivalentTo.Person("John", "Johnson"),
                ShouldBeEquivalentTo.Person("Marc", "Marcson").apply {
                    birthDate = LocalDate.of(2020, 2, 1)
                    address = ShouldBeEquivalentTo.Address("Graham Street", "36", "London", "N1 8GJ", "UK").apply {
                        address2 = "Islington"
                    }
                }
            )
        }

        // assert
        team1 `should be equivalent to` (team2 to { options: EquivalencyAssertionOptions ->
            options.including(ShouldBeEquivalentTo.Team::persons)
        })
    }


    @Test
    fun `pass should not be equivalent to as includedProperties are different`() {
        // arrange
        val team1 = ShouldBeEquivalentTo.Team("team1").apply {
            persons = listOf(
                ShouldBeEquivalentTo.Person("John", "Johnson").apply {
                    address = ShouldBeEquivalentTo.Address(
                        "Mainzerlandstrasse",
                        "200",
                        "Frankfurt am Main",
                        "60327",
                        "Germany"
                    )
                },
                ShouldBeEquivalentTo.Person("Marc", "Marcson").apply {
                    birthDate = LocalDate.of(2020, 2, 1)
                    address = ShouldBeEquivalentTo.Address("Graham Street", "36", "London", "N1 8GJ", "UK").apply {
                        address2 = "Islington"
                    }
                }
            )
        }
        val team2 = ShouldBeEquivalentTo.Team("team1").apply {
            persons = listOf(
                ShouldBeEquivalentTo.Person("John", "Johnson").apply {
                    address = ShouldBeEquivalentTo.Address(
                        "Mainzerlandstrasse",
                        "200",
                        "Frankfurt am Main",
                        "60327",
                        "Germany"
                    )
                },
                ShouldBeEquivalentTo.Person("Marc", "Marcson").apply {
                    birthDate = LocalDate.of(2020, 2, 1)
                    address = ShouldBeEquivalentTo.Address("Graham Street", "36", "London", "N1 8GJ", "UK")
                }
            )
        }

        // assert
        team1 `should not be equivalent to` Pair<ShouldBeEquivalentTo.Team, ((EquivalencyAssertionOptions) -> EquivalencyAssertionOptions)?>(
            team2,
            { options: EquivalencyAssertionOptions ->
                options.including(ShouldBeEquivalentTo.Team::persons)
            })
    }
}