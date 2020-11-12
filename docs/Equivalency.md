# Equivalency assertions

Inspired by [Fluent Assertions](https://github.com/fluentassertions/fluentassertions):

## shouldBeEquivalentTo / shouldNotBeEquivalentTo

These assertions are purposed to compare objects and lists of objects not using overridden equals() method, but comparing their property values.
Example. You have a data class:
```kt
data class Person (firstName: String, lastName: String) {
	var address: String? = null
}
```

In case of usual way of comparison, let's say, using shouldBeEqualTo, this assertion will pass:
```kt
// arrange
val person1 = Person("John", "Johnson").apply {
    address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
}
val person2 = Person("John", "Johnson")
		
// assert
person1.shouldBeEqualTo(person2)
```

The reason is that the getHashCode()/equals() method of the Person class is called to compare two objects.
But what if you like to compare all object properties one by one?

Here is what you can do:
```kt
    // arrange
    val person1 = Person("John", "Johnson").apply {
        address = Address("Mainzerlandstrasse", "200", "Frankfurt am Main", "60327", "Germany")
    }
    val person2 = Person("John", "Johnson")
		
    // assert
    person1.shouldBeEquivalentTo(person2)
```
In this case assertion will fail, as the address property of two objects are not the same.
More over, you can compare a hierarchy of objects in the same way:
```kt
    class Team(val name: String) {
        var persons: List<Person> = listOf()
    }

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
```

Both assertions work against a single object, as well as Iterables:
```kt
@ExperimentalStdlibApi
fun <T : Any> T.shouldBeEquivalentTo(expected: T, config: ((EquivalencyAssertionOptions) -> EquivalencyAssertionOptions)? = null): T
@ExperimentalStdlibApi
fun <T : Any, I : Iterable<T>> I.shouldBeEquivalentTo(expected: Iterable<T>, config: ((EquivalencyAssertionOptions) -> EquivalencyAssertionOptions)? = null): I
```

An important part of both shouldBeEquivalentTo and shouldNotBeEquivalentTo assertions is EquivalencyAssertionOptions which has the following helper methods that you can use to specify the way how you want to compare:
```kt
    fun compareByProperties(): EquivalencyAssertionOptions

    fun excluding(property: KProperty1<*, *>): EquivalencyAssertionOptions

    fun including(property: KProperty1<*, *>): EquivalencyAssertionOptions

    fun excludingNestedObjects(): EquivalencyAssertionOptions

    fun allowingInfiniteRecursion(): EquivalencyAssertionOptions

    fun withStrictOrdering(): EquivalencyAssertionOptions
```

### compareByProperties()
Calling of this function is not necessary, as by default equivalency assertions compare objects exactly by properties.

### excluding/including
By default equivalency assertions use all non-private properties of an object for comparison. And only if all properties are the same, the objects will be treated as equivalent.
Using excluding/including you can specify what properties should be used for comparison. All other properties will be skipped.
Example:
```kt
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
        it.including(Team::persons)
    }
```
Although the name property of two objects of the Team class are the same, the assertion will fail, as using including(Team::persons) only the persons property is used for comparison.

Another example using excluding:
```kt
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
```
Here the assertion will pass, as the persons property is excluded - therefore, only the name is compared.

###excludingNestedObjects

If you do not want to compare the nested objects and only limit it by the top level object in your hierarchy:
```kt
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
```
In this case only the properties of [primitive types](https://kotlinlang.org/docs/tutorials/kotlin-for-py/primitive-data-types-and-their-limitations.html) and strings are compared.

###allowingInfiniteRecursion

The default level of recurrsion in the equivalency assertions is 10. That means, if your object hierarchy contains more than 10 nested objects, even if on the 11th level some object properties are not the same, but everything before that level passed comparision, the assertion will also pass.
Using allowingInfiniteRecursion() you can instruct the Kluent to perform infinite recursion.

###withStrictOrdering

By default, if you compare lists of objects, the order they appear in such lists is not important. But if you need to verify also the order, you can use withStrictOrdering:
```kt
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
    teams1.shouldBeEquivalentTo(teams2) {
        it.withStrictOrdering()
    }
```
In this case assertion will fail, as the "team3" in the 2nd list of teams is not at the same position like in the 1st list of teams.

