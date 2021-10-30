package org.amshove.kluent.tests.equivalency

import org.amshove.kluent.internal.ComparisonFailedException
import org.amshove.kluent.internal.assertFailsWith
import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldBeEquivalentTo
import org.amshove.kluent.shouldNotBeEquivalentTo
import org.amshove.kluent.shouldStartWith
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
            )
        }

        // assert
        assertFailsWith(ComparisonFailedException::class) {
            team1.shouldBeEquivalentTo(team2)
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
            },
            Team("team3").apply {
                persons = listOf(
                    Person("John", "Johnson").apply {
                        address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                    },
                    Person("Marc", "Marcson").apply { birthDate = LocalDate.of(2020, 2, 1) }
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
                    Person("John", "Johnson").apply {
                        address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
                    },
                    Person("Marc", "Marcson").apply { birthDate = LocalDate.of(2020, 2, 1) }
                )
            }
        )

        // assert
        assertFailsWith(ComparisonFailedException::class) {
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
        assertFailsWith(ComparisonFailedException::class) {
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
        assertFailsWith(ComparisonFailedException::class) {
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
        assertFailsWith(ComparisonFailedException::class) {
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
        assertFailsWith(ComparisonFailedException::class) {
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
        assertFailsWith(ComparisonFailedException::class) {
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
        assertFailsWith(ComparisonFailedException::class) {
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
        assertFailsWith(ComparisonFailedException::class) {
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
        assertFailsWith(ComparisonFailedException::class) {
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
            b = B("name11").apply {
                c = C(D("name111").apply { name2 = "name1111" })
            }
        }
        val a2 = A("name1").apply {
            b = B("name11").apply {
                c = C(D("name311").apply { name2 = "name3111" })
            }
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
            b = B("name11").apply {
                c = C(D("name111").apply { name2 = "name1111" })
            }
        }
        val a2 = A("name1").apply {
            b = B("name11").apply {
                c = C(D("name311").apply { name2 = "name3111" })
            }
        }

        // assert
        assertFailsWith(ComparisonFailedException::class) {
            a1.shouldNotBeEquivalentTo(a2) {
                it.maxLevelOfRecursion = 3
                return@shouldNotBeEquivalentTo it
            }
        }
    }

    @Test
    fun passShouldNotBeEquivalentToAsPropertiesAreDifferentAndAllowingInfiniteRecursion() {
        // arrange
        val a1 = listOf(
            A("name1").apply {
                b = B("name11").apply {
                    c = C(D("name111").apply { name2 = "name1111" }).apply { name = "name1111" }
                    d = D("name111").apply {
                        Elist = mutableListOf(
                            E().apply {
                                Flist = listOf(
                                    F(1),
                                    F(2)
                                )
                            },
                            E().apply {
                                Flist = listOf(
                                    F(3),
                                    F(4)
                                )
                            }
                        )
                        name2 = "name1111"
                    }
                }
                e = "abc"
            },
            A("name2").apply {
                b = B("name11").apply {
                    c = C(D("name111").apply { name2 = "name2111" }).apply { name = "name1111" }
                    d = D("name111").apply { name2 = "name1111" }
                }
                e = "abc"
            }
        )
        val a2 = listOf(
            A("name1").apply {
                b = B("name11").apply {
                    c = C(D("name111").apply { name2 = "name1111" }).apply { name = "name1111" }
                    d = D("name111").apply { name2 = "name1111" }
                }
                e = "abc"
            },
            A("name2").apply {
                b = B("name11").apply {
                    c = C(D("name111").apply { name2 = "name3111" }).apply { name = "name1111" }
                    d = D("name111").apply { name2 = "name1111" }
                }
                e = "abc"
            }
        )

        // assert
        a1.shouldNotBeEquivalentTo(a2) {
            // set the default maxLevelOfRecursion = 2 but allow infinite recursion
            it.maxLevelOfRecursion = 2
            it.allowingInfiniteRecursion()
            return@shouldNotBeEquivalentTo it
        }
    }

    @Test
    fun failShouldBeEquivalentToAsPropertiesAreDifferentAndAllowingInfiniteRecursion() {
        // arrange
        val a1 = listOf(
            A("name1").apply {
                b = B("name11").apply {
                    c = C(D("name111").apply { name2 = "name1111" }).apply { name = "name1111" }
                    d = D("name111").apply {
                        Elist = mutableListOf(
                            E().apply {
                                Flist = listOf(
                                    F(1),
                                    F(2)
                                )
                            },
                            E().apply {
                                Flist = listOf(
                                    F(3),
                                    F(4)
                                )
                            }
                        )
                        name2 = "name1111"
                    }
                }
                e = "abc"
            },
            A("name2").apply {
                b = B("name11").apply {
                    c = C(D("name111").apply { name2 = "name2111" }).apply { name = "name1111" }
                    d = D("name111").apply {
                        Elist = mutableListOf(
                            E().apply {
                                Flist = listOf(
                                    F(5),
                                    F(6)
                                )
                            },
                            E().apply {
                                Flist = listOf(
                                    F(7)
                                )
                            }
                        )
                        name2 = "name1111"
                    }
                }
                e = "abc"
            }
        )
        val a2 = listOf(
            A("name1").apply {
                b = B("name11").apply {
                    c = C(D("name111").apply { name2 = "name1111" }).apply { name = "name1111" }
                    d = D("name111").apply {
                        Elist = mutableListOf(
                            E().apply {
                                Flist = listOf(
                                    F(1),
                                    F(2)
                                )
                            },
                            E().apply {
                                Flist = listOf(
                                    F(3),
                                    F(4)
                                )
                            }
                        )
                        name2 = "name1111"
                    }
                }
                e = "abc"
            },
            A("name2").apply {
                b = B("name11").apply {
                    c = C(D("name111").apply { name2 = "name3111" }).apply { name = "name1111" }
                    d = D("name111").apply {
                        name2 = "name1111"
                        Elist = mutableListOf(
                            E().apply {
                                Flist = listOf(
                                    F(5),
                                    F(6)
                                )
                            },
                            E().apply {
                                Flist = listOf(
                                    F(7)
                                )
                            }
                        )
                    }
                }
                e = "abc"
            }
        )

        // assert
        try {

            a1.shouldBeEquivalentTo(a2) {
                // set the default maxLevelOfRecursion = 2 but allow infinite recursion
                it.maxLevelOfRecursion = 2
                it.allowingInfiniteRecursion()
                return@shouldBeEquivalentTo it
            }
        } catch (e: ComparisonFailedException) {
            e.message!!.shouldStartWith("Are not equivalent:")
            e.actual!!.replace("\\s+|\\t|\\n".toRegex(), " ").trim().shouldBeEqualTo(
                """
                A (e = abc, name = name1)
                ˪-B (name = name11)
                ˪--C (name = name1111)
                ˪---D (name = name111, name2 = name1111)
                ˪----Elist
                ˪--D (name = name111, name2 = name1111)
                ˪---Elist
                ˪----E[0]
                ˪-----Flist
                ˪------F[0] (id = 1, name = )
                ˪------F[1] (id = 2, name = )
                ˪----E[1]
                ˪-----Flist
                ˪------F[0] (id = 3, name = )
                ˪------F[1] (id = 4, name = )
                A (e = abc, name = name2)
                ˪-B (name = name11)
                ˪--C (name = name1111)
                ˪---D (name = name111, name2 = name2111)
                ˪----Elist
                ˪--D (name = name111, name2 = name1111)
                ˪---Elist
                ˪----E[0]
                ˪-----Flist
                ˪------F[0] (id = 5, name = )
                ˪------F[1] (id = 6, name = )
                ˪----E[1]
                ˪-----Flist
                ˪------F[0] (id = 7, name = )
            """.replace("\\s+|\\t|\\n".toRegex(), " ").trim()
            )
            e.expected!!.replace("\\s+|\\t|\\n".toRegex(), " ").trim().shouldBeEqualTo(
                """
                A (e = abc, name = name1)
                ˪-B (name = name11)
                ˪--C (name = name1111)
                ˪---D (name = name111, name2 = name1111)
                ˪----Elist
                ˪--D (name = name111, name2 = name1111)
                ˪---Elist
                ˪----E[0]
                ˪-----Flist
                ˪------F[0] (id = 1, name = )
                ˪------F[1] (id = 2, name = )
                ˪----E[1]
                ˪-----Flist
                ˪------F[0] (id = 3, name = )
                ˪------F[1] (id = 4, name = )
                A (e = abc, name = name2)
                ˪-B (name = name11)
                ˪--C (name = name1111)
                ˪---D (name = name111, name2 = name3111)
                ˪----Elist
                ˪--D (name = name111, name2 = name1111)
                ˪---Elist
                ˪----E[0]
                ˪-----Flist
                ˪------F[0] (id = 5, name = )
                ˪------F[1] (id = 6, name = )
                ˪----E[1]
                ˪-----Flist
                ˪------F[0] (id = 7, name = )
            """.replace("\\s+|\\t|\\n".toRegex(), " ").trim()
            )
        }
    }

    @Test
    fun failShouldBeEquivalentToAsAmountOfEntitiesIsDifferent() {
        // arrange
        val a1 = listOf(
            A("name1").apply {
                b = B("name11").apply {
                    c = C(D("name111").apply { name2 = "name1111" }).apply { name = "name1111" }
                    d = D("name111").apply { name2 = "name1111" }
                }
                e = "abc"
            },
            A("name2").apply {
                b = B("name11").apply {
                    c = C(D("name111").apply { name2 = "name2111" }).apply { name = "name1111" }
                    d = D("name111").apply { name2 = "name1111" }
                }
                e = "abc"
            }
        )
        val a2 = listOf(
            A("name1").apply {
                b = B("name11").apply {
                    c = C(D("name111").apply { name2 = "name1111" }).apply { name = "name1111" }
                    d = D("name111").apply { name2 = "name1111" }
                }
                e = "abc"
            }
        )

        // assert
        try {
            a1.shouldBeEquivalentTo(a2) {
                // set the default maxLevelOfRecursion = 2 but allow infinite recursion
                it.maxLevelOfRecursion = 2
                it.allowingInfiniteRecursion()
                return@shouldBeEquivalentTo it
            }
        } catch (e: ComparisonFailedException) {
            e.message!!.shouldStartWith("Are not equivalent:")
            e.actual!!.replace("\\s+|\\t|\\n".toRegex(), " ").trim().shouldBeEqualTo(
                """
                A (e = abc, name = name1)
                ˪-B (name = name11)
                ˪--C (name = name1111)
                ˪---D (name = name111, name2 = name1111)
                ˪----Elist
                ˪--D (name = name111, name2 = name1111)
                ˪---Elist
                A (e = abc, name = name2)
                ˪-B (name = name11)
                ˪--C (name = name1111)
                ˪---D (name = name111, name2 = name2111)
                ˪----Elist
                ˪--D (name = name111, name2 = name1111)
                ˪---Elist
            """.replace("\\s+|\\t|\\n".toRegex(), " ").trim()
            )
            e.expected!!.replace("\\s+|\\t|\\n".toRegex(), " ").trim().shouldBeEqualTo(
                """
                A (e = abc, name = name1)
                ˪-B (name = name11)
                ˪--C (name = name1111)
                ˪---D (name = name111, name2 = name1111)
                ˪----Elist
                ˪--D (name = name111, name2 = name1111)
                ˪---Elist
            """.replace("\\s+|\\t|\\n".toRegex(), " ").trim()
            )
        }
    }

    @Test
    fun shouldFailAsAmountOfPropertiesIsDifferent() {
        // arrange
        val a1 = E().apply {
            Flist = listOf(
                F(1).apply { name = "name1" },
                F(2).apply { name = "name2" }
            )
        }
        val a2 = E().apply {
            Flist = listOf(
                F(1).apply { name = "name1" }
            )
        }

        // assert
        try {
            a1.shouldBeEquivalentTo(a2)
        } catch (e: ComparisonFailedException) {
            e.message!!.shouldStartWith("Are not equivalent:")
            e.actual!!.replace("\\s+|\\t|\\n".toRegex(), " ").trim().shouldBeEqualTo(
                """
                E
                ˪-Flist
                ˪--F[0] (id = 1, name = name1)
                ˪--F[1] (id = 2, name = name2)
            """.replace("\\s+|\\t|\\n".toRegex(), " ").trim()
            )
            e.expected!!.replace("\\s+|\\t|\\n".toRegex(), " ").trim().shouldBeEqualTo(
                """
                E
                ˪-Flist
                ˪--F[0] (id = 1, name = name1)
            """.replace("\\s+|\\t|\\n".toRegex(), " ").trim()
            )
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
    internal class Address(
        val street: String,
        val house: String,
        val city: String,
        val zipCode: String,
        val country: String
    ) {
        var address2: String? = null
    }

    @Suppress("unused")
    internal class A(val name: String) {
        var b: B? = null
        var e: String? = null
    }

    @Suppress("unused")
    internal class B(val name: String) {
        var c: C? = null
        var d: D? = null
    }

    @Suppress("unused")
    internal class C(val d: D) {
        var name: String? = null
    }

    @Suppress("unused")
    internal class D(val name: String) {
        var Elist: MutableList<E> = mutableListOf()
        var name2: String? = null
    }

    internal class E() {
        var Flist: List<F> = listOf()
    }

    internal class F(var id: Int) {
        var name: String = ""
    }
}