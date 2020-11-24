package org.amshove.kluent.tests.equivalency

import org.amshove.kluent.*
import org.amshove.kluent.internal.assertFailsWith
import org.junit.ComparisonFailure
import org.junit.Test
import java.time.LocalDate

@ExperimentalStdlibApi
class ShouldBeEquivalentTo {
    @Test
    fun failShouldBeEquivalentToAsPropertiesAreDifferent() {
        // arrange
        val team1 = Team("team1").apply {
            persons = listOf(
                    Person("John", "Johnson").apply {
                        address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                    },
                    Person("Marc", "Marcson").apply { birthDate = LocalDate.of(2020, 2, 1) }
            )
        }
        val team2 = Team("team1").apply {
            persons = listOf(
                    Person("John", "Johnson"),
                    Person("Marc", "Marcson")
            )
        }

        // assert
        assertFailsWith(ComparisonFailure::class) {
            team1.shouldBeEquivalentTo(team2) {
                it.compareByProperties()
            }
        }
    }

    @Test
    fun passShouldNotBeEquivalentToAsPropertiesAreDifferent() {
        // arrange
        val team1 = Team("team1").apply {
            persons = listOf(
                    Person("John", "Johnson").apply {
                        address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                    },
                    Person("Marc", "Marcson").apply { birthDate = LocalDate.of(2020, 2, 1) }
            )
        }
        val team2 = Team("team1").apply {
            persons = listOf(
                    Person("John", "Johnson"),
                    Person("Marc", "Marcson")
            )
        }

        // assert
        team1.shouldNotBeEquivalentTo(team2) { it.compareByProperties() }
    }

    @Test
    fun failShouldBeEquivalentToAsPropertiesAreDifferentForIterables() {
        // arrange
        val teams1 = listOf(
                Team("team1").apply {
                    persons = listOf(
                            Person("John", "Johnson").apply {
                                address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                            },
                            Person("Marc", "Marcson").apply { birthDate = LocalDate.of(2020, 2, 1) }
                    )
                },
                Team("team2").apply {
                    persons = listOf(
                            Person("John", "Johnson"),
                            Person("Marc", "Marcson")
                    )
                }
        )
        val teams2 = listOf(
                Team("team1").apply {
                    persons = listOf(
                            Person("John", "Johnson").apply {
                                address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                            },
                            Person("Marc", "Marcson").apply { birthDate = LocalDate.of(2020, 2, 1) }
                    )
                },
                Team("team2").apply {
                    persons = listOf(
                            Person("John", "Johnson"),
                            Person("Marc", "")
                    )
                }
        )

        // assert
        assertFailsWith(ComparisonFailure::class) {
            teams1.shouldBeEquivalentTo(teams2) {
                it.compareByProperties()
            }
        }
    }

    @Test
    fun passShouldNotBeEquivalentToAsPropertiesAreDifferentForIterables() {
        // arrange
        val teams1 = listOf(
                Team("team1").apply {
                    persons = listOf(
                            Person("John", "Johnson").apply {
                                address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                            },
                            Person("Marc", "Marcson").apply { birthDate = LocalDate.of(2020, 2, 1) }
                    )
                },
                Team("team2").apply {
                    persons = listOf(
                            Person("John", "Johnson"),
                            Person("Marc", "Marcson")
                    )
                },
                Team("team2").apply {
                    persons = listOf(
                            Person("John", "Johnson"),
                            Person("Marc", "Marcson")
                    )
                }
        )
        val teams2 = listOf(
                Team("team2").apply {
                    persons = listOf(
                            Person("John", "Johnson"),
                            Person("Marc", "")
                    )
                },
                Team("team1").apply {
                    persons = listOf(
                            Person("John", "Johnson").apply {
                                address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                            },
                            Person("Marc", "Marcson").apply { birthDate = LocalDate.of(2020, 2, 1) }
                    )
                },
                Team("team2").apply {
                    persons = listOf(
                            Person("John", "Johnson"),
                            Person("Marc", "Marcson")
                    )
                }
        )

        // assert
        teams1.shouldNotBeEquivalentTo(teams2)
    }

    @Test
    fun passShouldBeEquivalentToWithStrictOrderingAsPropertiesAreEqualForIterables() {
        // arrange
        val teams1 = listOf(
                Team("team1").apply {
                    persons = listOf(
                            Person("John", "Johnson").apply {
                                address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                            },
                            Person("Marc", "Marcson").apply { birthDate = LocalDate.of(2020, 2, 1) }
                    )
                },
                Team("team2").apply {
                    persons = listOf(
                            Person("John", "Johnson"),
                            Person("Marc", "")
                    )
                },
                Team("team3").apply {
                    persons = listOf(
                            Person("John", "Johnson"),
                            Person("Marc", "Marcson")
                    )
                }
        )
        val teams2 = listOf(
                Team("team1").apply {
                    persons = listOf(
                            Person("John", "Johnson").apply {
                                address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                            },
                            Person("Marc", "Marcson").apply { birthDate = LocalDate.of(2020, 2, 1) }
                    )
                },
                Team("team2").apply {
                    persons = listOf(
                            Person("John", "Johnson"),
                            Person("Marc", "")
                    )
                },
                Team("team3").apply {
                    persons = listOf(
                            Person("John", "Johnson"),
                            Person("Marc", "Marcson")
                    )
                }
        )

        // assert
        teams1.shouldBeEquivalentTo(teams2) {
            it.withStrictOrdering()
        }
    }

    @Test
    fun passShouldNotBeEquivalentToWithStrictOrderingEvenIfPropertiesAreEqualForIterables() {
        // arrange
        val teams1 = listOf(
                Team("team1").apply {
                    persons = listOf(
                            Person("John", "Johnson").apply {
                                address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                            },
                            Person("Marc", "Marcson").apply { birthDate = LocalDate.of(2020, 2, 1) }
                    )
                },
                Team("team2").apply {
                    persons = listOf(
                            Person("John", "Johnson"),
                            Person("Marc", "")
                    )
                },
                Team("team3").apply {
                    persons = listOf(
                            Person("John", "Johnson"),
                            Person("Marc", "Marcson")
                    )
                }
        )
        val teams2 = listOf(
                Team("team1").apply {
                    persons = listOf(
                            Person("John", "Johnson").apply {
                                address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                            },
                            Person("Marc", "Marcson").apply { birthDate = LocalDate.of(2020, 2, 1) }
                    )
                },
                Team("team3").apply {
                    persons = listOf(
                            Person("John", "Johnson"),
                            Person("Marc", "Marcson")
                    )
                },
                Team("team2").apply {
                    persons = listOf(
                            Person("John", "Johnson"),
                            Person("Marc", "")
                    )
                }
        )

        // assert
        teams1.shouldNotBeEquivalentTo(teams2) {
            it.withStrictOrdering()
        }
    }

    @Test
    fun passShouldBeEquivalentToAsPropertiesAreEqualComparingByProperties() {
        // arrange
        val team1 = Team("team1").apply {
            persons = listOf(
                    Person("John", "Johnson").apply {
                        address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                    },
                    Person("Marc", "Marcson").apply {
                        birthDate = LocalDate.of(2020, 2, 1)
                        address = Address("Graham Street", "36", "London", "N1 8GJ", "UK").apply {
                            address2 = "Islington"
                        }
                    }
            )
        }
        val team2 = Team("team1").apply {
            persons = listOf(
                    Person("John", "Johnson").apply {
                        address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                    },
                    Person("Marc", "Marcson").apply {
                        birthDate = LocalDate.of(2020, 2, 1)
                        address = Address("Graham Street", "36", "London", "N1 8GJ", "UK").apply {
                            address2 = "Islington"
                        }
                    }
            )
        }

        // assert
        team1.shouldBeEquivalentTo(team2) { it.compareByProperties() }
    }

    @Test
    fun failShouldNotBeEquivalentToAsPropertiesAreEqualComparingByProperties() {
        // arrange
        val team1 = Team("team1").apply {
            persons = listOf(
                    Person("John", "Johnson").apply {
                        address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                    },
                    Person("Marc", "Marcson").apply {
                        birthDate = LocalDate.of(2020, 2, 1)
                        address = Address("Graham Street", "36", "London", "N1 8GJ", "UK").apply {
                            address2 = "Islington"
                        }
                    }
            )
        }
        val team2 = Team("team1").apply {
            persons = listOf(
                    Person("John", "Johnson").apply {
                        address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                    },
                    Person("Marc", "Marcson").apply {
                        birthDate = LocalDate.of(2020, 2, 1)
                        address = Address("Graham Street", "36", "London", "N1 8GJ", "UK").apply {
                            address2 = "Islington"
                        }
                    }
            )
        }

        // assert
        assertFailsWith(ComparisonFailure::class) {
            team1.shouldNotBeEquivalentTo(team2) { it.compareByProperties() }
        }
    }

    @Test
    fun failShouldBeEquivalentToAsIncludedPropertyPersonsIsDifferent() {
        // arrange
        val team1 = Team("team1").apply {
            persons = listOf(
                    Person("John", "Johnson").apply {
                        address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                    },
                    Person("Marc", "Marcson").apply {
                        birthDate = LocalDate.of(2020, 2, 1)
                        address = Address("Graham Street", "36", "London", "N1 8GJ", "UK").apply {
                            address2 = "Islington"
                        }
                    }
            )
        }
        val team2 = Team("team1").apply {
            persons = listOf(
                    Person("John", "Johnson").apply {
                        address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                    },
                    Person("Marc", "Marcson").apply {
                        birthDate = LocalDate.of(2020, 2, 1)
                        address = Address("Graham Street", "36", "London", "N1 8GJ", "UK")
                    }
            )
        }

        // assert
        assertFailsWith(ComparisonFailure::class) {
            team1.shouldBeEquivalentTo(team2) {
                it.including(Team::persons)
            }
        }
    }

    @Test
    fun passShouldNotBeEquivalentToAsIncludedPropertyPersonsIsDifferent() {
        // arrange
        val team1 = Team("team1").apply {
            persons = listOf(
                    Person("John", "Johnson").apply {
                        address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                    },
                    Person("Marc", "Marcson").apply {
                        birthDate = LocalDate.of(2020, 2, 1)
                        address = Address("Graham Street", "36", "London", "N1 8GJ", "UK").apply {
                            address2 = "Islington"
                        }
                    }
            )
        }
        val team2 = Team("team1").apply {
            persons = listOf(
                    Person("John", "Johnson").apply {
                        address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                    },
                    Person("Marc", "Marcson").apply {
                        birthDate = LocalDate.of(2020, 2, 1)
                        address = Address("Graham Street", "36", "London", "N1 8GJ", "UK")
                    }
            )
        }

        // assert
        team1.shouldNotBeEquivalentTo(team2) {
            it.including(Team::persons)
        }
    }

    @Test
    fun passShouldBeEquivalentToEvenIfExcludedPropertyPersonsIsDifferent() {
        // arrange
        val team1 = Team("team1").apply {
            persons = listOf(
                    Person("John", "Johnson").apply {
                        address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                    },
                    Person("Marc", "Marcson").apply {
                        birthDate = LocalDate.of(2020, 2, 1)
                        address = Address("Graham Street", "36", "London", "N1 8GJ", "UK").apply {
                            address2 = "Islington"
                        }
                    }
            )
        }
        val team2 = Team("team1").apply {
            persons = listOf(
                    Person("John", "Johnson").apply {
                        address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                    },
                    Person("Marc", "Marcson").apply {
                        birthDate = LocalDate.of(2020, 2, 1)
                        address = Address("Graham Street", "36", "London", "N1 8GJ", "UK")
                    }
            )
        }

        // assert
        team1.shouldBeEquivalentTo(team2) {
            it.excluding(Team::persons)
        }
    }

    @Test
    fun failShouldNotBeEquivalentToEvenIfExcludedPropertyPersonsIsDifferent() {
        // arrange
        val team1 = Team("team1").apply {
            persons = listOf(
                    Person("John", "Johnson").apply {
                        address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                    },
                    Person("Marc", "Marcson").apply {
                        birthDate = LocalDate.of(2020, 2, 1)
                        address = Address("Graham Street", "36", "London", "N1 8GJ", "UK").apply {
                            address2 = "Islington"
                        }
                    }
            )
        }
        val team2 = Team("team1").apply {
            persons = listOf(
                    Person("John", "Johnson").apply {
                        address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                    },
                    Person("Marc", "Marcson").apply {
                        birthDate = LocalDate.of(2020, 2, 1)
                        address = Address("Graham Street", "36", "London", "N1 8GJ", "UK")
                    }
            )
        }

        // assert
        assertFailsWith(ComparisonFailure::class) {
            team1.shouldNotBeEquivalentTo(team2) {
                it.excluding(Team::persons)
            }
        }
    }

    @Test
    fun failShouldBeEquivalentToEvenIfExcludedPropertyPersonsIsEqual() {
        // arrange
        val team1 = Team("team1").apply {
            persons = listOf(
                    Person("John", "Johnson").apply {
                        address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                    },
                    Person("Marc", "Marcson").apply {
                        birthDate = LocalDate.of(2020, 2, 1)
                        address = Address("Graham Street", "36", "London", "N1 8GJ", "UK").apply {
                            address2 = "Islington"
                        }
                    }
            )
        }
        val team2 = Team("team2").apply {
            persons = listOf(
                    Person("John", "Johnson").apply {
                        address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                    },
                    Person("Marc", "Marcson").apply {
                        birthDate = LocalDate.of(2020, 2, 1)
                        address = Address("Graham Street", "36", "London", "N1 8GJ", "UK")
                    }
            )
        }

        // assert
        assertFailsWith(ComparisonFailure::class) {
            team1.shouldBeEquivalentTo(team2) {
                it.excluding(Team::persons)
            }
        }
    }

    @Test
    fun passShouldNotBeEquivalentToEvenIfExcludedPropertyPersonsIsEqual() {
        // arrange
        val team1 = Team("team1").apply {
            persons = listOf(
                    Person("John", "Johnson").apply {
                        address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                    },
                    Person("Marc", "Marcson").apply {
                        birthDate = LocalDate.of(2020, 2, 1)
                        address = Address("Graham Street", "36", "London", "N1 8GJ", "UK").apply {
                            address2 = "Islington"
                        }
                    }
            )
        }
        val team2 = Team("team2").apply {
            persons = listOf(
                    Person("John", "Johnson").apply {
                        address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                    },
                    Person("Marc", "Marcson").apply {
                        birthDate = LocalDate.of(2020, 2, 1)
                        address = Address("Graham Street", "36", "London", "N1 8GJ", "UK")
                    }
            )
        }

        // assert
        team1.shouldNotBeEquivalentTo(team2) {
            it.excluding(Team::persons)
        }
    }

    @Test
    fun failShouldBeEquivalentToAsIncludedPropertyNameIsDifferent() {
        // arrange
        val team1 = Team("team1").apply {
            persons = listOf(
                    Person("John", "Johnson").apply {
                        address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                    },
                    Person("Marc", "Marcson").apply {
                        birthDate = LocalDate.of(2020, 2, 1)
                        address = Address("Graham Street", "36", "London", "N1 8GJ", "UK").apply {
                            address2 = "Islington"
                        }
                    }
            )
        }
        val team2 = Team("team2").apply {
            persons = listOf(
                    Person("John", "Watson"),
                    Person("Marco", "Polo")
            )
        }

        // assert
        assertFailsWith(ComparisonFailure::class) {
            team1.shouldBeEquivalentTo(team2) {
                it.including(Team::name)
            }
        }
    }

    @Test
    fun passShouldNotBeEquivalentToAsIncludedPropertyNameIsDifferent() {
        // arrange
        val team1 = Team("team1").apply {
            persons = listOf(
                    Person("John", "Johnson").apply {
                        address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                    },
                    Person("Marc", "Marcson").apply {
                        birthDate = LocalDate.of(2020, 2, 1)
                        address = Address("Graham Street", "36", "London", "N1 8GJ", "UK").apply {
                            address2 = "Islington"
                        }
                    }
            )
        }
        val team2 = Team("team2").apply {
            persons = listOf(
                    Person("John", "Watson"),
                    Person("Marco", "Polo")
            )
        }

        // assert
        team1.shouldNotBeEquivalentTo(team2) {
            it.including(Team::name)
        }
    }

    @Test
    fun passShouldBeEquivalentToAsIncludedPropertiesAreEqual() {
        // arrange
        val team1 = Team("team1").apply {
            persons = listOf(
                    Person("John", "Johnson"),
                    Person("Marc", "Marcson").apply {
                        birthDate = LocalDate.of(2020, 2, 1)
                        address = Address("Graham Street", "36", "London", "N1 8GJ", "UK").apply {
                            address2 = "Islington"
                        }
                    }
            )
        }
        val team2 = Team("team2").apply {
            persons = listOf(
                    Person("John", "Johnson"),
                    Person("Marc", "Marcson").apply {
                        birthDate = LocalDate.of(2020, 2, 1)
                        address = Address("Graham Street", "36", "London", "N1 8GJ", "UK").apply {
                            address2 = "Islington"
                        }
                    }
            )
        }

        // assert
        team1.shouldBeEquivalentTo(team2) {
            it.including(Team::persons)
        }
    }

    @Test
    fun failShouldNotBeEquivalentToAsIncludedPropertiesAreEqual() {
        // arrange
        val team1 = Team("team1").apply {
            persons = listOf(
                    Person("John", "Johnson"),
                    Person("Marc", "Marcson").apply {
                        birthDate = LocalDate.of(2020, 2, 1)
                        address = Address("Graham Street", "36", "London", "N1 8GJ", "UK").apply {
                            address2 = "Islington"
                        }
                    }
            )
        }
        val team2 = Team("team2").apply {
            persons = listOf(
                    Person("John", "Johnson"),
                    Person("Marc", "Marcson").apply {
                        birthDate = LocalDate.of(2020, 2, 1)
                        address = Address("Graham Street", "36", "London", "N1 8GJ", "UK").apply {
                            address2 = "Islington"
                        }
                    }
            )
        }

        // assert
        assertFailsWith(ComparisonFailure::class) {
            team1.shouldNotBeEquivalentTo(team2) {
                it.including(Team::persons)
            }
        }
    }

    @Test
    fun passShouldBeEquivalentToEvenIfPropertiesAreDifferentAsExcludingNestedObjects() {
        // arrange
        val team1 = Team("team1").apply {
            persons = listOf(
                    Person("John", "Johnson").apply {
                        address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                    },
                    Person("Marc", "Marcson").apply { birthDate = LocalDate.of(2020, 2, 1) }
            )
        }
        val team2 = Team("team1").apply {
            persons = listOf(
                    Person("John", "Johnson"),
                    Person("Marc", "Marcson")
            )
        }

        // assert
        team1.shouldBeEquivalentTo(team2) {
            it.excludingNestedObjects()
        }
    }


    @Test
    fun failShouldNotBeEquivalentToEvenIfPropertiesAreDifferentAsExcludingNestedObjects() {
        // arrange
        val team1 = Team("team1").apply {
            persons = listOf(
                    Person("John", "Johnson").apply {
                        address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                    },
                    Person("Marc", "Marcson").apply { birthDate = LocalDate.of(2020, 2, 1) }
            )
        }
        val team2 = Team("team1").apply {
            persons = listOf(
                    Person("John", "Johnson"),
                    Person("Marc", "Marcson")
            )
        }

        // assert
        assertFailsWith(ComparisonFailure::class) {
            team1.shouldNotBeEquivalentTo(team2) {
                it.excludingNestedObjects()
            }
        }
    }

    @Test
    fun failShouldBeEquivalentToEvenIfPropertiesAreEqualAsExcludingNestedObjects() {
        // arrange
        val team1 = Team("team1").apply {
            persons = listOf(
                    Person("John", "Johnson").apply {
                        address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                    },
                    Person("Marc", "Marcson").apply { birthDate = LocalDate.of(2020, 2, 1) }
            )
        }
        val team2 = Team("team2").apply {
            persons = listOf(
                    Person("John", "Johnson").apply {
                        address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                    },
                    Person("Marc", "Marcson").apply { birthDate = LocalDate.of(2020, 2, 1) }
            )
        }

        // assert
        assertFailsWith(ComparisonFailure::class) {
            team1.shouldBeEquivalentTo(team2) {
                it.excludingNestedObjects()
            }
        }
    }

    @Test
    fun passShouldNotBeEquivalentToEvenIfPropertiesAreEqualAsExcludingNestedObjects() {
        // arrange
        val team1 = Team("team1").apply {
            persons = listOf(
                    Person("John", "Johnson").apply {
                        address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                    },
                    Person("Marc", "Marcson").apply { birthDate = LocalDate.of(2020, 2, 1) }
            )
        }
        val team2 = Team("team2").apply {
            persons = listOf(
                    Person("John", "Johnson").apply {
                        address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                    },
                    Person("Marc", "Marcson").apply { birthDate = LocalDate.of(2020, 2, 1) }
            )
        }

        // assert
        team1.shouldNotBeEquivalentTo(team2) {
            it.excludingNestedObjects()
        }
    }

    @Test
    fun passShouldBeEquivalentToEvenIfPropertiesAreDifferentAsNotAllowingInfiniteRecursion() {
        // arrange
        val a1 = A("name1").apply {
            b = listOf(
                    B("name11").apply {
                        c = listOf(
                                C(D("name111").apply { name2 = "name1111" }),
                                C(D("name112").apply { name2 = "name1121" })
                        )
                    },
                    B("name12").apply {
                        c = listOf(
                                C(D("name121").apply { name2 = "name1211" }),
                                C(D("name122").apply { name2 = "name1221" })
                        )
                    }
            )
        }
        val a2 = A("name1").apply {
            b = listOf(
                    B("name11").apply {
                        c = listOf(
                                C(D("name311").apply { name2 = "name3111" }),
                                C(D("name312").apply { name2 = "name3121" })
                        )
                    },
                    B("name12").apply {
                        c = listOf(
                                C(D("name321").apply { name2 = "name3211" }),
                                C(D("name322").apply { name2 = "name3221" })
                        )
                    }
            )
        }

        // assert
        a1.shouldBeEquivalentTo(a2) {
            it.maxLevelOfRecursion = 3
            return@shouldBeEquivalentTo it
        }
    }

    @Test
    fun failShouldNotBeEquivalentToEvenIfPropertiesAreDifferentAsNotAllowingInfiniteRecursion() {
        // arrange
        val a1 = A("name1").apply {
            b = listOf(
                    B("name11").apply {
                        c = listOf(
                                C(D("name111").apply { name2 = "name1111" }),
                                C(D("name112").apply { name2 = "name1121" })
                        )
                    },
                    B("name12").apply {
                        c = listOf(
                                C(D("name121").apply { name2 = "name1211" }),
                                C(D("name122").apply { name2 = "name1221" })
                        )
                    }
            )
        }
        val a2 = A("name1").apply {
            b = listOf(
                    B("name11").apply {
                        c = listOf(
                                C(D("name311").apply { name2 = "name3111" }),
                                C(D("name312").apply { name2 = "name3121" })
                        )
                    },
                    B("name12").apply {
                        c = listOf(
                                C(D("name321").apply { name2 = "name3211" }),
                                C(D("name322").apply { name2 = "name3221" })
                        )
                    }
            )
        }

        // assert
        assertFailsWith(ComparisonFailure::class) {
            a1.shouldNotBeEquivalentTo(a2) {
                it.maxLevelOfRecursion = 3
                return@shouldNotBeEquivalentTo it
            }
        }
    }

    @Test
    fun failShouldBeEquivalentToAsPropertiesAreDifferentAndAllowingInfiniteRecursion() {
        // arrange
        val a1 = A("name1").apply {
            b = listOf(
                    B("name11").apply {
                        c = listOf(
                                C(D("name111").apply { name2 = "name1111" }),
                                C(D("name112").apply { name2 = "name1121" })
                        )
                    },
                    B("name12").apply {
                        c = listOf(
                                C(D("name121").apply { name2 = "name1211" }),
                                C(D("name122").apply { name2 = "name1221" })
                        )
                    }
            )
        }
        val a2 = A("name1").apply {
            b = listOf(
                    B("name11").apply {
                        c = listOf(
                                C(D("name311").apply { name2 = "name3111" }),
                                C(D("name312").apply { name2 = "name3121" })
                        )
                    },
                    B("name12").apply {
                        c = listOf(
                                C(D("name321").apply { name2 = "name3211" }),
                                C(D("name322").apply { name2 = "name3221" })
                        )
                    }
            )
        }

        // assert
        assertFailsWith(ComparisonFailure::class) {
            a1.shouldBeEquivalentTo(a2) {
                it.allowingInfiniteRecursion()
                it.maxLevelOfRecursion = 2
                return@shouldBeEquivalentTo it
            }
        }
    }

    @Test
    fun passShouldNotBeEquivalentToAsPropertiesAreDifferentAndAllowingInfiniteRecursion() {
        // arrange
        val a1 = A("name1").apply {
            b = listOf(
                    B("name11").apply {
                        c = listOf(
                                C(D("name111").apply { name2 = "name1111" }),
                                C(D("name112").apply { name2 = "name1121" })
                        )
                    },
                    B("name12").apply {
                        c = listOf(
                                C(D("name121").apply { name2 = "name1211" }),
                                C(D("name122").apply { name2 = "name1221" })
                        )
                    }
            )
        }
        val a2 = A("name1").apply {
            b = listOf(
                    B("name11").apply {
                        c = listOf(
                                C(D("name311").apply { name2 = "name3111" }),
                                C(D("name312").apply { name2 = "name3121" })
                        )
                    },
                    B("name12").apply {
                        c = listOf(
                                C(D("name321").apply { name2 = "name3211" }),
                                C(D("name322").apply { name2 = "name3221" })
                        )
                    }
            )
        }

        // assert
        a1.shouldNotBeEquivalentTo(a2) {
            it.allowingInfiniteRecursion()
            it.maxLevelOfRecursion = 2
            return@shouldNotBeEquivalentTo it
        }
    }

    internal class Team(val name: String) {
        var persons: List<Person> = listOf()
    }

    @Suppress("unused")
    internal class Person(val firstName: String, val lastName: String) {
        var birthDate: LocalDate? = null
        var address: Address? = null
    }

    @Suppress("unused")
    internal class Address(val street: String, val house: String, val city: String, val zipCode: String, val country: String) {
        var address2: String? = null
    }

    @Suppress("unused")
    internal class A(val name: String) {
        var b: List<B> = listOf()
    }

    @Suppress("unused")
    internal class B(val name: String) {
        var c: List<C> = listOf()
    }

    @Suppress("unused")
    internal class C(val d: D) {
        var name: String? = null
    }

    @Suppress("unused")
    internal class D(val name: String) {
        var name2: String? = null
    }
}